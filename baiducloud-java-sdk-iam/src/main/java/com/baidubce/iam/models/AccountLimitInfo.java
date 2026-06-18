package com.baidubce.iam.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountLimitInfo {
    /**
     * 子用户上限数量
     */
    private Integer userLimit;

    /**
     * 自定义策略上限数量
     */
    private Integer policyLimit;

    /**
     * 消息接收人上限数量
     */
    private Integer contactsLimit;

    /**
     * 用户组上限数量
     */
    private Integer groupLimit;

    /**
     * 单个用户组可添加的子用户上限数量
     */
    private Integer subUserOfGroupLimit;

    /**
     * 关联到用户组的策略上限数量
     */
    private Integer groupMaxAttachPolicyLimit;

    /**
     * 角色上限数量
     */
    private Integer userRolePerAccountLimit;

    /**
     * 关系到角色的系统策略上限数量
     */
    private Integer roleMaxAttachSystemPolicyLimit;

    /**
     * 关系到角色的自定义策略上限数量
     */
    private Integer roleMaxAttachCustomPolicyLimit;

    /**
     * 每个子用户可以创建的AK上限数量
     */
    private Integer akskLimit;

    public AccountLimitInfo setUserLimit(Integer userLimit) {
        this.userLimit = userLimit;
        return this;
    }

    public Integer getUserLimit() {
        return this.userLimit;
    }

    public AccountLimitInfo setPolicyLimit(Integer policyLimit) {
        this.policyLimit = policyLimit;
        return this;
    }

    public Integer getPolicyLimit() {
        return this.policyLimit;
    }

    public AccountLimitInfo setContactsLimit(Integer contactsLimit) {
        this.contactsLimit = contactsLimit;
        return this;
    }

    public Integer getContactsLimit() {
        return this.contactsLimit;
    }

    public AccountLimitInfo setGroupLimit(Integer groupLimit) {
        this.groupLimit = groupLimit;
        return this;
    }

    public Integer getGroupLimit() {
        return this.groupLimit;
    }

    public AccountLimitInfo setSubUserOfGroupLimit(Integer subUserOfGroupLimit) {
        this.subUserOfGroupLimit = subUserOfGroupLimit;
        return this;
    }

    public Integer getSubUserOfGroupLimit() {
        return this.subUserOfGroupLimit;
    }

    public AccountLimitInfo setGroupMaxAttachPolicyLimit(Integer groupMaxAttachPolicyLimit) {
        this.groupMaxAttachPolicyLimit = groupMaxAttachPolicyLimit;
        return this;
    }

    public Integer getGroupMaxAttachPolicyLimit() {
        return this.groupMaxAttachPolicyLimit;
    }

    public AccountLimitInfo setUserRolePerAccountLimit(Integer userRolePerAccountLimit) {
        this.userRolePerAccountLimit = userRolePerAccountLimit;
        return this;
    }

    public Integer getUserRolePerAccountLimit() {
        return this.userRolePerAccountLimit;
    }

    public AccountLimitInfo setRoleMaxAttachSystemPolicyLimit(Integer roleMaxAttachSystemPolicyLimit) {
        this.roleMaxAttachSystemPolicyLimit = roleMaxAttachSystemPolicyLimit;
        return this;
    }

    public Integer getRoleMaxAttachSystemPolicyLimit() {
        return this.roleMaxAttachSystemPolicyLimit;
    }

    public AccountLimitInfo setRoleMaxAttachCustomPolicyLimit(Integer roleMaxAttachCustomPolicyLimit) {
        this.roleMaxAttachCustomPolicyLimit = roleMaxAttachCustomPolicyLimit;
        return this;
    }

    public Integer getRoleMaxAttachCustomPolicyLimit() {
        return this.roleMaxAttachCustomPolicyLimit;
    }

    public AccountLimitInfo setAkskLimit(Integer akskLimit) {
        this.akskLimit = akskLimit;
        return this;
    }

    public Integer getAkskLimit() {
        return this.akskLimit;
    }

    @Override
    public String toString() {
        return "AccountLimitInfo{" + "userLimit=" + userLimit + "\n" + "policyLimit=" + policyLimit + "\n" + "contactsLimit=" + contactsLimit + "\n" + "groupLimit=" + groupLimit
                + "\n" + "subUserOfGroupLimit=" + subUserOfGroupLimit + "\n" + "groupMaxAttachPolicyLimit=" + groupMaxAttachPolicyLimit + "\n" + "userRolePerAccountLimit="
                + userRolePerAccountLimit + "\n" + "roleMaxAttachSystemPolicyLimit=" + roleMaxAttachSystemPolicyLimit + "\n" + "roleMaxAttachCustomPolicyLimit="
                + roleMaxAttachCustomPolicyLimit + "\n" + "akskLimit=" + akskLimit + "\n" + "}";
    }

}