package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChangeAccountPasswordRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 要设置的账号名称。
    */
    private String userName;

    /**
    * 账号密码。详情请参考[密码加密传输规范定义](SCS/API参考/通用说明.md#密码加密传输规范定义)
    */
    private String clientAuth;

    public String getInstanceId() {
        return instanceId;
    }

    public ChangeAccountPasswordRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public ChangeAccountPasswordRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getClientAuth() {
        return clientAuth;
    }

    public ChangeAccountPasswordRequest setClientAuth(String clientAuth) {
        this.clientAuth = clientAuth;
        return this;
    }

}
