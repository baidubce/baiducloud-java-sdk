package com.baidubce.face.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceGetListFaceInfo {
    /**
     * 人脸创建时间
     */
    private String ctime;

    /**
     * 人脸标识
     */
    @JsonProperty("face_token")
    private String faceToken;

    public FaceGetListFaceInfo setCtime(String ctime) {
        this.ctime = ctime;
        return this;
    }

    public String getCtime() {
        return this.ctime;
    }

    public FaceGetListFaceInfo setFaceToken(String faceToken) {
        this.faceToken = faceToken;
        return this;
    }

    public String getFaceToken() {
        return this.faceToken;
    }

    @Override
    public String toString() {
        return "FaceGetListFaceInfo{" + "ctime=" + ctime + "\n" + "faceToken=" + faceToken + "\n" + "}";
    }

}