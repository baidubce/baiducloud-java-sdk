package com.baidubce.rds.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProxyWrFlagInfo {
    /**
     * Proxy 实例 ID
     */
    private String appId;

    /**
     * 关联账号名
     */
    private String account;

    /**
     * 读写标识
     */
    private String wrFlag;

    public ProxyWrFlagInfo setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getAppId() {
        return this.appId;
    }

    public ProxyWrFlagInfo setAccount(String account) {
        this.account = account;
        return this;
    }

    public String getAccount() {
        return this.account;
    }

    public ProxyWrFlagInfo setWrFlag(String wrFlag) {
        this.wrFlag = wrFlag;
        return this;
    }

    public String getWrFlag() {
        return this.wrFlag;
    }

    @Override
    public String toString() {
        return "ProxyWrFlagInfo{" + "appId=" + appId + "\n" + "account=" + account + "\n" + "wrFlag=" + wrFlag + "\n" + "}";
    }

}