package com.baidubce.blb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PortTypeModel {
    /**
     * 监听端口
     */
    private Integer port;

    /**
     * 监听端口的协议
     */
    private String type;

    public PortTypeModel setPort(Integer port) {
        this.port = port;
        return this;
    }

    public Integer getPort() {
        return this.port;
    }

    public PortTypeModel setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "PortTypeModel{" + "port=" + port + "\n" + "type=" + type + "\n" + "}";
    }

}