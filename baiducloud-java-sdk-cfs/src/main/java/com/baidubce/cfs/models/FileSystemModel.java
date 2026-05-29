package com.baidubce.cfs.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FileSystemModel {
    /**
     * 
     */
    private String fsId;

    /**
     * 
     */
    private String fsName;

    /**
     * 
     */
    private String vpcId;

    /**
     * 
     */
    private String type;

    /**
     * 
     */
    private String protocol;

    /**
     * 
     */
    private String fsUsage;

    /**
     * 
     */
    private String zone;

    /**
     * 
     */
    private String status;

    /**
     * 
     */
    private String kmSKeyId;

    /**
     * 
     */
    private String createTime;

    /**
     * 
     */
    private Integer capacityQuota;

    /**
     * 
     */
    private List<Object> mountTargetList;

    /**
     * 
     */
    private List<Object> tags;

    public FileSystemModel setFsId(String fsId) {
        this.fsId = fsId;
        return this;
    }

    public String getFsId() {
        return this.fsId;
    }

    public FileSystemModel setFsName(String fsName) {
        this.fsName = fsName;
        return this;
    }

    public String getFsName() {
        return this.fsName;
    }

    public FileSystemModel setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public FileSystemModel setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public FileSystemModel setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public FileSystemModel setFsUsage(String fsUsage) {
        this.fsUsage = fsUsage;
        return this;
    }

    public String getFsUsage() {
        return this.fsUsage;
    }

    public FileSystemModel setZone(String zone) {
        this.zone = zone;
        return this;
    }

    public String getZone() {
        return this.zone;
    }

    public FileSystemModel setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public FileSystemModel setKmSKeyId(String kmSKeyId) {
        this.kmSKeyId = kmSKeyId;
        return this;
    }

    public String getKmSKeyId() {
        return this.kmSKeyId;
    }

    public FileSystemModel setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public FileSystemModel setCapacityQuota(Integer capacityQuota) {
        this.capacityQuota = capacityQuota;
        return this;
    }

    public Integer getCapacityQuota() {
        return this.capacityQuota;
    }

    public FileSystemModel setMountTargetList(List<Object> mountTargetList) {
        this.mountTargetList = mountTargetList;
        return this;
    }

    public List<Object> getMountTargetList() {
        return this.mountTargetList;
    }

    public FileSystemModel setTags(List<Object> tags) {
        this.tags = tags;
        return this;
    }

    public List<Object> getTags() {
        return this.tags;
    }

    @Override
    public String toString() {
        return "FileSystemModel{" + "fsId=" + fsId + "\n" + "fsName=" + fsName + "\n" + "vpcId=" + vpcId + "\n" + "type=" + type + "\n" + "protocol=" + protocol + "\n"
                + "fsUsage=" + fsUsage + "\n" + "zone=" + zone + "\n" + "status=" + status + "\n" + "kmSKeyId=" + kmSKeyId + "\n" + "createTime=" + createTime + "\n"
                + "capacityQuota=" + capacityQuota + "\n" + "mountTargetList=" + mountTargetList + "\n" + "tags=" + tags + "\n" + "}";
    }

}