package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PeerToPeerConnectionRenewalRequest extends BaseBceRequest {

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

    /**
    * billing
    */
    private Billing billing;

    public String getPeerConnId() {
        return peerConnId;
    }

    public PeerToPeerConnectionRenewalRequest setPeerConnId(String peerConnId) {
        this.peerConnId = peerConnId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public PeerToPeerConnectionRenewalRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Billing getBilling() {
        return billing;
    }

    public PeerToPeerConnectionRenewalRequest setBilling(Billing billing) {
        this.billing = billing;
        return this;
    }

}
