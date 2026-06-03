package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateTemporaryPasswordResponse extends BaseBceResponse {

    /**
    * 临时密码
    */
    private String password;

    public String getPassword() {
        return password;
    }

    public CreateTemporaryPasswordResponse setPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public String toString() {
        return "CreateTemporaryPasswordResponse{" + "password=" + password + "\n" + "}";
    }

}
