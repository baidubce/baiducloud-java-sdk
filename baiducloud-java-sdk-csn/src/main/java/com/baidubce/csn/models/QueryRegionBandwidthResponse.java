package com.baidubce.csn.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryRegionBandwidthResponse extends BaseBceResponse {

    /**
    * 地域带宽列表
    */
    private List<CsnBpLimit> bpLimits;

    public List<CsnBpLimit> getBpLimits() {
        return bpLimits;
    }

    public QueryRegionBandwidthResponse setBpLimits(List<CsnBpLimit> bpLimits) {
        this.bpLimits = bpLimits;
        return this;
    }

    @Override
    public String toString() {
        return "QueryRegionBandwidthResponse{" + "bpLimits=" + bpLimits + "\n" + "}";
    }

}
