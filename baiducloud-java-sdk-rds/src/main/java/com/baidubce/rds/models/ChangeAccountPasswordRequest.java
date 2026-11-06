package com.baidubce.rds.models;

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
    * accountName
    */
    @JsonIgnore
    private String accountName;

    /**
    * 账号的密码，由字母、数字或下划线组成，长度6～32位 密码需要加密传输，禁止明文传输，详情请参考密码加密传输规范定义
    */
    private String password;

    public String getInstanceId() {
        return instanceId;
    }

    public ChangeAccountPasswordRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getAccountName() {
        return accountName;
    }

    public ChangeAccountPasswordRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public ChangeAccountPasswordRequest setPassword(String password) {
        this.password = password;
        return this;
    }

}
