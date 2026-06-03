package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateInstanceSyncRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 同步规则备注
    */
    private String description;

    /**
    * 同步目标实例ID
    */
    private String destInstanceId;

    /**
    * 同步目标命名空间
    */
    private String destProjectName;

    /**
    * 同步规则名称
    */
    private String name;

    /**
    * 是否覆盖目标实例已有的同名镜像
    */
    private Boolean override;

    /**
    * 源实例命名空间
    */
    private String srcProjectName;

    /**
    * 源仓库名称
    */
    private String srcRepository;

    /**
    * 源镜像版本
    */
    private String srcTag;

    /**
    * 同步类型
    */
    private String syncType;

    /**
    * trigger
    */
    private ReplicationSyncTriggerRequest trigger;

    public String getInstanceId() {
        return instanceId;
    }

    public CreateInstanceSyncRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateInstanceSyncRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDestInstanceId() {
        return destInstanceId;
    }

    public CreateInstanceSyncRequest setDestInstanceId(String destInstanceId) {
        this.destInstanceId = destInstanceId;
        return this;
    }

    public String getDestProjectName() {
        return destProjectName;
    }

    public CreateInstanceSyncRequest setDestProjectName(String destProjectName) {
        this.destProjectName = destProjectName;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateInstanceSyncRequest setName(String name) {
        this.name = name;
        return this;
    }

    public Boolean getOverride() {
        return override;
    }

    public CreateInstanceSyncRequest setOverride(Boolean override) {
        this.override = override;
        return this;
    }

    public String getSrcProjectName() {
        return srcProjectName;
    }

    public CreateInstanceSyncRequest setSrcProjectName(String srcProjectName) {
        this.srcProjectName = srcProjectName;
        return this;
    }

    public String getSrcRepository() {
        return srcRepository;
    }

    public CreateInstanceSyncRequest setSrcRepository(String srcRepository) {
        this.srcRepository = srcRepository;
        return this;
    }

    public String getSrcTag() {
        return srcTag;
    }

    public CreateInstanceSyncRequest setSrcTag(String srcTag) {
        this.srcTag = srcTag;
        return this;
    }

    public String getSyncType() {
        return syncType;
    }

    public CreateInstanceSyncRequest setSyncType(String syncType) {
        this.syncType = syncType;
        return this;
    }

    public ReplicationSyncTriggerRequest getTrigger() {
        return trigger;
    }

    public CreateInstanceSyncRequest setTrigger(ReplicationSyncTriggerRequest trigger) {
        this.trigger = trigger;
        return this;
    }

}
