package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SetSingleLogShipperStatusRequest extends BaseBceRequest {

    /**
    * logShipperID
    */
    @JsonIgnore
    private String logShipperID;

    /**
    * 期望的状态，可选Running或Paused
    */
    private String status;

    public String getLogShipperID() {
        return logShipperID;
    }

    public SetSingleLogShipperStatusRequest setLogShipperID(String logShipperID) {
        this.logShipperID = logShipperID;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public SetSingleLogShipperStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }

}
