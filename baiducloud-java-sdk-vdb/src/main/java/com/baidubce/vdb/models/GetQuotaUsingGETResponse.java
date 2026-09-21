package com.baidubce.vdb.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetQuotaUsingGETResponse extends BaseBceResponse {

    /**
    * quota
    */
    private Long quota;

    public Long getQuota() {
        return quota;
    }

    public GetQuotaUsingGETResponse setQuota(Long quota) {
        this.quota = quota;
        return this;
    }

    @Override
    public String toString() {
        return "GetQuotaUsingGETResponse{" + "quota=" + quota + "\n" + "}";
    }

}
