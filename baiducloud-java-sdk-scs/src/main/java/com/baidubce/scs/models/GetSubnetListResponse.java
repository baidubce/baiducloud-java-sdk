package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetSubnetListResponse extends BaseBceResponse {

    /**
    * 子网列表
    */
    private List<Subnet> subnets;

    public List<Subnet> getSubnets() {
        return subnets;
    }

    public GetSubnetListResponse setSubnets(List<Subnet> subnets) {
        this.subnets = subnets;
        return this;
    }

    @Override
    public String toString() {
        return "GetSubnetListResponse{" + "subnets=" + subnets + "\n" + "}";
    }

}
