package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteAppBlbIpGroupRequest extends BaseBceRequest {

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
    * 要删除的IP组id
    */
    private String ipGroupId;

    public String getBlbId() {
        return blbId;
    }

    public DeleteAppBlbIpGroupRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteAppBlbIpGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getIpGroupId() {
        return ipGroupId;
    }

    public DeleteAppBlbIpGroupRequest setIpGroupId(String ipGroupId) {
        this.ipGroupId = ipGroupId;
        return this;
    }

}
