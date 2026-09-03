package com.baidubce.image.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlantResult {
    /**
     * 植物名称
     */
    private String name;

    /**
     * 置信度
     */
    private Float score;

    /**
     * baikeInfo
     */
    @JsonProperty("baike_info")
    private BaikeInfo baikeInfo;

    public PlantResult setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public PlantResult setScore(Float score) {
        this.score = score;
        return this;
    }

    public Float getScore() {
        return this.score;
    }

    public PlantResult setBaikeInfo(BaikeInfo baikeInfo) {
        this.baikeInfo = baikeInfo;
        return this;
    }

    public BaikeInfo getBaikeInfo() {
        return this.baikeInfo;
    }

    @Override
    public String toString() {
        return "PlantResult{" + "name=" + name + "\n" + "score=" + score + "\n" + "baikeInfo=" + baikeInfo + "\n" + "}";
    }

}