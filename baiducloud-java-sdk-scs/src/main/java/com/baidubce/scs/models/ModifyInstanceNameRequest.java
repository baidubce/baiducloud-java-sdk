package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyInstanceNameRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 新的实例名称。要求：<br>1. 支持大小写字母、数字以及\-\_ /\.等特殊字符，必须以字母开头；<br>2. 长度限制为1\-64；<br>3. 和自己其他实例的名称不重复
    */
    private String instanceName;

    public String getInstanceId() {
        return instanceId;
    }

    public ModifyInstanceNameRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public ModifyInstanceNameRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

}
