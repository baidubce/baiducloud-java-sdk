package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteAppBlbIpGroupProtocolRequest extends BaseBceRequest {

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
    * 所属IP组的标识符
    */
    private String ipGroupId;

    /**
    * 要删除的IP组协议id数组
    */
    private List<String> backendPolicyIdList;

    public String getBlbId() {
        return blbId;
    }

    public DeleteAppBlbIpGroupProtocolRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteAppBlbIpGroupProtocolRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getIpGroupId() {
        return ipGroupId;
    }

    public DeleteAppBlbIpGroupProtocolRequest setIpGroupId(String ipGroupId) {
        this.ipGroupId = ipGroupId;
        return this;
    }

    public List<String> getBackendPolicyIdList() {
        return backendPolicyIdList;
    }

    public DeleteAppBlbIpGroupProtocolRequest setBackendPolicyIdList(List<String> backendPolicyIdList) {
        this.backendPolicyIdList = backendPolicyIdList;
        return this;
    }

}
