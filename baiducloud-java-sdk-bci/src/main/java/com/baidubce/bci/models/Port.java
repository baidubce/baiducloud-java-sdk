package com.baidubce.bci.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Port {
    /**
     * 端口名
     */
    private String name;

    /**
     * 端口号
     */
    private Integer port;

    /**
     * 协议类型：TCP、UDP
     */
    private String protocol;

    public Port setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Port setPort(Integer port) {
        this.port = port;
        return this;
    }

    public Integer getPort() {
        return this.port;
    }

    public Port setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public String getProtocol() {
        return this.protocol;
    }

    @Override
    public String toString() {
        return "Port{" + "name=" + name + "\n" + "port=" + port + "\n" + "protocol=" + protocol + "\n" + "}";
    }

}