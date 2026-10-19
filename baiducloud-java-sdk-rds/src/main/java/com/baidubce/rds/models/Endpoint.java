package com.baidubce.rds.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Endpoint {
    /**
     * 端口。
     */
    private Integer port;

    /**
     * 内网IP。
     */
    private String vnetIp;

    /**
     * 外网IP。
     */
    private String inetIp;

    /**
     * 域名。
     */
    private String address;

    /**
     * 外网IPV6地址。
     */
    private String inetIpV6;

    /**
     * 内网IPV6地址。
     */
    private String vnetIpV6;

    public Endpoint setPort(Integer port) {
        this.port = port;
        return this;
    }

    public Integer getPort() {
        return this.port;
    }

    public Endpoint setVnetIp(String vnetIp) {
        this.vnetIp = vnetIp;
        return this;
    }

    public String getVnetIp() {
        return this.vnetIp;
    }

    public Endpoint setInetIp(String inetIp) {
        this.inetIp = inetIp;
        return this;
    }

    public String getInetIp() {
        return this.inetIp;
    }

    public Endpoint setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getAddress() {
        return this.address;
    }

    public Endpoint setInetIpV6(String inetIpV6) {
        this.inetIpV6 = inetIpV6;
        return this;
    }

    public String getInetIpV6() {
        return this.inetIpV6;
    }

    public Endpoint setVnetIpV6(String vnetIpV6) {
        this.vnetIpV6 = vnetIpV6;
        return this;
    }

    public String getVnetIpV6() {
        return this.vnetIpV6;
    }

    @Override
    public String toString() {
        return "Endpoint{" + "port=" + port + "\n" + "vnetIp=" + vnetIp + "\n" + "inetIp=" + inetIp + "\n" + "address=" + address + "\n" + "inetIpV6=" + inetIpV6 + "\n"
                + "vnetIpV6=" + vnetIpV6 + "\n" + "}";
    }

}