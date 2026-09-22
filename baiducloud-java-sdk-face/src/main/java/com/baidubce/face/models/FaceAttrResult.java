package com.baidubce.face.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceAttrResult {
    /**
     * 编辑后图片的BASE64值
     */
    private String image;

    public FaceAttrResult setImage(String image) {
        this.image = image;
        return this;
    }

    public String getImage() {
        return this.image;
    }

    @Override
    public String toString() {
        return "FaceAttrResult{" + "image=" + image + "\n" + "}";
    }

}