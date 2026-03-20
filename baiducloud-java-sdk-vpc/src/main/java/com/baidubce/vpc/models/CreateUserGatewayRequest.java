package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateUserGatewayRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 用户网关名称，以字母开头，支持大小写字母、数字以及 -_/. 特殊字符，不能超过65个字符
    */
    private String name;

    /**
    * 用户网关IP
    */
    private String ip;

    /**
    * 用户网关描述，不能超过200个字符
    */
    private String description;

    public String getClientToken() {
        return clientToken;
    }

    public CreateUserGatewayRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateUserGatewayRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getIp() {
        return ip;
    }

    public CreateUserGatewayRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateUserGatewayRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
