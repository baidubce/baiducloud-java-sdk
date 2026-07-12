package com.baidubce.oos.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Task {
    /**
     * 名称空间
     */
    private String namespace;

    /**
     * 用户 ID
     */
    private String userId;

    /**
     * 任务 ID，全局唯一
     */
    private String id;

    /**
     * 版本号
     */
    private Long revision;

    /**
     * 当前任务所对应的 loops 序号
     */
    private Integer loopIndex;

    /**
     * 原因（失败/取消等）
     */
    private String reason;

    /**
     * 错误码
     */
    private String errorCode;

    /**
     * execution
     */
    private Execution execution;

    /**
     * operator
     */
    private Operator operator;

    /**
     * 任务开始时间，Unix 时间戳，单位：毫秒
     */
    private Long createdTimestamp;

    /**
     * 任务更新时间，Unix 时间戳，单位：毫秒
     */
    private Long updatedTimestamp;

    /**
     * 任务结束时间，Unix 时间戳，单位：毫秒，未结束填 0
     */
    private Long finishedTimestamp;

    /**
     * 
     */
    private String state;

    /**
     * 任务参数
     */
    private Object properties;

    /**
     * 任务尝试次数，从 0 开始
     */
    private Integer tries;

    /**
     * 子任务列表
     */
    private List<Task> children;

    /**
     * 子执行实例列表（重试时会产生多个执行实例）
     */
    private List<Execution> executions;

    /**
     * 任务输出结果
     */
    private Object outputContext;

    public Task setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public Task setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getUserId() {
        return this.userId;
    }

    public Task setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Task setRevision(Long revision) {
        this.revision = revision;
        return this;
    }

    public Long getRevision() {
        return this.revision;
    }

    public Task setLoopIndex(Integer loopIndex) {
        this.loopIndex = loopIndex;
        return this;
    }

    public Integer getLoopIndex() {
        return this.loopIndex;
    }

    public Task setReason(String reason) {
        this.reason = reason;
        return this;
    }

    public String getReason() {
        return this.reason;
    }

    public Task setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public Task setExecution(Execution execution) {
        this.execution = execution;
        return this;
    }

    public Execution getExecution() {
        return this.execution;
    }

    public Task setOperator(Operator operator) {
        this.operator = operator;
        return this;
    }

    public Operator getOperator() {
        return this.operator;
    }

    public Task setCreatedTimestamp(Long createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    public Long getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    public Task setUpdatedTimestamp(Long updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
        return this;
    }

    public Long getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    public Task setFinishedTimestamp(Long finishedTimestamp) {
        this.finishedTimestamp = finishedTimestamp;
        return this;
    }

    public Long getFinishedTimestamp() {
        return this.finishedTimestamp;
    }

    public Task setState(String state) {
        this.state = state;
        return this;
    }

    public String getState() {
        return this.state;
    }

    public Task setProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    public Object getProperties() {
        return this.properties;
    }

    public Task setTries(Integer tries) {
        this.tries = tries;
        return this;
    }

    public Integer getTries() {
        return this.tries;
    }

    public Task setChildren(List<Task> children) {
        this.children = children;
        return this;
    }

    public List<Task> getChildren() {
        return this.children;
    }

    public Task setExecutions(List<Execution> executions) {
        this.executions = executions;
        return this;
    }

    public List<Execution> getExecutions() {
        return this.executions;
    }

    public Task setOutputContext(Object outputContext) {
        this.outputContext = outputContext;
        return this;
    }

    public Object getOutputContext() {
        return this.outputContext;
    }

    @Override
    public String toString() {
        return "Task{" + "namespace=" + namespace + "\n" + "userId=" + userId + "\n" + "id=" + id + "\n" + "revision=" + revision + "\n" + "loopIndex=" + loopIndex + "\n"
                + "reason=" + reason + "\n" + "errorCode=" + errorCode + "\n" + "execution=" + execution + "\n" + "operator=" + operator + "\n" + "createdTimestamp="
                + createdTimestamp + "\n" + "updatedTimestamp=" + updatedTimestamp + "\n" + "finishedTimestamp=" + finishedTimestamp + "\n" + "state=" + state + "\n"
                + "properties=" + properties + "\n" + "tries=" + tries + "\n" + "children=" + children + "\n" + "executions=" + executions + "\n" + "outputContext="
                + outputContext + "\n" + "}";
    }

}