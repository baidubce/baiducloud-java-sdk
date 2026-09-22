package com.baidubce.face.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceMergeResult {
    /**
     * 融合图的BASE64值
     */
    @JsonProperty("merge_image")
    private String mergeImage;

    public FaceMergeResult setMergeImage(String mergeImage) {
        this.mergeImage = mergeImage;
        return this;
    }

    public String getMergeImage() {
        return this.mergeImage;
    }

    @Override
    public String toString() {
        return "FaceMergeResult{" + "mergeImage=" + mergeImage + "\n" + "}";
    }

}