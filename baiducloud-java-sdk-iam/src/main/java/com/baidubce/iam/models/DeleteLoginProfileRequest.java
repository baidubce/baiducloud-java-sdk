package com.baidubce.iam.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteLoginProfileRequest extends BaseBceRequest {

    /**
    * userName
    */
    @JsonIgnore
    private String userName;

    public String getUserName() {
        return userName;
    }

    public DeleteLoginProfileRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }

}
