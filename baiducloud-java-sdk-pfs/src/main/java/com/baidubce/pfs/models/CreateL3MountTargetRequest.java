package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateL3MountTargetRequest extends BaseBceRequest {

    /**
    * PFS实例ID
    */
    private String instanceId;

    /**
    * PFS实例vip所属VPC的短Id
    */
    private String vpcId;

    /**
    * MountTarget所属子网，subnet属于PFS实例所在vpc，为短id
    */
    private String subnetId;

    public String getInstanceId() {
        return instanceId;
    }

    public CreateL3MountTargetRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public CreateL3MountTargetRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public CreateL3MountTargetRequest setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

}
