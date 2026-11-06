package com.baidubce.rds.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountPrivilege {
    /**
     * 账户名称
     */
    private String accountName;

    /**
     * 授权类型。ReadOnly：只读，ReadWrite：读写
     */
    private String authType;

    public AccountPrivilege setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public AccountPrivilege setAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    public String getAuthType() {
        return this.authType;
    }

    @Override
    public String toString() {
        return "AccountPrivilege{" + "accountName=" + accountName + "\n" + "authType=" + authType + "\n" + "}";
    }

}