package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetUserDetailResponse extends BaseBceResponse {

    /**
    * 用户名
    */
    private String name;

    public String getName() {
        return name;
    }

    public GetUserDetailResponse setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "GetUserDetailResponse{" + "name=" + name + "\n" + "}";
    }

}
