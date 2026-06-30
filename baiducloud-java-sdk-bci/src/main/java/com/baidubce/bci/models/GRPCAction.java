package com.baidubce.bci.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GRPCAction {
    /**
     * GRPC检测端口
     */
    private Integer port;

    /**
     * GRPC检测服务
     */
    private String service;

    public GRPCAction setPort(Integer port) {
        this.port = port;
        return this;
    }

    public Integer getPort() {
        return this.port;
    }

    public GRPCAction setService(String service) {
        this.service = service;
        return this;
    }

    public String getService() {
        return this.service;
    }

    @Override
    public String toString() {
        return "GRPCAction{" + "port=" + port + "\n" + "service=" + service + "\n" + "}";
    }

}