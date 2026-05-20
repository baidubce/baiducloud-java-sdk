package com.baidubce.vpc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EtGateway {
    /**
     * 专线网关id
     */
    private String etGatewayId;

    /**
     * 专线网关名称
     */
    private String name;

    /**
     * 专线网关状态
     */
    private String status;

    /**
     * 出口带宽
     */
    private Integer speed;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 专线网关描述
     */
    private String description;

    /**
     * 虚拟网络id
     */
    private String vpcId;

    /**
     * 专线id
     */
    private String etId;

    /**
     * 专线通道id
     */
    private String channelId;

    /**
     * IPv4云端网络
     */
    private List<String> localCidrs;

    /**
     * IPv6功能是否开启，1是0否
     */
    private Integer enableIpv6;

    /**
     * IPv6云端网络
     */
    private List<String> ipv6LocalCidrs;

    /**
     * 专线网关绑定的标签集合
     */
    private List<TagModel> tags;

    public EtGateway setEtGatewayId(String etGatewayId) {
        this.etGatewayId = etGatewayId;
        return this;
    }

    public String getEtGatewayId() {
        return this.etGatewayId;
    }

    public EtGateway setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public EtGateway setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public EtGateway setSpeed(Integer speed) {
        this.speed = speed;
        return this;
    }

    public Integer getSpeed() {
        return this.speed;
    }

    public EtGateway setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public EtGateway setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public EtGateway setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public EtGateway setEtId(String etId) {
        this.etId = etId;
        return this;
    }

    public String getEtId() {
        return this.etId;
    }

    public EtGateway setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    public String getChannelId() {
        return this.channelId;
    }

    public EtGateway setLocalCidrs(List<String> localCidrs) {
        this.localCidrs = localCidrs;
        return this;
    }

    public List<String> getLocalCidrs() {
        return this.localCidrs;
    }

    public EtGateway setEnableIpv6(Integer enableIpv6) {
        this.enableIpv6 = enableIpv6;
        return this;
    }

    public Integer getEnableIpv6() {
        return this.enableIpv6;
    }

    public EtGateway setIpv6LocalCidrs(List<String> ipv6LocalCidrs) {
        this.ipv6LocalCidrs = ipv6LocalCidrs;
        return this;
    }

    public List<String> getIpv6LocalCidrs() {
        return this.ipv6LocalCidrs;
    }

    public EtGateway setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    public List<TagModel> getTags() {
        return this.tags;
    }

    @Override
    public String toString() {
        return "EtGateway{" + "etGatewayId=" + etGatewayId + "\n" + "name=" + name + "\n" + "status=" + status + "\n" + "speed=" + speed + "\n" + "createTime=" + createTime + "\n"
                + "description=" + description + "\n" + "vpcId=" + vpcId + "\n" + "etId=" + etId + "\n" + "channelId=" + channelId + "\n" + "localCidrs=" + localCidrs + "\n"
                + "enableIpv6=" + enableIpv6 + "\n" + "ipv6LocalCidrs=" + ipv6LocalCidrs + "\n" + "tags=" + tags + "\n" + "}";
    }

}