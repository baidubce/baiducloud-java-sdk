package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteElasticNetworkCardAuxiliaryIpRequest extends BaseBceRequest {

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

    public DeleteElasticNetworkCardAuxiliaryIpRequest setEniId(String eniId) {
        this.eniId = eniId;
        return this;
    }

    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    public DeleteElasticNetworkCardAuxiliaryIpRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteElasticNetworkCardAuxiliaryIpRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
