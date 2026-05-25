package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TemplateIpAddressInfo {
    /**
     * 参数模板IP地址，可为具体IP地址或者CIDR块
     */
    private String ipAddress;

    /**
     * 参数模板IP地址，具体描述
     */
    private String description;

    public TemplateIpAddressInfo setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public TemplateIpAddressInfo setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "TemplateIpAddressInfo{" + "ipAddress=" + ipAddress + "\n" + "description=" + description + "\n" + "}";
    }

}