package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddBlbServerRequest extends BaseBceRequest {

    /**
    * blbId
    */
    @JsonIgnore
    private String blbId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 待添加的后端服务器列表
    */
    private List<BackendServerModel> backendServerList;

    public String getBlbId() {
        return blbId;
    }

    public AddBlbServerRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public AddBlbServerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public List<BackendServerModel> getBackendServerList() {
        return backendServerList;
    }

    public AddBlbServerRequest setBackendServerList(List<BackendServerModel> backendServerList) {
        this.backendServerList = backendServerList;
        return this;
    }

}
