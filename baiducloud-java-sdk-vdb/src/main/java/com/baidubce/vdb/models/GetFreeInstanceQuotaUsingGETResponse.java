package com.baidubce.vdb.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetFreeInstanceQuotaUsingGETResponse extends BaseBceResponse {

    /**
    * freeQuota
    */
    private Integer freeQuota;

    public Integer getFreeQuota() {
        return freeQuota;
    }

    public GetFreeInstanceQuotaUsingGETResponse setFreeQuota(Integer freeQuota) {
        this.freeQuota = freeQuota;
        return this;
    }

    @Override
    public String toString() {
        return "GetFreeInstanceQuotaUsingGETResponse{" + "freeQuota=" + freeQuota + "\n" + "}";
    }

}
