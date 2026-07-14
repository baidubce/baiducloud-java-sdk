package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetWorkloadAccessTokenResponse extends BaseBceResponse {

    /**
    * WAT 令牌（格式：wat-v1.<encrypted-payload>）
    */
    private String token;

    /**
    * 过期时间（ISO 8601）
    */
    private String expireAt;

    public String getToken() {
        return token;
    }

    public GetWorkloadAccessTokenResponse setToken(String token) {
        this.token = token;
        return this;
    }

    public String getExpireAt() {
        return expireAt;
    }

    public GetWorkloadAccessTokenResponse setExpireAt(String expireAt) {
        this.expireAt = expireAt;
        return this;
    }

    @Override
    public String toString() {
        return "GetWorkloadAccessTokenResponse{" + "token=" + token + "\n" + "expireAt=" + expireAt + "\n" + "}";
    }

}
