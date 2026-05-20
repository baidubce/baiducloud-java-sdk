package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryTheDetailsOfTheDedicatedGatewayResponse extends BaseBceResponse {

    /**
    * 专线网关的ID
    */
    private String etGatewayId;

    /**
    * 专线网关的名称
    */
    private String name;

    /**
    * 专线网关的状态
    */
    private String status;

    /**
    * 专线网关带宽的限速值，单位为Mbps
    */
    private Integer speed;

    /**
    * 创建时间
    */
    private String createTime;

    /**
    * 专线网关的描述
    */
    private String description;

    /**
    * 专线网关所属VPC的ID
    */
    private String vpcId;

    /**
    * 绑定的物理专线的ID
    */
    private String etId;

    /**
    * 绑定的专线通道的ID
    */
    private String channelId;

    /**
    * 专线网关的IPv4云端网络
    */
    private List<String> localCidrs;

    /**
    * IPv6功能是否开启，1是0否
    */
    private Integer enableIpv6;

    /**
    * 专线网关的IPv6云端网络
    */
    private List<String> ipv6LocalCidrs;

    /**
    * 健康检查的源IP
    */
    private String healthCheckSourceIp;

    /**
    * 健康检查的目的IP
    */
    private String healthCheckDestIp;

    /**
    * 健康检查的间隔
    */
    private Integer healthCheckInterval;

    /**
    * 健康的阈值
    */
    private Integer healthThreshold;

    /**
    * 不健康的阈值
    */
    private Integer unhealthThreshold;

    /**
    * 健康检查的方式
    */
    private String healthCheckType;

    /**
    * 健康检查的端口
    */
    private Integer healthCheckPort;

    /**
    * 专线网关绑定的标签集合
    */
    private List<TagModel> tags;

    public String getEtGatewayId() {
        return etGatewayId;
    }

    public QueryTheDetailsOfTheDedicatedGatewayResponse setEtGatewayId(String etGatewayId) {
        this.etGatewayId = etGatewayId;
        return this;
    }

    public String getName() {
        return name;
    }

    public QueryTheDetailsOfTheDedicatedGatewayResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public QueryTheDetailsOfTheDedicatedGatewayResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public Integer getSpeed() {
        return speed;
    }

    public QueryTheDetailsOfTheDedicatedGatewayResponse setSpeed(Integer speed) {
        this.speed = speed;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public QueryTheDetailsOfTheDedicatedGatewayResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public QueryTheDetailsOfTheDedicatedGatewayResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public QueryTheDetailsOfTheDedicatedGatewayResponse setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getEtId() {
        return etId;
    }

    public QueryTheDetailsOfTheDedicatedGatewayResponse setEtId(String etId) {
        this.etId = etId;
        return this;
    }

    public String getChannelId() {
        return channelId;
    }

    public QueryTheDetailsOfTheDedicatedGatewayResponse setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    public List<String> getLocalCidrs() {
        return localCidrs;
    }

    public QueryTheDetailsOfTheDedicatedGatewayResponse setLocalCidrs(List<String> localCidrs) {
        this.localCidrs = localCidrs;
        return this;
    }

    public Integer getEnableIpv6() {
        return enableIpv6;
    }

    public QueryTheDetailsOfTheDedicatedGatewayResponse setEnableIpv6(Integer enableIpv6) {
        this.enableIpv6 = enableIpv6;
        return this;
    }

    public List<String> getIpv6LocalCidrs() {
        return ipv6LocalCidrs;
    }

    public QueryTheDetailsOfTheDedicatedGatewayResponse setIpv6LocalCidrs(List<String> ipv6LocalCidrs) {
        this.ipv6LocalCidrs = ipv6LocalCidrs;
        return this;
    }

    public String getHealthCheckSourceIp() {
        return healthCheckSourceIp;
    }

    public QueryTheDetailsOfTheDedicatedGatewayResponse setHealthCheckSourceIp(String healthCheckSourceIp) {
        this.healthCheckSourceIp = healthCheckSourceIp;
        return this;
    }

    public String getHealthCheckDestIp() {
        return healthCheckDestIp;
    }

    public QueryTheDetailsOfTheDedicatedGatewayResponse setHealthCheckDestIp(String healthCheckDestIp) {
        this.healthCheckDestIp = healthCheckDestIp;
        return this;
    }

    public Integer getHealthCheckInterval() {
        return healthCheckInterval;
    }

    public QueryTheDetailsOfTheDedicatedGatewayResponse setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }

    public Integer getHealthThreshold() {
        return healthThreshold;
    }

    public QueryTheDetailsOfTheDedicatedGatewayResponse setHealthThreshold(Integer healthThreshold) {
        this.healthThreshold = healthThreshold;
        return this;
    }

    public Integer getUnhealthThreshold() {
        return unhealthThreshold;
    }

    public QueryTheDetailsOfTheDedicatedGatewayResponse setUnhealthThreshold(Integer unhealthThreshold) {
        this.unhealthThreshold = unhealthThreshold;
        return this;
    }

    public String getHealthCheckType() {
        return healthCheckType;
    }

    public QueryTheDetailsOfTheDedicatedGatewayResponse setHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
        return this;
    }

    public Integer getHealthCheckPort() {
        return healthCheckPort;
    }

    public QueryTheDetailsOfTheDedicatedGatewayResponse setHealthCheckPort(Integer healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
        return this;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public QueryTheDetailsOfTheDedicatedGatewayResponse setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return "QueryTheDetailsOfTheDedicatedGatewayResponse{" + "etGatewayId=" + etGatewayId + "\n" + "name=" + name + "\n" + "status=" + status + "\n" + "speed=" + speed + "\n"
                + "createTime=" + createTime + "\n" + "description=" + description + "\n" + "vpcId=" + vpcId + "\n" + "etId=" + etId + "\n" + "channelId=" + channelId + "\n"
                + "localCidrs=" + localCidrs + "\n" + "enableIpv6=" + enableIpv6 + "\n" + "ipv6LocalCidrs=" + ipv6LocalCidrs + "\n" + "healthCheckSourceIp=" + healthCheckSourceIp
                + "\n" + "healthCheckDestIp=" + healthCheckDestIp + "\n" + "healthCheckInterval=" + healthCheckInterval + "\n" + "healthThreshold=" + healthThreshold + "\n"
                + "unhealthThreshold=" + unhealthThreshold + "\n" + "healthCheckType=" + healthCheckType + "\n" + "healthCheckPort=" + healthCheckPort + "\n" + "tags=" + tags
                + "\n" + "}";
    }

}
