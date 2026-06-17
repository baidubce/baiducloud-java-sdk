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
    private String desiredStatus;

    public String getLogShipperID() {
        return logShipperID;
    }

    public SetSingleLogShipperStatusRequest setLogShipperID(String logShipperID) {
        this.logShipperID = logShipperID;
        return this;
    }

    public String getDesiredStatus() {
        return desiredStatus;
    }

    public SetSingleLogShipperStatusRequest setDesiredStatus(String desiredStatus) {
        this.desiredStatus = desiredStatus;
        return this;
    }

}
