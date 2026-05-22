package com.baidubce.blb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppUDPListenerModel {
    /**
     * 监听器的监听端口
     */
    private Integer listenerPort;

    /**
     * 负载均衡算法，值为"RoundRobin"/"WeightLeastConn"/"Hash"，"RoundRobin"代表加权轮询、"WeightLeastConn"代表加权最小连接数、"Hash"代表根据源ip哈希
     */
    private String scheduler;

    /**
     * 描述信息，长度不超过200个字符。
     */
    private String description;

    public AppUDPListenerModel setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }

    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public AppUDPListenerModel setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }

    public String getScheduler() {
        return this.scheduler;
    }

    public AppUDPListenerModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "AppUDPListenerModel{" + "listenerPort=" + listenerPort + "\n" + "scheduler=" + scheduler + "\n" + "description=" + description + "\n" + "}";
    }

}