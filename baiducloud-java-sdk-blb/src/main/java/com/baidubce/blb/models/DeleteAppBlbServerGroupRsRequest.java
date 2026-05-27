package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteAppBlbServerGroupRsRequest extends BaseBceRequest {

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
    * 要删除的RS所属服务器组id
    */
    private String sgId;

    /**
    * 所有待释放的后端服务器标识符，一起组成一个数组
    */
    private List<String> backendServerIdList;

    public String getBlbId() {
        return blbId;
    }

    public DeleteAppBlbServerGroupRsRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteAppBlbServerGroupRsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getSgId() {
        return sgId;
    }

    public DeleteAppBlbServerGroupRsRequest setSgId(String sgId) {
        this.sgId = sgId;
        return this;
    }

    public List<String> getBackendServerIdList() {
        return backendServerIdList;
    }

    public DeleteAppBlbServerGroupRsRequest setBackendServerIdList(List<String> backendServerIdList) {
        this.backendServerIdList = backendServerIdList;
        return this;
    }

}
