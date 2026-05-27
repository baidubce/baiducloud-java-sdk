package com.baidubce.csn.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateCsnRequest extends BaseBceRequest {

    /**
    * csnId
    */
    @JsonIgnore
    private String csnId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 云智能网名称
    */
    private String name;

    /**
    * 云智能网的描述
    */
    private String description;

    public String getCsnId() {
        return csnId;
    }

    public UpdateCsnRequest setCsnId(String csnId) {
        this.csnId = csnId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateCsnRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateCsnRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateCsnRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
