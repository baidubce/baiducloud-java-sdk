package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReleasePeerConnRequest extends BaseBceRequest {

    /**
    * peerConnId
    */
    @JsonIgnore
    private String peerConnId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    public String getPeerConnId() {
        return peerConnId;
    }

    public ReleasePeerConnRequest setPeerConnId(String peerConnId) {
        this.peerConnId = peerConnId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public ReleasePeerConnRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
