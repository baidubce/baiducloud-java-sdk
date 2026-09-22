package com.baidubce.face.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceMultiFaceInfo {
    /**
     * location
     */
    private FaceMultiLocation location;

    /**
     * 人脸图片的唯一标识，有效期60min
     */
    @JsonProperty("face_token")
    private String faceToken;

    /**
     * 匹配的用户信息列表
     */
    @JsonProperty("user_list")
    private List<FaceMultiUserInfo> userList;

    public FaceMultiFaceInfo setLocation(FaceMultiLocation location) {
        this.location = location;
        return this;
    }

    public FaceMultiLocation getLocation() {
        return this.location;
    }

    public FaceMultiFaceInfo setFaceToken(String faceToken) {
        this.faceToken = faceToken;
        return this;
    }

    public String getFaceToken() {
        return this.faceToken;
    }

    public FaceMultiFaceInfo setUserList(List<FaceMultiUserInfo> userList) {
        this.userList = userList;
        return this;
    }

    public List<FaceMultiUserInfo> getUserList() {
        return this.userList;
    }

    @Override
    public String toString() {
        return "FaceMultiFaceInfo{" + "location=" + location + "\n" + "faceToken=" + faceToken + "\n" + "userList=" + userList + "\n" + "}";
    }

}