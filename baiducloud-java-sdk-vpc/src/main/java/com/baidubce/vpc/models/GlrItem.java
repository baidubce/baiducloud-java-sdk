package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GlrItem {
    /**
     * 限速规则ID
     */
    private String glrId;

    /**
     * IP协议版本，取值"4"
     */
    private String ipVersion;

    /**
     * 限速规则名称
     */
    private String name;

    /**
     * 描述信息
     */
    private String description;

    /**
     * 服务类型： <br>perrconn-对等连接 <br>et-专线网关 <br> csn-云智能网
     */
    private String serviceType;

    /**
     * 子服务类型，当serviceType是csn时该字段存在值：<br>LOCAL 实例带宽 <br> PEER_CLOUD 云间互通 <br>PEER_EDGE 云边互通
     */
    private String subServiceType;

    /**
     * 资源ID
     */
    private String resourceId;

    /**
     * 流量方向
     */
    private String direction;

    /**
     * CIDR
     */
    private String cidr;

    /**
     * 带宽
     */
    private Integer bandwidth;

    /**
     * 是否启用
     */
    private Boolean enable;

    /**
     * 创建时间
     */
    private String createdTime;

    /**
     * 修改时间
     */
    private String updatedTime;

    public GlrItem setGlrId(String glrId) {
        this.glrId = glrId;
        return this;
    }

    public String getGlrId() {
        return this.glrId;
    }

    public GlrItem setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    public String getIpVersion() {
        return this.ipVersion;
    }

    public GlrItem setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public GlrItem setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public GlrItem setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    public String getServiceType() {
        return this.serviceType;
    }

    public GlrItem setSubServiceType(String subServiceType) {
        this.subServiceType = subServiceType;
        return this;
    }

    public String getSubServiceType() {
        return this.subServiceType;
    }

    public GlrItem setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    public String getResourceId() {
        return this.resourceId;
    }

    public GlrItem setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    public String getDirection() {
        return this.direction;
    }

    public GlrItem setCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    public String getCidr() {
        return this.cidr;
    }

    public GlrItem setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public GlrItem setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    public Boolean getEnable() {
        return this.enable;
    }

    public GlrItem setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getCreatedTime() {
        return this.createdTime;
    }

    public GlrItem setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    public String getUpdatedTime() {
        return this.updatedTime;
    }

    @Override
    public String toString() {
        return "GlrItem{" + "glrId=" + glrId + "\n" + "ipVersion=" + ipVersion + "\n" + "name=" + name + "\n" + "description=" + description + "\n" + "serviceType=" + serviceType
                + "\n" + "subServiceType=" + subServiceType + "\n" + "resourceId=" + resourceId + "\n" + "direction=" + direction + "\n" + "cidr=" + cidr + "\n" + "bandwidth="
                + bandwidth + "\n" + "enable=" + enable + "\n" + "createdTime=" + createdTime + "\n" + "updatedTime=" + updatedTime + "\n" + "}";
    }

}