package com.baidubce.blb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppBackendServerForCreate {
    /**
     * 后端服务器标识符
     */
    private String instanceId;

    /**
     * 后端服务器权重，取值范围0-100
     */
    private Integer weight;

    /**
     * 描述
     */
    private String desc;

    public AppBackendServerForCreate setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public AppBackendServerForCreate setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public AppBackendServerForCreate setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getDesc() {
        return this.desc;
    }

    @Override
    public String toString() {
        return "AppBackendServerForCreate{" + "instanceId=" + instanceId + "\n" + "weight=" + weight + "\n" + "desc=" + desc + "\n" + "}";
    }

}