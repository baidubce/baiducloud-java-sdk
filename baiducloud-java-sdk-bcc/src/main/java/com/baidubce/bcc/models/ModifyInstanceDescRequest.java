package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyInstanceDescRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 实例描述信息，只支持中文、字母、数字、点号“.”、空格、下划线“_”、中划线“-”、等号“=”、英文逗号“,”、中文逗号“，”、冒号“：”、斜杠 “/” 和中文句号“。”
    */
    private String desc;

    public String getInstanceId() {
        return instanceId;
    }

    public ModifyInstanceDescRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public ModifyInstanceDescRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }

}
