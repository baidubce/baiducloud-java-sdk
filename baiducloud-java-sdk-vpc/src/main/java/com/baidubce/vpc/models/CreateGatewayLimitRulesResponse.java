package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateGatewayLimitRulesResponse extends BaseBceResponse {

    /**
    * 网关限速规则ID
    */
    private String glrId;

    public String getGlrId() {
        return glrId;
    }

    public CreateGatewayLimitRulesResponse setGlrId(String glrId) {
        this.glrId = glrId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateGatewayLimitRulesResponse{" + "glrId=" + glrId + "\n" + "}";
    }

}
