package com.baidubce.privatezone.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateResolverRuleRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 转发规则名称，大小写字母、数字、中文以及 `-_/ .` 特殊字符，必须以字母或者中文开头，长度1-65
    */
    private String name;

    /**
    * 转发规则描述，最长不超过200个字符
    */
    private String description;

    /**
    * 转发的私有域
    */
    private String zone;

    /**
    * 必须为出站解析器，使用该出站终端节点将DNS查询流量转发到目标IP地址列表中指定的IP地址
    */
    private String resolverId;

    /**
    * 外部DNS系统的IP地址和端口列表
    */
    private List<DnsServerConfig> dnsServerConfigs;

    public String getClientToken() {
        return clientToken;
    }

    public CreateResolverRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateResolverRuleRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateResolverRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getZone() {
        return zone;
    }

    public CreateResolverRuleRequest setZone(String zone) {
        this.zone = zone;
        return this;
    }

    public String getResolverId() {
        return resolverId;
    }

    public CreateResolverRuleRequest setResolverId(String resolverId) {
        this.resolverId = resolverId;
        return this;
    }

    public List<DnsServerConfig> getDnsServerConfigs() {
        return dnsServerConfigs;
    }

    public CreateResolverRuleRequest setDnsServerConfigs(List<DnsServerConfig> dnsServerConfigs) {
        this.dnsServerConfigs = dnsServerConfigs;
        return this;
    }

}
