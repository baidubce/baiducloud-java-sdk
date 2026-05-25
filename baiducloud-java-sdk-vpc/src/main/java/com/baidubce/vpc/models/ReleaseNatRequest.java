package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReleaseNatRequest extends BaseBceRequest {

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

    public String getNatId() {
        return natId;
    }

    public ReleaseNatRequest setNatId(String natId) {
        this.natId = natId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public ReleaseNatRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
