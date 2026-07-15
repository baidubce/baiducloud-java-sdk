package com.baidubce.cloudassistant.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActionIndex {
    /**
     * 命令id
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

    public ActionIndex setActionId(String actionId) {
        this.actionId = actionId;
        return this;
    }

    public String getActionId() {
        return this.actionId;
    }

    public ActionIndex setActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }

    public String getActionName() {
        return this.actionName;
    }

    public ActionIndex setRunId(String runId) {
        this.runId = runId;
        return this;
    }

    public String getRunId() {
        return this.runId;
    }

    @Override
    public String toString() {
        return "ActionIndex{" + "actionId=" + actionId + "\n" + "actionName=" + actionName + "\n" + "runId=" + runId + "\n" + "}";
    }

}