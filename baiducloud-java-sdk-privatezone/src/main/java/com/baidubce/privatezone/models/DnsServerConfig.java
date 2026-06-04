package com.baidubce.privatezone.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DnsServerConfig {
    /**
     * 转发目标 IP 地址
     */
    private String ip;

    /**
     * 转发目标 IP 地址的端口号
     */
    private Integer port;

    public DnsServerConfig setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public String getIp() {
        return this.ip;
    }

    public DnsServerConfig setPort(Integer port) {
        this.port = port;
        return this;
    }

    public Integer getPort() {
        return this.port;
    }

    @Override
    public String toString() {
        return "DnsServerConfig{" + "ip=" + ip + "\n" + "port=" + port + "\n" + "}";
    }

}