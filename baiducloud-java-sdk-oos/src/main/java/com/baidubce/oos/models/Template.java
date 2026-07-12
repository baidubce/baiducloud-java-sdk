package com.baidubce.oos.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Template {
    /**
     * 模板唯一标识，由服务端生成，更新模版需要传递此字段，查询详情和列表时响应此字段
     */
    private String id;

    /**
     * 创建执行时，使用本字段设置使用的模版id
     */
    private String ref;

    /**
     * 模板名称，不允许重复
     */
    private String name;

    /**
     * 模板类型，可选值：INDIVIDUAL（个人模板）,GLOBAL（系统模板）
     */
    private String type;

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
     * 并发度
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

    /**
     * 最后更新时间，查询详情和列表接口返回
     */
    private String updatedTime;

    /**
     * 支持的实例类型列表，目前仅用于系统模版
     */
    private List<String> supportedInstanceTypes;

    public Template setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Template setRef(String ref) {
        this.ref = ref;
        return this;
    }

    public String getRef() {
        return this.ref;
    }

    public Template setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Template setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public Template setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public Template setTags(List<KeyValuePair> tags) {
        this.tags = tags;
        return this;
    }

    public List<KeyValuePair> getTags() {
        return this.tags;
    }

    public Template setLinear(Boolean linear) {
        this.linear = linear;
        return this;
    }

    public Boolean getLinear() {
        return this.linear;
    }

    public Template setParallelism(Integer parallelism) {
        this.parallelism = parallelism;
        return this;
    }

    public Integer getParallelism() {
        return this.parallelism;
    }

    public Template setOperators(List<Operator> operators) {
        this.operators = operators;
        return this;
    }

    public List<Operator> getOperators() {
        return this.operators;
    }

    public Template setLinks(List<LinkModel> links) {
        this.links = links;
        return this;
    }

    public List<LinkModel> getLinks() {
        return this.links;
    }

    public Template setProperties(List<Property> properties) {
        this.properties = properties;
        return this;
    }

    public List<Property> getProperties() {
        return this.properties;
    }

    public Template setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    public String getUpdatedTime() {
        return this.updatedTime;
    }

    public Template setSupportedInstanceTypes(List<String> supportedInstanceTypes) {
        this.supportedInstanceTypes = supportedInstanceTypes;
        return this;
    }

    public List<String> getSupportedInstanceTypes() {
        return this.supportedInstanceTypes;
    }

    @Override
    public String toString() {
        return "Template{" + "id=" + id + "\n" + "ref=" + ref + "\n" + "name=" + name + "\n" + "type=" + type + "\n" + "description=" + description + "\n" + "tags=" + tags + "\n"
                + "linear=" + linear + "\n" + "parallelism=" + parallelism + "\n" + "operators=" + operators + "\n" + "links=" + links + "\n" + "properties=" + properties + "\n"
                + "updatedTime=" + updatedTime + "\n" + "supportedInstanceTypes=" + supportedInstanceTypes + "\n" + "}";
    }

}