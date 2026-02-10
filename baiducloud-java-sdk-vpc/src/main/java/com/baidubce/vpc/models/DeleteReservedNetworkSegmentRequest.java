package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteReservedNetworkSegmentRequest {

    /**
    * ipReserveId
    */
    @JsonIgnore
    private String ipReserveId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;


    public String getIpReserveId() {
        return ipReserveId;
    }

    public DeleteReservedNetworkSegmentRequest setIpReserveId(String ipReserveId) {
        this.ipReserveId = ipReserveId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteReservedNetworkSegmentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }


}
