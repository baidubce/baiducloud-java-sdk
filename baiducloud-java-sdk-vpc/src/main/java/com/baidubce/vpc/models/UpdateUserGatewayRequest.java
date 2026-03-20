package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateUserGatewayRequest extends BaseBceRequest {

    /**
    * cgwId
    */
    @JsonIgnore
    private String cgwId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 用户网关名称
    */
    private String name;

    /**
    * 用户网关描述，名称与描述不能同时为空
    */
    private String description;

    public String getCgwId() {
        return cgwId;
    }

    public UpdateUserGatewayRequest setCgwId(String cgwId) {
        this.cgwId = cgwId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateUserGatewayRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateUserGatewayRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateUserGatewayRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
