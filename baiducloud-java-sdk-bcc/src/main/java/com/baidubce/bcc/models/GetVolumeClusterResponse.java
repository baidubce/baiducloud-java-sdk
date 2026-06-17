package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetVolumeClusterResponse extends BaseBceResponse {

    /**
    * 专属集群ID
    */
    private String clusterId;

    /**
    * 专属集群名称,支持大小写字母、数字、中文以及-_ /.特殊字符，必须以字母开头，长度1-65
    */
    private String clusterName;

    /**
    * 创建日期，符合BCE日期规范
    */
    private String createdTime;

    /**
    * 过期时间，符合BCE日期规范。
    */
    private String expiredTime;

    /**
    * 专属集群状态
    */
    private String status;

    /**
    * 可用区
    */
    private String logicalZone;

    /**
    * 专属集群付费类型
    */
    private String productType;

    /**
    * 专属集群类型
    */
    private String clusterType;

    /**
    * 专属集群总容量
    */
    private Integer totalCapacity;

    /**
    * 专属集群已使用容量
    */
    private Integer usedCapacity;

    /**
    * 专属集群可用容量
    */
    private Integer availableCapacity;

    /**
    * 专属集群扩展容量
    */
    private Integer expandingCapacity;

    /**
    * 由专属集群创建的CDS数量
    */
    private Integer createdVolumeNum;

    /**
    * 由专属集群创建的CDS列表
    */
    private List<String> affiliatedCDSNumber;

    /**
    * 是否开启自动续费
    */
    private Boolean enableAutoRenew;

    /**
    * 绑定的标签
    */
    private List<TagModel> tags;

    public String getClusterId() {
        return clusterId;
    }

    public GetVolumeClusterResponse setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    public String getClusterName() {
        return clusterName;
    }

    public GetVolumeClusterResponse setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public GetVolumeClusterResponse setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getExpiredTime() {
        return expiredTime;
    }

    public GetVolumeClusterResponse setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public GetVolumeClusterResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getLogicalZone() {
        return logicalZone;
    }

    public GetVolumeClusterResponse setLogicalZone(String logicalZone) {
        this.logicalZone = logicalZone;
        return this;
    }

    public String getProductType() {
        return productType;
    }

    public GetVolumeClusterResponse setProductType(String productType) {
        this.productType = productType;
        return this;
    }

    public String getClusterType() {
        return clusterType;
    }

    public GetVolumeClusterResponse setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    public Integer getTotalCapacity() {
        return totalCapacity;
    }

    public GetVolumeClusterResponse setTotalCapacity(Integer totalCapacity) {
        this.totalCapacity = totalCapacity;
        return this;
    }

    public Integer getUsedCapacity() {
        return usedCapacity;
    }

    public GetVolumeClusterResponse setUsedCapacity(Integer usedCapacity) {
        this.usedCapacity = usedCapacity;
        return this;
    }

    public Integer getAvailableCapacity() {
        return availableCapacity;
    }

    public GetVolumeClusterResponse setAvailableCapacity(Integer availableCapacity) {
        this.availableCapacity = availableCapacity;
        return this;
    }

    public Integer getExpandingCapacity() {
        return expandingCapacity;
    }

    public GetVolumeClusterResponse setExpandingCapacity(Integer expandingCapacity) {
        this.expandingCapacity = expandingCapacity;
        return this;
    }

    public Integer getCreatedVolumeNum() {
        return createdVolumeNum;
    }

    public GetVolumeClusterResponse setCreatedVolumeNum(Integer createdVolumeNum) {
        this.createdVolumeNum = createdVolumeNum;
        return this;
    }

    public List<String> getAffiliatedCDSNumber() {
        return affiliatedCDSNumber;
    }

    public GetVolumeClusterResponse setAffiliatedCDSNumber(List<String> affiliatedCDSNumber) {
        this.affiliatedCDSNumber = affiliatedCDSNumber;
        return this;
    }

    public Boolean getEnableAutoRenew() {
        return enableAutoRenew;
    }

    public GetVolumeClusterResponse setEnableAutoRenew(Boolean enableAutoRenew) {
        this.enableAutoRenew = enableAutoRenew;
        return this;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public GetVolumeClusterResponse setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return "GetVolumeClusterResponse{" + "clusterId=" + clusterId + "\n" + "clusterName=" + clusterName + "\n" + "createdTime=" + createdTime + "\n" + "expiredTime="
                + expiredTime + "\n" + "status=" + status + "\n" + "logicalZone=" + logicalZone + "\n" + "productType=" + productType + "\n" + "clusterType=" + clusterType + "\n"
                + "totalCapacity=" + totalCapacity + "\n" + "usedCapacity=" + usedCapacity + "\n" + "availableCapacity=" + availableCapacity + "\n" + "expandingCapacity="
                + expandingCapacity + "\n" + "createdVolumeNum=" + createdVolumeNum + "\n" + "affiliatedCDSNumber=" + affiliatedCDSNumber + "\n" + "enableAutoRenew="
                + enableAutoRenew + "\n" + "tags=" + tags + "\n" + "}";
    }

}
