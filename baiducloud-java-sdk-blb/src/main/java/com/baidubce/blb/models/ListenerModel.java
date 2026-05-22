package com.baidubce.blb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListenerModel {
    /**
     * 监听器端口
     */
    private String port;

    /**
     * 监听器协议类型
     */
    private String type;

    /**
     * 描述信息，长度不超过200个字符。
     */
    private String description;

    public ListenerModel setPort(String port) {
        this.port = port;
        return this;
    }

    public String getPort() {
        return this.port;
    }

    public ListenerModel setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public ListenerModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "ListenerModel{" + "port=" + port + "\n" + "type=" + type + "\n" + "description=" + description + "\n" + "}";
    }

}