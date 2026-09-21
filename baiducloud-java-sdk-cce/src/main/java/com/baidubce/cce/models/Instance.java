package com.baidubce.cce.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Instance {
    /**
     * 节点规格配置
     */
    private Object spec;

    /**
     * 节点状态信息
     */
    private Object status;

    /**
     * 创建时间
     */
    private String createdAt;

    /**
     * 更新时间
     */
    private String updatedAt;

    public Instance setSpec(Object spec) {
        this.spec = spec;
        return this;
    }

    public Object getSpec() {
        return this.spec;
    }

    public Instance setStatus(Object status) {
        this.status = status;
        return this;
    }

    public Object getStatus() {
        return this.status;
    }

    public Instance setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public Instance setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }

    @Override
    public String toString() {
        return "Instance{" + "spec=" + spec + "\n" + "status=" + status + "\n" + "createdAt=" + createdAt + "\n" + "updatedAt=" + updatedAt + "\n" + "}";
    }

}