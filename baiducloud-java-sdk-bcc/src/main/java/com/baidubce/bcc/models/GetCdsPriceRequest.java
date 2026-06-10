package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetCdsPriceRequest extends BaseBceRequest {

    /**
    * CDS磁盘存储类型，包括enhanced_ssd_pl0【增强型SSD_PL0】，enhanced_ssd_pl1【增强型SSD_PL1】，enhanced_ssd_pl2【增强型SSD_PL2】，enhanced_ssd_pl3【增强型SSD_PL3】，cloud_hp1 或 premium_ssd 【通用型SSD】 和 hp1 或 ssd
    * 【高性能云磁盘】 六种云盘类型，elastic_ephemeral_disk【弹性临时盘_标准型】一种弹性临时盘类型，默认 hp1。
    */
    private String storageType;

    /**
    * CDS磁盘容量
    */
    private Integer cdsSizeInGB;

    /**
    * 付费方式，包括Postpaid（后付费），Prepaid（预付费）两种
    */
    private String paymentTiming;

    /**
    * 可用区名称
    */
    private String zoneName;

    /**
    * 任意数量CDS的总价格，必须为大于0的整数，可选参数，缺省为1
    */
    private Integer purchaseCount;

    /**
    * 时长，可选值[1,2,3,4,5,6,7,8,9,12,24,36]，单位：月
    */
    private Integer purchaseLength;

    /**
    * 增强型SSD_PL1、增强型SSD_PL2、增强型SSD_PL3，支持购买额外IO性能
    */
    private Integer cdsExtraIo;

    public String getStorageType() {
        return storageType;
    }

    public GetCdsPriceRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    public Integer getCdsSizeInGB() {
        return cdsSizeInGB;
    }

    public GetCdsPriceRequest setCdsSizeInGB(Integer cdsSizeInGB) {
        this.cdsSizeInGB = cdsSizeInGB;
        return this;
    }

    public String getPaymentTiming() {
        return paymentTiming;
    }

    public GetCdsPriceRequest setPaymentTiming(String paymentTiming) {
        this.paymentTiming = paymentTiming;
        return this;
    }

    public String getZoneName() {
        return zoneName;
    }

    public GetCdsPriceRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public Integer getPurchaseCount() {
        return purchaseCount;
    }

    public GetCdsPriceRequest setPurchaseCount(Integer purchaseCount) {
        this.purchaseCount = purchaseCount;
        return this;
    }

    public Integer getPurchaseLength() {
        return purchaseLength;
    }

    public GetCdsPriceRequest setPurchaseLength(Integer purchaseLength) {
        this.purchaseLength = purchaseLength;
        return this;
    }

    public Integer getCdsExtraIo() {
        return cdsExtraIo;
    }

    public GetCdsPriceRequest setCdsExtraIo(Integer cdsExtraIo) {
        this.cdsExtraIo = cdsExtraIo;
        return this;
    }

}
