package com.baidubce.blb.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlbSecurityGroupModel {
    /**
     * 普通安全组ID
     */
    private String securityGroupId;

    /**
     * 普通安全组名称
     */
    private String securityGroupName;

    /**
     * 普通安全组描述
     */
    private String securityGroupDesc;

    /**
     * 私有网络VPC名称
     */
    private String vpcName;

    /**
     * 普通安全组规则
     */
    private List<BlbSecurityGroupRuleModel> securityGroupRules;

    public BlbSecurityGroupModel setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public BlbSecurityGroupModel setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
        return this;
    }

    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    public BlbSecurityGroupModel setSecurityGroupDesc(String securityGroupDesc) {
        this.securityGroupDesc = securityGroupDesc;
        return this;
    }

    public String getSecurityGroupDesc() {
        return this.securityGroupDesc;
    }

    public BlbSecurityGroupModel setVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    public String getVpcName() {
        return this.vpcName;
    }

    public BlbSecurityGroupModel setSecurityGroupRules(List<BlbSecurityGroupRuleModel> securityGroupRules) {
        this.securityGroupRules = securityGroupRules;
        return this;
    }

    public List<BlbSecurityGroupRuleModel> getSecurityGroupRules() {
        return this.securityGroupRules;
    }

    @Override
    public String toString() {
        return "BlbSecurityGroupModel{" + "securityGroupId=" + securityGroupId + "\n" + "securityGroupName=" + securityGroupName + "\n" + "securityGroupDesc=" + securityGroupDesc
                + "\n" + "vpcName=" + vpcName + "\n" + "securityGroupRules=" + securityGroupRules + "\n" + "}";
    }

}