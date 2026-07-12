package com.baidubce.oos.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Execution {
    /**
     * 执行 ID，全局唯一，由服务端自动生成
     */
    private String id;

    /**
     * 执行描述
     */
    private String description;

    /**
     * template
     */
    private Template template;

    /**
     * 模板是否已被删除
     */
    private Boolean templateDeleted;

    /**
     * 并发度
     */
    private Integer parallelism;

    /**
     * 是否手动触发
     */
    private Boolean manually;

    /**
     * 执行开始时间，Unix 时间戳，单位：毫秒；仅用于查询详情或列表接口的字段返回
     */
    private Long createdTimestamp;

    /**
     * 执行更新时间，Unix 时间戳，单位：毫秒；仅用于查询详情或列表接口的字段返回
     */
    private Long updatedTimestamp;

    /**
     * 执行结束时间，Unix 时间戳，单位：毫秒，未结束填 0；仅用于查询详情或列表接口的字段返回
     */
    private Long finishedTimestamp;

    /**
     * 执行状态：PENDING/RUNNING/SUCCESS/FAILED/PAUSED/CANCELED；仅用于查询详情或列表接口的字段返回
     */
    private String state;

    /**
     * 全局参数取值集合
     */
    private Object properties;

    /**
     * 执行中的任务列表；执行列表接口响应固定为空数组，仅用于查询详情接口的字段返回
     */
    private List<ExecutionTaskSummary> tasks;

    /**
     * 执行绑定标签列表
     */
    private List<Tag> tags;

    /**
     * 触发执行的方式
     */
    private String trigger;

    /**
     * 原因（失败/取消等）
     */
    private String reason;

    /**
     * 错误码
     */
    private String errorCode;

    /**
     * eventExecution
     */
    private EventExecution eventExecution;

    /**
     * cronExecution
     */
    private CronExecution cronExecution;

    /**
     * 语言
     */
    private String locale;

    public Execution setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Execution setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public Execution setTemplate(Template template) {
        this.template = template;
        return this;
    }

    public Template getTemplate() {
        return this.template;
    }

    public Execution setTemplateDeleted(Boolean templateDeleted) {
        this.templateDeleted = templateDeleted;
        return this;
    }

    public Boolean getTemplateDeleted() {
        return this.templateDeleted;
    }

    public Execution setParallelism(Integer parallelism) {
        this.parallelism = parallelism;
        return this;
    }

    public Integer getParallelism() {
        return this.parallelism;
    }

    public Execution setManually(Boolean manually) {
        this.manually = manually;
        return this;
    }

    public Boolean getManually() {
        return this.manually;
    }

    public Execution setCreatedTimestamp(Long createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    public Long getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    public Execution setUpdatedTimestamp(Long updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
        return this;
    }

    public Long getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    public Execution setFinishedTimestamp(Long finishedTimestamp) {
        this.finishedTimestamp = finishedTimestamp;
        return this;
    }

    public Long getFinishedTimestamp() {
        return this.finishedTimestamp;
    }

    public Execution setState(String state) {
        this.state = state;
        return this;
    }

    public String getState() {
        return this.state;
    }

    public Execution setProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    public Object getProperties() {
        return this.properties;
    }

    public Execution setTasks(List<ExecutionTaskSummary> tasks) {
        this.tasks = tasks;
        return this;
    }

    public List<ExecutionTaskSummary> getTasks() {
        return this.tasks;
    }

    public Execution setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public Execution setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    public String getTrigger() {
        return this.trigger;
    }

    public Execution setReason(String reason) {
        this.reason = reason;
        return this;
    }

    public String getReason() {
        return this.reason;
    }

    public Execution setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public Execution setEventExecution(EventExecution eventExecution) {
        this.eventExecution = eventExecution;
        return this;
    }

    public EventExecution getEventExecution() {
        return this.eventExecution;
    }

    public Execution setCronExecution(CronExecution cronExecution) {
        this.cronExecution = cronExecution;
        return this;
    }

    public CronExecution getCronExecution() {
        return this.cronExecution;
    }

    public Execution setLocale(String locale) {
        this.locale = locale;
        return this;
    }

    public String getLocale() {
        return this.locale;
    }

    @Override
    public String toString() {
        return "Execution{" + "id=" + id + "\n" + "description=" + description + "\n" + "template=" + template + "\n" + "templateDeleted=" + templateDeleted + "\n"
                + "parallelism=" + parallelism + "\n" + "manually=" + manually + "\n" + "createdTimestamp=" + createdTimestamp + "\n" + "updatedTimestamp=" + updatedTimestamp
                + "\n" + "finishedTimestamp=" + finishedTimestamp + "\n" + "state=" + state + "\n" + "properties=" + properties + "\n" + "tasks=" + tasks + "\n" + "tags=" + tags
                + "\n" + "trigger=" + trigger + "\n" + "reason=" + reason + "\n" + "errorCode=" + errorCode + "\n" + "eventExecution=" + eventExecution + "\n" + "cronExecution="
                + cronExecution + "\n" + "locale=" + locale + "\n" + "}";
    }

}