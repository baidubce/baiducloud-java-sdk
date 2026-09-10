package com.baidubce.cce.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstanceGroup {
    /**
     * 节点组配置
     */
    private Object spec;

    /**
     * 节点组状态
     */
    private Object status;

    /**
     * 创建时间
     */
    private String createdAt;

    public InstanceGroup setSpec(Object spec) {
        this.spec = spec;
        return this;
    }

    public Object getSpec() {
        return this.spec;
    }

    public InstanceGroup setStatus(Object status) {
        this.status = status;
        return this;
    }

    public Object getStatus() {
        return this.status;
    }

    public InstanceGroup setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    @Override
    public String toString() {
        return "InstanceGroup{" + "spec=" + spec + "\n" + "status=" + status + "\n" + "createdAt=" + createdAt + "\n" + "}";
    }

}