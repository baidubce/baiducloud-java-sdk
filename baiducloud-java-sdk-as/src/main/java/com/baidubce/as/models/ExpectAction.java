package com.baidubce.as.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExpectAction {
    /**
     * 动作类型。包括：INCREASE(扩容),DECREASE(缩容),ADJUST(调整至)
     */
    private String actionType;

    /**
     * 动作数量
     */
    private Integer actionNum;

    /**
     * 调整到的数量
     */
    private Integer adjustToNum;

    public ExpectAction setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }

    public String getActionType() {
        return this.actionType;
    }

    public ExpectAction setActionNum(Integer actionNum) {
        this.actionNum = actionNum;
        return this;
    }

    public Integer getActionNum() {
        return this.actionNum;
    }

    public ExpectAction setAdjustToNum(Integer adjustToNum) {
        this.adjustToNum = adjustToNum;
        return this;
    }

    public Integer getAdjustToNum() {
        return this.adjustToNum;
    }

    @Override
    public String toString() {
        return "ExpectAction{" + "actionType=" + actionType + "\n" + "actionNum=" + actionNum + "\n" + "adjustToNum=" + adjustToNum + "\n" + "}";
    }

}