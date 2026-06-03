package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetImageMigrationRuleDetailResponse extends BaseBceResponse {

    /**
    * 镜像迁移规则创建时间
    */
    private String creationTime;

    /**
    * 级联删除
    */
    private Boolean deletion;

    /**
    * 镜像迁移规则描述
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
    * 镜像迁移规则状态
    */
    private Boolean enabled;

    /**
    * 镜像迁移规则执行次数
    */
    private Integer executionTimes;

    /**
    * 资源筛选
    */
    private List<ReplicationFilter> filters;

    /**
    * 镜像迁移规则ID
    */
    private Integer id;

    /**
    * 镜像迁移规则名称
    */
    private String name;

    /**
    * 是否覆盖目的仓库上的资源
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
    * 镜像迁移规则更新时间
    */
    private String updateTime;

    public String getCreationTime() {
        return creationTime;
    }

    public GetImageMigrationRuleDetailResponse setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public Boolean getDeletion() {
        return deletion;
    }

    public GetImageMigrationRuleDetailResponse setDeletion(Boolean deletion) {
        this.deletion = deletion;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public GetImageMigrationRuleDetailResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDestProjectName() {
        return destProjectName;
    }

    public GetImageMigrationRuleDetailResponse setDestProjectName(String destProjectName) {
        this.destProjectName = destProjectName;
        return this;
    }

    public ReplicationRegistry getDestRegistry() {
        return destRegistry;
    }

    public GetImageMigrationRuleDetailResponse setDestRegistry(ReplicationRegistry destRegistry) {
        this.destRegistry = destRegistry;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public GetImageMigrationRuleDetailResponse setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Integer getExecutionTimes() {
        return executionTimes;
    }

    public GetImageMigrationRuleDetailResponse setExecutionTimes(Integer executionTimes) {
        this.executionTimes = executionTimes;
        return this;
    }

    public List<ReplicationFilter> getFilters() {
        return filters;
    }

    public GetImageMigrationRuleDetailResponse setFilters(List<ReplicationFilter> filters) {
        this.filters = filters;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public GetImageMigrationRuleDetailResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public GetImageMigrationRuleDetailResponse setName(String name) {
        this.name = name;
        return this;
    }

    public Boolean getOverride() {
        return override;
    }

    public GetImageMigrationRuleDetailResponse setOverride(Boolean override) {
        this.override = override;
        return this;
    }

    public ReplicationRegistry getSrcRegistry() {
        return srcRegistry;
    }

    public GetImageMigrationRuleDetailResponse setSrcRegistry(ReplicationRegistry srcRegistry) {
        this.srcRegistry = srcRegistry;
        return this;
    }

    public ReplicationTrigger getTrigger() {
        return trigger;
    }

    public GetImageMigrationRuleDetailResponse setTrigger(ReplicationTrigger trigger) {
        this.trigger = trigger;
        return this;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public GetImageMigrationRuleDetailResponse setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public String toString() {
        return "GetImageMigrationRuleDetailResponse{" + "creationTime=" + creationTime + "\n" + "deletion=" + deletion + "\n" + "description=" + description + "\n"
                + "destProjectName=" + destProjectName + "\n" + "destRegistry=" + destRegistry + "\n" + "enabled=" + enabled + "\n" + "executionTimes=" + executionTimes + "\n"
                + "filters=" + filters + "\n" + "id=" + id + "\n" + "name=" + name + "\n" + "override=" + override + "\n" + "srcRegistry=" + srcRegistry + "\n" + "trigger="
                + trigger + "\n" + "updateTime=" + updateTime + "\n" + "}";
    }

}
