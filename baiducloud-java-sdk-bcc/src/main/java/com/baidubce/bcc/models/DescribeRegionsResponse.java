package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeRegionsResponse extends BaseBceResponse {

    /**
    * 地域信息列表
    */
    private List<RegionModel> regions;

    public List<RegionModel> getRegions() {
        return regions;
    }

    public DescribeRegionsResponse setRegions(List<RegionModel> regions) {
        this.regions = regions;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeRegionsResponse{" + "regions=" + regions + "\n" + "}";
    }

}
