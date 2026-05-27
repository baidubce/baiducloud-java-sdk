package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateAppBlbServerGroupRsRequest extends BaseBceRequest {

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
    * RS所属服务器组id
    */
    private String sgId;

    /**
    * 后端服务器列表
    */
    private List<AppBackendServer> backendServerList;

    public String getBlbId() {
        return blbId;
    }

    public UpdateAppBlbServerGroupRsRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateAppBlbServerGroupRsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getSgId() {
        return sgId;
    }

    public UpdateAppBlbServerGroupRsRequest setSgId(String sgId) {
        this.sgId = sgId;
        return this;
    }

    public List<AppBackendServer> getBackendServerList() {
        return backendServerList;
    }

    public UpdateAppBlbServerGroupRsRequest setBackendServerList(List<AppBackendServer> backendServerList) {
        this.backendServerList = backendServerList;
        return this;
    }

}
