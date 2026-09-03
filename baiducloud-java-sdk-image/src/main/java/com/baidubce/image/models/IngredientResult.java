package com.baidubce.image.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class IngredientResult {
    /**
     * 果蔬名称
     */
    private String name;

    /**
     * 置信度
     */
    private Double score;

    public IngredientResult setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public IngredientResult setScore(Double score) {
        this.score = score;
        return this;
    }

    public Double getScore() {
        return this.score;
    }

    @Override
    public String toString() {
        return "IngredientResult{" + "name=" + name + "\n" + "score=" + score + "\n" + "}";
    }

}