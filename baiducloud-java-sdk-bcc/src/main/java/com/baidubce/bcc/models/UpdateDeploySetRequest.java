package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateDeploySetRequest extends BaseBceRequest {

    /**
    * deployId
    */
    @JsonIgnore
    private String deployId;

    /**
    * 部署集名字（name与desc至少传一个）
    */
    private String name;

    /**
    * 部署集描述（name与desc至少传一个），只能包含中文、字母、数字、点号“.”、空格、下划线“_”、中划线“-”、等号“=”、英文逗号“,”、中文逗号“，”、冒号“：”、斜杠 “/” 和中文句号“。”
    */
    private String desc;

    public String getDeployId() {
        return deployId;
    }

    public UpdateDeploySetRequest setDeployId(String deployId) {
        this.deployId = deployId;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateDeploySetRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public UpdateDeploySetRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }

}
