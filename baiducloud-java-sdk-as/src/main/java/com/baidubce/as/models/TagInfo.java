package com.baidubce.as.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TagInfo {
    /**
     * 键
     */
    private String tagKey;

    /**
     * 值
     */
    private String tagValue;

    public TagInfo setTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }

    public String getTagKey() {
        return this.tagKey;
    }

    public TagInfo setTagValue(String tagValue) {
        this.tagValue = tagValue;
        return this;
    }

    public String getTagValue() {
        return this.tagValue;
    }

    @Override
    public String toString() {
        return "TagInfo{" + "tagKey=" + tagKey + "\n" + "tagValue=" + tagValue + "\n" + "}";
    }

}