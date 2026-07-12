package com.baidubce.oos.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OperatorSpec {
    /**
     * operator 名称
     */
    private String name;

    /**
     * operator 描述
     */
    private String description;

    /**
     * 标签列表
     */
    private List<KeyValuePair> tags;

    /**
     * operator 类型
     */
    private String operator;

    /**
     * 显示名称
     */
    private String label;

    /**
     * template
     */
    private Template template;

    /**
     * 重试次数
     */
    private Integer retries;

    /**
     * 重试间隔，单位毫秒，默认 300000
     */
    private Integer retryInterval;

    /**
     * 超时时长，单位毫秒
     */
    private Integer timeout;

    /**
     * 并行比例
     */
    private Double parallelismRatio;

    /**
     * 并行个数
     */
    private Integer parallelismCount;

    /**
     * 允许失败比例
     */
    private Double allowedFailureRatio;

    /**
     * 允许失败个数
     */
    private Integer allowedFailureCount;

    /**
     * 是否手动执行
     */
    private Boolean manually;

    /**
     * 延时启动毫秒数
     */
    private Integer scheduleDelayMilli;

    /**
     * 等待Agent可用毫秒数
     */
    private Integer waitOnAgentMilli;

    /**
     * 是否自动回滚
     */
    private Boolean autoRollback;

    /**
     * 失败后是否暂停
     */
    private Boolean pauseOnFailure;

    /**
     * 参数定义列表
     */
    private List<Property> properties;

    /**
     * 输出参数定义列表
     */
    private List<Property> output;

    /**
     * 初始上下文
     */
    private Object initContext;

    /**
     * 循环配置列表
     */
    private List<LoopModel> loops;

    /**
     * 是否并行
     */
    private Boolean parallel;

    public OperatorSpec setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public OperatorSpec setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public OperatorSpec setTags(List<KeyValuePair> tags) {
        this.tags = tags;
        return this;
    }

    public List<KeyValuePair> getTags() {
        return this.tags;
    }

    public OperatorSpec setOperator(String operator) {
        this.operator = operator;
        return this;
    }

    public String getOperator() {
        return this.operator;
    }

    public OperatorSpec setLabel(String label) {
        this.label = label;
        return this;
    }

    public String getLabel() {
        return this.label;
    }

    public OperatorSpec setTemplate(Template template) {
        this.template = template;
        return this;
    }

    public Template getTemplate() {
        return this.template;
    }

    public OperatorSpec setRetries(Integer retries) {
        this.retries = retries;
        return this;
    }

    public Integer getRetries() {
        return this.retries;
    }

    public OperatorSpec setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
        return this;
    }

    public Integer getRetryInterval() {
        return this.retryInterval;
    }

    public OperatorSpec setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    public Integer getTimeout() {
        return this.timeout;
    }

    public OperatorSpec setParallelismRatio(Double parallelismRatio) {
        this.parallelismRatio = parallelismRatio;
        return this;
    }

    public Double getParallelismRatio() {
        return this.parallelismRatio;
    }

    public OperatorSpec setParallelismCount(Integer parallelismCount) {
        this.parallelismCount = parallelismCount;
        return this;
    }

    public Integer getParallelismCount() {
        return this.parallelismCount;
    }

    public OperatorSpec setAllowedFailureRatio(Double allowedFailureRatio) {
        this.allowedFailureRatio = allowedFailureRatio;
        return this;
    }

    public Double getAllowedFailureRatio() {
        return this.allowedFailureRatio;
    }

    public OperatorSpec setAllowedFailureCount(Integer allowedFailureCount) {
        this.allowedFailureCount = allowedFailureCount;
        return this;
    }

    public Integer getAllowedFailureCount() {
        return this.allowedFailureCount;
    }

    public OperatorSpec setManually(Boolean manually) {
        this.manually = manually;
        return this;
    }

    public Boolean getManually() {
        return this.manually;
    }

    public OperatorSpec setScheduleDelayMilli(Integer scheduleDelayMilli) {
        this.scheduleDelayMilli = scheduleDelayMilli;
        return this;
    }

    public Integer getScheduleDelayMilli() {
        return this.scheduleDelayMilli;
    }

    public OperatorSpec setWaitOnAgentMilli(Integer waitOnAgentMilli) {
        this.waitOnAgentMilli = waitOnAgentMilli;
        return this;
    }

    public Integer getWaitOnAgentMilli() {
        return this.waitOnAgentMilli;
    }

    public OperatorSpec setAutoRollback(Boolean autoRollback) {
        this.autoRollback = autoRollback;
        return this;
    }

    public Boolean getAutoRollback() {
        return this.autoRollback;
    }

    public OperatorSpec setPauseOnFailure(Boolean pauseOnFailure) {
        this.pauseOnFailure = pauseOnFailure;
        return this;
    }

    public Boolean getPauseOnFailure() {
        return this.pauseOnFailure;
    }

    public OperatorSpec setProperties(List<Property> properties) {
        this.properties = properties;
        return this;
    }

    public List<Property> getProperties() {
        return this.properties;
    }

    public OperatorSpec setOutput(List<Property> output) {
        this.output = output;
        return this;
    }

    public List<Property> getOutput() {
        return this.output;
    }

    public OperatorSpec setInitContext(Object initContext) {
        this.initContext = initContext;
        return this;
    }

    public Object getInitContext() {
        return this.initContext;
    }

    public OperatorSpec setLoops(List<LoopModel> loops) {
        this.loops = loops;
        return this;
    }

    public List<LoopModel> getLoops() {
        return this.loops;
    }

    public OperatorSpec setParallel(Boolean parallel) {
        this.parallel = parallel;
        return this;
    }

    public Boolean getParallel() {
        return this.parallel;
    }

    @Override
    public String toString() {
        return "OperatorSpec{" + "name=" + name + "\n" + "description=" + description + "\n" + "tags=" + tags + "\n" + "operator=" + operator + "\n" + "label=" + label + "\n"
                + "template=" + template + "\n" + "retries=" + retries + "\n" + "retryInterval=" + retryInterval + "\n" + "timeout=" + timeout + "\n" + "parallelismRatio="
                + parallelismRatio + "\n" + "parallelismCount=" + parallelismCount + "\n" + "allowedFailureRatio=" + allowedFailureRatio + "\n" + "allowedFailureCount="
                + allowedFailureCount + "\n" + "manually=" + manually + "\n" + "scheduleDelayMilli=" + scheduleDelayMilli + "\n" + "waitOnAgentMilli=" + waitOnAgentMilli + "\n"
                + "autoRollback=" + autoRollback + "\n" + "pauseOnFailure=" + pauseOnFailure + "\n" + "properties=" + properties + "\n" + "output=" + output + "\n"
                + "initContext=" + initContext + "\n" + "loops=" + loops + "\n" + "parallel=" + parallel + "\n" + "}";
    }

}