package com.baidubce.privatezone.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BindVpcToRuleRequest extends BaseBceRequest {

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
    * 要绑定的vpc信息
    */
    private List<VpcRegion> vpcRegions;

    public String getRuleId() {
        return ruleId;
    }

    public BindVpcToRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    public String getClienToken() {
        return clienToken;
    }

    public BindVpcToRuleRequest setClienToken(String clienToken) {
        this.clienToken = clienToken;
        return this;
    }

    public List<VpcRegion> getVpcRegions() {
        return vpcRegions;
    }

    public BindVpcToRuleRequest setVpcRegions(List<VpcRegion> vpcRegions) {
        this.vpcRegions = vpcRegions;
        return this;
    }

}
