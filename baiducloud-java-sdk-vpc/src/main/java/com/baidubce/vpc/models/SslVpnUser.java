package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SslVpnUser {
    /**
     * 用户名，大小写字母、数字以及-_/.特殊字符，必须以字母开头，长度1-65
     */
    private String userName;

    /**
     * 密码，8～17位字符，英文、数字和符号必须同时存在，符号仅限!@#$%^*(_
     */
    private String password;

    /**
     * 描述
     */
    private String description;

    public SslVpnUser setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getUserName() {
        return this.userName;
    }

    public SslVpnUser setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getPassword() {
        return this.password;
    }

    public SslVpnUser setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "SslVpnUser{" + "userName=" + userName + "\n" + "password=" + password + "\n" + "description=" + description + "\n" + "}";
    }

}