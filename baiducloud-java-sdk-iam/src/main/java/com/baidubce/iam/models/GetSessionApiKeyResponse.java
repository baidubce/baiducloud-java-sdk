package com.baidubce.iam.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetSessionApiKeyResponse extends BaseBceResponse {

    /**
    * API Key归属user
    */
    private String userId;

    /**
    * API Key本身
    */
    private String token;

    /**
    * 创建时间
    */
    private String createTime;

    /**
    * 过期时间
    */
    private String expireTime;

    public String getUserId() {
        return userId;
    }

    public GetSessionApiKeyResponse setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getToken() {
        return token;
    }

    public GetSessionApiKeyResponse setToken(String token) {
        this.token = token;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public GetSessionApiKeyResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public GetSessionApiKeyResponse setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    @Override
    public String toString() {
        return "GetSessionApiKeyResponse{" + "userId=" + userId + "\n" + "token=" + token + "\n" + "createTime=" + createTime + "\n" + "expireTime=" + expireTime + "\n" + "}";
    }

}
