package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetUserDetailRequest extends BaseBceRequest {

    /**
    * userId
    */
    @JsonIgnore
    private String userId;

    public String getUserId() {
        return userId;
    }

    public GetUserDetailRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }

}
