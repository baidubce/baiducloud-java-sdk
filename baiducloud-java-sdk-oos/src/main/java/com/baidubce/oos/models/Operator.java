package com.baidubce.oos.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Operator {
    /**
     * 任务自定义名称，同一个模板下不允许重复（必填）
     */
    private String name;

    /**
     * 任务描述，选填
     */
    private String description;

    /**
     * 任务标签列表
     */
    private List<KeyValuePair> tags;

    /**
     * 任务 ID/类型标识（如 BCE::BCC::StopInstance）；与 template.ref 不可同时为空
     */
    private String operator;

    /**
     * 任务显示名称
     */
    private String label;

    /**
     * template
     */
    private Template template;

    /**
     * 重试次数，默认 0，表示不重试
     */
    private Integer retries;

    /**
     * 重试间隔，单位毫秒，默认 300000（5 分钟）
     */
    private Integer retryInterval;

    /**
     * 超时时长，单位毫秒，默认 21600000（6 小时）；超时将触发重试
     */
    private Integer timeout;

    /**
     * 允许的并行比例，取值 [0,1]，默认 0；仅当 loops 字段存在时生效
     */
    private Double parallelismRatio;

    /**
     * 允许的并行个数，默认 0；与 parallelismRatio 二选一
     */
    private Integer parallelismCount;

    /**
     * parallelismControl
     */
    private ParallelismControl parallelismControl;

    /**
     * 允许失败的 loops 比例，取值 [0,1]，默认 0
     */
    private Double allowedFailureRatio;

    /**
     * 允许失败的 loops 个数，默认 0
     */
    private Integer allowedFailureCount;

    /**
     * allowedFailureControl
     */
    private AllowedFailureControl allowedFailureControl;

    /**
     * 是否需要手动执行，默认 false
     */
    private Boolean manually;

    /**
     * 延时启动，单位毫秒，默认 0
     */
    private Integer scheduleDelayMilli;

    /**
     * 等待 Agent 上线毫秒数
     */
    private Integer waitOnAgentMilli;

    /**
     * 失败后是否暂停，默认 false
     */
    private Boolean pauseOnFailure;

    /**
     * 条件表达式，节点是否执行的判断依据（结构由具体表达式决定）
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
     * 循环窗口类型，默认 SLICING
     */
    private String loopWindowType;

    /**
     * 任务执行所需参数取值
     */
    private Object properties;

    /**
     * 循环执行参数列表，与 targetInstances 不能同时设置
     */
    private List<Object> loops;

    public Operator setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Operator setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public Operator setTags(List<KeyValuePair> tags) {
        this.tags = tags;
        return this;
    }

    public List<KeyValuePair> getTags() {
        return this.tags;
    }

    public Operator setOperator(String operator) {
        this.operator = operator;
        return this;
    }

    public String getOperator() {
        return this.operator;
    }

    public Operator setLabel(String label) {
        this.label = label;
        return this;
    }

    public String getLabel() {
        return this.label;
    }

    public Operator setTemplate(Template template) {
        this.template = template;
        return this;
    }

    public Template getTemplate() {
        return this.template;
    }

    public Operator setRetries(Integer retries) {
        this.retries = retries;
        return this;
    }

    public Integer getRetries() {
        return this.retries;
    }

    public Operator setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
        return this;
    }

    public Integer getRetryInterval() {
        return this.retryInterval;
    }

    public Operator setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    public Integer getTimeout() {
        return this.timeout;
    }

    public Operator setParallelismRatio(Double parallelismRatio) {
        this.parallelismRatio = parallelismRatio;
        return this;
    }

    public Double getParallelismRatio() {
        return this.parallelismRatio;
    }

    public Operator setParallelismCount(Integer parallelismCount) {
        this.parallelismCount = parallelismCount;
        return this;
    }

    public Integer getParallelismCount() {
        return this.parallelismCount;
    }

    public Operator setParallelismControl(ParallelismControl parallelismControl) {
        this.parallelismControl = parallelismControl;
        return this;
    }

    public ParallelismControl getParallelismControl() {
        return this.parallelismControl;
    }

    public Operator setAllowedFailureRatio(Double allowedFailureRatio) {
        this.allowedFailureRatio = allowedFailureRatio;
        return this;
    }

    public Double getAllowedFailureRatio() {
        return this.allowedFailureRatio;
    }

    public Operator setAllowedFailureCount(Integer allowedFailureCount) {
        this.allowedFailureCount = allowedFailureCount;
        return this;
    }

    public Integer getAllowedFailureCount() {
        return this.allowedFailureCount;
    }

    public Operator setAllowedFailureControl(AllowedFailureControl allowedFailureControl) {
        this.allowedFailureControl = allowedFailureControl;
        return this;
    }

    public AllowedFailureControl getAllowedFailureControl() {
        return this.allowedFailureControl;
    }

    public Operator setManually(Boolean manually) {
        this.manually = manually;
        return this;
    }

    public Boolean getManually() {
        return this.manually;
    }

    public Operator setScheduleDelayMilli(Integer scheduleDelayMilli) {
        this.scheduleDelayMilli = scheduleDelayMilli;
        return this;
    }

    public Integer getScheduleDelayMilli() {
        return this.scheduleDelayMilli;
    }

    public Operator setWaitOnAgentMilli(Integer waitOnAgentMilli) {
        this.waitOnAgentMilli = waitOnAgentMilli;
        return this;
    }

    public Integer getWaitOnAgentMilli() {
        return this.waitOnAgentMilli;
    }

    public Operator setPauseOnFailure(Boolean pauseOnFailure) {
        this.pauseOnFailure = pauseOnFailure;
        return this;
    }

    public Boolean getPauseOnFailure() {
        return this.pauseOnFailure;
    }

    public Operator setCondition(Object condition) {
        this.condition = condition;
        return this;
    }

    public Object getCondition() {
        return this.condition;
    }

    public Operator setBreakpoints(List<Integer> breakpoints) {
        this.breakpoints = breakpoints;
        return this;
    }

    public List<Integer> getBreakpoints() {
        return this.breakpoints;
    }

    public Operator setTriggerRule(String triggerRule) {
        this.triggerRule = triggerRule;
        return this;
    }

    public String getTriggerRule() {
        return this.triggerRule;
    }

    public Operator setLoopWindowType(String loopWindowType) {
        this.loopWindowType = loopWindowType;
        return this;
    }

    public String getLoopWindowType() {
        return this.loopWindowType;
    }

    public Operator setProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    public Object getProperties() {
        return this.properties;
    }

    public Operator setLoops(List<Object> loops) {
        this.loops = loops;
        return this;
    }

    public List<Object> getLoops() {
        return this.loops;
    }

    @Override
    public String toString() {
        return "Operator{" + "name=" + name + "\n" + "description=" + description + "\n" + "tags=" + tags + "\n" + "operator=" + operator + "\n" + "label=" + label + "\n"
                + "template=" + template + "\n" + "retries=" + retries + "\n" + "retryInterval=" + retryInterval + "\n" + "timeout=" + timeout + "\n" + "parallelismRatio="
                + parallelismRatio + "\n" + "parallelismCount=" + parallelismCount + "\n" + "parallelismControl=" + parallelismControl + "\n" + "allowedFailureRatio="
                + allowedFailureRatio + "\n" + "allowedFailureCount=" + allowedFailureCount + "\n" + "allowedFailureControl=" + allowedFailureControl + "\n" + "manually="
                + manually + "\n" + "scheduleDelayMilli=" + scheduleDelayMilli + "\n" + "waitOnAgentMilli=" + waitOnAgentMilli + "\n" + "pauseOnFailure=" + pauseOnFailure + "\n"
                + "condition=" + condition + "\n" + "breakpoints=" + breakpoints + "\n" + "triggerRule=" + triggerRule + "\n" + "loopWindowType=" + loopWindowType + "\n"
                + "properties=" + properties + "\n" + "loops=" + loops + "\n" + "}";
    }

}