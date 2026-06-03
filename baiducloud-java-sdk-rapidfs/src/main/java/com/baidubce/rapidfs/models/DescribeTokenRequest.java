package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeTokenRequest extends BaseBceRequest {

    /**
    * RapidFS 实例 ID
    */
    private String instanceId;

    /**
    * Token id，不传返回集群默认 Token
    */
    private String tokenId;

    public String getInstanceId() {
        return instanceId;
    }

    public DescribeTokenRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getTokenId() {
        return tokenId;
    }

    public DescribeTokenRequest setTokenId(String tokenId) {
        this.tokenId = tokenId;
        return this;
    }

}
