package com.baidubce.image.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AnimalResult {
    /**
     * 动物名称
     */
    private String name;

    /**
     * 置信度
     */
    private String score;

    /**
     * baikeInfo
     */
    @JsonProperty("baike_info")
    private BaikeInfo baikeInfo;

    public AnimalResult setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public AnimalResult setScore(String score) {
        this.score = score;
        return this;
    }

    public String getScore() {
        return this.score;
    }

    public AnimalResult setBaikeInfo(BaikeInfo baikeInfo) {
        this.baikeInfo = baikeInfo;
        return this;
    }

    public BaikeInfo getBaikeInfo() {
        return this.baikeInfo;
    }

    @Override
    public String toString() {
        return "AnimalResult{" + "name=" + name + "\n" + "score=" + score + "\n" + "baikeInfo=" + baikeInfo + "\n" + "}";
    }

}