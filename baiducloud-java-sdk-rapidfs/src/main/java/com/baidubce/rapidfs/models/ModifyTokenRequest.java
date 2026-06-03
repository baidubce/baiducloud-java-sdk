package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyTokenRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 所属 RapidFS 实例唯一 Id
    */
    private String instanceId;

    /**
    * Token id
    */
    private String tokenId;

    /**
    * Token更新周期，单位分钟，取值范围 [0, 43200(min)]；0 表示永不更新，Token 永久有效
    */
    private Integer tokenRefreshIntervalMinutes;

    public String getClientToken() {
        return clientToken;
    }

    public ModifyTokenRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public ModifyTokenRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getTokenId() {
        return tokenId;
    }

    public ModifyTokenRequest setTokenId(String tokenId) {
        this.tokenId = tokenId;
        return this;
    }

    public Integer getTokenRefreshIntervalMinutes() {
        return tokenRefreshIntervalMinutes;
    }

    public ModifyTokenRequest setTokenRefreshIntervalMinutes(Integer tokenRefreshIntervalMinutes) {
        this.tokenRefreshIntervalMinutes = tokenRefreshIntervalMinutes;
        return this;
    }

}
