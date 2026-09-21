package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPegadbSlowLogTrendResponse extends BaseBceResponse {

    /**
    * 慢日志趋势数据
    */
    private List<SCSSlowlogTrend> data;

    public List<SCSSlowlogTrend> getData() {
        return data;
    }

    public GetPegadbSlowLogTrendResponse setData(List<SCSSlowlogTrend> data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "GetPegadbSlowLogTrendResponse{" + "data=" + data + "\n" + "}";
    }

}
