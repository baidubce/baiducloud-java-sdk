package com.baidubce.nlp.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class KeywordItem {
    /**
     * 内容标签
     */
    private String tag;

    /**
     * 权重值，取值范围[0,1]
     */
    private Float score;

    public KeywordItem setTag(String tag) {
        this.tag = tag;
        return this;
    }

    public String getTag() {
        return this.tag;
    }

    public KeywordItem setScore(Float score) {
        this.score = score;
        return this;
    }

    public Float getScore() {
        return this.score;
    }

    @Override
    public String toString() {
        return "KeywordItem{" + "tag=" + tag + "\n" + "score=" + score + "\n" + "}";
    }

}