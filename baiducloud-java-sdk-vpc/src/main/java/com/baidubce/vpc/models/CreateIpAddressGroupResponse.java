package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateIpAddressGroupResponse extends BaseBceResponse {

    /**
    * IP地址组的ID
    */
    private String ipSetId;

    public String getIpSetId() {
        return ipSetId;
    }

    public CreateIpAddressGroupResponse setIpSetId(String ipSetId) {
        this.ipSetId = ipSetId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateIpAddressGroupResponse{" + "ipSetId=" + ipSetId + "\n" + "}";
    }

}
