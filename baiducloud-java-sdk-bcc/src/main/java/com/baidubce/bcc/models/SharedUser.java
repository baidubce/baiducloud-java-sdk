package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SharedUser {
    /**
     * 共享用户名
     */
    private String account;

    /**
     * 共享用户ID
     */
    private String accountId;

    /**
     * uc账号
     */
    private String ucAccount;

    public SharedUser setAccount(String account) {
        this.account = account;
        return this;
    }

    public String getAccount() {
        return this.account;
    }

    public SharedUser setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public SharedUser setUcAccount(String ucAccount) {
        this.ucAccount = ucAccount;
        return this;
    }

    public String getUcAccount() {
        return this.ucAccount;
    }

    @Override
    public String toString() {
        return "SharedUser{" + "account=" + account + "\n" + "accountId=" + accountId + "\n" + "ucAccount=" + ucAccount + "\n" + "}";
    }

}