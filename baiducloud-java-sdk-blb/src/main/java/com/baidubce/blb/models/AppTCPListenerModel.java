package com.baidubce.blb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppTCPListenerModel {
    /**
     * 监听器的监听端口
     */
    private Integer listenerPort;

    /**
     * 负载均衡算法，值为"RoundRobin"/"WeightLeastConn"/"Hash"，"RoundRobin"代表加权轮询、"WeightLeastConn"代表加权最小连接数、"Hash"代表根据源ip哈希
     */
    private String scheduler;

    /**
     * tcp设置连接超时时间（单位：秒），默认为900，需为10-4000间的整数
     */
    private Integer tcpSessionTimeout;

    /**
     * 描述信息，长度不超过200个字符。
     */
    private String description;

    public AppTCPListenerModel setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }

    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public AppTCPListenerModel setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }

    public String getScheduler() {
        return this.scheduler;
    }

    public AppTCPListenerModel setTcpSessionTimeout(Integer tcpSessionTimeout) {
        this.tcpSessionTimeout = tcpSessionTimeout;
        return this;
    }

    public Integer getTcpSessionTimeout() {
        return this.tcpSessionTimeout;
    }

    public AppTCPListenerModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "AppTCPListenerModel{" + "listenerPort=" + listenerPort + "\n" + "scheduler=" + scheduler + "\n" + "tcpSessionTimeout=" + tcpSessionTimeout + "\n" + "description="
                + description + "\n" + "}";
    }

}