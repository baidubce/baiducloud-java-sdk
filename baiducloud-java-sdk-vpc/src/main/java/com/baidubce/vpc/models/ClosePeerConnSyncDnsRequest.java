package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClosePeerConnSyncDnsRequest extends BaseBceRequest {

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

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    public String getPeerConnId() {
        return peerConnId;
    }

    public ClosePeerConnSyncDnsRequest setPeerConnId(String peerConnId) {
        this.peerConnId = peerConnId;
        return this;
    }

    public String getRole() {
        return role;
    }

    public ClosePeerConnSyncDnsRequest setRole(String role) {
        this.role = role;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public ClosePeerConnSyncDnsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
