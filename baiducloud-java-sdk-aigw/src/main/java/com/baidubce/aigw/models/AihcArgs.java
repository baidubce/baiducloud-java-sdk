package com.baidubce.aigw.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AihcArgs {
    /**
     * AIHC 账号 ID
     */
    private String accountId;

    /**
     * AIHC 子网 ID
     */
    private String subnetId;

    /**
     * AIHC 安全组 ID 列表或标识
     */
    private String securityGroupIds;

    /**
     * AIHC VPC CIDR
     */
    private String vpcCidr;

    /**
     * 默认域名前缀
     */
    private String domainPrefix;

    public AihcArgs setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public AihcArgs setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public AihcArgs setSecurityGroupIds(String securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    public String getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public AihcArgs setVpcCidr(String vpcCidr) {
        this.vpcCidr = vpcCidr;
        return this;
    }

    public String getVpcCidr() {
        return this.vpcCidr;
    }

    public AihcArgs setDomainPrefix(String domainPrefix) {
        this.domainPrefix = domainPrefix;
        return this;
    }

    public String getDomainPrefix() {
        return this.domainPrefix;
    }

    @Override
    public String toString() {
        return "AihcArgs{" + "accountId=" + accountId + "\n" + "subnetId=" + subnetId + "\n" + "securityGroupIds=" + securityGroupIds + "\n" + "vpcCidr=" + vpcCidr + "\n"
                + "domainPrefix=" + domainPrefix + "\n" + "}";
    }

}