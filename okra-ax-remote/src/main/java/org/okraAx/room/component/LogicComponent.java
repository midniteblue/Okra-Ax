//package org.okraAx.room.component;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.okraAx.common.LoginForRoomService;
//import org.okraAx.common.PlayerCallback;
//import org.okraAx.internal.v3.ConnectionEventHandler;
//import org.okraAx.room.fy.LogicClient;
//import org.okraAx.utilities.ProxyUtil;
//import org.springframework.stereotype.Service;
//
///**
// * Logic组件. 用于remote管理和logic组件建立的连接.
// *
// * @author TinyZ.
// * @version 2017.04.09
// */
//@Service
//public final class LogicComponent {
//
//    private static final Logger LOG = LogManager.getLogger(LogicComponent.class);
//
//    private static final PlayerCallback DEFAULT_CALLBACK =
//            ProxyUtil.newProxyInstance(PlayerCallback.class, (proxy, method, args) -> {
//                //  no-op
//                LOG.info("Empty proxy instance invoked by [{}]", method.getName());
//                return null;
//            });
//
//    private volatile LogicClient logicClient;
//
//    public LogicComponent() {
////        init();
//    }
//
//    private void init() {
//        try {
//            //  注册message
//            //  连接logic
//            logicClient = new LogicClient("", 9005, new LogicClientEventHandler());
//            logicClient.start();
//        } catch (Exception e) {
//            LOG.error("LoginComponent init failed.", e);
//        }
//    }
//
//    public LoginForRoomService logicClient() {
//        return logicClient.logicClient();
//    }
//
//    private class LogicClientEventHandler implements ConnectionEventHandler {
//
//        @Override
//        public void connected() {
//            logicClient.logicClient().registerChannel();
//        }
//
//        @Override
//        public void connectFailed() {
//
//        }
//
//        @Override
//        public void disconnected() {
//
//        }
//    }
//}
