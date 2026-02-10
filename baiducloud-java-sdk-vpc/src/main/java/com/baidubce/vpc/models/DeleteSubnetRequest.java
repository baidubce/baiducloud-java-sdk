package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteSubnetRequest {

    /**
    * subnetId
    */
    @JsonIgnore
    private String subnetId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;


    public String getSubnetId() {
        return subnetId;
    }

    public DeleteSubnetRequest setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteSubnetRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }


}
