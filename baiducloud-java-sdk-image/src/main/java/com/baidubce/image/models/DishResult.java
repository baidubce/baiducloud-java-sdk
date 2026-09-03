package com.baidubce.image.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DishResult {
    /**
     * 菜品名称
     */
    private String name;

    /**
     * 卡路里，每100g的卡路里含量
     */
    private String calorie;

    /**
     * 识别概率
     */
    private String probability;

    /**
     * 是否有卡路里信息
     */
    @JsonProperty("has_calorie")
    private Boolean hasCalorie;

    /**
     * baikeInfo
     */
    @JsonProperty("baike_info")
    private BaikeInfo baikeInfo;

    public DishResult setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public DishResult setCalorie(String calorie) {
        this.calorie = calorie;
        return this;
    }

    public String getCalorie() {
        return this.calorie;
    }

    public DishResult setProbability(String probability) {
        this.probability = probability;
        return this;
    }

    public String getProbability() {
        return this.probability;
    }

    public DishResult setHasCalorie(Boolean hasCalorie) {
        this.hasCalorie = hasCalorie;
        return this;
    }

    public Boolean getHasCalorie() {
        return this.hasCalorie;
    }

    public DishResult setBaikeInfo(BaikeInfo baikeInfo) {
        this.baikeInfo = baikeInfo;
        return this;
    }

    public BaikeInfo getBaikeInfo() {
        return this.baikeInfo;
    }

    @Override
    public String toString() {
        return "DishResult{" + "name=" + name + "\n" + "calorie=" + calorie + "\n" + "probability=" + probability + "\n" + "hasCalorie=" + hasCalorie + "\n" + "baikeInfo="
                + baikeInfo + "\n" + "}";
    }

}