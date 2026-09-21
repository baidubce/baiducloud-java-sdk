package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetMysqlSlowLogTrendResponse extends BaseBceResponse {

    /**
    * 慢日志趋势数据
    */
    private List<MySQLSlowLogTrend> data;

    public List<MySQLSlowLogTrend> getData() {
        return data;
    }

    public GetMysqlSlowLogTrendResponse setData(List<MySQLSlowLogTrend> data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "GetMysqlSlowLogTrendResponse{" + "data=" + data + "\n" + "}";
    }

}
