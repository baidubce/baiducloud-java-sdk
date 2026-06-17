package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BulkSetLogShipperStatusRequest extends BaseBceRequest {

    /**
    * 期望的状态，可选Running或Paused
    */
    private String desiredStatus;

    /**
    * 批量任务ID
    */
    private List<String> logShipperIDs;

    public String getDesiredStatus() {
        return desiredStatus;
    }

    public BulkSetLogShipperStatusRequest setDesiredStatus(String desiredStatus) {
        this.desiredStatus = desiredStatus;
        return this;
    }

    public List<String> getLogShipperIDs() {
        return logShipperIDs;
    }

    public BulkSetLogShipperStatusRequest setLogShipperIDs(List<String> logShipperIDs) {
        this.logShipperIDs = logShipperIDs;
        return this;
    }

}
