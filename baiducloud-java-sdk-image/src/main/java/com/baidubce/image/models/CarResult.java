package com.baidubce.image.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CarResult {
    /**
     * 车型名称
     */
    private String name;

    /**
     * 置信度，0-1
     */
    private Double score;

    /**
     * 年份
     */
    private String year;

    /**
     * baikeInfo
     */
    @JsonProperty("baike_info")
    private BaikeInfo baikeInfo;

    public CarResult setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public CarResult setScore(Double score) {
        this.score = score;
        return this;
    }

    public Double getScore() {
        return this.score;
    }

    public CarResult setYear(String year) {
        this.year = year;
        return this;
    }

    public String getYear() {
        return this.year;
    }

    public CarResult setBaikeInfo(BaikeInfo baikeInfo) {
        this.baikeInfo = baikeInfo;
        return this;
    }

    public BaikeInfo getBaikeInfo() {
        return this.baikeInfo;
    }

    @Override
    public String toString() {
        return "CarResult{" + "name=" + name + "\n" + "score=" + score + "\n" + "year=" + year + "\n" + "baikeInfo=" + baikeInfo + "\n" + "}";
    }

}