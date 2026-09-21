package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListPostgresqlSlowLogsResponse extends BaseBceResponse {

    /**
    * 总记录数
    */
    private Long totalCount;

    /**
    * 慢日志信息列表
    */
    private List<PGSlowLogInfo> logs;

    public Long getTotalCount() {
        return totalCount;
    }

    public ListPostgresqlSlowLogsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public List<PGSlowLogInfo> getLogs() {
        return logs;
    }

    public ListPostgresqlSlowLogsResponse setLogs(List<PGSlowLogInfo> logs) {
        this.logs = logs;
        return this;
    }

    @Override
    public String toString() {
        return "ListPostgresqlSlowLogsResponse{" + "totalCount=" + totalCount + "\n" + "logs=" + logs + "\n" + "}";
    }

}
