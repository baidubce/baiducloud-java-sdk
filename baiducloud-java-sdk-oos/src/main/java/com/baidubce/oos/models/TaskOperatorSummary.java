package com.baidubce.oos.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TaskOperatorSummary {
    /**
     * operator 名称
     */
    private String name;

    /**
     * operator 描述
     */
    private String description;

    /**
     * 标签键值对
     */
    private Object tags;

    /**
     * operator 类型标识
     */
    private String operator;

    /**
     * dagSpec
     */
    private DagSpec dagSpec;

    /**
     * 是否内联子模板
     */
    private Boolean inline;

    /**
     * 重试次数
     */
    private Integer retries;

    /**
     * 重试间隔，单位毫秒
     */
    private Integer retryInterval;

    /**
     * 超时时长，单位毫秒
     */
    private Integer timeout;

    /**
     * 初始上下文
     */
    private Object initContext;

    /**
     * 循环配置列表
     */
    private List<Object> loops;

    /**
     * 允许的并行比例，取值 [0,1]
     */
    private Double parallelismRatio;

    /**
     * 允许的并行个数
     */
    private Integer parallelismCount;

    /**
     * 允许失败的 loops 比例，取值 [0,1]
     */
    private Double allowedFailureRatio;

    /**
     * 允许失败的 loops 个数
     */
    private Integer allowedFailureCount;

    /**
     * 是否需要手动触发
     */
    private Boolean manually;

    /**
     * 失败后是否暂停
     */
    private Boolean pauseOnFailure;

    /**
     * 延时启动，单位毫秒
     */
    private Integer scheduleDelayMilli;

    /**
     * 等待 agent 就绪的超时时长，单位毫秒
     */
    private Integer waitOnAgentMilli;

    /**
     * 执行条件表达式
     */
    private Object condition;

    /**
     * 断点列表
     */
    private List<Integer> breakpoints;

    /**
     * 触发规则，默认 ALL_SUCCESS
     */
    private String triggerRule;

    /**
     * loop 窗口类型，默认 SLICING
     */
    private String loopWindowType;

    /**
     * 工作机选择器列表
     */
    private List<TagSelector> workerSelectors;

    /**
     * 子执行上下文收集策略
     */
    private String collectChildrenContext;

    /**
     * rollbackOperator
     */
    private TaskOperatorSummary rollbackOperator;

    /**
     * 关联审计事件列表
     */
    private List<EventModel> events;

    /**
     * 初始 operator 列表
     */
    private List<TaskOperatorSummary> initOperators;

    /**
     * 是否通过 BSM Agent 执行
     */
    private Boolean byBsmAgent;

    public TaskOperatorSummary setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public TaskOperatorSummary setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public TaskOperatorSummary setTags(Object tags) {
        this.tags = tags;
        return this;
    }

    public Object getTags() {
        return this.tags;
    }

    public TaskOperatorSummary setOperator(String operator) {
        this.operator = operator;
        return this;
    }

    public String getOperator() {
        return this.operator;
    }

    public TaskOperatorSummary setDagSpec(DagSpec dagSpec) {
        this.dagSpec = dagSpec;
        return this;
    }

    public DagSpec getDagSpec() {
        return this.dagSpec;
    }

    public TaskOperatorSummary setInline(Boolean inline) {
        this.inline = inline;
        return this;
    }

    public Boolean getInline() {
        return this.inline;
    }

    public TaskOperatorSummary setRetries(Integer retries) {
        this.retries = retries;
        return this;
    }

    public Integer getRetries() {
        return this.retries;
    }

    public TaskOperatorSummary setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
        return this;
    }

    public Integer getRetryInterval() {
        return this.retryInterval;
    }

    public TaskOperatorSummary setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    public Integer getTimeout() {
        return this.timeout;
    }

    public TaskOperatorSummary setInitContext(Object initContext) {
        this.initContext = initContext;
        return this;
    }

    public Object getInitContext() {
        return this.initContext;
    }

    public TaskOperatorSummary setLoops(List<Object> loops) {
        this.loops = loops;
        return this;
    }

    public List<Object> getLoops() {
        return this.loops;
    }

    public TaskOperatorSummary setParallelismRatio(Double parallelismRatio) {
        this.parallelismRatio = parallelismRatio;
        return this;
    }

    public Double getParallelismRatio() {
        return this.parallelismRatio;
    }

    public TaskOperatorSummary setParallelismCount(Integer parallelismCount) {
        this.parallelismCount = parallelismCount;
        return this;
    }

    public Integer getParallelismCount() {
        return this.parallelismCount;
    }

    public TaskOperatorSummary setAllowedFailureRatio(Double allowedFailureRatio) {
        this.allowedFailureRatio = allowedFailureRatio;
        return this;
    }

    public Double getAllowedFailureRatio() {
        return this.allowedFailureRatio;
    }

    public TaskOperatorSummary setAllowedFailureCount(Integer allowedFailureCount) {
        this.allowedFailureCount = allowedFailureCount;
        return this;
    }

    public Integer getAllowedFailureCount() {
        return this.allowedFailureCount;
    }

    public TaskOperatorSummary setManually(Boolean manually) {
        this.manually = manually;
        return this;
    }

    public Boolean getManually() {
        return this.manually;
    }

    public TaskOperatorSummary setPauseOnFailure(Boolean pauseOnFailure) {
        this.pauseOnFailure = pauseOnFailure;
        return this;
    }

    public Boolean getPauseOnFailure() {
        return this.pauseOnFailure;
    }

    public TaskOperatorSummary setScheduleDelayMilli(Integer scheduleDelayMilli) {
        this.scheduleDelayMilli = scheduleDelayMilli;
        return this;
    }

    public Integer getScheduleDelayMilli() {
        return this.scheduleDelayMilli;
    }

    public TaskOperatorSummary setWaitOnAgentMilli(Integer waitOnAgentMilli) {
        this.waitOnAgentMilli = waitOnAgentMilli;
        return this;
    }

    public Integer getWaitOnAgentMilli() {
        return this.waitOnAgentMilli;
    }

    public TaskOperatorSummary setCondition(Object condition) {
        this.condition = condition;
        return this;
    }

    public Object getCondition() {
        return this.condition;
    }

    public TaskOperatorSummary setBreakpoints(List<Integer> breakpoints) {
        this.breakpoints = breakpoints;
        return this;
    }

    public List<Integer> getBreakpoints() {
        return this.breakpoints;
    }

    public TaskOperatorSummary setTriggerRule(String triggerRule) {
        this.triggerRule = triggerRule;
        return this;
    }

    public String getTriggerRule() {
        return this.triggerRule;
    }

    public TaskOperatorSummary setLoopWindowType(String loopWindowType) {
        this.loopWindowType = loopWindowType;
        return this;
    }

    public String getLoopWindowType() {
        return this.loopWindowType;
    }

    public TaskOperatorSummary setWorkerSelectors(List<TagSelector> workerSelectors) {
        this.workerSelectors = workerSelectors;
        return this;
    }

    public List<TagSelector> getWorkerSelectors() {
        return this.workerSelectors;
    }

    public TaskOperatorSummary setCollectChildrenContext(String collectChildrenContext) {
        this.collectChildrenContext = collectChildrenContext;
        return this;
    }

    public String getCollectChildrenContext() {
        return this.collectChildrenContext;
    }

    public TaskOperatorSummary setRollbackOperator(TaskOperatorSummary rollbackOperator) {
        this.rollbackOperator = rollbackOperator;
        return this;
    }

    public TaskOperatorSummary getRollbackOperator() {
        return this.rollbackOperator;
    }

    public TaskOperatorSummary setEvents(List<EventModel> events) {
        this.events = events;
        return this;
    }

    public List<EventModel> getEvents() {
        return this.events;
    }

    public TaskOperatorSummary setInitOperators(List<TaskOperatorSummary> initOperators) {
        this.initOperators = initOperators;
        return this;
    }

    public List<TaskOperatorSummary> getInitOperators() {
        return this.initOperators;
    }

    public TaskOperatorSummary setByBsmAgent(Boolean byBsmAgent) {
        this.byBsmAgent = byBsmAgent;
        return this;
    }

    public Boolean getByBsmAgent() {
        return this.byBsmAgent;
    }

    @Override
    public String toString() {
        return "TaskOperatorSummary{" + "name=" + name + "\n" + "description=" + description + "\n" + "tags=" + tags + "\n" + "operator=" + operator + "\n" + "dagSpec=" + dagSpec
                + "\n" + "inline=" + inline + "\n" + "retries=" + retries + "\n" + "retryInterval=" + retryInterval + "\n" + "timeout=" + timeout + "\n" + "initContext="
                + initContext + "\n" + "loops=" + loops + "\n" + "parallelismRatio=" + parallelismRatio + "\n" + "parallelismCount=" + parallelismCount + "\n"
                + "allowedFailureRatio=" + allowedFailureRatio + "\n" + "allowedFailureCount=" + allowedFailureCount + "\n" + "manually=" + manually + "\n" + "pauseOnFailure="
                + pauseOnFailure + "\n" + "scheduleDelayMilli=" + scheduleDelayMilli + "\n" + "waitOnAgentMilli=" + waitOnAgentMilli + "\n" + "condition=" + condition + "\n"
                + "breakpoints=" + breakpoints + "\n" + "triggerRule=" + triggerRule + "\n" + "loopWindowType=" + loopWindowType + "\n" + "workerSelectors=" + workerSelectors
                + "\n" + "collectChildrenContext=" + collectChildrenContext + "\n" + "rollbackOperator=" + rollbackOperator + "\n" + "events=" + events + "\n" + "initOperators="
                + initOperators + "\n" + "byBsmAgent=" + byBsmAgent + "\n" + "}";
    }

}