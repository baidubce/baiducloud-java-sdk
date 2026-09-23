package com.baidubce.nlp.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TopicItem {
    /**
     * 一级分类结果（唯一）
     */
    @JsonProperty("lv1_tag_list")
    private List<TopicTagItem> lv1TagList;

    /**
     * 二级分类结果
     */
    @JsonProperty("lv2_tag_list")
    private List<TopicTagItem> lv2TagList;

    public TopicItem setLv1TagList(List<TopicTagItem> lv1TagList) {
        this.lv1TagList = lv1TagList;
        return this;
    }

    public List<TopicTagItem> getLv1TagList() {
        return this.lv1TagList;
    }

    public TopicItem setLv2TagList(List<TopicTagItem> lv2TagList) {
        this.lv2TagList = lv2TagList;
        return this;
    }

    public List<TopicTagItem> getLv2TagList() {
        return this.lv2TagList;
    }

    @Override
    public String toString() {
        return "TopicItem{" + "lv1TagList=" + lv1TagList + "\n" + "lv2TagList=" + lv2TagList + "\n" + "}";
    }

}