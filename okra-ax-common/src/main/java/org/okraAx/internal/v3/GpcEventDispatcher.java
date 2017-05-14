package org.okraAx.internal.v3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.ogcs.app.Executor;
import org.ogcs.app.Session;
import org.ogcs.netty.handler.DisruptorAdapterBy41xHandler;
import org.okraAx.v3.GpcCall;

import static io.netty.channel.ChannelHandler.Sharable;

/**
 * @author TinyZ.
 * @version 2017.05.08
 */
@Sharable
public class GpcEventDispatcher extends DisruptorAdapterBy41xHandler<GpcCall> {

    private static final Logger LOG = LogManager.getLogger(GpbServerContext.class);
    private final GpbServerContext context;

    public GpcEventDispatcher(GpbServerContext context) {
        this.context = context;
    }

    @Override
    protected Executor newExecutor(Session session, GpcCall msg) {
        try {
            GpbCommand command = context.getMethod(msg.getMethod());
            command.execute(session, msg);
        } catch (Exception e) {
            LOG.info("[GpcEventDispatcher] GpcCall execute error.api:{} ", msg.getMethod(), e);
        }
        return null;
    }
}
