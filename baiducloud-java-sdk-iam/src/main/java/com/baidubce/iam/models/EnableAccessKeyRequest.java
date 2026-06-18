package com.baidubce.iam.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnableAccessKeyRequest extends BaseBceRequest {

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

    public EnableAccessKeyRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public EnableAccessKeyRequest setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }

}
