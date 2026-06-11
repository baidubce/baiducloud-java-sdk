package com.baidubce.bcc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImageModel {
    /**
     * 镜像ID（查询镜像列表、查询镜像详情）
     */
    private String id;

    /**
     * 镜像名称（查询镜像列表、查询镜像详情）
     */
    private String name;

    /**
     * 镜像类型（查询镜像列表、查询镜像详情）
     */
    private String type;

    /**
     * 操作系统类型，如linux、windows（查询镜像列表、查询镜像详情）
     */
    private String osType;

    /**
     * 操作系统版本（查询镜像列表、查询镜像详情）
     */
    private String osVersion;

    /**
     * 操作系统架构（查询镜像列表、查询镜像详情）
     */
    private String osArch;

    /**
     * 操作系统名称（查询镜像列表、查询镜像详情）
     */
    private String osName;

    /**
     * 操作系统构建版本（查询镜像列表、查询镜像详情）
     */
    private String osBuild;

    /**
     * 操作系统语言（查询镜像列表、查询镜像详情）
     */
    private String osLang;

    /**
     * 特殊版本信息（查询镜像列表、查询镜像详情）
     */
    private String specialVersion;

    /**
     * 镜像创建时间（查询镜像列表、查询镜像详情）
     */
    private String createTime;

    /**
     * 镜像状态（查询镜像列表、查询镜像详情）
     */
    private String status;

    /**
     * 镜像是否加密（查询镜像列表、查询镜像详情）
     */
    private Boolean encrypted;

    /**
     * 是否为大镜像（包含所有CDS盘）（查询镜像列表、查询镜像详情）
     */
    @JsonProperty("package")
    private Boolean bccPackage;

    /**
     * 镜像描述（查询镜像列表、查询镜像详情）
     */
    private String desc;

    /**
     * 磁盘大小（查询镜像详情）
     */
    private Integer diskSize;

    /**
     * 创建实例时所需的最小磁盘大小，单位GB（查询镜像详情）
     */
    private Integer minDiskGb;

    /**
     * 临时盘大小（查询镜像详情）
     */
    private Integer ephemeralSize;

    /**
     * 镜像关联的快照列表（查询镜像详情）
     */
    private List<SnapshotModel> snapshots;

    public ImageModel setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public ImageModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public ImageModel setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public ImageModel setOsType(String osType) {
        this.osType = osType;
        return this;
    }

    public String getOsType() {
        return this.osType;
    }

    public ImageModel setOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public ImageModel setOsArch(String osArch) {
        this.osArch = osArch;
        return this;
    }

    public String getOsArch() {
        return this.osArch;
    }

    public ImageModel setOsName(String osName) {
        this.osName = osName;
        return this;
    }

    public String getOsName() {
        return this.osName;
    }

    public ImageModel setOsBuild(String osBuild) {
        this.osBuild = osBuild;
        return this;
    }

    public String getOsBuild() {
        return this.osBuild;
    }

    public ImageModel setOsLang(String osLang) {
        this.osLang = osLang;
        return this;
    }

    public String getOsLang() {
        return this.osLang;
    }

    public ImageModel setSpecialVersion(String specialVersion) {
        this.specialVersion = specialVersion;
        return this;
    }

    public String getSpecialVersion() {
        return this.specialVersion;
    }

    public ImageModel setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public ImageModel setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public ImageModel setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    public ImageModel setPackage(Boolean bccPackage) {
        this.bccPackage = bccPackage;
        return this;
    }

    public Boolean getPackage() {
        return this.bccPackage;
    }

    public ImageModel setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getDesc() {
        return this.desc;
    }

    public ImageModel setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }

    public Integer getDiskSize() {
        return this.diskSize;
    }

    public ImageModel setMinDiskGb(Integer minDiskGb) {
        this.minDiskGb = minDiskGb;
        return this;
    }

    public Integer getMinDiskGb() {
        return this.minDiskGb;
    }

    public ImageModel setEphemeralSize(Integer ephemeralSize) {
        this.ephemeralSize = ephemeralSize;
        return this;
    }

    public Integer getEphemeralSize() {
        return this.ephemeralSize;
    }

    public ImageModel setSnapshots(List<SnapshotModel> snapshots) {
        this.snapshots = snapshots;
        return this;
    }

    public List<SnapshotModel> getSnapshots() {
        return this.snapshots;
    }

    @Override
    public String toString() {
        return "ImageModel{" + "id=" + id + "\n" + "name=" + name + "\n" + "type=" + type + "\n" + "osType=" + osType + "\n" + "osVersion=" + osVersion + "\n" + "osArch=" + osArch
                + "\n" + "osName=" + osName + "\n" + "osBuild=" + osBuild + "\n" + "osLang=" + osLang + "\n" + "specialVersion=" + specialVersion + "\n" + "createTime="
                + createTime + "\n" + "status=" + status + "\n" + "encrypted=" + encrypted + "\n" + "bccPackage=" + bccPackage + "\n" + "desc=" + desc + "\n" + "diskSize="
                + diskSize + "\n" + "minDiskGb=" + minDiskGb + "\n" + "ephemeralSize=" + ephemeralSize + "\n" + "snapshots=" + snapshots + "\n" + "}";
    }

}