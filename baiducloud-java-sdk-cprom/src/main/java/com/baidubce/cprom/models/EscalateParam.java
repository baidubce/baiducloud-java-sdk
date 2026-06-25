package com.baidubce.cprom.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EscalateParam {
    /**
     * 升级通知策略级别，1，2，3, xx时间未响应升级到1级->2级->3级
     */
    private Integer rank;

    /**
     * condition
     */
    private ClaimCondition condition;

    /**
     * notifyAction
     */
    private NotifyAction notifyAction;

    public EscalateParam setRank(Integer rank) {
        this.rank = rank;
        return this;
    }

    public Integer getRank() {
        return this.rank;
    }

    public EscalateParam setCondition(ClaimCondition condition) {
        this.condition = condition;
        return this;
    }

    public ClaimCondition getCondition() {
        return this.condition;
    }

    public EscalateParam setNotifyAction(NotifyAction notifyAction) {
        this.notifyAction = notifyAction;
        return this;
    }

    public NotifyAction getNotifyAction() {
        return this.notifyAction;
    }

    @Override
    public String toString() {
        return "EscalateParam{" + "rank=" + rank + "\n" + "condition=" + condition + "\n" + "notifyAction=" + notifyAction + "\n" + "}";
    }

}