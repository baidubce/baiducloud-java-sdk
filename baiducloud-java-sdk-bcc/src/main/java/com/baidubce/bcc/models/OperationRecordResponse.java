package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OperationRecordResponse {
    /**
     * 操作名
     */
    private String name;

    /**
     * 操作人
     */
    private String operator;

    /**
     * 操作时间，符合BCE规范的日期格式
     */
    private String operateTime;

    public OperationRecordResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public OperationRecordResponse setOperator(String operator) {
        this.operator = operator;
        return this;
    }

    public String getOperator() {
        return this.operator;
    }

    public OperationRecordResponse setOperateTime(String operateTime) {
        this.operateTime = operateTime;
        return this;
    }

    public String getOperateTime() {
        return this.operateTime;
    }

    @Override
    public String toString() {
        return "OperationRecordResponse{" + "name=" + name + "\n" + "operator=" + operator + "\n" + "operateTime=" + operateTime + "\n" + "}";
    }

}