package com.baidubce.oos.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EventExecution {
    /**
     * 名称空间
     */
    private String namespace;

    /**
     * 事件运维名称
     */
    private String name;

    /**
     * 状态：RUNNING/STOPPED
     */
    private String state;

    /**
     * 描述
     */
    private String description;

    /**
     * template
     */
    private Template template;

    /**
     * 全局参数取值集合
     */
    private Object properties;

    /**
     * event
     */
    private Event event;

    /**
     * 静默周期，单位毫秒
     */
    private Integer silentCycleMilli;

    /**
     * 标签
     */
    private List<Tag> tags;

    /**
     * 模板是否已被删除
     */
    private Boolean templateDeleted;

    /**
     * 语言
     */
    private String locale;

    public EventExecution setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public EventExecution setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public EventExecution setState(String state) {
        this.state = state;
        return this;
    }

    public String getState() {
        return this.state;
    }

    public EventExecution setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public EventExecution setTemplate(Template template) {
        this.template = template;
        return this;
    }

    public Template getTemplate() {
        return this.template;
    }

    public EventExecution setProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    public Object getProperties() {
        return this.properties;
    }

    public EventExecution setEvent(Event event) {
        this.event = event;
        return this;
    }

    public Event getEvent() {
        return this.event;
    }

    public EventExecution setSilentCycleMilli(Integer silentCycleMilli) {
        this.silentCycleMilli = silentCycleMilli;
        return this;
    }

    public Integer getSilentCycleMilli() {
        return this.silentCycleMilli;
    }

    public EventExecution setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public EventExecution setTemplateDeleted(Boolean templateDeleted) {
        this.templateDeleted = templateDeleted;
        return this;
    }

    public Boolean getTemplateDeleted() {
        return this.templateDeleted;
    }

    public EventExecution setLocale(String locale) {
        this.locale = locale;
        return this;
    }

    public String getLocale() {
        return this.locale;
    }

    @Override
    public String toString() {
        return "EventExecution{" + "namespace=" + namespace + "\n" + "name=" + name + "\n" + "state=" + state + "\n" + "description=" + description + "\n" + "template=" + template
                + "\n" + "properties=" + properties + "\n" + "event=" + event + "\n" + "silentCycleMilli=" + silentCycleMilli + "\n" + "tags=" + tags + "\n" + "templateDeleted="
                + templateDeleted + "\n" + "locale=" + locale + "\n" + "}";
    }

}