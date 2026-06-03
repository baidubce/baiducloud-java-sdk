package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoveDataSrcResponse extends BaseBceResponse {

    /**
    * 临时令牌
    */
    private String token;

    public String getToken() {
        return token;
    }

    public RemoveDataSrcResponse setToken(String token) {
        this.token = token;
        return this;
    }

    @Override
    public String toString() {
        return "RemoveDataSrcResponse{" + "token=" + token + "\n" + "}";
    }

}
