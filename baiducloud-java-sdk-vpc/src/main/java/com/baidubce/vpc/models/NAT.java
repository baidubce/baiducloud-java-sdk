package com.baidubce.vpc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NAT {
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
     * NAT网关的CU数量
     */
    private Integer cuNum;

    /**
     * NAT网关的大小，有small(最多支持绑定5个公网IP)、medium(最多支持绑定10个公网IP)、large(最多支持绑定15个公网IP)三种，仅适用于普通型NAT网关
     */
    private String spec;

    /**
     * NAT网关绑定的EIP的IP地址列表
     */
    private List<String> bindEips;

    /**
     * NAT网关的状态
     */
    private String status;

    /**
     * 付费方式 预付费Prepaid 后付费Postpaid
     */
    private String paymentTiming;

    /**
     * sessionConfig
     */
    private SessionConfig sessionConfig;

    /**
     * ip类型，v4/v6
     */
    private String ipVersion;

    /**
     * 过期时间
     */
    private String expiredTime;

    /**
     * 创建时间
     */
    private String createTime;

    public NAT setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public NAT setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public NAT setNatType(String natType) {
        this.natType = natType;
        return this;
    }

    public String getNatType() {
        return this.natType;
    }

    public NAT setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public NAT setCuNum(Integer cuNum) {
        this.cuNum = cuNum;
        return this;
    }

    public Integer getCuNum() {
        return this.cuNum;
    }

    public NAT setSpec(String spec) {
        this.spec = spec;
        return this;
    }

    public String getSpec() {
        return this.spec;
    }

    public NAT setBindEips(List<String> bindEips) {
        this.bindEips = bindEips;
        return this;
    }

    public List<String> getBindEips() {
        return this.bindEips;
    }

    public NAT setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public NAT setPaymentTiming(String paymentTiming) {
        this.paymentTiming = paymentTiming;
        return this;
    }

    public String getPaymentTiming() {
        return this.paymentTiming;
    }

    public NAT setSessionConfig(SessionConfig sessionConfig) {
        this.sessionConfig = sessionConfig;
        return this;
    }

    public SessionConfig getSessionConfig() {
        return this.sessionConfig;
    }

    public NAT setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    public String getIpVersion() {
        return this.ipVersion;
    }

    public NAT setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }

    public String getExpiredTime() {
        return this.expiredTime;
    }

    public NAT setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    @Override
    public String toString() {
        return "NAT{" + "id=" + id + "\n" + "name=" + name + "\n" + "natType=" + natType + "\n" + "vpcId=" + vpcId + "\n" + "cuNum=" + cuNum + "\n" + "spec=" + spec + "\n"
                + "bindEips=" + bindEips + "\n" + "status=" + status + "\n" + "paymentTiming=" + paymentTiming + "\n" + "sessionConfig=" + sessionConfig + "\n" + "ipVersion="
                + ipVersion + "\n" + "expiredTime=" + expiredTime + "\n" + "createTime=" + createTime + "\n" + "}";
    }

}