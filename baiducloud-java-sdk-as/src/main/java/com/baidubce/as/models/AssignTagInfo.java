package com.baidubce.as.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssignTagInfo {
    /**
     * 资源id
     */
    private String resourceId;

    /**
     * 是否绑定标签
     */
    private Boolean relationTag;

    /**
     * 标签信息
     */
    private List<TagInfo> tags;

    public AssignTagInfo setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    public String getResourceId() {
        return this.resourceId;
    }

    public AssignTagInfo setRelationTag(Boolean relationTag) {
        this.relationTag = relationTag;
        return this;
    }

    public Boolean getRelationTag() {
        return this.relationTag;
    }

    public AssignTagInfo setTags(List<TagInfo> tags) {
        this.tags = tags;
        return this;
    }

    public List<TagInfo> getTags() {
        return this.tags;
    }

    @Override
    public String toString() {
        return "AssignTagInfo{" + "resourceId=" + resourceId + "\n" + "relationTag=" + relationTag + "\n" + "tags=" + tags + "\n" + "}";
    }

}