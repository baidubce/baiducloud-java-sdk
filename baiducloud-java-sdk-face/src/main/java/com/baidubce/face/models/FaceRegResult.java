package com.baidubce.face.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceRegResult {
    /**
     * location
     */
    private FaceLocation location;

    /**
     * 人脸图片的唯一标识，有效期永久
     */
    @JsonProperty("face_token")
    private String faceToken;

    public FaceRegResult setLocation(FaceLocation location) {
        this.location = location;
        return this;
    }

    public FaceLocation getLocation() {
        return this.location;
    }

    public FaceRegResult setFaceToken(String faceToken) {
        this.faceToken = faceToken;
        return this;
    }

    public String getFaceToken() {
        return this.faceToken;
    }

    @Override
    public String toString() {
        return "FaceRegResult{" + "location=" + location + "\n" + "faceToken=" + faceToken + "\n" + "}";
    }

}