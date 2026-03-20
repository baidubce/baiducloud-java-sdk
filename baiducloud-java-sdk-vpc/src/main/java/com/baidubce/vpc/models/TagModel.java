package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TagModel {
    /**
     * 标签的键，可包含大小写字母、数字、中文以及-_ /.特殊字符，长度1-65
     */
    private String tagKey;

    /**
     * 标签的值，可包含大小写字母、数字、中文以及-_ /.特殊字符，长度0-65
     */
    private String tagValue;

    public TagModel setTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }

    public String getTagKey() {
        return this.tagKey;
    }

    public TagModel setTagValue(String tagValue) {
        this.tagValue = tagValue;
        return this;
    }

    public String getTagValue() {
        return this.tagValue;
    }

    @Override
    public String toString() {
        return "TagModel{" + "tagKey=" + tagKey + "\n" + "tagValue=" + tagValue + "\n" + "}";
    }

}