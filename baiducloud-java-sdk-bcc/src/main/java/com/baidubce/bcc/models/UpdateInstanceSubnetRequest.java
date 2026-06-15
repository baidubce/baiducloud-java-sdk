package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateInstanceSubnetRequest extends BaseBceRequest {

    /**
    * 虚拟机实例ID
    */
    private String instanceId;

    /**
    * 变更后的子网ID
    */
    private String subnetId;

    /**
    * 指定内网IP，不指定则随机生成
    */
    private String internalIp;

    /**
    * 变更普通安全组，跨VPC变更子网时生效，不支持和企业安全组同时修改
    */
    private List<String> securityGroupIds;

    /**
    * 变更企业安全组，跨VPC变更子网时生效，不支持和安全组同时修改
    */
    private List<String> enterpriseSecurityGroupIds;

    public String getInstanceId() {
        return instanceId;
    }

    public UpdateInstanceSubnetRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public UpdateInstanceSubnetRequest setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getInternalIp() {
        return internalIp;
    }

    public UpdateInstanceSubnetRequest setInternalIp(String internalIp) {
        this.internalIp = internalIp;
        return this;
    }

    public List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    public UpdateInstanceSubnetRequest setSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    public List<String> getEnterpriseSecurityGroupIds() {
        return enterpriseSecurityGroupIds;
    }

    public UpdateInstanceSubnetRequest setEnterpriseSecurityGroupIds(List<String> enterpriseSecurityGroupIds) {
        this.enterpriseSecurityGroupIds = enterpriseSecurityGroupIds;
        return this;
    }

}
