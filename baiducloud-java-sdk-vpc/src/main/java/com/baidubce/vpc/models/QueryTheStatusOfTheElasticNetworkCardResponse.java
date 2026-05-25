package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryTheStatusOfTheElasticNetworkCardResponse extends BaseBceResponse {

    /**
    * 弹性网卡的状态
    */
    private String status;

    public String getStatus() {
        return status;
    }

    public QueryTheStatusOfTheElasticNetworkCardResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        return "QueryTheStatusOfTheElasticNetworkCardResponse{" + "status=" + status + "\n" + "}";
    }

}
