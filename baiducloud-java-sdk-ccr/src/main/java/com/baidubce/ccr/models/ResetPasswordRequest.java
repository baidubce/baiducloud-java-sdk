package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResetPasswordRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 新密码，密码格式要求：8-20位字符，至少一个大写一个小写一个数字，符号仅限!@#$%^*()
    */
    private String password;

    public String getInstanceId() {
        return instanceId;
    }

    public ResetPasswordRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public ResetPasswordRequest setPassword(String password) {
        this.password = password;
        return this;
    }

}
