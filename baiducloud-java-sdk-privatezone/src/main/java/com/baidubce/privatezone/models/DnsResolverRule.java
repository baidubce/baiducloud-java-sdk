package com.baidubce.privatezone.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DnsResolverRule {
    /**
     * 转发规则 ID
     */
    private String id;

    /**
     * 转发规则名称
     */
    private String name;

    /**
     * 转发规则状态：BOUND（已关联 VPC）、UNBOUND（未关联 VPC）、BINDING（关联中）、UNBINDING（解除关联中）
     */
    private String status;

    /**
     * 转发规则描述
     */
    private String description;

    /**
     * 转发的私有域
     */
    private String zone;

    /**
     * 出站解析器的 ID
     */
    private String resolverId;

    /**
     * 出站解析器所在的地区
     */
    private String resolverRegion;

    /**
     * 外部 DNS 系统的 IP 地址和端口
     */
    private List<DnsServerConfig> dnsServerConfigs;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 更新时间
     */
    private String updateTime;

    public DnsResolverRule setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public DnsResolverRule setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public DnsResolverRule setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public DnsResolverRule setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public DnsResolverRule setZone(String zone) {
        this.zone = zone;
        return this;
    }

    public String getZone() {
        return this.zone;
    }

    public DnsResolverRule setResolverId(String resolverId) {
        this.resolverId = resolverId;
        return this;
    }

    public String getResolverId() {
        return this.resolverId;
    }

    public DnsResolverRule setResolverRegion(String resolverRegion) {
        this.resolverRegion = resolverRegion;
        return this;
    }

    public String getResolverRegion() {
        return this.resolverRegion;
    }

    public DnsResolverRule setDnsServerConfigs(List<DnsServerConfig> dnsServerConfigs) {
        this.dnsServerConfigs = dnsServerConfigs;
        return this;
    }

    public List<DnsServerConfig> getDnsServerConfigs() {
        return this.dnsServerConfigs;
    }

    public DnsResolverRule setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public DnsResolverRule setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    @Override
    public String toString() {
        return "DnsResolverRule{" + "id=" + id + "\n" + "name=" + name + "\n" + "status=" + status + "\n" + "description=" + description + "\n" + "zone=" + zone + "\n"
                + "resolverId=" + resolverId + "\n" + "resolverRegion=" + resolverRegion + "\n" + "dnsServerConfigs=" + dnsServerConfigs + "\n" + "createTime=" + createTime + "\n"
                + "updateTime=" + updateTime + "\n" + "}";
    }

}