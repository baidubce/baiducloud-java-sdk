package com.baidubce.rapidfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthInfo {
    /**
     * 权限地址，ip/ip 段，请确保格式正确有效，如：127.0.0.1，127.0.0.0/28
     */
    private String cidr;

    /**
     * 权限类型，枚举值：ReadOnly：只读；ReadWrite：可读写；Forbid：禁止访问
     */
    private String mode;

    /**
     * 权限描述信息
     */
    private String description;

    public AuthInfo setCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    public String getCidr() {
        return this.cidr;
    }

    public AuthInfo setMode(String mode) {
        this.mode = mode;
        return this;
    }

    public String getMode() {
        return this.mode;
    }

    public AuthInfo setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "AuthInfo{" + "cidr=" + cidr + "\n" + "mode=" + mode + "\n" + "description=" + description + "\n" + "}";
    }

}