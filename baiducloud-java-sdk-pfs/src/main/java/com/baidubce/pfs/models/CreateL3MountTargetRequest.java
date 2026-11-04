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

    /**
    * 挂载点名称，默认default
    */
    private String name;

    /**
    * 权限组名称，默认DEFAULT_ACCESS_GROUP_NAME
    */
    private String accessGroupName;

    /**
    * 协议类型，默认bpfs，当前只支持bpfs/nfs
    */
    private String protocol;

    /**
    * 挂载点IP地址
    */
    private String ipAddress;

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

    public String getName() {
        return name;
    }

    public CreateL3MountTargetRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getAccessGroupName() {
        return accessGroupName;
    }

    public CreateL3MountTargetRequest setAccessGroupName(String accessGroupName) {
        this.accessGroupName = accessGroupName;
        return this;
    }

    public String getProtocol() {
        return protocol;
    }

    public CreateL3MountTargetRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public CreateL3MountTargetRequest setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

}
