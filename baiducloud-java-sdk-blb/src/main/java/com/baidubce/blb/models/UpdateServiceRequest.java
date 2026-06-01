package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateServiceRequest extends BaseBceRequest {

    /**
    * service
    */
    @JsonIgnore
    private String service;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 服务发布点名称,大小写字母、数字以及-_/.特殊字符，必须以字母开头，长度1-65
    */
    private String name;

    /**
    * 服务发布点描述，不超过200字符
    */
    private String description;

    public String getService() {
        return service;
    }

    public UpdateServiceRequest setService(String service) {
        this.service = service;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateServiceRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateServiceRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
