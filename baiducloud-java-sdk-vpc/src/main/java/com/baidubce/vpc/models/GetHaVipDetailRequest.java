package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetHaVipDetailRequest extends BaseBceRequest {

    /**
    * haVipId
    */
    @JsonIgnore
    private String haVipId;

    public String getHaVipId() {
        return haVipId;
    }

    public GetHaVipDetailRequest setHaVipId(String haVipId) {
        this.haVipId = haVipId;
        return this;
    }

}
