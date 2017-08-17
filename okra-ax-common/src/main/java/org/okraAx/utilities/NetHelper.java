package org.okraAx.utilities;


import org.okraAx.internal.net.NetSession;

/**
 * @author TinyZ.
 * @version 2017.03.16
 */
public final class NetHelper {

    private static final ThreadLocal<NetSession> THREAD_LOCAL = new ThreadLocal<>();

    /**
     * @param <T> the special session class.
     * @return return the session that call the produce.
     */
    @SuppressWarnings("unchecked")
    public static <T extends NetSession> T session() {
        return (T) THREAD_LOCAL.get();
    }

    public static void setSession(NetSession session) {
        THREAD_LOCAL.set(session);
    }
}
