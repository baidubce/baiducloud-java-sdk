package com.baidubce.face.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserGetUserInfo {
    /**
     * 用户资料，被查询用户的资料
     */
    @JsonProperty("user_info")
    private String userInfo;

    /**
     * 用户所属的group_id，被查询用户的所在组
     */
    @JsonProperty("group_id")
    private String groupId;

    public UserGetUserInfo setUserInfo(String userInfo) {
        this.userInfo = userInfo;
        return this;
    }

    public String getUserInfo() {
        return this.userInfo;
    }

    public UserGetUserInfo setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getGroupId() {
        return this.groupId;
    }

    @Override
    public String toString() {
        return "UserGetUserInfo{" + "userInfo=" + userInfo + "\n" + "groupId=" + groupId + "\n" + "}";
    }

}