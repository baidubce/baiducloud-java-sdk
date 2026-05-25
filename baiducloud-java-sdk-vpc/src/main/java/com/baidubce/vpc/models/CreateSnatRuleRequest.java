package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateSnatRuleRequest extends BaseBceRequest {

    /**
    * natId
    */
    @JsonIgnore
    private String natId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 名称，由大小写字母、数字以及-\_ /.特殊字符组成，必须以字母开头，长度1-65
    */
    private String ruleName;

    /**
    * 公网IPs，关联在NAT网关snatEips或bindEips上的EIP或共享带宽中的IPs
    */
    private List<String> publicIpsAddress;

    /**
    * 内网IP/网段
    */
    private String sourceCIDR;

    public String getNatId() {
        return natId;
    }

    public CreateSnatRuleRequest setNatId(String natId) {
        this.natId = natId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public CreateSnatRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getRuleName() {
        return ruleName;
    }

    public CreateSnatRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    public List<String> getPublicIpsAddress() {
        return publicIpsAddress;
    }

    public CreateSnatRuleRequest setPublicIpsAddress(List<String> publicIpsAddress) {
        this.publicIpsAddress = publicIpsAddress;
        return this;
    }

    public String getSourceCIDR() {
        return sourceCIDR;
    }

    public CreateSnatRuleRequest setSourceCIDR(String sourceCIDR) {
        this.sourceCIDR = sourceCIDR;
        return this;
    }

}
