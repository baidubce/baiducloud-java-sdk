package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListMongodbSlowLogsResponse extends BaseBceResponse {

    /**
    * 全量日志列表
    */
    private List<MongoDBSlowLogDetail> logs;

    /**
    * 日志总数
    */
    private Integer totalCount;

    public List<MongoDBSlowLogDetail> getLogs() {
        return logs;
    }

    public ListMongodbSlowLogsResponse setLogs(List<MongoDBSlowLogDetail> logs) {
        this.logs = logs;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public ListMongodbSlowLogsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    @Override
    public String toString() {
        return "ListMongodbSlowLogsResponse{" + "logs=" + logs + "\n" + "totalCount=" + totalCount + "\n" + "}";
    }

}
