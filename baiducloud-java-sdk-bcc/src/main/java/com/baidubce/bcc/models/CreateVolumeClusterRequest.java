package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateVolumeClusterRequest extends BaseBceRequest {

    /**
    * 指定可用区信息，默认为空，由系统自动选择。
    */
    private String zoneName;

    /**
    * 创建CDS专属集群的名字。
    */
    private String clusterName;

    /**
    * 集群总容量单位GB，最小容量85TB，最大容量1015TB，购买步长10TB。
    */
    private Integer clusterSizeInGB;

    /**
    * CDS磁盘存储类型，包括enhanced_ssd_pl0【增强型SSD_PL0】，enhanced_ssd_pl1【增强型SSD_PL1】，enhanced_ssd_pl2【增强型SSD_PL2】，enhanced_ssd_pl3【增强型SSD_PL3】，cloud_hp1 或 premium_ssd 【通用型SSD】 和 hp1 或 ssd
    * 【高性能云磁盘】 六种云盘类型，elastic_ephemeral_disk【弹性临时盘_标准型】一种弹性临时盘类型，默认 hp1。
    */
    private String storageType;

    /**
    * 创建CDS专属集群的数量，必须大于0的证书，缺省值为1
    */
    private Integer purchaseCount;

    /**
    * billing
    */
    private Billing billing;

    /**
    * 待创建的标签列表
    */
    private List<TagModel> tags;

    public String getZoneName() {
        return zoneName;
    }

    public CreateVolumeClusterRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getClusterName() {
        return clusterName;
    }

    public CreateVolumeClusterRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    public Integer getClusterSizeInGB() {
        return clusterSizeInGB;
    }

    public CreateVolumeClusterRequest setClusterSizeInGB(Integer clusterSizeInGB) {
        this.clusterSizeInGB = clusterSizeInGB;
        return this;
    }

    public String getStorageType() {
        return storageType;
    }

    public CreateVolumeClusterRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    public Integer getPurchaseCount() {
        return purchaseCount;
    }

    public CreateVolumeClusterRequest setPurchaseCount(Integer purchaseCount) {
        this.purchaseCount = purchaseCount;
        return this;
    }

    public Billing getBilling() {
        return billing;
    }

    public CreateVolumeClusterRequest setBilling(Billing billing) {
        this.billing = billing;
        return this;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public CreateVolumeClusterRequest setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

}
