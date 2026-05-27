package com.baidubce.privatezone.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPrivateZoneRequest extends BaseBceRequest {

    /**
    * zoneId
    */
    @JsonIgnore
    private String zoneId;

    public String getZoneId() {
        return zoneId;
    }

    public GetPrivateZoneRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }

}
