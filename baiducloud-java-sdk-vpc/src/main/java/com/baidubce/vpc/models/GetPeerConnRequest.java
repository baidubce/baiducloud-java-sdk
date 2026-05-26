package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPeerConnRequest extends BaseBceRequest {

    /**
    * peerConnId
    */
    @JsonIgnore
    private String peerConnId;

    /**
    * role
    */
    @JsonIgnore
    private String role;

    public String getPeerConnId() {
        return peerConnId;
    }

    public GetPeerConnRequest setPeerConnId(String peerConnId) {
        this.peerConnId = peerConnId;
        return this;
    }

    public String getRole() {
        return role;
    }

    public GetPeerConnRequest setRole(String role) {
        this.role = role;
        return this;
    }

}
