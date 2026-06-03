package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateImageMigrationRuleRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 镜像迁移规则描述
    */
    private String description;

    /**
    * 目的命名空间
    */
    private String destProjectName;

    /**
    * 资源筛选
    */
    private List<ReplicationFilterRequest> filters;

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
    private ReplicationRegistryRequest srcRegistry;

    /**
    * trigger
    */
    private ReplicationTriggerRequest trigger;

    public String getInstanceId() {
        return instanceId;
    }

    public CreateImageMigrationRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateImageMigrationRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDestProjectName() {
        return destProjectName;
    }

    public CreateImageMigrationRuleRequest setDestProjectName(String destProjectName) {
        this.destProjectName = destProjectName;
        return this;
    }

    public List<ReplicationFilterRequest> getFilters() {
        return filters;
    }

    public CreateImageMigrationRuleRequest setFilters(List<ReplicationFilterRequest> filters) {
        this.filters = filters;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateImageMigrationRuleRequest setName(String name) {
        this.name = name;
        return this;
    }

    public Boolean getOverride() {
        return override;
    }

    public CreateImageMigrationRuleRequest setOverride(Boolean override) {
        this.override = override;
        return this;
    }

    public ReplicationRegistryRequest getSrcRegistry() {
        return srcRegistry;
    }

    public CreateImageMigrationRuleRequest setSrcRegistry(ReplicationRegistryRequest srcRegistry) {
        this.srcRegistry = srcRegistry;
        return this;
    }

    public ReplicationTriggerRequest getTrigger() {
        return trigger;
    }

    public CreateImageMigrationRuleRequest setTrigger(ReplicationTriggerRequest trigger) {
        this.trigger = trigger;
        return this;
    }

}
