package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteIpSetRequest extends BaseBceRequest {

    /**
    * ipGroupId
    */
    @JsonIgnore
    private String ipGroupId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    public String getIpGroupId() {
        return ipGroupId;
    }

    public DeleteIpSetRequest setIpGroupId(String ipGroupId) {
        this.ipGroupId = ipGroupId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteIpSetRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
