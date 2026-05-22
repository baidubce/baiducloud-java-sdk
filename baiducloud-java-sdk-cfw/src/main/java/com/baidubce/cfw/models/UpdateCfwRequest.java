package com.baidubce.cfw.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateCfwRequest extends BaseBceRequest {

    /**
    * cfwId
    */
    @JsonIgnore
    private String cfwId;

    /**
    * CFW名称，长度不超过65个字符，可由数字、字符、下划线组成
    */
    private String name;

    /**
    * CFW描述，不超过200字符
    */
    private String description;

    public String getCfwId() {
        return cfwId;
    }

    public UpdateCfwRequest setCfwId(String cfwId) {
        this.cfwId = cfwId;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateCfwRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateCfwRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
