package com.baidubce.ccr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReplicationSyncPolicyResult {
    /**
     * 同步规则 ID
     */
    private Integer id;

    /**
     * 同步规则名称
     */
    private String name;

    /**
     * 同步规则备注
     */
    private String description;

    /**
     * 同步类型
     */
    private String syncType;

    /**
     * 源实例命名空间
     */
    private String srcProjectName;

    /**
     * 源仓库名称
     */
    private String srcRepositoryName;

    /**
     * 源镜像版本
     */
    private String srcTagName;

    /**
     * 源实例所在地域
     */
    private String srcRegion;

    /**
     * 同步规则创建时间
     */
    private String creationTime;

    /**
     * 同步规则更新时间
     */
    private String updateTime;

    /**
     * 同步目标实例 ID
     */
    private String destInstanceId;

    /**
     * 同步目标命名空间
     */
    private String destProjectName;

    /**
     * 同步目标实例所在地域
     */
    private String destRegion;

    /**
     * trigger
     */
    private ReplicationSyncTrigger trigger;

    /**
     * 是否覆盖目标实例已有的同名镜像
     */
    private Boolean override;

    public ReplicationSyncPolicyResult setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getId() {
        return this.id;
    }

    public ReplicationSyncPolicyResult setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public ReplicationSyncPolicyResult setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public ReplicationSyncPolicyResult setSyncType(String syncType) {
        this.syncType = syncType;
        return this;
    }

    public String getSyncType() {
        return this.syncType;
    }

    public ReplicationSyncPolicyResult setSrcProjectName(String srcProjectName) {
        this.srcProjectName = srcProjectName;
        return this;
    }

    public String getSrcProjectName() {
        return this.srcProjectName;
    }

    public ReplicationSyncPolicyResult setSrcRepositoryName(String srcRepositoryName) {
        this.srcRepositoryName = srcRepositoryName;
        return this;
    }

    public String getSrcRepositoryName() {
        return this.srcRepositoryName;
    }

    public ReplicationSyncPolicyResult setSrcTagName(String srcTagName) {
        this.srcTagName = srcTagName;
        return this;
    }

    public String getSrcTagName() {
        return this.srcTagName;
    }

    public ReplicationSyncPolicyResult setSrcRegion(String srcRegion) {
        this.srcRegion = srcRegion;
        return this;
    }

    public String getSrcRegion() {
        return this.srcRegion;
    }

    public ReplicationSyncPolicyResult setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public String getCreationTime() {
        return this.creationTime;
    }

    public ReplicationSyncPolicyResult setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public ReplicationSyncPolicyResult setDestInstanceId(String destInstanceId) {
        this.destInstanceId = destInstanceId;
        return this;
    }

    public String getDestInstanceId() {
        return this.destInstanceId;
    }

    public ReplicationSyncPolicyResult setDestProjectName(String destProjectName) {
        this.destProjectName = destProjectName;
        return this;
    }

    public String getDestProjectName() {
        return this.destProjectName;
    }

    public ReplicationSyncPolicyResult setDestRegion(String destRegion) {
        this.destRegion = destRegion;
        return this;
    }

    public String getDestRegion() {
        return this.destRegion;
    }

    public ReplicationSyncPolicyResult setTrigger(ReplicationSyncTrigger trigger) {
        this.trigger = trigger;
        return this;
    }

    public ReplicationSyncTrigger getTrigger() {
        return this.trigger;
    }

    public ReplicationSyncPolicyResult setOverride(Boolean override) {
        this.override = override;
        return this;
    }

    public Boolean getOverride() {
        return this.override;
    }

    @Override
    public String toString() {
        return "ReplicationSyncPolicyResult{" + "id=" + id + "\n" + "name=" + name + "\n" + "description=" + description + "\n" + "syncType=" + syncType + "\n" + "srcProjectName="
                + srcProjectName + "\n" + "srcRepositoryName=" + srcRepositoryName + "\n" + "srcTagName=" + srcTagName + "\n" + "srcRegion=" + srcRegion + "\n" + "creationTime="
                + creationTime + "\n" + "updateTime=" + updateTime + "\n" + "destInstanceId=" + destInstanceId + "\n" + "destProjectName=" + destProjectName + "\n" + "destRegion="
                + destRegion + "\n" + "trigger=" + trigger + "\n" + "override=" + override + "\n" + "}";
    }

}