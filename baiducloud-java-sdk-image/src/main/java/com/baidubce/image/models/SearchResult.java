package com.baidubce.image.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchResult {
    /**
     * 图片签名，可用于删除图片或定位问题
     */
    @JsonProperty("cont_sign")
    private String contSign;

    /**
     * 图片相关性，0-1，越接近1越相似
     */
    private Float score;

    /**
     * 入库时添加的brief信息
     */
    private String brief;

    public SearchResult setContSign(String contSign) {
        this.contSign = contSign;
        return this;
    }

    public String getContSign() {
        return this.contSign;
    }

    public SearchResult setScore(Float score) {
        this.score = score;
        return this;
    }

    public Float getScore() {
        return this.score;
    }

    public SearchResult setBrief(String brief) {
        this.brief = brief;
        return this;
    }

    public String getBrief() {
        return this.brief;
    }

    @Override
    public String toString() {
        return "SearchResult{" + "contSign=" + contSign + "\n" + "score=" + score + "\n" + "brief=" + brief + "\n" + "}";
    }

}