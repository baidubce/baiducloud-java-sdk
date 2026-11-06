package com.baidubce.rds.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPgLogListResponse extends BaseBceResponse {

    /**
    * pg 日志列表响应结构。
    */
    private List<PgLogResponse> pgLogs;

    public List<PgLogResponse> getPgLogs() {
        return pgLogs;
    }

    public GetPgLogListResponse setPgLogs(List<PgLogResponse> pgLogs) {
        this.pgLogs = pgLogs;
        return this;
    }

    @Override
    public String toString() {
        return "GetPgLogListResponse{" + "pgLogs=" + pgLogs + "\n" + "}";
    }

}
