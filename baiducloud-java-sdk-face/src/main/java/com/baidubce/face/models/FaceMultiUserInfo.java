package com.baidubce.face.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceMultiUserInfo {
    /**
     * 用户的匹配得分，80分以上可判断为同一人
     */
    private Float score;

    /**
     * 用户所属的group_id
     */
    @JsonProperty("group_id")
    private String groupId;

    /**
     * 用户的user_id
     */
    @JsonProperty("user_id")
    private String userId;

    /**
     * 注册用户时携带的user_info
     */
    @JsonProperty("user_info")
    private String userInfo;

    public FaceMultiUserInfo setScore(Float score) {
        this.score = score;
        return this;
    }

    public Float getScore() {
        return this.score;
    }

    public FaceMultiUserInfo setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public FaceMultiUserInfo setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getUserId() {
        return this.userId;
    }

    public FaceMultiUserInfo setUserInfo(String userInfo) {
        this.userInfo = userInfo;
        return this;
    }

    public String getUserInfo() {
        return this.userInfo;
    }

    @Override
    public String toString() {
        return "FaceMultiUserInfo{" + "score=" + score + "\n" + "groupId=" + groupId + "\n" + "userId=" + userId + "\n" + "userInfo=" + userInfo + "\n" + "}";
    }

}