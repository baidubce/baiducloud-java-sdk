package com.baidubce.privatezone.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateResolverRuleRequest extends BaseBceRequest {

    /**
    * reluId
    */
    @JsonIgnore
    private String reluId;

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
    * 外部DNS系统的IP地址和端口
    */
    private List<DnsServerConfig> dnsServerConfigs;

    public String getReluId() {
        return reluId;
    }

    public UpdateResolverRuleRequest setReluId(String reluId) {
        this.reluId = reluId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateResolverRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateResolverRuleRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateResolverRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public List<DnsServerConfig> getDnsServerConfigs() {
        return dnsServerConfigs;
    }

    public UpdateResolverRuleRequest setDnsServerConfigs(List<DnsServerConfig> dnsServerConfigs) {
        this.dnsServerConfigs = dnsServerConfigs;
        return this;
    }

}
