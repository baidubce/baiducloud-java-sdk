package com.baidubce.cfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateMountingTargetRequest extends BaseBceRequest {

    /**
    * fsId
    */
    @JsonIgnore
    private String fsId;

    /**
    * MountTarget所属子网，subnet属于fs所在vpc，为短id
    */
    private String subnetId;

    /**
    * fs实例vip所属VPC的短Id
    */
    private String vpcId;

    /**
    * 绑定的权限组的名称，长度1~65个字节，字母开头，可包含字母数字和- _ .字符。
    */
    private String accessGroupName;

    /**
    * 创建MountTarget的指定IP地址
    */
    private String address;

    public String getFsId() {
        return fsId;
    }

    public CreateMountingTargetRequest setFsId(String fsId) {
        this.fsId = fsId;
        return this;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public CreateMountingTargetRequest setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public CreateMountingTargetRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getAccessGroupName() {
        return accessGroupName;
    }

    public CreateMountingTargetRequest setAccessGroupName(String accessGroupName) {
        this.accessGroupName = accessGroupName;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public CreateMountingTargetRequest setAddress(String address) {
        this.address = address;
        return this;
    }

}
