package org.okraAx.room.component;

import org.okraAx.room.bean.RoomInfo;
import org.okraAx.room.fy.RemoteUser;
import org.okraAx.room.module.Room;
import org.okraAx.room.module.RoomFactory;
import org.okraAx.room.module.chess.ChineseChess;
import org.okraAx.utilities.NetHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * 房间组件
 *
 * @author TinyZ
 * @version 2017.05.25.
 */
@Service
public final class RoomComponent {

    @Autowired
    private PlayerComponent playerComponent;


    private final Map<Integer, RoomFactory> factorys = new ConcurrentHashMap<>();

    /**
     * 房间信息
     */
    private final Map<Long/* roomId */, Room> roomMap = new ConcurrentHashMap<>();

    private final Map<Long/* uid */, Room> uid2RoomMap = new ConcurrentHashMap<>();

    /**
     * 注册Room工厂
     */
    public void initRoomFactory() {

        factorys.put(1, ChineseChess.CHINESE_CHESS);


    }

    public Room get(long roomId) {
        return roomMap.get(roomId);
    }

    /**
     * 搜索房间
     */
    public Room lookupRoom(int amount) {
        for (Room room : roomMap.values()) {
            if (!room.isFully()) {
                return room;
            }
        }
        return null;
    }

    public Room getByUid(long uid) {
        return uid2RoomMap.get(uid);
    }

    public Set<Room> getAllRoom() {
        return roomMap.values().stream().collect(Collectors.toSet());
    }

    /**
     * 显示房间列表
     */
    public void showRoomList() {

    }

    /**
     * 创建房间
     */
    public void onCreateRoom(int roomType, String title, int maxPlayer, String password) {
        RemoteUser remoteUser = playerComponent.getPlayer(NetHelper.session());
        if (remoteUser == null) return;
        Room currentRoom = remoteUser.getRoom();
        if (currentRoom != null) {
            //  退出旧房间
            currentRoom.onExit(remoteUser.id());
        }
        RoomInfo roomInfo = new RoomInfo();
        roomInfo.roomId = 1;    //  TODO: 生成一个roomId
        roomInfo.roomType = roomType;
        roomInfo.title = title;
        roomInfo.maxPlayer = maxPlayer;
        roomInfo.password = password;
        roomInfo.roomType = roomType;
        Room room = newRoom(roomInfo);
        if (room == null) {
            //  创建room失败.
            return;
        }
        if (roomMap.containsKey(roomInfo.roomId)) {
            //  房间id已经存在
            return;
        }
        roomMap.put(room.id(), room);
        //
        remoteUser.setRoom(room);
    }

    public void onJoinRoom(long roomId) {
        RemoteUser remoteUser = playerComponent.getPlayer(NetHelper.session());
        if (remoteUser == null) return;
        Room room = roomMap.get(roomId);
        int ret = verifyRoomRules(room, remoteUser);
        if (ret < 0) {
            //  加入房间失败
            remoteUser.callback().callbackJoinRoom(ret, 0, null, 0);
            return;
        }
        if (room instanceof ChineseChess) {
            room.onEnter(remoteUser);
        }
    }

    public void onEnterRoom(int roomId, int seat, long uid, String name) {
        RemoteUser remoteUser = playerComponent.getPlayer(NetHelper.session());
        if (remoteUser == null) return;
        Room room = remoteUser.getRoom();
        if (room == null) {
            room = lookupRoom(1);
            if (room == null) {
                room = new ChineseChess(roomId);
                playerJoin(remoteUser.id(), remoteUser.getRoom());
            }
        }
        room.onEnter(remoteUser);
    }

    public void onExitRoom() {
        RemoteUser remoteUser = playerComponent.getPlayer(NetHelper.session());
        if (remoteUser == null) return;
        Room room = remoteUser.getRoom();
        if (room == null) {
            return;
        }
        room.onExit(remoteUser.id());
        //
        for (RemoteUser user : room.players()) {
            user.callback().callbackChangeRoomStatus(0);
        }
    }

    public void onGetReady(boolean ready) {
        RemoteUser remoteUser = playerComponent.getPlayer(NetHelper.session());
        if (remoteUser == null) return;
        Room room = remoteUser.getRoom();
        if (room == null) return;
        room.onReady(remoteUser, ready);
    }

    private Room newRoom(RoomInfo roomInfo) {
        if (roomInfo == null) {
            return null;
        }
        RoomFactory factory = factorys.get(roomInfo.roomType);
        if (factory == null) {
            //  房间类型非法
            return null;
        }
        try {
            return factory.newInstance(roomInfo);
        } catch (Exception e) {

            return null;
        }
    }

    public int verifyRoomRules(Room room, RemoteUser remoteUser) {
        if (room == null)  {
            //  房间不存在
            return -1;
        }
        if (room.isFully()) {
            //  房间已满
            return -2;
        }
        //  TODO: 房间规则   [等级]
        return 0;
    }



    public void playerJoin(long uid, Room room) {
        roomMap.put(room.id(), room);
        uid2RoomMap.put(uid, room);
    }

    public void playerExit(long uid) {
        Room room = uid2RoomMap.remove(uid);
        if (room != null) {
            room.onExit(uid);
        }
    }

    public void destroyRoom(long roomId) {
        Room room = roomMap.remove(roomId);
        if (room != null) {
            Set<RemoteUser> remoteUsers = room.players();
            for (RemoteUser remoteUser : remoteUsers) {
                uid2RoomMap.remove(remoteUser.id());
            }
            room.onDestroy();
        }
    }

}
