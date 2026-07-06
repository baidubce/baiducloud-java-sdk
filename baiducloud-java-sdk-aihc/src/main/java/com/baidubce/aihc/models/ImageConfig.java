package com.baidubce.aihc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImageConfig {
    /**
     * 私有镜像仓库用户名
     */
    private String username;

    /**
     * 私有镜像仓库密码
     */
    private String password;

    public ImageConfig setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getUsername() {
        return this.username;
    }

    public ImageConfig setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getPassword() {
        return this.password;
    }

    @Override
    public String toString() {
        return "ImageConfig{" + "username=" + username + "\n" + "password=" + password + "\n" + "}";
    }

}