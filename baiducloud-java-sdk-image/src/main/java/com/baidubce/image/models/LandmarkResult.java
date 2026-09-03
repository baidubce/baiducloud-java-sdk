package com.baidubce.image.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LandmarkResult {
    /**
     * 地标名称
     */
    private String landmark;

    public LandmarkResult setLandmark(String landmark) {
        this.landmark = landmark;
        return this;
    }

    public String getLandmark() {
        return this.landmark;
    }

    @Override
    public String toString() {
        return "LandmarkResult{" + "landmark=" + landmark + "\n" + "}";
    }

}