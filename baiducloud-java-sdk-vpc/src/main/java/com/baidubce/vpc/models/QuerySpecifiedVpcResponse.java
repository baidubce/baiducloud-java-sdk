package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuerySpecifiedVpcResponse extends BaseBceResponse {
    /**
     * vpc
     */
    private ShowVpcModel vpc;

    public QuerySpecifiedVpcResponse setVpc(ShowVpcModel vpc) {
        this.vpc = vpc;
        return this;
    }

    public ShowVpcModel getVpc() {
        return this.vpc;
    }

    @Override
    public String toString() {
        return "QuerySpecifiedVpcResponse{" + "vpc=" + vpc + "\n" + "}";
    }

}