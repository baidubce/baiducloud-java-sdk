package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SnapshotShareModel {
    /**
     * 源快照ID
     */
    private String sourceSnapshotId;

    /**
     * 源快照uuid
     */
    private String sourceSnapshotUuid;

    /**
     * 共享快照ID
     */
    private String snapshotId;

    /**
     * 共享方用户ID
     */
    private String sourceAccountId;

    /**
     * 接收方用户ID
     */
    private String accountId;

    /**
     * 快照类型
     */
    private String snapshotType;

    /**
     * 共享快照名称
     */
    private String name;

    /**
     * 快照大小
     */
    private Integer sizeInGB;

    /**
     * 快照共享时间
     */
    private String shareTime;

    /**
     * 共享快照描述
     */
    private String desc;

    /**
     * 共享状态
     */
    private String shareStatus;

    /**
     * 加密的密钥对
     */
    private String encryptKey;

    /**
     * 源快照是否已被删除
     */
    private Boolean isSourceDeleted;

    public SnapshotShareModel setSourceSnapshotId(String sourceSnapshotId) {
        this.sourceSnapshotId = sourceSnapshotId;
        return this;
    }

    public String getSourceSnapshotId() {
        return this.sourceSnapshotId;
    }

    public SnapshotShareModel setSourceSnapshotUuid(String sourceSnapshotUuid) {
        this.sourceSnapshotUuid = sourceSnapshotUuid;
        return this;
    }

    public String getSourceSnapshotUuid() {
        return this.sourceSnapshotUuid;
    }

    public SnapshotShareModel setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    public String getSnapshotId() {
        return this.snapshotId;
    }

    public SnapshotShareModel setSourceAccountId(String sourceAccountId) {
        this.sourceAccountId = sourceAccountId;
        return this;
    }

    public String getSourceAccountId() {
        return this.sourceAccountId;
    }

    public SnapshotShareModel setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public SnapshotShareModel setSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
        return this;
    }

    public String getSnapshotType() {
        return this.snapshotType;
    }

    public SnapshotShareModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public SnapshotShareModel setSizeInGB(Integer sizeInGB) {
        this.sizeInGB = sizeInGB;
        return this;
    }

    public Integer getSizeInGB() {
        return this.sizeInGB;
    }

    public SnapshotShareModel setShareTime(String shareTime) {
        this.shareTime = shareTime;
        return this;
    }

    public String getShareTime() {
        return this.shareTime;
    }

    public SnapshotShareModel setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getDesc() {
        return this.desc;
    }

    public SnapshotShareModel setShareStatus(String shareStatus) {
        this.shareStatus = shareStatus;
        return this;
    }

    public String getShareStatus() {
        return this.shareStatus;
    }

    public SnapshotShareModel setEncryptKey(String encryptKey) {
        this.encryptKey = encryptKey;
        return this;
    }

    public String getEncryptKey() {
        return this.encryptKey;
    }

    public SnapshotShareModel setIsSourceDeleted(Boolean isSourceDeleted) {
        this.isSourceDeleted = isSourceDeleted;
        return this;
    }

    public Boolean getIsSourceDeleted() {
        return this.isSourceDeleted;
    }

    @Override
    public String toString() {
        return "SnapshotShareModel{" + "sourceSnapshotId=" + sourceSnapshotId + "\n" + "sourceSnapshotUuid=" + sourceSnapshotUuid + "\n" + "snapshotId=" + snapshotId + "\n"
                + "sourceAccountId=" + sourceAccountId + "\n" + "accountId=" + accountId + "\n" + "snapshotType=" + snapshotType + "\n" + "name=" + name + "\n" + "sizeInGB="
                + sizeInGB + "\n" + "shareTime=" + shareTime + "\n" + "desc=" + desc + "\n" + "shareStatus=" + shareStatus + "\n" + "encryptKey=" + encryptKey + "\n"
                + "isSourceDeleted=" + isSourceDeleted + "\n" + "}";
    }

}