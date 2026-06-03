package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddVpcLinkRequest extends BaseBceRequest {

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

    /**
    * IP分配方式，取值范围：auto、manual，分别表示自动分配、手动指定
    */
    private String ipType;

    /**
    * 当ipType为manual为必填，子网内可用的IP
    */
    private String ipAddress;

    /**
    * 自动DNS解析，取值范围：true、false
    */
    private Boolean autoDnsResolve;

    public String getInstanceId() {
        return instanceId;
    }

    public AddVpcLinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getVpcID() {
        return vpcID;
    }

    public AddVpcLinkRequest setVpcID(String vpcID) {
        this.vpcID = vpcID;
        return this;
    }

    public String getSubnetID() {
        return subnetID;
    }

    public AddVpcLinkRequest setSubnetID(String subnetID) {
        this.subnetID = subnetID;
        return this;
    }

    public String getIpType() {
        return ipType;
    }

    public AddVpcLinkRequest setIpType(String ipType) {
        this.ipType = ipType;
        return this;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public AddVpcLinkRequest setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    public Boolean getAutoDnsResolve() {
        return autoDnsResolve;
    }

    public AddVpcLinkRequest setAutoDnsResolve(Boolean autoDnsResolve) {
        this.autoDnsResolve = autoDnsResolve;
        return this;
    }

}
