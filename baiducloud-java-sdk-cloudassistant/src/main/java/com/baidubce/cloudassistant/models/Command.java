package com.baidubce.cloudassistant.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Command {
    /**
     * 脚本类型
     */
    private String type;

    /**
     * 命令脚本内容
     */
    private String content;

    /**
     * 命令可见范围。GLOBAL公共命令，INDIVIDUAL个人命令
     */
    private String scope;

    /**
     * 命令是否包含参数
     */
    private Boolean enableParameter;

    /**
     * 命令参数列表
     */
    private List<Parameter> parameters;

    /**
     * 命令在虚机的执行用户
     */
    private String user;

    /**
     * 命令在虚机的执行路径
     */
    private String workDir;

    /**
     * 命令执行时的实际参数值，仅在查询 ActionRun 详情时返回
     */
    private Object execParams;

    /**
     * Agent等待时间（毫秒）
     */
    private Integer waitOnAgentMilli;

    public Command setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public Command setContent(String content) {
        this.content = content;
        return this;
    }

    public String getContent() {
        return this.content;
    }

    public Command setScope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getScope() {
        return this.scope;
    }

    public Command setEnableParameter(Boolean enableParameter) {
        this.enableParameter = enableParameter;
        return this;
    }

    public Boolean getEnableParameter() {
        return this.enableParameter;
    }

    public Command setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    public List<Parameter> getParameters() {
        return this.parameters;
    }

    public Command setUser(String user) {
        this.user = user;
        return this;
    }

    public String getUser() {
        return this.user;
    }

    public Command setWorkDir(String workDir) {
        this.workDir = workDir;
        return this;
    }

    public String getWorkDir() {
        return this.workDir;
    }

    public Command setExecParams(Object execParams) {
        this.execParams = execParams;
        return this;
    }

    public Object getExecParams() {
        return this.execParams;
    }

    public Command setWaitOnAgentMilli(Integer waitOnAgentMilli) {
        this.waitOnAgentMilli = waitOnAgentMilli;
        return this;
    }

    public Integer getWaitOnAgentMilli() {
        return this.waitOnAgentMilli;
    }

    @Override
    public String toString() {
        return "Command{" + "type=" + type + "\n" + "content=" + content + "\n" + "scope=" + scope + "\n" + "enableParameter=" + enableParameter + "\n" + "parameters="
                + parameters + "\n" + "user=" + user + "\n" + "workDir=" + workDir + "\n" + "execParams=" + execParams + "\n" + "waitOnAgentMilli=" + waitOnAgentMilli + "\n"
                + "}";
    }

}