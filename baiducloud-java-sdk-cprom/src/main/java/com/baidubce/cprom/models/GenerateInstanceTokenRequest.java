package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenerateInstanceTokenRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * action
    */
    @JsonIgnore
    private String action;

    /**
    * 当 `Action=DeleteToken` 时必填。表示待删除的 Token，格式为 `Bearer <jwt>`；创建 Token 时无需传入。
    */
    private String token;

    public String getInstanceId() {
        return instanceId;
    }

    public GenerateInstanceTokenRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getAction() {
        return action;
    }

    public GenerateInstanceTokenRequest setAction(String action) {
        this.action = action;
        return this;
    }

    public String getToken() {
        return token;
    }

    public GenerateInstanceTokenRequest setToken(String token) {
        this.token = token;
        return this;
    }

}
