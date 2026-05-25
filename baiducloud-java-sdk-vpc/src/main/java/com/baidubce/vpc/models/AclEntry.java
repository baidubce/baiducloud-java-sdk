package com.baidubce.vpc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AclEntry {
    /**
     * 子网ID
     */
    private String subnetId;

    /**
     * 子网名称
     */
    private String subnetName;

    /**
     * 子网的CIDR
     */
    private String subnetCidr;

    /**
     * ACL规则集合
     */
    private List<AclRule> aclRules;

    public AclEntry setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public AclEntry setSubnetName(String subnetName) {
        this.subnetName = subnetName;
        return this;
    }

    public String getSubnetName() {
        return this.subnetName;
    }

    public AclEntry setSubnetCidr(String subnetCidr) {
        this.subnetCidr = subnetCidr;
        return this;
    }

    public String getSubnetCidr() {
        return this.subnetCidr;
    }

    public AclEntry setAclRules(List<AclRule> aclRules) {
        this.aclRules = aclRules;
        return this;
    }

    public List<AclRule> getAclRules() {
        return this.aclRules;
    }

    @Override
    public String toString() {
        return "AclEntry{" + "subnetId=" + subnetId + "\n" + "subnetName=" + subnetName + "\n" + "subnetCidr=" + subnetCidr + "\n" + "aclRules=" + aclRules + "\n" + "}";
    }

}