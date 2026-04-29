package com.baidubce.privatezone.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeletePrivateZoneRequest {

    /**
    * zoneId
    */
    @JsonIgnore
    private String zoneId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    public String getZoneId() {
        return zoneId;
    }

    public DeletePrivateZoneRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeletePrivateZoneRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
