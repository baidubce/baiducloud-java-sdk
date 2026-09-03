package com.baidubce.image.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LogoResult {
    /**
     * location
     */
    private LogoLocation location;

    /**
     * 识别的品牌名称
     */
    private String name;

    /**
     * 分类结果置信度（0--1.0）
     */
    private Float probability;

    /**
     * type=0为1千种高优商标识别结果;type=1为2万类logo库的结果；其它type为自定义logo库结果
     */
    private Integer type;

    public LogoResult setLocation(LogoLocation location) {
        this.location = location;
        return this;
    }

    public LogoLocation getLocation() {
        return this.location;
    }

    public LogoResult setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public LogoResult setProbability(Float probability) {
        this.probability = probability;
        return this;
    }

    public Float getProbability() {
        return this.probability;
    }

    public LogoResult setType(Integer type) {
        this.type = type;
        return this;
    }

    public Integer getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "LogoResult{" + "location=" + location + "\n" + "name=" + name + "\n" + "probability=" + probability + "\n" + "type=" + type + "\n" + "}";
    }

}