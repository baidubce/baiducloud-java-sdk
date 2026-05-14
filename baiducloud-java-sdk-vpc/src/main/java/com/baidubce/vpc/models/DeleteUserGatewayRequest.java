package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteUserGatewayRequest extends BaseBceRequest {

    /**
    * cgwId
    */
    @JsonIgnore
    private String cgwId;

    public String getCgwId() {
        return cgwId;
    }

    public DeleteUserGatewayRequest setCgwId(String cgwId) {
        this.cgwId = cgwId;
        return this;
    }

}
