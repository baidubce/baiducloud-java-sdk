package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetMongodbSlowLogTimeDistributionResponse extends BaseBceResponse {

    /**
    * 执行时间区间分布数据
    */
    private List<MySQLSlowLogStatsByDuration> stats;

    public List<MySQLSlowLogStatsByDuration> getStats() {
        return stats;
    }

    public GetMongodbSlowLogTimeDistributionResponse setStats(List<MySQLSlowLogStatsByDuration> stats) {
        this.stats = stats;
        return this;
    }

    @Override
    public String toString() {
        return "GetMongodbSlowLogTimeDistributionResponse{" + "stats=" + stats + "\n" + "}";
    }

}
