package com.baidubce.rds.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Resource {
    /**
     * 资源ID（实例ID）
     */
    private String instanceId;

    /**
     * 标签列表
     */
    private List<Tag> tags;

    public Resource setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public Resource setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    @Override
    public String toString() {
        return "Resource{" + "instanceId=" + instanceId + "\n" + "tags=" + tags + "\n" + "}";
    }

}