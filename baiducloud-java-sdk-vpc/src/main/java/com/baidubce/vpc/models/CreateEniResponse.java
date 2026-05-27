package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateEniResponse extends BaseBceResponse {

    /**
    * 弹性网卡的ID
    */
    private String eniId;

    public String getEniId() {
        return eniId;
    }

    public CreateEniResponse setEniId(String eniId) {
        this.eniId = eniId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateEniResponse{" + "eniId=" + eniId + "\n" + "}";
    }

}
