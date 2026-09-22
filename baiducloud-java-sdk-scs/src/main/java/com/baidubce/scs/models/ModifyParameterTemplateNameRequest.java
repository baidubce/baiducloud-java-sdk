package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyParameterTemplateNameRequest extends BaseBceRequest {

    /**
    * templateShowId
    */
    @JsonIgnore
    private String templateShowId;

    /**
    * 新的实例名称。要求：<br> 大小写字母、数字、中文以及-_/.特殊字符，必须以字母或者中文开头，长度1-65<br>
    */
    private String name;

    public String getTemplateShowId() {
        return templateShowId;
    }

    public ModifyParameterTemplateNameRequest setTemplateShowId(String templateShowId) {
        this.templateShowId = templateShowId;
        return this;
    }

    public String getName() {
        return name;
    }

    public ModifyParameterTemplateNameRequest setName(String name) {
        this.name = name;
        return this;
    }

}
