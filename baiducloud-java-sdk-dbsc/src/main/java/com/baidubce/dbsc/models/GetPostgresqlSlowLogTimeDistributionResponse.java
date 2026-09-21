package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPostgresqlSlowLogTimeDistributionResponse extends BaseBceResponse {

    /**
    * 分段统计数据列表
    */
    private List<StatsByRangeItem> stats;

    public List<StatsByRangeItem> getStats() {
        return stats;
    }

    public GetPostgresqlSlowLogTimeDistributionResponse setStats(List<StatsByRangeItem> stats) {
        this.stats = stats;
        return this;
    }

    @Override
    public String toString() {
        return "GetPostgresqlSlowLogTimeDistributionResponse{" + "stats=" + stats + "\n" + "}";
    }

}
