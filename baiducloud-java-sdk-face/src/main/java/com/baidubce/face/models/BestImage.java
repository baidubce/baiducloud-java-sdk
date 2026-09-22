package com.baidubce.face.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BestImage {
    /**
     * 人脸图片的唯一标识
     */
    @JsonProperty("face_token")
    private String faceToken;

    /**
     * base64编码后的图片信息
     */
    private String pic;

    /**
     * 此图片的活体分数，范围[0,1]
     */
    @JsonProperty("liveness_score")
    private Float livenessScore;

    public BestImage setFaceToken(String faceToken) {
        this.faceToken = faceToken;
        return this;
    }

    public String getFaceToken() {
        return this.faceToken;
    }

    public BestImage setPic(String pic) {
        this.pic = pic;
        return this;
    }

    public String getPic() {
        return this.pic;
    }

    public BestImage setLivenessScore(Float livenessScore) {
        this.livenessScore = livenessScore;
        return this;
    }

    public Float getLivenessScore() {
        return this.livenessScore;
    }

    @Override
    public String toString() {
        return "BestImage{" + "faceToken=" + faceToken + "\n" + "pic=" + pic + "\n" + "livenessScore=" + livenessScore + "\n" + "}";
    }

}