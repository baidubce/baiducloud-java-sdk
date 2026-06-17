package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetLogShipperRequest extends BaseBceRequest {

    /**
    * logShipperID
    */
    @JsonIgnore
    private String logShipperID;

    public String getLogShipperID() {
        return logShipperID;
    }

    public GetLogShipperRequest setLogShipperID(String logShipperID) {
        this.logShipperID = logShipperID;
        return this;
    }

}
