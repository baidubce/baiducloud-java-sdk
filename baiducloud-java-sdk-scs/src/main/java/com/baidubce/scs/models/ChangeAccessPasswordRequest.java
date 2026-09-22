package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChangeAccessPasswordRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 密码长度8～16位，至少包含字母、数字和特殊字符中两种。允许的特殊字符包括 $^\*\(\)\_\+\-=,密码需要加密传输，禁止明文传输，详情请参考[密码加密传输规范定义](SCS/API参考/通用说明.md#密码加密传输规范定义)
    */
    private String password;

    public String getInstanceId() {
        return instanceId;
    }

    public ChangeAccessPasswordRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public ChangeAccessPasswordRequest setPassword(String password) {
        this.password = password;
        return this;
    }

}
