package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BulkDeleteLogShipperRequest extends BaseBceRequest {

    /**
    * 批量任务ID
    */
    private List<String> logShipperIDs;

    public List<String> getLogShipperIDs() {
        return logShipperIDs;
    }

    public BulkDeleteLogShipperRequest setLogShipperIDs(List<String> logShipperIDs) {
        this.logShipperIDs = logShipperIDs;
        return this;
    }

}
