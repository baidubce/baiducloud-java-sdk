package com.baidubce.privatezone.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchForDetailsOfPrivatzoneRequest {

    /**
    * zoneId
    */
    @JsonIgnore
    private String zoneId;

    public String getZoneId() {
        return zoneId;
    }

    public SearchForDetailsOfPrivatzoneRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }

}
