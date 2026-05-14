package com.baidubce.snic.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateSnicRequest extends BaseBceRequest {

    /**
    * endpointId
    */
    @JsonIgnore
    private String endpointId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 服务网卡名称,长度不超过65个字符，可由数字，字符，下划线、中文组成
    */
    private String name;

    /**
    * 服务网卡描述，不超过200字符
    */
    private String description;

    public String getEndpointId() {
        return endpointId;
    }

    public UpdateSnicRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateSnicRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateSnicRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateSnicRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
