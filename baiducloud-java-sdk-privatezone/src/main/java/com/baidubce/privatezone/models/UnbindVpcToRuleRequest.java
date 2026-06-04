package com.baidubce.privatezone.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UnbindVpcToRuleRequest extends BaseBceRequest {

    /**
    * ruleId
    */
    @JsonIgnore
    private String ruleId;

    /**
    * clienToken
    */
    @JsonIgnore
    private String clienToken;

    /**
    * 要解绑的vpc信息
    */
    private List<VpcRegion> vpcRegions;

    public String getRuleId() {
        return ruleId;
    }

    public UnbindVpcToRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    public String getClienToken() {
        return clienToken;
    }

    public UnbindVpcToRuleRequest setClienToken(String clienToken) {
        this.clienToken = clienToken;
        return this;
    }

    public List<VpcRegion> getVpcRegions() {
        return vpcRegions;
    }

    public UnbindVpcToRuleRequest setVpcRegions(List<VpcRegion> vpcRegions) {
        this.vpcRegions = vpcRegions;
        return this;
    }

}
