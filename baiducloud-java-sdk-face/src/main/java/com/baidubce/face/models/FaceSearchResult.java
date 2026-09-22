package com.baidubce.face.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceSearchResult {
    /**
     * 用于搜索的人脸图片唯一标识，有效期60min
     */
    @JsonProperty("face_token")
    private String faceToken;

    /**
     * 匹配的用户信息列表
     */
    @JsonProperty("user_list")
    private List<FaceSearchUserInfo> userList;

    public FaceSearchResult setFaceToken(String faceToken) {
        this.faceToken = faceToken;
        return this;
    }

    public String getFaceToken() {
        return this.faceToken;
    }

    public FaceSearchResult setUserList(List<FaceSearchUserInfo> userList) {
        this.userList = userList;
        return this;
    }

    public List<FaceSearchUserInfo> getUserList() {
        return this.userList;
    }

    @Override
    public String toString() {
        return "FaceSearchResult{" + "faceToken=" + faceToken + "\n" + "userList=" + userList + "\n" + "}";
    }

}