package com.baidubce.rapidfs.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TagResource {
    /**
     * RapidFS 实例ID
     */
    private String instanceId;

    /**
     * 需要创建或者修改绑定的实例标签，解绑所有标签时则传空数组即可，见Tag
     */
    private List<Tag> tags;

    public TagResource setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public TagResource setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    @Override
    public String toString() {
        return "TagResource{" + "instanceId=" + instanceId + "\n" + "tags=" + tags + "\n" + "}";
    }

}