package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteGatewayLimitRuleRequest {

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

    public String getGlrId() {
        return glrId;
    }

    public DeleteGatewayLimitRuleRequest setGlrId(String glrId) {
        this.glrId = glrId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteGatewayLimitRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
