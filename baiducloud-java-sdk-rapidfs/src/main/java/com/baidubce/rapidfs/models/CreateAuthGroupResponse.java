package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAuthGroupResponse extends BaseBceResponse {

    /**
    * 权限组唯一id
    */
    private String authGroupId;

    public String getAuthGroupId() {
        return authGroupId;
    }

    public CreateAuthGroupResponse setAuthGroupId(String authGroupId) {
        this.authGroupId = authGroupId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateAuthGroupResponse{" + "authGroupId=" + authGroupId + "\n" + "}";
    }

}
