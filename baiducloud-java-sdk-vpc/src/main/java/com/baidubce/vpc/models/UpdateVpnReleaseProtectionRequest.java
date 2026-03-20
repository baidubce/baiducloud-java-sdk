package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateVpnReleaseProtectionRequest extends BaseBceRequest {

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
    * 是否开启释放保护
    */
    private Boolean deleteProtect;

    public String getVpnId() {
        return vpnId;
    }

    public UpdateVpnReleaseProtectionRequest setVpnId(String vpnId) {
        this.vpnId = vpnId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateVpnReleaseProtectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Boolean getDeleteProtect() {
        return deleteProtect;
    }

    public UpdateVpnReleaseProtectionRequest setDeleteProtect(Boolean deleteProtect) {
        this.deleteProtect = deleteProtect;
        return this;
    }

}
