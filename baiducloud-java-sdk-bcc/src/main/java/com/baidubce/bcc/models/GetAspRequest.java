package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetAspRequest extends BaseBceRequest {

    /**
    * aspId
    */
    @JsonIgnore
    private String aspId;

    public String getAspId() {
        return aspId;
    }

    public GetAspRequest setAspId(String aspId) {
        this.aspId = aspId;
        return this;
    }

}
