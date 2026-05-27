package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateIpGroupRequest extends BaseBceRequest {

    /**
    * ipSetId
    */
    @JsonIgnore
    private String ipSetId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * IP地址组的名称
    */
    private String name;

    /**
    * IP地址组的描述
    */
    private String description;

    public String getIpSetId() {
        return ipSetId;
    }

    public UpdateIpGroupRequest setIpSetId(String ipSetId) {
        this.ipSetId = ipSetId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateIpGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateIpGroupRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateIpGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
