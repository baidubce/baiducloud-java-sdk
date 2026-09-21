package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListMysqlSlowLogsResponse extends BaseBceResponse {

    /**
    * 全量日志列表
    */
    private List<MySQLSlowLogDetail> logs;

    /**
    * 日志总数
    */
    private Integer totalCount;

    public List<MySQLSlowLogDetail> getLogs() {
        return logs;
    }

    public ListMysqlSlowLogsResponse setLogs(List<MySQLSlowLogDetail> logs) {
        this.logs = logs;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public ListMysqlSlowLogsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    @Override
    public String toString() {
        return "ListMysqlSlowLogsResponse{" + "logs=" + logs + "\n" + "totalCount=" + totalCount + "\n" + "}";
    }

}
