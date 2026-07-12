package com.baidubce.oos.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateTemplateV2Request extends BaseBceRequest {

    /**
    * 名称空间，默认 default
    */
    private String namespace;

    /**
    * 模板唯一标识，由服务端生成，更新模版需要传递此字段，查询详情和列表时响应此字段
    */
    private String id;

    /**
    * 模板名称，和原名称保持一致
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

    public String getNamespace() {
        return namespace;
    }

    public UpdateTemplateV2Request setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getId() {
        return id;
    }

    public UpdateTemplateV2Request setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateTemplateV2Request setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateTemplateV2Request setDescription(String description) {
        this.description = description;
        return this;
    }

    public List<KeyValuePair> getTags() {
        return tags;
    }

    public UpdateTemplateV2Request setTags(List<KeyValuePair> tags) {
        this.tags = tags;
        return this;
    }

    public Boolean getLinear() {
        return linear;
    }

    public UpdateTemplateV2Request setLinear(Boolean linear) {
        this.linear = linear;
        return this;
    }

    public Integer getParallelism() {
        return parallelism;
    }

    public UpdateTemplateV2Request setParallelism(Integer parallelism) {
        this.parallelism = parallelism;
        return this;
    }

    public List<Operator> getOperators() {
        return operators;
    }

    public UpdateTemplateV2Request setOperators(List<Operator> operators) {
        this.operators = operators;
        return this;
    }

    public List<LinkModel> getLinks() {
        return links;
    }

    public UpdateTemplateV2Request setLinks(List<LinkModel> links) {
        this.links = links;
        return this;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public UpdateTemplateV2Request setProperties(List<Property> properties) {
        this.properties = properties;
        return this;
    }

}
