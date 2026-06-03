package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetInstanceSyncDetailResponse extends BaseBceResponse {

    /**
    * 同步规则创建时间
    */
    private String creationTime;

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
    * 同步目标实例所在地域
    */
    private String destRegion;

    /**
    * 同步规则ID
    */
    private Integer id;

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
    * 源实例所在地域
    */
    private String srcRegion;

    /**
    * 源仓库名称
    */
    private String srcRepositoryName;

    /**
    * 源镜像版本
    */
    private String srcTagName;

    /**
    * 同步类型
    */
    private String syncType;

    /**
    * trigger
    */
    private ReplicationSyncTrigger trigger;

    /**
    * 同步规则更新时间
    */
    private String updateTime;

    public String getCreationTime() {
        return creationTime;
    }

    public GetInstanceSyncDetailResponse setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public GetInstanceSyncDetailResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDestInstanceId() {
        return destInstanceId;
    }

    public GetInstanceSyncDetailResponse setDestInstanceId(String destInstanceId) {
        this.destInstanceId = destInstanceId;
        return this;
    }

    public String getDestProjectName() {
        return destProjectName;
    }

    public GetInstanceSyncDetailResponse setDestProjectName(String destProjectName) {
        this.destProjectName = destProjectName;
        return this;
    }

    public String getDestRegion() {
        return destRegion;
    }

    public GetInstanceSyncDetailResponse setDestRegion(String destRegion) {
        this.destRegion = destRegion;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public GetInstanceSyncDetailResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public GetInstanceSyncDetailResponse setName(String name) {
        this.name = name;
        return this;
    }

    public Boolean getOverride() {
        return override;
    }

    public GetInstanceSyncDetailResponse setOverride(Boolean override) {
        this.override = override;
        return this;
    }

    public String getSrcProjectName() {
        return srcProjectName;
    }

    public GetInstanceSyncDetailResponse setSrcProjectName(String srcProjectName) {
        this.srcProjectName = srcProjectName;
        return this;
    }

    public String getSrcRegion() {
        return srcRegion;
    }

    public GetInstanceSyncDetailResponse setSrcRegion(String srcRegion) {
        this.srcRegion = srcRegion;
        return this;
    }

    public String getSrcRepositoryName() {
        return srcRepositoryName;
    }

    public GetInstanceSyncDetailResponse setSrcRepositoryName(String srcRepositoryName) {
        this.srcRepositoryName = srcRepositoryName;
        return this;
    }

    public String getSrcTagName() {
        return srcTagName;
    }

    public GetInstanceSyncDetailResponse setSrcTagName(String srcTagName) {
        this.srcTagName = srcTagName;
        return this;
    }

    public String getSyncType() {
        return syncType;
    }

    public GetInstanceSyncDetailResponse setSyncType(String syncType) {
        this.syncType = syncType;
        return this;
    }

    public ReplicationSyncTrigger getTrigger() {
        return trigger;
    }

    public GetInstanceSyncDetailResponse setTrigger(ReplicationSyncTrigger trigger) {
        this.trigger = trigger;
        return this;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public GetInstanceSyncDetailResponse setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public String toString() {
        return "GetInstanceSyncDetailResponse{" + "creationTime=" + creationTime + "\n" + "description=" + description + "\n" + "destInstanceId=" + destInstanceId + "\n"
                + "destProjectName=" + destProjectName + "\n" + "destRegion=" + destRegion + "\n" + "id=" + id + "\n" + "name=" + name + "\n" + "override=" + override + "\n"
                + "srcProjectName=" + srcProjectName + "\n" + "srcRegion=" + srcRegion + "\n" + "srcRepositoryName=" + srcRepositoryName + "\n" + "srcTagName=" + srcTagName + "\n"
                + "syncType=" + syncType + "\n" + "trigger=" + trigger + "\n" + "updateTime=" + updateTime + "\n" + "}";
    }

}
