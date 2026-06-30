package com.baidubce.bci.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExecAction {
    /**
     * 容器内执行的健康检查命令
     */
    private List<String> command;

    public ExecAction setCommand(List<String> command) {
        this.command = command;
        return this;
    }

    public List<String> getCommand() {
        return this.command;
    }

    @Override
    public String toString() {
        return "ExecAction{" + "command=" + command + "\n" + "}";
    }

}