package com.baidubce.rds.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TargetRegionMappingListApiResponse extends BaseBceResponse {

    /**
    * 可选的目标地域列表
    */
    private List<String> regions;

    public List<String> getRegions() {
        return regions;
    }

    public TargetRegionMappingListApiResponse setRegions(List<String> regions) {
        this.regions = regions;
        return this;
    }

    @Override
    public String toString() {
        return "TargetRegionMappingListApiResponse{" + "regions=" + regions + "\n" + "}";
    }

}
