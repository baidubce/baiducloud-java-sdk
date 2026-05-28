package com.baidubce.blb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BackendServerModel {
    /**
     * 后端服务器标识符
     */
    private String instanceId;

    /**
     * 后端服务器权重，取值范围[0, 100]，权重为0表示不要把流量转发到该后端服务器上
     */
    private Integer weight;

    public BackendServerModel setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public BackendServerModel setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    public Integer getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return "BackendServerModel{" + "instanceId=" + instanceId + "\n" + "weight=" + weight + "\n" + "}";
    }

}