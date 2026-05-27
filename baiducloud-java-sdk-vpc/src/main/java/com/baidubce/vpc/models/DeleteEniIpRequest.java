package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteEniIpRequest extends BaseBceRequest {

    /**
    * eniId
    */
    @JsonIgnore
    private String eniId;

    /**
    * privateIpAddress
    */
    @JsonIgnore
    private String privateIpAddress;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    public String getEniId() {
        return eniId;
    }

    public DeleteEniIpRequest setEniId(String eniId) {
        this.eniId = eniId;
        return this;
    }

    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    public DeleteEniIpRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteEniIpRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
