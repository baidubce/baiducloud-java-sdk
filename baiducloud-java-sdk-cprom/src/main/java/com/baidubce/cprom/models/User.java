package com.baidubce.cprom.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
    /**
     * 用户ID
     */
    private String userId;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 用户类型, 默认identity
     */
    private String userType;

    /**
     * 用户手机号码
     */
    private String phoneNumber;

    /**
     * 用户邮箱
     */
    private String email;

    public User setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getUserId() {
        return this.userId;
    }

    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getUserName() {
        return this.userName;
    }

    public User setUserType(String userType) {
        this.userType = userType;
        return this;
    }

    public String getUserType() {
        return this.userType;
    }

    public User setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getEmail() {
        return this.email;
    }

    @Override
    public String toString() {
        return "User{" + "userId=" + userId + "\n" + "userName=" + userName + "\n" + "userType=" + userType + "\n" + "phoneNumber=" + phoneNumber + "\n" + "email=" + email + "\n"
                + "}";
    }

}