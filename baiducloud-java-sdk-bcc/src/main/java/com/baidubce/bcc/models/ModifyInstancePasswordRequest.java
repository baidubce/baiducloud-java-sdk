package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyInstancePasswordRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 待指定的实例管理员密码，8-32位字符，大写字母、小写字母、数字、特殊符号至少存在三种，符号仅限()`~!@#$%^&*-_+=\|{}[]:;'<>,.?/，密码需要加密传输
    */
    private String adminPass;

    public String getInstanceId() {
        return instanceId;
    }

    public ModifyInstancePasswordRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getAdminPass() {
        return adminPass;
    }

    public ModifyInstancePasswordRequest setAdminPass(String adminPass) {
        this.adminPass = adminPass;
        return this;
    }

}
