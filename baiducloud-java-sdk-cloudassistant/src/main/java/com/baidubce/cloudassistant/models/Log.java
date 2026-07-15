package com.baidubce.cloudassistant.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Log {
    /**
     * 命令执行日志
     */
    private String msg;

    public Log setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public String getMsg() {
        return this.msg;
    }

    @Override
    public String toString() {
        return "Log{" + "msg=" + msg + "\n" + "}";
    }

}