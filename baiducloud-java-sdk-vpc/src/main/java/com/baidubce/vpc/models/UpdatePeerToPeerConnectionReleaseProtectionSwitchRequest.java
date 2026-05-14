package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdatePeerToPeerConnectionReleaseProtectionSwitchRequest extends BaseBceRequest {

    /**
    * peerConnId
    */
    @JsonIgnore
    private String peerConnId;

    /**
    * 是否开启释放保护
    */
    private Boolean deleteProtect;

    public String getPeerConnId() {
        return peerConnId;
    }

    public UpdatePeerToPeerConnectionReleaseProtectionSwitchRequest setPeerConnId(String peerConnId) {
        this.peerConnId = peerConnId;
        return this;
    }

    public Boolean getDeleteProtect() {
        return deleteProtect;
    }

    public UpdatePeerToPeerConnectionReleaseProtectionSwitchRequest setDeleteProtect(Boolean deleteProtect) {
        this.deleteProtect = deleteProtect;
        return this;
    }

}
