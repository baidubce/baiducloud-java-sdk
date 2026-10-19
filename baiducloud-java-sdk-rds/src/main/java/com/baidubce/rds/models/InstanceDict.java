package com.baidubce.rds.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstanceDict {
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

    public InstanceDict setPort(Integer port) {
        this.port = port;
        return this;
    }

    public Integer getPort() {
        return this.port;
    }

    public InstanceDict setVnetIp(String vnetIp) {
        this.vnetIp = vnetIp;
        return this;
    }

    public String getVnetIp() {
        return this.vnetIp;
    }

    public InstanceDict setInetIp(String inetIp) {
        this.inetIp = inetIp;
        return this;
    }

    public String getInetIp() {
        return this.inetIp;
    }

    public InstanceDict setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getAddress() {
        return this.address;
    }

    @Override
    public String toString() {
        return "InstanceDict{" + "port=" + port + "\n" + "vnetIp=" + vnetIp + "\n" + "inetIp=" + inetIp + "\n" + "address=" + address + "\n" + "}";
    }

}