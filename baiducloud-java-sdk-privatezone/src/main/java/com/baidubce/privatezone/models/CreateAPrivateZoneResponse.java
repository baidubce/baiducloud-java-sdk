package com.baidubce.privatezone.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAPrivateZoneResponse extends BaseBceResponse {
    /**
     * Zone的ID
     */
    private String zoneId;

    public CreateAPrivateZoneResponse setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    @Override
    public String toString() {
        return "CreateAPrivateZoneResponse{" + "zoneId=" + zoneId + "\n" + "}";
    }

}