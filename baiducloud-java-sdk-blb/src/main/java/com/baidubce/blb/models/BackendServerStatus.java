package com.baidubce.blb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BackendServerStatus {
    /**
     * 后端服务器标识符
     */
    private String instanceId;

    /**
     * 后端服务器权重
     */
    private Integer weight;

    /**
     * 后端服务器健康状态，值为"Alive"/"Dead"/"Unknown"
     */
    private String status;

    public BackendServerStatus setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public BackendServerStatus setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public BackendServerStatus setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        return "BackendServerStatus{" + "instanceId=" + instanceId + "\n" + "weight=" + weight + "\n" + "status=" + status + "\n" + "}";
    }

}