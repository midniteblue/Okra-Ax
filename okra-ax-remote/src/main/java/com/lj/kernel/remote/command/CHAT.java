package com.lj.kernel.remote.command;

import com.lj.kernel.gpb.generated.Chat;
import com.lj.kernel.gpb.generated.Chat.PushChat;
import com.lj.kernel.gpb.generated.Chat.ReqChat;
import com.lj.kernel.remote.RemoteCommand;
import com.lj.kernel.remote.SpringContext;
import org.ogcs.app.AppContext;
import org.ogcs.app.Session;
import org.ogcs.ax.component.GpbReplys;
import org.ogcs.ax.component.inner.AxReplys;
import org.ogcs.ax.component.manager.ConnectorManager;
import org.ogcs.ax.gpb.OkraAx;
import org.ogcs.ax.gpb.OkraAx.AxOutbound;

/**
 * @author : TinyZ.
 * @email : ogcs_tinyz@outlook.com
 * @date : 2016/4/23
 */
public class CHAT extends RemoteCommand {

    private ConnectorManager connectorManager = (ConnectorManager) AppContext.getBean(SpringContext.MANAGER_CONNECTOR);

    @Override
    public void execute(Session session, OkraAx.AxInbound inbound) throws Exception {
        ReqChat reqChat = ReqChat.parseFrom(inbound.getData());

        PushChat pushChat = PushChat.newBuilder()
                .setName(reqChat.getName())
                .setTarget(reqChat.getTarget())
                .setUid(reqChat.getUid())
                .setContent(reqChat.getContent()).build();
        AxOutbound axOutbound = AxReplys.axOutbound(inbound.getRid(),
                GpbReplys.response(inbound.getRid(), pushChat), reqChat.getUid(), reqChat.getTarget()
        );
        // TODO: 无目标 - 全频道发言
        if (reqChat.getTarget() < 0) {
            connectorManager.pushAll(axOutbound);
        } else {
            // TODO: 获取指定的session
            long index = reqChat.getTarget() % 2;
            connectorManager.pushById(axOutbound, "10" + index);
        }
    }
}
