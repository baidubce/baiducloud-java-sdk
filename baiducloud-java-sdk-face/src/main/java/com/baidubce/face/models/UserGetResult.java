package com.baidubce.face.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserGetResult {
    /**
     * 用户信息列表
     */
    @JsonProperty("user_list")
    private List<UserGetUserInfo> userList;

    public UserGetResult setUserList(List<UserGetUserInfo> userList) {
        this.userList = userList;
        return this;
    }

    public List<UserGetUserInfo> getUserList() {
        return this.userList;
    }

    @Override
    public String toString() {
        return "UserGetResult{" + "userList=" + userList + "\n" + "}";
    }

}