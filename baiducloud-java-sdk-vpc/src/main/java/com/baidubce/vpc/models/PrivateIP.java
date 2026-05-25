package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PrivateIP {
    /**
     * 弹性网卡的公网IP地址，即EIP地址
     */
    private String publicIpAddress;

    /**
     * 是否是主IP
     */
    private Boolean primary;

    /**
     * 弹性网卡的内网Ip地址
     */
    private String privateIpAddress;

    public PrivateIP setPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    public String getPublicIpAddress() {
        return this.publicIpAddress;
    }

    public PrivateIP setPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    public Boolean getPrimary() {
        return this.primary;
    }

    public PrivateIP setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    @Override
    public String toString() {
        return "PrivateIP{" + "publicIpAddress=" + publicIpAddress + "\n" + "primary=" + primary + "\n" + "privateIpAddress=" + privateIpAddress + "\n" + "}";
    }

}