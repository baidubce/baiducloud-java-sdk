package com.baidubce.iam.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountCountInfo {
    /**
     * 已创建的用户数量
     */
    private Integer userCount;

    /**
     * 已创建的策略数量
     */
    private Integer policyCount;

    /**
     * 已创建的用户组数量
     */
    private Integer groupCount;

    public AccountCountInfo setUserCount(Integer userCount) {
        this.userCount = userCount;
        return this;
    }

    public Integer getUserCount() {
        return this.userCount;
    }

    public AccountCountInfo setPolicyCount(Integer policyCount) {
        this.policyCount = policyCount;
        return this;
    }

    public Integer getPolicyCount() {
        return this.policyCount;
    }

    public AccountCountInfo setGroupCount(Integer groupCount) {
        this.groupCount = groupCount;
        return this;
    }

    public Integer getGroupCount() {
        return this.groupCount;
    }

    @Override
    public String toString() {
        return "AccountCountInfo{" + "userCount=" + userCount + "\n" + "policyCount=" + policyCount + "\n" + "groupCount=" + groupCount + "\n" + "}";
    }

}