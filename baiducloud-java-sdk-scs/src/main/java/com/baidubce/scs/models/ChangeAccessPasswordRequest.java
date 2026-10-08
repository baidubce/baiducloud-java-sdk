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
    * 密码长度8～16位，至少包含字母、数字和特殊字符中两种。允许的特殊字符包括
    * $^\*\(\)\_\+\-=,密码需要加密传输，禁止明文传输，
    * 详情请参考[密码加密传输规范定义](https://cloud.baidu.com/doc/SCS/s/fjwvxtrd9#%E5%AF%86%E7%A0%81%E5%8A%A0%E5%AF%86%E4%BC%A0%E8%BE%93%E8%A7%84%E8%8C%83%E5%AE%9A%E4%B9%89)
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
