package com.baidubce.aihc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class JobTimeLine {
    /**
     * 
     */
    private String conditionType;

    /**
     * 任务状态描述，由 conditionType 自动映射生成（如 conditionType 为 Created 则显示 “任务创建”，为 Succeeded 则显示 “任务成功”）
     */
    private String conditionMessage;

    /**
     * 任务进入当前状态的时间（如 2024-05-20T14:30:00+08:00）
     */
    private String time;

    public JobTimeLine setConditionType(String conditionType) {
        this.conditionType = conditionType;
        return this;
    }

    public String getConditionType() {
        return this.conditionType;
    }

    public JobTimeLine setConditionMessage(String conditionMessage) {
        this.conditionMessage = conditionMessage;
        return this;
    }

    public String getConditionMessage() {
        return this.conditionMessage;
    }

    public JobTimeLine setTime(String time) {
        this.time = time;
        return this;
    }

    public String getTime() {
        return this.time;
    }

    @Override
    public String toString() {
        return "JobTimeLine{" + "conditionType=" + conditionType + "\n" + "conditionMessage=" + conditionMessage + "\n" + "time=" + time + "\n" + "}";
    }

}