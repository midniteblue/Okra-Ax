package org.okraAx.common;

/**
 * The room component send the message back to login component.
 *
 * @author TinyZ
 * @version 2017.03.12
 * @since 2.0
 */
public interface LoginForRoomService {

    /**
     * 注册频道进程
     */
    void registerChannel();

    void verifyPlayerInfo(long uid, long security);

    //  callback


    void callbackEnterChannel(int ret);


}
