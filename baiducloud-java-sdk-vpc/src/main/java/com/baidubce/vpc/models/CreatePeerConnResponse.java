package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreatePeerConnResponse extends BaseBceResponse {

    /**
    * 创建的对等连接ID
    */
    private String peerConnId;

    public String getPeerConnId() {
        return peerConnId;
    }

    public CreatePeerConnResponse setPeerConnId(String peerConnId) {
        this.peerConnId = peerConnId;
        return this;
    }

    @Override
    public String toString() {
        return "CreatePeerConnResponse{" + "peerConnId=" + peerConnId + "\n" + "}";
    }

}
