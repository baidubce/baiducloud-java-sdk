package com.baidubce.blb.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppBackendServer {
    /**
     * 后端服务器标识符
     */
    private String instanceId;

    /**
     * 后端服务器权重，取值范围0-100
     */
    private Integer weight;

    /**
     * 查询时返回值，后端绑定的该服务器ip地址
     */
    private String privateIp;

    /**
     * 查询时返回值，设置了相应策略，RS开放的端口列表
     */
    private List<AppRsPortModel> portList;

    public AppBackendServer setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public AppBackendServer setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public AppBackendServer setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    public String getPrivateIp() {
        return this.privateIp;
    }

    public AppBackendServer setPortList(List<AppRsPortModel> portList) {
        this.portList = portList;
        return this;
    }

    public List<AppRsPortModel> getPortList() {
        return this.portList;
    }

    @Override
    public String toString() {
        return "AppBackendServer{" + "instanceId=" + instanceId + "\n" + "weight=" + weight + "\n" + "privateIp=" + privateIp + "\n" + "portList=" + portList + "\n" + "}";
    }

}