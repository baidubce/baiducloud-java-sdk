package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteServiceAuthRequest extends BaseBceRequest {

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
    * action
    */
    @JsonIgnore
    private String action;

    /**
    * 用户id列表，所有人使用"*"
    */
    private List<String> uidList;

    public String getService() {
        return service;
    }

    public DeleteServiceAuthRequest setService(String service) {
        this.service = service;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteServiceAuthRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getAction() {
        return action;
    }

    public DeleteServiceAuthRequest setAction(String action) {
        this.action = action;
        return this;
    }

    public List<String> getUidList() {
        return uidList;
    }

    public DeleteServiceAuthRequest setUidList(List<String> uidList) {
        this.uidList = uidList;
        return this;
    }

}
