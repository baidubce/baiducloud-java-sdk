package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateImageMigrationRuleRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * policyId
    */
    @JsonIgnore
    private String policyId;

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

    public UpdateImageMigrationRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getPolicyId() {
        return policyId;
    }

    public UpdateImageMigrationRuleRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateImageMigrationRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDestProjectName() {
        return destProjectName;
    }

    public UpdateImageMigrationRuleRequest setDestProjectName(String destProjectName) {
        this.destProjectName = destProjectName;
        return this;
    }

    public List<ReplicationFilterRequest> getFilters() {
        return filters;
    }

    public UpdateImageMigrationRuleRequest setFilters(List<ReplicationFilterRequest> filters) {
        this.filters = filters;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateImageMigrationRuleRequest setName(String name) {
        this.name = name;
        return this;
    }

    public Boolean getOverride() {
        return override;
    }

    public UpdateImageMigrationRuleRequest setOverride(Boolean override) {
        this.override = override;
        return this;
    }

    public ReplicationRegistryRequest getSrcRegistry() {
        return srcRegistry;
    }

    public UpdateImageMigrationRuleRequest setSrcRegistry(ReplicationRegistryRequest srcRegistry) {
        this.srcRegistry = srcRegistry;
        return this;
    }

    public ReplicationTriggerRequest getTrigger() {
        return trigger;
    }

    public UpdateImageMigrationRuleRequest setTrigger(ReplicationTriggerRequest trigger) {
        this.trigger = trigger;
        return this;
    }

}
