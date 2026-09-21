package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetMongodbSlowLogTrendResponse extends BaseBceResponse {

    /**
    * 慢日志趋势数据
    */
    private List<SlowLogTrend> data;

    public List<SlowLogTrend> getData() {
        return data;
    }

    public GetMongodbSlowLogTrendResponse setData(List<SlowLogTrend> data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "GetMongodbSlowLogTrendResponse{" + "data=" + data + "\n" + "}";
    }

}
