package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateIpSetRequest extends BaseBceRequest {

    /**
    * ipGroupId
    */
    @JsonIgnore
    private String ipGroupId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * IP地址族的名称
    */
    private String name;

    /**
    * IP地址族的描述
    */
    private String description;

    public String getIpGroupId() {
        return ipGroupId;
    }

    public UpdateIpSetRequest setIpGroupId(String ipGroupId) {
        this.ipGroupId = ipGroupId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateIpSetRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateIpSetRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateIpSetRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
