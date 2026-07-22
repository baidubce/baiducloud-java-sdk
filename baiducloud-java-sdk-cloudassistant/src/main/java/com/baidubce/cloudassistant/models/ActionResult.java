package com.baidubce.cloudassistant.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActionResult {
    /**
     * 命令ID
     */
    private String actionId;

    /**
     * 命令名称
     */
    private String actionName;

    /**
     * 执行id，仅在命令执行时返回
     */
    private String runId;

    public ActionResult setActionId(String actionId) {
        this.actionId = actionId;
        return this;
    }

    public String getActionId() {
        return this.actionId;
    }

    public ActionResult setActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }

    public String getActionName() {
        return this.actionName;
    }

    public ActionResult setRunId(String runId) {
        this.runId = runId;
        return this;
    }

    public String getRunId() {
        return this.runId;
    }

    @Override
    public String toString() {
        return "ActionResult{" + "actionId=" + actionId + "\n" + "actionName=" + actionName + "\n" + "runId=" + runId + "\n" + "}";
    }

}