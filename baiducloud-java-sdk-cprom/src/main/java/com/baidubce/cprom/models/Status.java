package com.baidubce.cprom.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Status {
    /**
     * 监控实例状态，可选值：Pending, Creating, Failed, Running, Upgrading
     */
    private String phase;

    /**
     * 监控实例是否ready
     */
    private Boolean ready;

    /**
     * 监控实例状态说明信息
     */
    private String message;

    public Status setPhase(String phase) {
        this.phase = phase;
        return this;
    }

    public String getPhase() {
        return this.phase;
    }

    public Status setReady(Boolean ready) {
        this.ready = ready;
        return this;
    }

    public Boolean getReady() {
        return this.ready;
    }

    public Status setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    @Override
    public String toString() {
        return "Status{" + "phase=" + phase + "\n" + "ready=" + ready + "\n" + "message=" + message + "\n" + "}";
    }

}