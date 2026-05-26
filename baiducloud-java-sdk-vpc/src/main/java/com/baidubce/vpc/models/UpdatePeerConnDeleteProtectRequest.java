package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdatePeerConnDeleteProtectRequest extends BaseBceRequest {

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
    * 是否开启释放保护
    */
    private Boolean deleteProtect;

    public String getPeerConnId() {
        return peerConnId;
    }

    public UpdatePeerConnDeleteProtectRequest setPeerConnId(String peerConnId) {
        this.peerConnId = peerConnId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdatePeerConnDeleteProtectRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Boolean getDeleteProtect() {
        return deleteProtect;
    }

    public UpdatePeerConnDeleteProtectRequest setDeleteProtect(Boolean deleteProtect) {
        this.deleteProtect = deleteProtect;
        return this;
    }

}
