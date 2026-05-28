package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateBlbServerRequest extends BaseBceRequest {

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
    * 待更新的后端服务器列表
    */
    private List<BackendServerModel> backendServerList;

    public String getBlbId() {
        return blbId;
    }

    public UpdateBlbServerRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateBlbServerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public List<BackendServerModel> getBackendServerList() {
        return backendServerList;
    }

    public UpdateBlbServerRequest setBackendServerList(List<BackendServerModel> backendServerList) {
        this.backendServerList = backendServerList;
        return this;
    }

}
