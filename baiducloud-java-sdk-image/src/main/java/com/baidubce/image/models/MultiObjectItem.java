package com.baidubce.image.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MultiObjectItem {
    /**
     * 识别的物体名称
     */
    private String name;

    /**
     * 置信度，0-1
     */
    private Float score;

    /**
     * location
     */
    private MultiObjectLocation location;

    public MultiObjectItem setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public MultiObjectItem setScore(Float score) {
        this.score = score;
        return this;
    }

    public Float getScore() {
        return this.score;
    }

    public MultiObjectItem setLocation(MultiObjectLocation location) {
        this.location = location;
        return this;
    }

    public MultiObjectLocation getLocation() {
        return this.location;
    }

    @Override
    public String toString() {
        return "MultiObjectItem{" + "name=" + name + "\n" + "score=" + score + "\n" + "location=" + location + "\n" + "}";
    }

}