package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateServiceAuthRequest extends BaseBceRequest {

    /**
    * service
    */
    @JsonIgnore
    private String service;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 用户授权列表
    */
    private List<Auth> authList;

    public String getService() {
        return service;
    }

    public UpdateServiceAuthRequest setService(String service) {
        this.service = service;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateServiceAuthRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public List<Auth> getAuthList() {
        return authList;
    }

    public UpdateServiceAuthRequest setAuthList(List<Auth> authList) {
        this.authList = authList;
        return this;
    }

}
