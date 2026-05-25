package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateElasticNetworkCardResponse extends BaseBceResponse {

    /**
    * 弹性网卡的ID
    */
    private String eniId;

    public String getEniId() {
        return eniId;
    }

    public CreateElasticNetworkCardResponse setEniId(String eniId) {
        this.eniId = eniId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateElasticNetworkCardResponse{" + "eniId=" + eniId + "\n" + "}";
    }

}
