package org.okraAx.login.component;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.okraAx.common.LogicService;
import org.okraAx.internal.bean.ConnectionInfo;
import org.okraAx.internal.v3.NetSession;
import org.okraAx.internal.v3.ProxyClient;
import org.okraAx.internal.v3.protobuf.GpbInvocationHandler;
import org.okraAx.internal.v3.protobuf.GpbProxyUtil;
import org.okraAx.utilities.NetHelper;
import org.okraAx.utilities.ProxyUtil;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 节点组件
 *
 * @author TinyZ.
 * @version 2017.06.21
 */
@Service
public class NodeComponent {

    private static final Logger LOG = LogManager.getLogger(NodeComponent.class);

    private static final LogicService DEFAULT_LOGIC =
            ProxyUtil.newProxyInstance(LogicService.class, (proxy, method, args) -> {
                //  no-op
                LOG.info("[LogicService] Empty proxy instance invoked by [{}]. args:{}", method.getName(), args);
                return null;
            });

    private Map<Integer, ProxyClient<LogicService>> logicClientMap = new ConcurrentHashMap<>();

    public void registerNode(ConnectionInfo info) {
        NetSession session = NetHelper.session();
        if (info == null) {
            return;
        }
        info.getVersion();

        //  TODO:校验通过

        if (info.getType() == 1) {
            ProxyClient<LogicService> client = GpbProxyUtil.newProxyClient(session, DEFAULT_LOGIC);
        }


        //  Logic
        ProxyClient<LogicService> logicClient = new ProxyClient<>(session, new GpbInvocationHandler(session), DEFAULT_LOGIC);
        logicClient.initialize();

    }

    //  获取logicClient
    public LogicService logicClient(long uid) {
        return logicClientMap.get(uid % 3).impl();
    }


}
