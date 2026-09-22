package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAccountRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 账号名称。由小写字母、数字、下划线组成、字母开头,字母或数字结尾,最长16个字符。
    */
    private String userName;

    /**
    * 账号密码。详情请参考[密码加密传输规范定义](SCS/API参考/通用说明.md#密码加密传输规范定义)
    */
    private String clientAuth;

    /**
    * 备注
    */
    private String extra;

    /**
    * 账号权限。1：读写；2：只读；
    */
    private Integer userType;

    public String getInstanceId() {
        return instanceId;
    }

    public CreateAccountRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public CreateAccountRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getClientAuth() {
        return clientAuth;
    }

    public CreateAccountRequest setClientAuth(String clientAuth) {
        this.clientAuth = clientAuth;
        return this;
    }

    public String getExtra() {
        return extra;
    }

    public CreateAccountRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }

    public Integer getUserType() {
        return userType;
    }

    public CreateAccountRequest setUserType(Integer userType) {
        this.userType = userType;
        return this;
    }

}
