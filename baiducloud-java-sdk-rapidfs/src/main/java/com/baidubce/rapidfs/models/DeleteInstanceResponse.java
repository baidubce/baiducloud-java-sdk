package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteInstanceResponse extends BaseBceResponse {

    /**
    * 临时令牌
    */
    private String token;

    public String getToken() {
        return token;
    }

    public DeleteInstanceResponse setToken(String token) {
        this.token = token;
        return this;
    }

    @Override
    public String toString() {
        return "DeleteInstanceResponse{" + "token=" + token + "\n" + "}";
    }

}
