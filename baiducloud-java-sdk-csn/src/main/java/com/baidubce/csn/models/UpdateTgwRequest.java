package com.baidubce.csn.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateTgwRequest extends BaseBceRequest {

    /**
    * csnId
    */
    @JsonIgnore
    private String csnId;

    /**
    * tgwId
    */
    @JsonIgnore
    private String tgwId;

    /**
    * TGW的名称
    */
    private String name;

    /**
    * TGW的描述信息
    */
    private String description;

    public String getCsnId() {
        return csnId;
    }

    public UpdateTgwRequest setCsnId(String csnId) {
        this.csnId = csnId;
        return this;
    }

    public String getTgwId() {
        return tgwId;
    }

    public UpdateTgwRequest setTgwId(String tgwId) {
        this.tgwId = tgwId;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateTgwRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateTgwRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
