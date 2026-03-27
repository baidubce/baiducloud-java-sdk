package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyGatewayLimitRulesRequest extends BaseBceRequest {

    /**
    * glrId
    */
    @JsonIgnore
    private String glrId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 规则名称
    */
    private String name;

    /**
    * 描述
    */
    private String description;

    /**
    * 带宽
    */
    private Integer bandwidth;

    public String getGlrId() {
        return glrId;
    }

    public ModifyGatewayLimitRulesRequest setGlrId(String glrId) {
        this.glrId = glrId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public ModifyGatewayLimitRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public ModifyGatewayLimitRulesRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ModifyGatewayLimitRulesRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getBandwidth() {
        return bandwidth;
    }

    public ModifyGatewayLimitRulesRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

}
