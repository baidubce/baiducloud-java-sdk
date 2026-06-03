package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteVpcLinkRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 私有网络ID
    */
    private String vpcID;

    /**
    * 私有网络子网ID
    */
    private String subnetID;

    public String getInstanceId() {
        return instanceId;
    }

    public DeleteVpcLinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getVpcID() {
        return vpcID;
    }

    public DeleteVpcLinkRequest setVpcID(String vpcID) {
        this.vpcID = vpcID;
        return this;
    }

    public String getSubnetID() {
        return subnetID;
    }

    public DeleteVpcLinkRequest setSubnetID(String subnetID) {
        this.subnetID = subnetID;
        return this;
    }

}
