package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetNatResponse extends BaseBceResponse {

    /**
    * NAT网关的ID
    */
    private String id;

    /**
    * NAT网关名称
    */
    private String name;

    /**
    * NAT网关类型，enhanced表示增强型，normal表示普通型
    */
    private String natType;

    /**
    * NAT网关所属VPC的ID
    */
    private String vpcId;

    /**
    * 普通型NAT网关的大小，有small(最多支持绑定5个公网IP)、medium(最多支持绑定10个公网IP)、large(最多支持绑定15个公网IP)三种
    */
    private String spec;

    /**
    * NAT网关的CU数量，仅适用于增强型NAT网关
    */
    private Integer cuNum;

    /**
    * NAT网关绑定的EIP的IP地址列表，仅适用于增强型NAT网关
    */
    private List<String> bindEips;

    /**
    * NAT网关的状态
    */
    private String status;

    /**
    * NAT IP类型，v4/v6
    */
    private String ipVersion;

    /**
    * 付费方式 预付费Prepaid 后付费Postpaid
    */
    private String paymentTiming;

    /**
    * 过期时间
    */
    private String expiredTime;

    /**
    * 创建时间
    */
    private String createTime;

    /**
    * NAT网关绑定的标签列表
    */
    private List<TagModel> tags;

    /**
    * 是否开启释放保护
    */
    private Boolean deleteProtect;

    public String getId() {
        return id;
    }

    public GetNatResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public GetNatResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getNatType() {
        return natType;
    }

    public GetNatResponse setNatType(String natType) {
        this.natType = natType;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public GetNatResponse setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getSpec() {
        return spec;
    }

    public GetNatResponse setSpec(String spec) {
        this.spec = spec;
        return this;
    }

    public Integer getCuNum() {
        return cuNum;
    }

    public GetNatResponse setCuNum(Integer cuNum) {
        this.cuNum = cuNum;
        return this;
    }

    public List<String> getBindEips() {
        return bindEips;
    }

    public GetNatResponse setBindEips(List<String> bindEips) {
        this.bindEips = bindEips;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public GetNatResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getIpVersion() {
        return ipVersion;
    }

    public GetNatResponse setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    public String getPaymentTiming() {
        return paymentTiming;
    }

    public GetNatResponse setPaymentTiming(String paymentTiming) {
        this.paymentTiming = paymentTiming;
        return this;
    }

    public String getExpiredTime() {
        return expiredTime;
    }

    public GetNatResponse setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public GetNatResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public GetNatResponse setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    public Boolean getDeleteProtect() {
        return deleteProtect;
    }

    public GetNatResponse setDeleteProtect(Boolean deleteProtect) {
        this.deleteProtect = deleteProtect;
        return this;
    }

    @Override
    public String toString() {
        return "GetNatResponse{" + "id=" + id + "\n" + "name=" + name + "\n" + "natType=" + natType + "\n" + "vpcId=" + vpcId + "\n" + "spec=" + spec + "\n" + "cuNum=" + cuNum
                + "\n" + "bindEips=" + bindEips + "\n" + "status=" + status + "\n" + "ipVersion=" + ipVersion + "\n" + "paymentTiming=" + paymentTiming + "\n" + "expiredTime="
                + expiredTime + "\n" + "createTime=" + createTime + "\n" + "tags=" + tags + "\n" + "deleteProtect=" + deleteProtect + "\n" + "}";
    }

}
