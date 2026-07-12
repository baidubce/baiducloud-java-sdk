package com.baidubce.oos.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExecutionTaskSummary {
    /**
     * 任务 ID
     */
    private String id;

    /**
     * loops 序号
     */
    private Integer loopIndex;

    /**
     * 名称空间
     */
    private String namespace;

    /**
     * dag
     */
    private DagInstance dag;

    /**
     * 版本号
     */
    private Long revision;

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
     * 任务状态
     */
    private String state;

    /**
     * operator
     */
    private TaskOperatorSummary operator;

    /**
     * 原因
     */
    private String reason;

    /**
     * 错误码
     */
    private String errorCode;

    /**
     * 任务初始参数
     */
    private Object initContext;

    /**
     * 任务上下文，包含全局参数和输出结果
     */
    private Object context;

    /**
     * 任务输出结果
     */
    private Object outputContext;

    /**
     * 任务尝试次数，从 0 开始
     */
    private Integer tries;

    /**
     * 子任务列表
     */
    private List<ExecutionTaskSummary> children;

    /**
     * 任务日志列表
     */
    private List<Log> log;

    public ExecutionTaskSummary setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public ExecutionTaskSummary setLoopIndex(Integer loopIndex) {
        this.loopIndex = loopIndex;
        return this;
    }

    public Integer getLoopIndex() {
        return this.loopIndex;
    }

    public ExecutionTaskSummary setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public ExecutionTaskSummary setDag(DagInstance dag) {
        this.dag = dag;
        return this;
    }

    public DagInstance getDag() {
        return this.dag;
    }

    public ExecutionTaskSummary setRevision(Long revision) {
        this.revision = revision;
        return this;
    }

    public Long getRevision() {
        return this.revision;
    }

    public ExecutionTaskSummary setCreatedTimestamp(Long createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    public Long getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    public ExecutionTaskSummary setUpdatedTimestamp(Long updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
        return this;
    }

    public Long getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    public ExecutionTaskSummary setFinishedTimestamp(Long finishedTimestamp) {
        this.finishedTimestamp = finishedTimestamp;
        return this;
    }

    public Long getFinishedTimestamp() {
        return this.finishedTimestamp;
    }

    public ExecutionTaskSummary setState(String state) {
        this.state = state;
        return this;
    }

    public String getState() {
        return this.state;
    }

    public ExecutionTaskSummary setOperator(TaskOperatorSummary operator) {
        this.operator = operator;
        return this;
    }

    public TaskOperatorSummary getOperator() {
        return this.operator;
    }

    public ExecutionTaskSummary setReason(String reason) {
        this.reason = reason;
        return this;
    }

    public String getReason() {
        return this.reason;
    }

    public ExecutionTaskSummary setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public ExecutionTaskSummary setInitContext(Object initContext) {
        this.initContext = initContext;
        return this;
    }

    public Object getInitContext() {
        return this.initContext;
    }

    public ExecutionTaskSummary setContext(Object context) {
        this.context = context;
        return this;
    }

    public Object getContext() {
        return this.context;
    }

    public ExecutionTaskSummary setOutputContext(Object outputContext) {
        this.outputContext = outputContext;
        return this;
    }

    public Object getOutputContext() {
        return this.outputContext;
    }

    public ExecutionTaskSummary setTries(Integer tries) {
        this.tries = tries;
        return this;
    }

    public Integer getTries() {
        return this.tries;
    }

    public ExecutionTaskSummary setChildren(List<ExecutionTaskSummary> children) {
        this.children = children;
        return this;
    }

    public List<ExecutionTaskSummary> getChildren() {
        return this.children;
    }

    public ExecutionTaskSummary setLog(List<Log> log) {
        this.log = log;
        return this;
    }

    public List<Log> getLog() {
        return this.log;
    }

    @Override
    public String toString() {
        return "ExecutionTaskSummary{" + "id=" + id + "\n" + "loopIndex=" + loopIndex + "\n" + "namespace=" + namespace + "\n" + "dag=" + dag + "\n" + "revision=" + revision
                + "\n" + "createdTimestamp=" + createdTimestamp + "\n" + "updatedTimestamp=" + updatedTimestamp + "\n" + "finishedTimestamp=" + finishedTimestamp + "\n" + "state="
                + state + "\n" + "operator=" + operator + "\n" + "reason=" + reason + "\n" + "errorCode=" + errorCode + "\n" + "initContext=" + initContext + "\n" + "context="
                + context + "\n" + "outputContext=" + outputContext + "\n" + "tries=" + tries + "\n" + "children=" + children + "\n" + "log=" + log + "\n" + "}";
    }

}