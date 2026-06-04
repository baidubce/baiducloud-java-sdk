package com.baidubce.privatezone.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetDnsResolverRuleDetailResponse extends BaseBceResponse {

    /**
    * 解析器ID
    */
    private String id;

    /**
    * 解析器名称
    */
    private String name;

    /**
    * 转发规则的状态：<br>BOUND：已关联vpc<br>UNBOUND：未关联vpc<br>BINGDING：关联中<br>UNBINGDING：解除关联中
    */
    private String status;

    /**
    * 解析器描述
    */
    private String description;

    /**
    * 转发私有域
    */
    private String zone;

    /**
    * 出站解析器的ID
    */
    private String resolverId;

    /**
    * 出站解析器的地区
    */
    private String resolverRegion;

    /**
    * 外部DNS系统的IP地址和端口
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

    public String getId() {
        return id;
    }

    public GetDnsResolverRuleDetailResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public GetDnsResolverRuleDetailResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public GetDnsResolverRuleDetailResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public GetDnsResolverRuleDetailResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getZone() {
        return zone;
    }

    public GetDnsResolverRuleDetailResponse setZone(String zone) {
        this.zone = zone;
        return this;
    }

    public String getResolverId() {
        return resolverId;
    }

    public GetDnsResolverRuleDetailResponse setResolverId(String resolverId) {
        this.resolverId = resolverId;
        return this;
    }

    public String getResolverRegion() {
        return resolverRegion;
    }

    public GetDnsResolverRuleDetailResponse setResolverRegion(String resolverRegion) {
        this.resolverRegion = resolverRegion;
        return this;
    }

    public List<DnsServerConfig> getDnsServerConfigs() {
        return dnsServerConfigs;
    }

    public GetDnsResolverRuleDetailResponse setDnsServerConfigs(List<DnsServerConfig> dnsServerConfigs) {
        this.dnsServerConfigs = dnsServerConfigs;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public GetDnsResolverRuleDetailResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public GetDnsResolverRuleDetailResponse setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public String toString() {
        return "GetDnsResolverRuleDetailResponse{" + "id=" + id + "\n" + "name=" + name + "\n" + "status=" + status + "\n" + "description=" + description + "\n" + "zone=" + zone
                + "\n" + "resolverId=" + resolverId + "\n" + "resolverRegion=" + resolverRegion + "\n" + "dnsServerConfigs=" + dnsServerConfigs + "\n" + "createTime=" + createTime
                + "\n" + "updateTime=" + updateTime + "\n" + "}";
    }

}
