package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RefreshRobotAccountKeyResponse extends BaseBceResponse {

    /**
    * 账号密码
    */
    private String secret;

    public String getSecret() {
        return secret;
    }

    public RefreshRobotAccountKeyResponse setSecret(String secret) {
        this.secret = secret;
        return this;
    }

    @Override
    public String toString() {
        return "RefreshRobotAccountKeyResponse{" + "secret=" + secret + "\n" + "}";
    }

}
