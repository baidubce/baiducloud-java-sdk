package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChangeVpcRequest extends BaseBceRequest {

    /**
    * 虚机ID
    */
    private String instanceId;

    /**
    * 目标VPC的子网ID
    */
    private String subnetId;

    /**
    * 内网IP
    */
    private String internalIp;

    /**
    * 安全组列表
    */
    private List<String> securityGroupIds;

    /**
    * 企业安全组列表，不能同时指定普通安全组和企业安全组
    */
    private List<String> enterpriseSecurityGroupIds;

    /**
    * 是否重启实例
    */
    private Boolean reboot;

    public String getInstanceId() {
        return instanceId;
    }

    public ChangeVpcRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public ChangeVpcRequest setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getInternalIp() {
        return internalIp;
    }

    public ChangeVpcRequest setInternalIp(String internalIp) {
        this.internalIp = internalIp;
        return this;
    }

    public List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    public ChangeVpcRequest setSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    public List<String> getEnterpriseSecurityGroupIds() {
        return enterpriseSecurityGroupIds;
    }

    public ChangeVpcRequest setEnterpriseSecurityGroupIds(List<String> enterpriseSecurityGroupIds) {
        this.enterpriseSecurityGroupIds = enterpriseSecurityGroupIds;
        return this;
    }

    public Boolean getReboot() {
        return reboot;
    }

    public ChangeVpcRequest setReboot(Boolean reboot) {
        this.reboot = reboot;
        return this;
    }

}
