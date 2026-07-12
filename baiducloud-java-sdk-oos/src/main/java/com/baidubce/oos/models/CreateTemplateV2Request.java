package com.baidubce.oos.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateTemplateV2Request extends BaseBceRequest {

    /**
    * 模板名称，不允许重复
    */
    private String name;

    /**
    * 模板描述
    */
    private String description;

    /**
    * 模板标签
    */
    private List<KeyValuePair> tags;

    /**
    * 任务是否串行执行，默认false
    */
    private Boolean linear;

    /**
    * 并发度，当linear=false的时候，可以控制Operator并发执行的数量
    */
    private Integer parallelism;

    /**
    * 模板任务步骤列表
    */
    private List<Operator> operators;

    /**
    * 描述 operator 之间的拓扑关系，linear=false 时必填
    */
    private List<LinkModel> links;

    /**
    * 全局参数列表
    */
    private List<Property> properties;

    public String getName() {
        return name;
    }

    public CreateTemplateV2Request setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateTemplateV2Request setDescription(String description) {
        this.description = description;
        return this;
    }

    public List<KeyValuePair> getTags() {
        return tags;
    }

    public CreateTemplateV2Request setTags(List<KeyValuePair> tags) {
        this.tags = tags;
        return this;
    }

    public Boolean getLinear() {
        return linear;
    }

    public CreateTemplateV2Request setLinear(Boolean linear) {
        this.linear = linear;
        return this;
    }

    public Integer getParallelism() {
        return parallelism;
    }

    public CreateTemplateV2Request setParallelism(Integer parallelism) {
        this.parallelism = parallelism;
        return this;
    }

    public List<Operator> getOperators() {
        return operators;
    }

    public CreateTemplateV2Request setOperators(List<Operator> operators) {
        this.operators = operators;
        return this;
    }

    public List<LinkModel> getLinks() {
        return links;
    }

    public CreateTemplateV2Request setLinks(List<LinkModel> links) {
        this.links = links;
        return this;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public CreateTemplateV2Request setProperties(List<Property> properties) {
        this.properties = properties;
        return this;
    }

}
