package com.baidubce.ax.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SandboxResourceCondition {
    /**
     * 条件类型。
     */
    private String type;

    /**
     * 条件状态。
     */
    private String status;

    /**
     * 原因。
     */
    private String reason;

    /**
     * 详细信息。
     */
    private String message;

    public SandboxResourceCondition setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public SandboxResourceCondition setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public SandboxResourceCondition setReason(String reason) {
        this.reason = reason;
        return this;
    }

    public String getReason() {
        return this.reason;
    }

    public SandboxResourceCondition setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    @Override
    public String toString() {
        return "SandboxResourceCondition{" + "type=" + type + "\n" + "status=" + status + "\n" + "reason=" + reason + "\n" + "message=" + message + "\n" + "}";
    }

}