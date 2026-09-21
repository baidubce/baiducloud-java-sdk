package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPegadbSlowLogTimeDistributionResponse extends BaseBceResponse {

    /**
    * 返回统计区间信息
    */
    private List<SCSSlowlogStatsDuartion> stats;

    public List<SCSSlowlogStatsDuartion> getStats() {
        return stats;
    }

    public GetPegadbSlowLogTimeDistributionResponse setStats(List<SCSSlowlogStatsDuartion> stats) {
        this.stats = stats;
        return this;
    }

    @Override
    public String toString() {
        return "GetPegadbSlowLogTimeDistributionResponse{" + "stats=" + stats + "\n" + "}";
    }

}
