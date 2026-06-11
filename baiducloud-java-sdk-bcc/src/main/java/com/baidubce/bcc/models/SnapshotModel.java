package com.baidubce.bcc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SnapshotModel {
    /**
     * 快照ID（查询快照列表、查询快照详情）
     */
    private String id;

    /**
     * 快照名称（查询快照列表、查询快照详情）
     */
    private String name;

    /**
     * 快照大小，单位GB（查询快照列表、查询快照详情）
     */
    private Integer sizeInGB;

    /**
     * 快照创建时间（查询快照列表、查询快照详情）
     */
    private String createTime;

    /**
     * 快照状态（查询快照列表、查询快照详情）
     */
    private String status;

    /**
     * 快照创建方式，取值：MANUAL/MIGRATION/auto（查询快照列表、查询快照详情）
     */
    private String createMethod;

    /**
     * 快照所属磁盘ID（查询快照列表、查询快照详情）
     */
    private String volumeId;

    /**
     * 快照描述（查询快照列表、查询快照详情）
     */
    private String desc;

    /**
     * 快照过期时间（查询快照列表、查询快照详情）
     */
    private String expireTime;

    /**
     * 内部快照ID（查询快照列表、查询快照详情）
     */
    private String insnapId;

    /**
     * 是否为大镜像快照（查询快照列表、查询快照详情）
     */
    @JsonProperty("package")
    private Boolean bccPackage;

    /**
     * 关联的镜像ID（查询快照列表、查询快照详情）
     */
    private String templateId;

    /**
     * 快照是否加密（查询快照列表、查询快照详情）
     */
    private Boolean encrypted;

    /**
     * 快照进度（查询快照详情）
     */
    private String progress;

    /**
     * 标签列表（查询快照详情）
     */
    private List<Tag> tags;

    public SnapshotModel setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public SnapshotModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public SnapshotModel setSizeInGB(Integer sizeInGB) {
        this.sizeInGB = sizeInGB;
        return this;
    }

    public Integer getSizeInGB() {
        return this.sizeInGB;
    }

    public SnapshotModel setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public SnapshotModel setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public SnapshotModel setCreateMethod(String createMethod) {
        this.createMethod = createMethod;
        return this;
    }

    public String getCreateMethod() {
        return this.createMethod;
    }

    public SnapshotModel setVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    public String getVolumeId() {
        return this.volumeId;
    }

    public SnapshotModel setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getDesc() {
        return this.desc;
    }

    public SnapshotModel setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    public String getExpireTime() {
        return this.expireTime;
    }

    public SnapshotModel setInsnapId(String insnapId) {
        this.insnapId = insnapId;
        return this;
    }

    public String getInsnapId() {
        return this.insnapId;
    }

    public SnapshotModel setPackage(Boolean bccPackage) {
        this.bccPackage = bccPackage;
        return this;
    }

    public Boolean getPackage() {
        return this.bccPackage;
    }

    public SnapshotModel setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    public String getTemplateId() {
        return this.templateId;
    }

    public SnapshotModel setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    public SnapshotModel setProgress(String progress) {
        this.progress = progress;
        return this;
    }

    public String getProgress() {
        return this.progress;
    }

    public SnapshotModel setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    @Override
    public String toString() {
        return "SnapshotModel{" + "id=" + id + "\n" + "name=" + name + "\n" + "sizeInGB=" + sizeInGB + "\n" + "createTime=" + createTime + "\n" + "status=" + status + "\n"
                + "createMethod=" + createMethod + "\n" + "volumeId=" + volumeId + "\n" + "desc=" + desc + "\n" + "expireTime=" + expireTime + "\n" + "insnapId=" + insnapId + "\n"
                + "bccPackage=" + bccPackage + "\n" + "templateId=" + templateId + "\n" + "encrypted=" + encrypted + "\n" + "progress=" + progress + "\n" + "tags=" + tags + "\n"
                + "}";
    }

}