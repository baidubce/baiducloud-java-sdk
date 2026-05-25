package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateHighlyAvailableVirtualIpRequest extends BaseBceRequest {

    /**
    * haVipId
    */
    @JsonIgnore
    private String haVipId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 高可用虚拟IP的名称
    */
    private String name;

    /**
    * 高可用虚拟IP的描述
    */
    private String description;

    public String getHaVipId() {
        return haVipId;
    }

    public UpdateHighlyAvailableVirtualIpRequest setHaVipId(String haVipId) {
        this.haVipId = haVipId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateHighlyAvailableVirtualIpRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateHighlyAvailableVirtualIpRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateHighlyAvailableVirtualIpRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
