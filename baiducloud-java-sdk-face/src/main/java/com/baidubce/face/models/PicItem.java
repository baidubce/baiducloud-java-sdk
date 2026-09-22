package com.baidubce.face.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PicItem {
    /**
     * 人脸图片的唯一标识
     */
    @JsonProperty("face_token")
    private String faceToken;

    /**
     * 此图片的合成图分数，范围[0,1]
     */
    private Float spoofing;

    public PicItem setFaceToken(String faceToken) {
        this.faceToken = faceToken;
        return this;
    }

    public String getFaceToken() {
        return this.faceToken;
    }

    public PicItem setSpoofing(Float spoofing) {
        this.spoofing = spoofing;
        return this;
    }

    public Float getSpoofing() {
        return this.spoofing;
    }

    @Override
    public String toString() {
        return "PicItem{" + "faceToken=" + faceToken + "\n" + "spoofing=" + spoofing + "\n" + "}";
    }

}