package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteSingleLogShipperRequest extends BaseBceRequest {

    /**
    * logShipperID
    */
    @JsonIgnore
    private String logShipperID;

    public String getLogShipperID() {
        return logShipperID;
    }

    public DeleteSingleLogShipperRequest setLogShipperID(String logShipperID) {
        this.logShipperID = logShipperID;
        return this;
    }

}
