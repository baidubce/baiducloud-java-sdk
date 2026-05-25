package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAHighlyAvailableVirtualIpResponse extends BaseBceResponse {

    /**
    * 高可用虚拟IP的ID
    */
    private String haVipId;

    public String getHaVipId() {
        return haVipId;
    }

    public CreateAHighlyAvailableVirtualIpResponse setHaVipId(String haVipId) {
        this.haVipId = haVipId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateAHighlyAvailableVirtualIpResponse{" + "haVipId=" + haVipId + "\n" + "}";
    }

}
