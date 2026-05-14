package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateTheNameAndCommentsOfTheLocalInterfaceForPeerToPeerConnectionsRequest extends BaseBceRequest {

    /**
    * peerConnId
    */
    @JsonIgnore
    private String peerConnId;

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

    public UpdateTheNameAndCommentsOfTheLocalInterfaceForPeerToPeerConnectionsRequest setPeerConnId(String peerConnId) {
        this.peerConnId = peerConnId;
        return this;
    }

    public String getLocalIfId() {
        return localIfId;
    }

    public UpdateTheNameAndCommentsOfTheLocalInterfaceForPeerToPeerConnectionsRequest setLocalIfId(String localIfId) {
        this.localIfId = localIfId;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateTheNameAndCommentsOfTheLocalInterfaceForPeerToPeerConnectionsRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getLocalIfName() {
        return localIfName;
    }

    public UpdateTheNameAndCommentsOfTheLocalInterfaceForPeerToPeerConnectionsRequest setLocalIfName(String localIfName) {
        this.localIfName = localIfName;
        return this;
    }

}
