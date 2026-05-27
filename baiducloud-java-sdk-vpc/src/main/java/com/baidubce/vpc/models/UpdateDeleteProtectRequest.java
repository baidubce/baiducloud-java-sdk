package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateDeleteProtectRequest extends BaseBceRequest {

    /**
    * gatewayId
    */
    @JsonIgnore
    private String gatewayId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 是否开启释放保护
    */
    private Integer deleteProtect;

    public String getGatewayId() {
        return gatewayId;
    }

    public UpdateDeleteProtectRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateDeleteProtectRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Integer getDeleteProtect() {
        return deleteProtect;
    }

    public UpdateDeleteProtectRequest setDeleteProtect(Integer deleteProtect) {
        this.deleteProtect = deleteProtect;
        return this;
    }

}
