package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SnapchainModel {
    /**
     * 快照链状态
     */
    private String status;

    /**
     * 实例ID
     */
    private String instanceId;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 快照链大小
     */
    private String chainSize;

    /**
     * 快照链ID
     */
    private String chainId;

    /**
     * 磁盘ID
     */
    private String volumeId;

    /**
     * 手动快照数量
     */
    private Integer manualSnapCount;

    /**
     * 自动快照数量
     */
    private Integer autoSnapCount;

    /**
     * 磁盘大小
     */
    private Integer volumeSize;

    /**
     * 创建时间
     */
    private String createTime;

    public SnapchainModel setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public SnapchainModel setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public SnapchainModel setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getUserId() {
        return this.userId;
    }

    public SnapchainModel setChainSize(String chainSize) {
        this.chainSize = chainSize;
        return this;
    }

    public String getChainSize() {
        return this.chainSize;
    }

    public SnapchainModel setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }

    public String getChainId() {
        return this.chainId;
    }

    public SnapchainModel setVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    public String getVolumeId() {
        return this.volumeId;
    }

    public SnapchainModel setManualSnapCount(Integer manualSnapCount) {
        this.manualSnapCount = manualSnapCount;
        return this;
    }

    public Integer getManualSnapCount() {
        return this.manualSnapCount;
    }

    public SnapchainModel setAutoSnapCount(Integer autoSnapCount) {
        this.autoSnapCount = autoSnapCount;
        return this;
    }

    public Integer getAutoSnapCount() {
        return this.autoSnapCount;
    }

    public SnapchainModel setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }

    public Integer getVolumeSize() {
        return this.volumeSize;
    }

    public SnapchainModel setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    @Override
    public String toString() {
        return "SnapchainModel{" + "status=" + status + "\n" + "instanceId=" + instanceId + "\n" + "userId=" + userId + "\n" + "chainSize=" + chainSize + "\n" + "chainId="
                + chainId + "\n" + "volumeId=" + volumeId + "\n" + "manualSnapCount=" + manualSnapCount + "\n" + "autoSnapCount=" + autoSnapCount + "\n" + "volumeSize="
                + volumeSize + "\n" + "createTime=" + createTime + "\n" + "}";
    }

}