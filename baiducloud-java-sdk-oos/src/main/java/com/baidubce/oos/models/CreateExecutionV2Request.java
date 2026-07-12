package com.baidubce.oos.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateExecutionV2Request extends BaseBceRequest {

    /**
    * locale
    */
    @JsonIgnore
    private String locale;

    /**
    * 执行描述
    */
    private String description;

    /**
    * template
    */
    private Template template;

    /**
    * 并发度
    */
    private Integer parallelism;

    /**
    * 是否手动触发
    */
    private Boolean manually;

    /**
    * 全局参数取值集合
    */
    private Object properties;

    /**
    * 执行绑定标签列表
    */
    private List<Tag> tags;

    public String getLocale() {
        return locale;
    }

    public CreateExecutionV2Request setLocale(String locale) {
        this.locale = locale;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateExecutionV2Request setDescription(String description) {
        this.description = description;
        return this;
    }

    public Template getTemplate() {
        return template;
    }

    public CreateExecutionV2Request setTemplate(Template template) {
        this.template = template;
        return this;
    }

    public Integer getParallelism() {
        return parallelism;
    }

    public CreateExecutionV2Request setParallelism(Integer parallelism) {
        this.parallelism = parallelism;
        return this;
    }

    public Boolean getManually() {
        return manually;
    }

    public CreateExecutionV2Request setManually(Boolean manually) {
        this.manually = manually;
        return this;
    }

    public Object getProperties() {
        return properties;
    }

    public CreateExecutionV2Request setProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public CreateExecutionV2Request setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

}
