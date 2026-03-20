package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserGatewayDetailsRequest {

    /**
    * cgwId
    */
    @JsonIgnore
    private String cgwId;

    public String getCgwId() {
        return cgwId;
    }

    public UserGatewayDetailsRequest setCgwId(String cgwId) {
        this.cgwId = cgwId;
        return this;
    }

}
