package com.baidubce.bci.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TCPSocketAction {
    /**
     * TCP Socket检测端口
     */
    private Integer port;

    /**
     * TCP Socket检测host
     */
    private String host;

    public TCPSocketAction setPort(Integer port) {
        this.port = port;
        return this;
    }

    public Integer getPort() {
        return this.port;
    }

    public TCPSocketAction setHost(String host) {
        this.host = host;
        return this;
    }

    public String getHost() {
        return this.host;
    }

    @Override
    public String toString() {
        return "TCPSocketAction{" + "port=" + port + "\n" + "host=" + host + "\n" + "}";
    }

}