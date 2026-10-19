package com.baidubce.rds.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuerySubnetListResponse extends BaseBceResponse {

    /**
    * 子网列表
    */
    private List<SubnetVo> subnets;

    public List<SubnetVo> getSubnets() {
        return subnets;
    }

    public QuerySubnetListResponse setSubnets(List<SubnetVo> subnets) {
        this.subnets = subnets;
        return this;
    }

    @Override
    public String toString() {
        return "QuerySubnetListResponse{" + "subnets=" + subnets + "\n" + "}";
    }

}
