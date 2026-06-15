package com.baidubce.bcm.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlarmTemplate {
    /**
     * 报警模板ID
     */
    private String id;

    /**
     * 云产品类型
     */
    private String scope;

    /**
     * 资源类型
     */
    private String resourceType;

    /**
     * 子资源类型
     */
    private String subResourceType;

    /**
     * 模板名称
     */
    private String name;

    /**
     * 备注信息
     */
    private String comment;

    /**
     * 报警规则列表
     */
    private List<AlarmRule> rules;

    public AlarmTemplate setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public AlarmTemplate setScope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getScope() {
        return this.scope;
    }

    public AlarmTemplate setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public String getResourceType() {
        return this.resourceType;
    }

    public AlarmTemplate setSubResourceType(String subResourceType) {
        this.subResourceType = subResourceType;
        return this;
    }

    public String getSubResourceType() {
        return this.subResourceType;
    }

    public AlarmTemplate setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public AlarmTemplate setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getComment() {
        return this.comment;
    }

    public AlarmTemplate setRules(List<AlarmRule> rules) {
        this.rules = rules;
        return this;
    }

    public List<AlarmRule> getRules() {
        return this.rules;
    }

    @Override
    public String toString() {
        return "AlarmTemplate{" + "id=" + id + "\n" + "scope=" + scope + "\n" + "resourceType=" + resourceType + "\n" + "subResourceType=" + subResourceType + "\n" + "name="
                + name + "\n" + "comment=" + comment + "\n" + "rules=" + rules + "\n" + "}";
    }

}