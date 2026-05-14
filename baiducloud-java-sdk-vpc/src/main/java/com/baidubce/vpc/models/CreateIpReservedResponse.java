package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateIpReservedResponse extends BaseBceResponse {

    /**
    * 预留网段的ID
    */
    private String ipReserveId;

    public String getIpReserveId() {
        return ipReserveId;
    }

    public CreateIpReservedResponse setIpReserveId(String ipReserveId) {
        this.ipReserveId = ipReserveId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateIpReservedResponse{" + "ipReserveId=" + ipReserveId + "\n" + "}";
    }

}
