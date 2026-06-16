package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAspResponse extends BaseBceResponse {

    /**
    * 自动快照策略ID
    */
    private String aspId;

    public String getAspId() {
        return aspId;
    }

    public CreateAspResponse setAspId(String aspId) {
        this.aspId = aspId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateAspResponse{" + "aspId=" + aspId + "\n" + "}";
    }

}
