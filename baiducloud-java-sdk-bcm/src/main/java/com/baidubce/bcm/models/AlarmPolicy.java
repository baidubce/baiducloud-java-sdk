package com.baidubce.bcm.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlarmPolicy {
    /**
     * 策略ID
     */
    private String id;

    /**
     * 策略名称
     */
    private String name;

    /**
     * 云产品类型
     */
    private String scope;

    /**
     * 资源类型
     */
    private String resourceType;

    /**
     * 子资源类型（当requireSubResourceType=true时返回）
     */
    private String subResourceType;

    /**
     * target
     */
    private AlarmTarget target;

    /**
     * 报警规则列表
     */
    private List<AlarmRule> rules;

    /**
     * 报警通知项列表
     */
    private List<PolicyAction> actions;

    /**
     * 创建时间，UTC格式
     */
    private String createdTime;

    /**
     * 更新时间，UTC格式
     */
    private String updatedTime;

    public AlarmPolicy setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public AlarmPolicy setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public AlarmPolicy setScope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getScope() {
        return this.scope;
    }

    public AlarmPolicy setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public String getResourceType() {
        return this.resourceType;
    }

    public AlarmPolicy setSubResourceType(String subResourceType) {
        this.subResourceType = subResourceType;
        return this;
    }

    public String getSubResourceType() {
        return this.subResourceType;
    }

    public AlarmPolicy setTarget(AlarmTarget target) {
        this.target = target;
        return this;
    }

    public AlarmTarget getTarget() {
        return this.target;
    }

    public AlarmPolicy setRules(List<AlarmRule> rules) {
        this.rules = rules;
        return this;
    }

    public List<AlarmRule> getRules() {
        return this.rules;
    }

    public AlarmPolicy setActions(List<PolicyAction> actions) {
        this.actions = actions;
        return this;
    }

    public List<PolicyAction> getActions() {
        return this.actions;
    }

    public AlarmPolicy setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getCreatedTime() {
        return this.createdTime;
    }

    public AlarmPolicy setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    public String getUpdatedTime() {
        return this.updatedTime;
    }

    @Override
    public String toString() {
        return "AlarmPolicy{" + "id=" + id + "\n" + "name=" + name + "\n" + "scope=" + scope + "\n" + "resourceType=" + resourceType + "\n" + "subResourceType=" + subResourceType
                + "\n" + "target=" + target + "\n" + "rules=" + rules + "\n" + "actions=" + actions + "\n" + "createdTime=" + createdTime + "\n" + "updatedTime=" + updatedTime
                + "\n" + "}";
    }

}