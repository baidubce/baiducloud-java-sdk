package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdatePeerConnRequest extends BaseBceRequest {

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
    * 对等连接的接口ID 不可更改
    */
    private String localIfId;

    /**
    * 备注
    */
    private String description;

    /**
    * 本端接口名称
    */
    private String localIfName;

    public String getPeerConnId() {
        return peerConnId;
    }

    public UpdatePeerConnRequest setPeerConnId(String peerConnId) {
        this.peerConnId = peerConnId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdatePeerConnRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getLocalIfId() {
        return localIfId;
    }

    public UpdatePeerConnRequest setLocalIfId(String localIfId) {
        this.localIfId = localIfId;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdatePeerConnRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getLocalIfName() {
        return localIfName;
    }

    public UpdatePeerConnRequest setLocalIfName(String localIfName) {
        this.localIfName = localIfName;
        return this;
    }

}
