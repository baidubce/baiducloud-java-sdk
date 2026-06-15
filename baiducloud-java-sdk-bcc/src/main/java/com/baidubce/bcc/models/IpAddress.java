package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class IpAddress {
    /**
     * 是否为主IP
     */
    private Boolean primary;

    /**
     * 公网IP
     */
    private String publicIpAddress;

    /**
     * 内网IP
     */
    private String privateIpAddress;

    /**
     * IPV6地址
     */
    private String ipv6Address;

    public IpAddress setPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    public Boolean getPrimary() {
        return this.primary;
    }

    public IpAddress setPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    public String getPublicIpAddress() {
        return this.publicIpAddress;
    }

    public IpAddress setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public IpAddress setIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
        return this;
    }

    public String getIpv6Address() {
        return this.ipv6Address;
    }

    @Override
    public String toString() {
        return "IpAddress{" + "primary=" + primary + "\n" + "publicIpAddress=" + publicIpAddress + "\n" + "privateIpAddress=" + privateIpAddress + "\n" + "ipv6Address="
                + ipv6Address + "\n" + "}";
    }

}