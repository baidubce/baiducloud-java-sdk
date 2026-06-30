package com.baidubce.bci.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImageRegistryCredential {
    /**
     * 镜像仓库注册地址
     */
    private String server;

    /**
     * 镜像仓库用户名
     */
    private String userName;

    /**
     * 镜像仓库密码
     */
    private String password;

    public ImageRegistryCredential setServer(String server) {
        this.server = server;
        return this;
    }

    public String getServer() {
        return this.server;
    }

    public ImageRegistryCredential setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getUserName() {
        return this.userName;
    }

    public ImageRegistryCredential setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getPassword() {
        return this.password;
    }

    @Override
    public String toString() {
        return "ImageRegistryCredential{" + "server=" + server + "\n" + "userName=" + userName + "\n" + "password=" + password + "\n" + "}";
    }

}