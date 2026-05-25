package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeTraceMetricDataV3Response extends BaseBceResponse {

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

    public DescribeTraceMetricDataV3Response setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public DescribeTraceMetricDataV3Response setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DescribeTraceMetricDataV3Response setMessage(String message) {
        this.message = message;
        return this;
    }

    public List<Timeseries> getTimeseries() {
        return timeseries;
    }

    public DescribeTraceMetricDataV3Response setTimeseries(List<Timeseries> timeseries) {
        this.timeseries = timeseries;
        return this;
    }

    public AggregateResult getAggregate() {
        return aggregate;
    }

    public DescribeTraceMetricDataV3Response setAggregate(AggregateResult aggregate) {
        this.aggregate = aggregate;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeTraceMetricDataV3Response{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "timeseries=" + timeseries + "\n"
                + "aggregate=" + aggregate + "\n" + "}";
    }

}
