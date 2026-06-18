package com.baidubce.iam.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteAccessKeyRequest extends BaseBceRequest {

    /**
    * userName
    */
    @JsonIgnore
    private String userName;

    /**
    * accessKeyId
    */
    @JsonIgnore
    private String accessKeyId;

    public String getUserName() {
        return userName;
    }

    public DeleteAccessKeyRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public DeleteAccessKeyRequest setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }

}
