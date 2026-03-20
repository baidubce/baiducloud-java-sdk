package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateVpnRequest extends BaseBceRequest {

    /**
    * vpnId
    */
    @JsonIgnore
    private String vpnId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * VPN名称,不能取值"default",长度不超过65个字符，可由数字，字符，下划线组成
    */
    private String vpnName;

    /**
    * VPN描述，不超过200字符
    */
    private String description;

    public String getVpnId() {
        return vpnId;
    }

    public UpdateVpnRequest setVpnId(String vpnId) {
        this.vpnId = vpnId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateVpnRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getVpnName() {
        return vpnName;
    }

    public UpdateVpnRequest setVpnName(String vpnName) {
        this.vpnName = vpnName;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateVpnRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
