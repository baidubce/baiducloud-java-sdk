package com.baidubce.bci.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Tag {
    /**
     * 标签名，由字母数字、'-'、'.'组成，必须以字母数字开始和结束
     */
    private String tagKey;

    /**
     * 标签值
     */
    private String tagValue;

    public Tag setTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }

    public String getTagKey() {
        return this.tagKey;
    }

    public Tag setTagValue(String tagValue) {
        this.tagValue = tagValue;
        return this;
    }

    public String getTagValue() {
        return this.tagValue;
    }

    @Override
    public String toString() {
        return "Tag{" + "tagKey=" + tagKey + "\n" + "tagValue=" + tagValue + "\n" + "}";
    }

}