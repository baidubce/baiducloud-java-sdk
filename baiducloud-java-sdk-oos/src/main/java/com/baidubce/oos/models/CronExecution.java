package com.baidubce.oos.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CronExecution {
    /**
     * 名称空间
     */
    private String namespace;

    /**
     * 描述
     */
    private String description;

    /**
     * 定时运维名称
     */
    private String name;

    /**
     * template
     */
    private Template template;

    /**
     * 模板是否已被删除
     */
    private Boolean templateDeleted;

    /**
     * 全局参数取值集合
     */
    private Object properties;

    /**
     * 标签
     */
    private List<Tag> tags;

    /**
     * cron 表达式
     */
    private String cron;

    /**
     * period
     */
    private Period period;

    /**
     * 是否依赖上次执行
     */
    private Boolean dependOnPast;

    /**
     * 调度超时（毫秒）
     */
    private Long scheduleTimeout;

    /**
     * 创建时间，Unix 时间戳，单位：毫秒
     */
    private Long createdTimestamp;

    /**
     * 更新时间，Unix 时间戳，单位：毫秒
     */
    private Long updatedTimestamp;

    /**
     * 下一次调度时间，Unix 时间戳，单位：毫秒
     */
    private Long nextScheduleTimestamp;

    /**
     * 生效开始时间，Unix 时间戳，单位：毫秒
     */
    private Long beginTimestamp;

    /**
     * 生效结束时间，Unix 时间戳，单位：毫秒
     */
    private Long endTimestamp;

    /**
     * 状态
     */
    private String state;

    /**
     * 语言
     */
    private String locale;

    public CronExecution setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public CronExecution setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public CronExecution setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public CronExecution setTemplate(Template template) {
        this.template = template;
        return this;
    }

    public Template getTemplate() {
        return this.template;
    }

    public CronExecution setTemplateDeleted(Boolean templateDeleted) {
        this.templateDeleted = templateDeleted;
        return this;
    }

    public Boolean getTemplateDeleted() {
        return this.templateDeleted;
    }

    public CronExecution setProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    public Object getProperties() {
        return this.properties;
    }

    public CronExecution setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public CronExecution setCron(String cron) {
        this.cron = cron;
        return this;
    }

    public String getCron() {
        return this.cron;
    }

    public CronExecution setPeriod(Period period) {
        this.period = period;
        return this;
    }

    public Period getPeriod() {
        return this.period;
    }

    public CronExecution setDependOnPast(Boolean dependOnPast) {
        this.dependOnPast = dependOnPast;
        return this;
    }

    public Boolean getDependOnPast() {
        return this.dependOnPast;
    }

    public CronExecution setScheduleTimeout(Long scheduleTimeout) {
        this.scheduleTimeout = scheduleTimeout;
        return this;
    }

    public Long getScheduleTimeout() {
        return this.scheduleTimeout;
    }

    public CronExecution setCreatedTimestamp(Long createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    public Long getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    public CronExecution setUpdatedTimestamp(Long updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
        return this;
    }

    public Long getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    public CronExecution setNextScheduleTimestamp(Long nextScheduleTimestamp) {
        this.nextScheduleTimestamp = nextScheduleTimestamp;
        return this;
    }

    public Long getNextScheduleTimestamp() {
        return this.nextScheduleTimestamp;
    }

    public CronExecution setBeginTimestamp(Long beginTimestamp) {
        this.beginTimestamp = beginTimestamp;
        return this;
    }

    public Long getBeginTimestamp() {
        return this.beginTimestamp;
    }

    public CronExecution setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }

    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public CronExecution setState(String state) {
        this.state = state;
        return this;
    }

    public String getState() {
        return this.state;
    }

    public CronExecution setLocale(String locale) {
        this.locale = locale;
        return this;
    }

    public String getLocale() {
        return this.locale;
    }

    @Override
    public String toString() {
        return "CronExecution{" + "namespace=" + namespace + "\n" + "description=" + description + "\n" + "name=" + name + "\n" + "template=" + template + "\n"
                + "templateDeleted=" + templateDeleted + "\n" + "properties=" + properties + "\n" + "tags=" + tags + "\n" + "cron=" + cron + "\n" + "period=" + period + "\n"
                + "dependOnPast=" + dependOnPast + "\n" + "scheduleTimeout=" + scheduleTimeout + "\n" + "createdTimestamp=" + createdTimestamp + "\n" + "updatedTimestamp="
                + updatedTimestamp + "\n" + "nextScheduleTimestamp=" + nextScheduleTimestamp + "\n" + "beginTimestamp=" + beginTimestamp + "\n" + "endTimestamp=" + endTimestamp
                + "\n" + "state=" + state + "\n" + "locale=" + locale + "\n" + "}";
    }

}