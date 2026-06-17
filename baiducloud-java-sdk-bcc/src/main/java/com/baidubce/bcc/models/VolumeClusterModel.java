package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VolumeClusterModel {
    /**
     * 专属集群ID（专属集群列表接口返回）
     */
    private String clusterId;

    /**
     * 专属集群名称,支持大小写字母、数字、中文以及-_ /.特殊字符，必须以字母开头，长度1-65（专属集群列表接口返回）
     */
    private String clusterName;

    /**
     * 创建日期，符合BCE日期规范（专属集群列表接口返回）
     */
    private String createdTime;

    /**
     * 过期时间，符合BCE日期规范。（专属集群列表接口返回）
     */
    private String expiredTime;

    /**
     * 专属集群状态（专属集群列表接口返回）
     */
    private String status;

    /**
     * 可用区（专属集群列表接口返回）
     */
    private String logicalZone;

    /**
     * 专属集群付费类型（专属集群列表接口返回）
     */
    private String productType;

    /**
     * 专属集群类型（专属集群列表接口返回）
     */
    private String clusterType;

    /**
     * 专属集群总容量（专属集群列表接口返回）
     */
    private Integer totalCapacity;

    /**
     * 专属集群已使用容量（专属集群列表接口返回）
     */
    private Integer usedCapacity;

    /**
     * 专属集群可用容量（专属集群列表接口返回）
     */
    private Integer availableCapacity;

    /**
     * 专属集群扩展容量（专属集群列表接口返回）
     */
    private Integer expandingCapacity;

    /**
     * 由专属集群创建的CDS数量（专属集群列表接口返回）
     */
    private Integer createdVolumeNum;

    /**
     * 是否开启自动付费（专属集群列表接口返回）
     */
    private Boolean enableAutoRenew;

    public VolumeClusterModel setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    public String getClusterId() {
        return this.clusterId;
    }

    public VolumeClusterModel setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    public String getClusterName() {
        return this.clusterName;
    }

    public VolumeClusterModel setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getCreatedTime() {
        return this.createdTime;
    }

    public VolumeClusterModel setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }

    public String getExpiredTime() {
        return this.expiredTime;
    }

    public VolumeClusterModel setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public VolumeClusterModel setLogicalZone(String logicalZone) {
        this.logicalZone = logicalZone;
        return this;
    }

    public String getLogicalZone() {
        return this.logicalZone;
    }

    public VolumeClusterModel setProductType(String productType) {
        this.productType = productType;
        return this;
    }

    public String getProductType() {
        return this.productType;
    }

    public VolumeClusterModel setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    public String getClusterType() {
        return this.clusterType;
    }

    public VolumeClusterModel setTotalCapacity(Integer totalCapacity) {
        this.totalCapacity = totalCapacity;
        return this;
    }

    public Integer getTotalCapacity() {
        return this.totalCapacity;
    }

    public VolumeClusterModel setUsedCapacity(Integer usedCapacity) {
        this.usedCapacity = usedCapacity;
        return this;
    }

    public Integer getUsedCapacity() {
        return this.usedCapacity;
    }

    public VolumeClusterModel setAvailableCapacity(Integer availableCapacity) {
        this.availableCapacity = availableCapacity;
        return this;
    }

    public Integer getAvailableCapacity() {
        return this.availableCapacity;
    }

    public VolumeClusterModel setExpandingCapacity(Integer expandingCapacity) {
        this.expandingCapacity = expandingCapacity;
        return this;
    }

    public Integer getExpandingCapacity() {
        return this.expandingCapacity;
    }

    public VolumeClusterModel setCreatedVolumeNum(Integer createdVolumeNum) {
        this.createdVolumeNum = createdVolumeNum;
        return this;
    }

    public Integer getCreatedVolumeNum() {
        return this.createdVolumeNum;
    }

    public VolumeClusterModel setEnableAutoRenew(Boolean enableAutoRenew) {
        this.enableAutoRenew = enableAutoRenew;
        return this;
    }

    public Boolean getEnableAutoRenew() {
        return this.enableAutoRenew;
    }

    @Override
    public String toString() {
        return "VolumeClusterModel{" + "clusterId=" + clusterId + "\n" + "clusterName=" + clusterName + "\n" + "createdTime=" + createdTime + "\n" + "expiredTime=" + expiredTime
                + "\n" + "status=" + status + "\n" + "logicalZone=" + logicalZone + "\n" + "productType=" + productType + "\n" + "clusterType=" + clusterType + "\n"
                + "totalCapacity=" + totalCapacity + "\n" + "usedCapacity=" + usedCapacity + "\n" + "availableCapacity=" + availableCapacity + "\n" + "expandingCapacity="
                + expandingCapacity + "\n" + "createdVolumeNum=" + createdVolumeNum + "\n" + "enableAutoRenew=" + enableAutoRenew + "\n" + "}";
    }

}