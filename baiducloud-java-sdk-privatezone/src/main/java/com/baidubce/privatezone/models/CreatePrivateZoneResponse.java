package com.baidubce.privatezone.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreatePrivateZoneResponse extends BaseBceResponse {

    /**
    * Zone的ID
    */
    private String zoneId;

    public String getZoneId() {
        return zoneId;
    }

    public CreatePrivateZoneResponse setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }

    @Override
    public String toString() {
        return "CreatePrivateZoneResponse{" + "zoneId=" + zoneId + "\n" + "}";
    }

}
