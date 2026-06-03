package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateRobotAccountResponse extends BaseBceResponse {

    /**
    * 机器人账号ID
    */
    private Integer id;

    /**
    * 账号名称
    */
    private String name;

    /**
    * 账号密码
    */
    private String secret;

    /**
    * 创建时间
    */
    private String creationTime;

    /**
    * 过期时间 Unix 时间戳，-1表示永不过期
    */
    private Integer expiresAt;

    public Integer getId() {
        return id;
    }

    public CreateRobotAccountResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateRobotAccountResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getSecret() {
        return secret;
    }

    public CreateRobotAccountResponse setSecret(String secret) {
        this.secret = secret;
        return this;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public CreateRobotAccountResponse setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public Integer getExpiresAt() {
        return expiresAt;
    }

    public CreateRobotAccountResponse setExpiresAt(Integer expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    @Override
    public String toString() {
        return "CreateRobotAccountResponse{" + "id=" + id + "\n" + "name=" + name + "\n" + "secret=" + secret + "\n" + "creationTime=" + creationTime + "\n" + "expiresAt="
                + expiresAt + "\n" + "}";
    }

}
