package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.baidubce.annotation.Host;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetResourceApikeyRequest extends BaseBceRequest {

    /**
    * xBceWorkloadAccessToken
    */
    @Host
    @JsonIgnore
    private String xBceWorkloadAccessToken;

    /**
    * 凭证提供方名称
    */
    private String name;

    /**
    * WAT 令牌，也可通过 Header 传递
    */
    private String workloadAccessToken;

    public String getXBceWorkloadAccessToken() {
        return xBceWorkloadAccessToken;
    }

    public GetResourceApikeyRequest setXBceWorkloadAccessToken(String xBceWorkloadAccessToken) {
        this.xBceWorkloadAccessToken = xBceWorkloadAccessToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public GetResourceApikeyRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getWorkloadAccessToken() {
        return workloadAccessToken;
    }

    public GetResourceApikeyRequest setWorkloadAccessToken(String workloadAccessToken) {
        this.workloadAccessToken = workloadAccessToken;
        return this;
    }

}
