package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryMemoryScalingConfigResponse extends BaseBceResponse {

    /**
    * memSpec
    */
    private MemSpec memSpec;

    public MemSpec getMemSpec() {
        return memSpec;
    }

    public QueryMemoryScalingConfigResponse setMemSpec(MemSpec memSpec) {
        this.memSpec = memSpec;
        return this;
    }

    @Override
    public String toString() {
        return "QueryMemoryScalingConfigResponse{" + "memSpec=" + memSpec + "\n" + "}";
    }

}
