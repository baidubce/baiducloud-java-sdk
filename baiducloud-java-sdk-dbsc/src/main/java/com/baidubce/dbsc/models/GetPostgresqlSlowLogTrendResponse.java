package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPostgresqlSlowLogTrendResponse extends BaseBceResponse {

    /**
    * 趋势数据点列表
    */
    private List<SlowTrendDataPoint> data;

    public List<SlowTrendDataPoint> getData() {
        return data;
    }

    public GetPostgresqlSlowLogTrendResponse setData(List<SlowTrendDataPoint> data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "GetPostgresqlSlowLogTrendResponse{" + "data=" + data + "\n" + "}";
    }

}
