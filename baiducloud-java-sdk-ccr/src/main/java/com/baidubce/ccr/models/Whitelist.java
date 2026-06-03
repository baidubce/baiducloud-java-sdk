package com.baidubce.ccr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Whitelist {
    /**
     * 白名单 IP 地址
     */
    private String ipAddr;

    /**
     * 白名单描述信息
     */
    private String description;

    public Whitelist setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
        return this;
    }

    public String getIpAddr() {
        return this.ipAddr;
    }

    public Whitelist setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "Whitelist{" + "ipAddr=" + ipAddr + "\n" + "description=" + description + "\n" + "}";
    }

}