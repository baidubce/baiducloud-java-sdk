package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetInstanceVncResponse extends BaseBceResponse {

    /**
    * VNC 地址URL
    */
    private String vncUrl;

    public String getVncUrl() {
        return vncUrl;
    }

    public GetInstanceVncResponse setVncUrl(String vncUrl) {
        this.vncUrl = vncUrl;
        return this;
    }

    @Override
    public String toString() {
        return "GetInstanceVncResponse{" + "vncUrl=" + vncUrl + "\n" + "}";
    }

}
