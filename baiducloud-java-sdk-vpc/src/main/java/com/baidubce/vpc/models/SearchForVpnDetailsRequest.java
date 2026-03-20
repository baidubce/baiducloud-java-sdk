package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchForVpnDetailsRequest {

    /**
    * vpnId
    */
    @JsonIgnore
    private String vpnId;

    public String getVpnId() {
        return vpnId;
    }

    public SearchForVpnDetailsRequest setVpnId(String vpnId) {
        this.vpnId = vpnId;
        return this;
    }

}
