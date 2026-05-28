package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteBlbServerRequest extends BaseBceRequest {

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
    * 所有待释放的后端服务器标识符，一起组成一个数组
    */
    private List<String> backendServerList;

    public String getBlbId() {
        return blbId;
    }

    public DeleteBlbServerRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteBlbServerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public List<String> getBackendServerList() {
        return backendServerList;
    }

    public DeleteBlbServerRequest setBackendServerList(List<String> backendServerList) {
        this.backendServerList = backendServerList;
        return this;
    }

}
