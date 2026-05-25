package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteIpAddressGroupRequest extends BaseBceRequest {

    /**
    * ipSetId
    */
    @JsonIgnore
    private String ipSetId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    public String getIpSetId() {
        return ipSetId;
    }

    public DeleteIpAddressGroupRequest setIpSetId(String ipSetId) {
        this.ipSetId = ipSetId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteIpAddressGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
