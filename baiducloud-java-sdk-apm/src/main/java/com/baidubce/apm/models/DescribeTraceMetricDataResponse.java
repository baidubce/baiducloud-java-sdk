package com.baidubce.apm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeTraceMetricDataResponse extends BaseBceResponse {

    /**
    * 请求是否成功
    */
    private Boolean success;

    /**
    * 状态码
    */
    private String code;

    /**
    * 错误信息
    */
    private String message;

    /**
    * 时序数据列表
    */
    private List<Timeseries> timeseries;

    /**
    * aggregate
    */
    private AggregateResult aggregate;

    public Boolean getSuccess() {
        return success;
    }

    public DescribeTraceMetricDataResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public DescribeTraceMetricDataResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DescribeTraceMetricDataResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public List<Timeseries> getTimeseries() {
        return timeseries;
    }

    public DescribeTraceMetricDataResponse setTimeseries(List<Timeseries> timeseries) {
        this.timeseries = timeseries;
        return this;
    }

    public AggregateResult getAggregate() {
        return aggregate;
    }

    public DescribeTraceMetricDataResponse setAggregate(AggregateResult aggregate) {
        this.aggregate = aggregate;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeTraceMetricDataResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "timeseries=" + timeseries + "\n"
                + "aggregate=" + aggregate + "\n" + "}";
    }

}
