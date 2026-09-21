package com.baidubce.vdb.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetFreeInstanceQuotaResponse extends BaseBceResponse {

    /**
    * freeQuota
    */
    private Integer freeQuota;

    public Integer getFreeQuota() {
        return freeQuota;
    }

    public GetFreeInstanceQuotaResponse setFreeQuota(Integer freeQuota) {
        this.freeQuota = freeQuota;
        return this;
    }

    @Override
    public String toString() {
        return "GetFreeInstanceQuotaResponse{" + "freeQuota=" + freeQuota + "\n" + "}";
    }

}
