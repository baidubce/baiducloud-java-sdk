package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateIpSetResponse extends BaseBceResponse {

    /**
    * IP地址族的ID
    */
    private String ipGroupId;

    public String getIpGroupId() {
        return ipGroupId;
    }

    public CreateIpSetResponse setIpGroupId(String ipGroupId) {
        this.ipGroupId = ipGroupId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateIpSetResponse{" + "ipGroupId=" + ipGroupId + "\n" + "}";
    }

}
