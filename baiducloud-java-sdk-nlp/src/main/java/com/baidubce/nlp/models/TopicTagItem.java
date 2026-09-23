package com.baidubce.nlp.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TopicTagItem {
    /**
     * 类别标签对应得分，范围0-1
     */
    private Float score;

    /**
     * 类别标签
     */
    private String tag;

    public TopicTagItem setScore(Float score) {
        this.score = score;
        return this;
    }

    public Float getScore() {
        return this.score;
    }

    public TopicTagItem setTag(String tag) {
        this.tag = tag;
        return this;
    }

    public String getTag() {
        return this.tag;
    }

    @Override
    public String toString() {
        return "TopicTagItem{" + "score=" + score + "\n" + "tag=" + tag + "\n" + "}";
    }

}