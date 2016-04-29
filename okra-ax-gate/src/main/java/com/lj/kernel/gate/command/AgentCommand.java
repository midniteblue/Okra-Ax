package com.lj.kernel.gate.command;

import com.lj.kernel.ax.SpringContext;
import com.lj.kernel.ax.core.ConnectorManager;
import com.lj.kernel.ax.inner.AxInnerCoManager;
import com.lj.kernel.gpb.generated.GpbD.Request;
import org.ogcs.app.AppContext;
import org.ogcs.app.Command;
import org.ogcs.app.Session;

/**
 * @author : TinyZ.
 * @email : ogcs_tinyz@outlook.com
 * @date : 2016/3/31
 */
public abstract class AgentCommand implements Command<Session, Request> {

    // Service
    protected AxInnerCoManager components = (AxInnerCoManager) AppContext.getBean(SpringContext.MANAGER_AX_COMPONENT);
    protected ConnectorManager sessions = (ConnectorManager) AppContext.getBean(SpringContext.MANAGER_CONNECTOR);


}
