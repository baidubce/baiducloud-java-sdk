package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetBidInstancePriceRequest extends BaseBceRequest {

    /**
    * 套餐规格
    */
    private String spec;

    /**
    * 待创建虚拟机实例的系统盘大小，单位GB，默认是40GB，范围为[40, 2048]GB，超过40GB按照云磁盘价格收费。注意指定的系统盘大小需要满足所使用镜像最小磁盘空间限制。
    */
    private Integer rootDiskSizeInGb;

    /**
    * 待创建虚拟机实例系统盘介质，默认使用SSD型云磁盘，可指定系统盘磁盘类型
    */
    private String rootDiskStorageType;

    /**
    * 待创建的CDS磁盘列表
    */
    private List<CreateCdsModel> createCdsList;

    /**
    * 公网带宽，单位Mbps，0~200，0表示不分配公网IP
    */
    private Integer networkCapacityInMbps;

    /**
    * 公网带宽计费方式
    */
    private String internetChargeType;

    /**
    * 批量创建（购买）的虚拟机实例个数，必须为大于0的整数，可选参数，缺省为1
    */
    private Integer purchaseCount;

    /**
    * 接口查询可用区列表。zoneName命名规范是“国家-region-可用区序列"，小写，例如北京可用区A为"cn-bj-a"。专属实例使用专属服务器所在zone,无需指定该字段。
    */
    private String zoneName;

    public String getSpec() {
        return spec;
    }

    public GetBidInstancePriceRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }

    public Integer getRootDiskSizeInGb() {
        return rootDiskSizeInGb;
    }

    public GetBidInstancePriceRequest setRootDiskSizeInGb(Integer rootDiskSizeInGb) {
        this.rootDiskSizeInGb = rootDiskSizeInGb;
        return this;
    }

    public String getRootDiskStorageType() {
        return rootDiskStorageType;
    }

    public GetBidInstancePriceRequest setRootDiskStorageType(String rootDiskStorageType) {
        this.rootDiskStorageType = rootDiskStorageType;
        return this;
    }

    public List<CreateCdsModel> getCreateCdsList() {
        return createCdsList;
    }

    public GetBidInstancePriceRequest setCreateCdsList(List<CreateCdsModel> createCdsList) {
        this.createCdsList = createCdsList;
        return this;
    }

    public Integer getNetworkCapacityInMbps() {
        return networkCapacityInMbps;
    }

    public GetBidInstancePriceRequest setNetworkCapacityInMbps(Integer networkCapacityInMbps) {
        this.networkCapacityInMbps = networkCapacityInMbps;
        return this;
    }

    public String getInternetChargeType() {
        return internetChargeType;
    }

    public GetBidInstancePriceRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }

    public Integer getPurchaseCount() {
        return purchaseCount;
    }

    public GetBidInstancePriceRequest setPurchaseCount(Integer purchaseCount) {
        this.purchaseCount = purchaseCount;
        return this;
    }

    public String getZoneName() {
        return zoneName;
    }

    public GetBidInstancePriceRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

}
