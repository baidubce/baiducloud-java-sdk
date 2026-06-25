package com.baidubce.cprom.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EventClaimDetail {
    /**
     * 事件 ID
     */
    private String eventId;

    /**
     * 是否成功
     */
    private Boolean success;

    /**
     * 错误信息（失败时有值）
     */
    private String message;

    public EventClaimDetail setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    public String getEventId() {
        return this.eventId;
    }

    public EventClaimDetail setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public Boolean getSuccess() {
        return this.success;
    }

    public EventClaimDetail setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    @Override
    public String toString() {
        return "EventClaimDetail{" + "eventId=" + eventId + "\n" + "success=" + success + "\n" + "message=" + message + "\n" + "}";
    }

}