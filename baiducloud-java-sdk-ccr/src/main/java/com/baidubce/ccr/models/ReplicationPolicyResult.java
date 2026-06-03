package com.baidubce.ccr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReplicationPolicyResult {
    /**
     * 迁移规则创建时间
     */
    private String creationTime;

    /**
     * 级联删除
     */
    private Boolean deletion;

    /**
     * 迁移规则描述
     */
    private String description;

    /**
     * 目的命名空间
     */
    private String destProjectName;

    /**
     * destRegistry
     */
    private ReplicationRegistry destRegistry;

    /**
     * 迁移规则状态
     */
    private Boolean enabled;

    /**
     * 迁移规则执行次数
     */
    private Integer executionTimes;

    /**
     * 资源筛选
     */
    private List<ReplicationFilter> filters;

    /**
     * 迁移规则 ID
     */
    private Integer id;

    /**
     * 迁移规则名称
     */
    private String name;

    /**
     * 是否覆盖目的 Registry 上的资源
     */
    private Boolean override;

    /**
     * srcRegistry
     */
    private ReplicationRegistry srcRegistry;

    /**
     * trigger
     */
    private ReplicationTrigger trigger;

    /**
     * 迁移规则更新时间
     */
    private String updateTime;

    public ReplicationPolicyResult setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public String getCreationTime() {
        return this.creationTime;
    }

    public ReplicationPolicyResult setDeletion(Boolean deletion) {
        this.deletion = deletion;
        return this;
    }

    public Boolean getDeletion() {
        return this.deletion;
    }

    public ReplicationPolicyResult setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public ReplicationPolicyResult setDestProjectName(String destProjectName) {
        this.destProjectName = destProjectName;
        return this;
    }

    public String getDestProjectName() {
        return this.destProjectName;
    }

    public ReplicationPolicyResult setDestRegistry(ReplicationRegistry destRegistry) {
        this.destRegistry = destRegistry;
        return this;
    }

    public ReplicationRegistry getDestRegistry() {
        return this.destRegistry;
    }

    public ReplicationPolicyResult setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public ReplicationPolicyResult setExecutionTimes(Integer executionTimes) {
        this.executionTimes = executionTimes;
        return this;
    }

    public Integer getExecutionTimes() {
        return this.executionTimes;
    }

    public ReplicationPolicyResult setFilters(List<ReplicationFilter> filters) {
        this.filters = filters;
        return this;
    }

    public List<ReplicationFilter> getFilters() {
        return this.filters;
    }

    public ReplicationPolicyResult setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getId() {
        return this.id;
    }

    public ReplicationPolicyResult setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public ReplicationPolicyResult setOverride(Boolean override) {
        this.override = override;
        return this;
    }

    public Boolean getOverride() {
        return this.override;
    }

    public ReplicationPolicyResult setSrcRegistry(ReplicationRegistry srcRegistry) {
        this.srcRegistry = srcRegistry;
        return this;
    }

    public ReplicationRegistry getSrcRegistry() {
        return this.srcRegistry;
    }

    public ReplicationPolicyResult setTrigger(ReplicationTrigger trigger) {
        this.trigger = trigger;
        return this;
    }

    public ReplicationTrigger getTrigger() {
        return this.trigger;
    }

    public ReplicationPolicyResult setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    @Override
    public String toString() {
        return "ReplicationPolicyResult{" + "creationTime=" + creationTime + "\n" + "deletion=" + deletion + "\n" + "description=" + description + "\n" + "destProjectName="
                + destProjectName + "\n" + "destRegistry=" + destRegistry + "\n" + "enabled=" + enabled + "\n" + "executionTimes=" + executionTimes + "\n" + "filters=" + filters
                + "\n" + "id=" + id + "\n" + "name=" + name + "\n" + "override=" + override + "\n" + "srcRegistry=" + srcRegistry + "\n" + "trigger=" + trigger + "\n"
                + "updateTime=" + updateTime + "\n" + "}";
    }

}