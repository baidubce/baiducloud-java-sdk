package com.baidubce.blb.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlbEnterpriseSecurityGroupModel {
    /**
     * 企业安全组ID
     */
    private String enterpriseSecurityGroupId;

    /**
     * 企业安全组名称
     */
    private String enterpriseSecurityGroupName;

    /**
     * 企业安全组描述
     */
    private String enterpriseSecurityGroupDesc;

    /**
     * 企业安全组规则
     */
    private List<BlbEnterpriseSecurityGroupRuleModel> enterpriseSecurityGroupRules;

    public BlbEnterpriseSecurityGroupModel setEnterpriseSecurityGroupId(String enterpriseSecurityGroupId) {
        this.enterpriseSecurityGroupId = enterpriseSecurityGroupId;
        return this;
    }

    public String getEnterpriseSecurityGroupId() {
        return this.enterpriseSecurityGroupId;
    }

    public BlbEnterpriseSecurityGroupModel setEnterpriseSecurityGroupName(String enterpriseSecurityGroupName) {
        this.enterpriseSecurityGroupName = enterpriseSecurityGroupName;
        return this;
    }

    public String getEnterpriseSecurityGroupName() {
        return this.enterpriseSecurityGroupName;
    }

    public BlbEnterpriseSecurityGroupModel setEnterpriseSecurityGroupDesc(String enterpriseSecurityGroupDesc) {
        this.enterpriseSecurityGroupDesc = enterpriseSecurityGroupDesc;
        return this;
    }

    public String getEnterpriseSecurityGroupDesc() {
        return this.enterpriseSecurityGroupDesc;
    }

    public BlbEnterpriseSecurityGroupModel setEnterpriseSecurityGroupRules(List<BlbEnterpriseSecurityGroupRuleModel> enterpriseSecurityGroupRules) {
        this.enterpriseSecurityGroupRules = enterpriseSecurityGroupRules;
        return this;
    }

    public List<BlbEnterpriseSecurityGroupRuleModel> getEnterpriseSecurityGroupRules() {
        return this.enterpriseSecurityGroupRules;
    }

    @Override
    public String toString() {
        return "BlbEnterpriseSecurityGroupModel{" + "enterpriseSecurityGroupId=" + enterpriseSecurityGroupId + "\n" + "enterpriseSecurityGroupName=" + enterpriseSecurityGroupName
                + "\n" + "enterpriseSecurityGroupDesc=" + enterpriseSecurityGroupDesc + "\n" + "enterpriseSecurityGroupRules=" + enterpriseSecurityGroupRules + "\n" + "}";
    }

}