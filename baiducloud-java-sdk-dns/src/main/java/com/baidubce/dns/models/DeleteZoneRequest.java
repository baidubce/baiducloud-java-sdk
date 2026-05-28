package com.baidubce.dns.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteZoneRequest extends BaseBceRequest {

    /**
    * zoneName
    */
    @JsonIgnore
    private String zoneName;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    public String getZoneName() {
        return zoneName;
    }

    public DeleteZoneRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteZoneRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
