package com.baidubce.scs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EntranceItem {
    /**
     * 入口IP
     */
    private String ip;

    /**
     * 端口
     */
    private Integer port;

    /**
     * 可用区
     */
    private String zone;

    public EntranceItem setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public String getIp() {
        return this.ip;
    }

    public EntranceItem setPort(Integer port) {
        this.port = port;
        return this;
    }

    public Integer getPort() {
        return this.port;
    }

    public EntranceItem setZone(String zone) {
        this.zone = zone;
        return this;
    }

    public String getZone() {
        return this.zone;
    }

    @Override
    public String toString() {
        return "EntranceItem{" + "ip=" + ip + "\n" + "port=" + port + "\n" + "zone=" + zone + "\n" + "}";
    }

}