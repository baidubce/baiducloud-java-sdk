package com.baidubce.oos.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DagSpec {
    /**
     * 引用的模板 ref 标识
     */
    private String ref;

    /**
     * 名称空间
     */
    private String namespace;

    /**
     * 模板名称
     */
    private String name;

    /**
     * 模板名称列表（批量查询时使用）
     */
    private List<String> names;

    /**
     * 模板描述
     */
    private String description;

    /**
     * 标签键值对
     */
    private Object tags;

    /**
     * operator 列表
     */
    private List<TaskOperatorSummary> operators;

    /**
     * 是否线性执行（operator 顺序依次执行）
     */
    private Boolean linear;

    /**
     * operator 间依赖关系列表
     */
    private List<LinkModel> links;

    /**
     * 输入参数定义列表
     */
    private List<InputModel> inputs;

    /**
     * 输出参数定义列表
     */
    private List<OutputModel> outputs;

    /**
     * 并发度
     */
    private Integer parallelism;

    /**
     * 扩展字段
     */
    private Object extra;

    /**
     * 创建时间，Unix 时间戳，单位：毫秒
     */
    private Long createdTimestamp;

    /**
     * 最近更新时间，Unix 时间戳，单位：毫秒
     */
    private Long updatedTimestamp;

    public DagSpec setRef(String ref) {
        this.ref = ref;
        return this;
    }

    public String getRef() {
        return this.ref;
    }

    public DagSpec setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public DagSpec setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public DagSpec setNames(List<String> names) {
        this.names = names;
        return this;
    }

    public List<String> getNames() {
        return this.names;
    }

    public DagSpec setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public DagSpec setTags(Object tags) {
        this.tags = tags;
        return this;
    }

    public Object getTags() {
        return this.tags;
    }

    public DagSpec setOperators(List<TaskOperatorSummary> operators) {
        this.operators = operators;
        return this;
    }

    public List<TaskOperatorSummary> getOperators() {
        return this.operators;
    }

    public DagSpec setLinear(Boolean linear) {
        this.linear = linear;
        return this;
    }

    public Boolean getLinear() {
        return this.linear;
    }

    public DagSpec setLinks(List<LinkModel> links) {
        this.links = links;
        return this;
    }

    public List<LinkModel> getLinks() {
        return this.links;
    }

    public DagSpec setInputs(List<InputModel> inputs) {
        this.inputs = inputs;
        return this;
    }

    public List<InputModel> getInputs() {
        return this.inputs;
    }

    public DagSpec setOutputs(List<OutputModel> outputs) {
        this.outputs = outputs;
        return this;
    }

    public List<OutputModel> getOutputs() {
        return this.outputs;
    }

    public DagSpec setParallelism(Integer parallelism) {
        this.parallelism = parallelism;
        return this;
    }

    public Integer getParallelism() {
        return this.parallelism;
    }

    public DagSpec setExtra(Object extra) {
        this.extra = extra;
        return this;
    }

    public Object getExtra() {
        return this.extra;
    }

    public DagSpec setCreatedTimestamp(Long createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    public Long getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    public DagSpec setUpdatedTimestamp(Long updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
        return this;
    }

    public Long getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    @Override
    public String toString() {
        return "DagSpec{" + "ref=" + ref + "\n" + "namespace=" + namespace + "\n" + "name=" + name + "\n" + "names=" + names + "\n" + "description=" + description + "\n" + "tags="
                + tags + "\n" + "operators=" + operators + "\n" + "linear=" + linear + "\n" + "links=" + links + "\n" + "inputs=" + inputs + "\n" + "outputs=" + outputs + "\n"
                + "parallelism=" + parallelism + "\n" + "extra=" + extra + "\n" + "createdTimestamp=" + createdTimestamp + "\n" + "updatedTimestamp=" + updatedTimestamp + "\n"
                + "}";
    }

}