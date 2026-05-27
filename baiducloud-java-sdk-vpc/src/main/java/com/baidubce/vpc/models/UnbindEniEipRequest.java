package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UnbindEniEipRequest extends BaseBceRequest {

    /**
    * eniId
    */
    @JsonIgnore
    private String eniId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * EIP的地址
    */
    private String publicIpAddress;

    public String getEniId() {
        return eniId;
    }

    public UnbindEniEipRequest setEniId(String eniId) {
        this.eniId = eniId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UnbindEniEipRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getPublicIpAddress() {
        return publicIpAddress;
    }

    public UnbindEniEipRequest setPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

}
