package com.baidubce.rds.models;

import java.lang.String;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SimpleVpcVo {
    /**
     * vpcID。
     */
    private String vpcId;

    /**
     * vpc短ID。
     */
    private String shortId;

    /**
     * vpc名称。
     */
    private String name;

    /**
     * Ipv4地址（vpc主网络）。
     */
    private String cidr;

    /**
     * 子网状态 0表示可用、1表示创建中、大于等于2时表示不可用。
     */
    private Integer status;

    /**
     * 创建时间。格式：yyyy-MM-dd'T'HH:mm:ss'Z'。
     */
    private String createTime;

    /**
     * 子网描述。
     */
    private String description;

    /**
     * 是否默认子网。 true：有、false：没有；默认false。
     */
    private Boolean defaultVpc;

    /**
     * IPv6地址。
     */
    private String ipv6Cidr;

    /**
     * Ipv4地址（vpc辅网络）。
     */
    private List<String> auxiliaryCidr;

    /**
     * 是否开启replay。true：开启、false：未开启；默认false。
     */
    private Boolean relay;

    public SimpleVpcVo setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public SimpleVpcVo setShortId(String shortId) {
        this.shortId = shortId;
        return this;
    }

    public String getShortId() {
        return this.shortId;
    }

    public SimpleVpcVo setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public SimpleVpcVo setCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    public String getCidr() {
        return this.cidr;
    }

    public SimpleVpcVo setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Integer getStatus() {
        return this.status;
    }

    public SimpleVpcVo setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public SimpleVpcVo setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public SimpleVpcVo setDefaultVpc(Boolean defaultVpc) {
        this.defaultVpc = defaultVpc;
        return this;
    }

    public Boolean getDefaultVpc() {
        return this.defaultVpc;
    }

    public SimpleVpcVo setIpv6Cidr(String ipv6Cidr) {
        this.ipv6Cidr = ipv6Cidr;
        return this;
    }

    public String getIpv6Cidr() {
        return this.ipv6Cidr;
    }

    public SimpleVpcVo setAuxiliaryCidr(List<String> auxiliaryCidr) {
        this.auxiliaryCidr = auxiliaryCidr;
        return this;
    }

    public List<String> getAuxiliaryCidr() {
        return this.auxiliaryCidr;
    }

    public SimpleVpcVo setRelay(Boolean relay) {
        this.relay = relay;
        return this;
    }

    public Boolean getRelay() {
        return this.relay;
    }

    @Override
    public String toString() {
        return "SimpleVpcVo{" + "vpcId=" + vpcId + "\n" + "shortId=" + shortId + "\n" + "name=" + name + "\n" + "cidr=" + cidr + "\n" + "status=" + status + "\n" + "createTime="
                + createTime + "\n" + "description=" + description + "\n" + "defaultVpc=" + defaultVpc + "\n" + "ipv6Cidr=" + ipv6Cidr + "\n" + "auxiliaryCidr=" + auxiliaryCidr
                + "\n" + "relay=" + relay + "\n" + "}";
    }

}