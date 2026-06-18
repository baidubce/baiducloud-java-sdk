package com.baidubce.iam.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetSessionApiKeyRequest extends BaseBceRequest {

    /**
    * expireInSeconds
    */
    @JsonIgnore
    private Integer expireInSeconds;

    /**
    * acl
    */
    @JsonIgnore
    private String acl;

    public Integer getExpireInSeconds() {
        return expireInSeconds;
    }

    public GetSessionApiKeyRequest setExpireInSeconds(Integer expireInSeconds) {
        this.expireInSeconds = expireInSeconds;
        return this;
    }

    public String getAcl() {
        return acl;
    }

    public GetSessionApiKeyRequest setAcl(String acl) {
        this.acl = acl;
        return this;
    }

}
