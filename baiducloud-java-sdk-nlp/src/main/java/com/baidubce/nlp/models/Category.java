package com.baidubce.nlp.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Category {
    /**
     * 一级概念
     */
    @JsonProperty("level_1")
    private String level1;

    /**
     * 二级概念
     */
    @JsonProperty("level_2")
    private String level2;

    /**
     * 三级概念
     */
    @JsonProperty("level_3")
    private String level3;

    public Category setLevel1(String level1) {
        this.level1 = level1;
        return this;
    }

    public String getLevel1() {
        return this.level1;
    }

    public Category setLevel2(String level2) {
        this.level2 = level2;
        return this;
    }

    public String getLevel2() {
        return this.level2;
    }

    public Category setLevel3(String level3) {
        this.level3 = level3;
        return this;
    }

    public String getLevel3() {
        return this.level3;
    }

    @Override
    public String toString() {
        return "Category{" + "level1=" + level1 + "\n" + "level2=" + level2 + "\n" + "level3=" + level3 + "\n" + "}";
    }

}