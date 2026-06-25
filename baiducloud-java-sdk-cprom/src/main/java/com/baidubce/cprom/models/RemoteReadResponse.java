package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoteReadResponse extends BaseBceResponse {

    /**
    * 请求是否成功。
    */
    private String status;

    /**
    * 查询结果是否为部分数据。
    */
    private Boolean isPartial;

    /**
    * 
    */
    private Object data;

    /**
    * 查询结果类型，如 `matrix` 或 `vector`。
    */
    private String dataResultType;

    /**
    * 查询结果列表，列表项包含 `metric` 以及 `values` 或 `value` 等信息。
    */
    private List<Object> dataResult;

    /**
    * 查询指标的所有维度。
    */
    private Map<String, Object> dataResultMetric;

    /**
    * 区间查询返回的样本点列表，每个元素为 `[时间戳, 数值]`。
    */
    private List<Object> dataResultValues;

    /**
    * 即时查询返回的单个样本点，格式为 `[时间戳, 数值]`。
    */
    private List<Object> dataResultValue;

    public String getStatus() {
        return status;
    }

    public RemoteReadResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public Boolean getIsPartial() {
        return isPartial;
    }

    public RemoteReadResponse setIsPartial(Boolean isPartial) {
        this.isPartial = isPartial;
        return this;
    }

    public Object getData() {
        return data;
    }

    public RemoteReadResponse setData(Object data) {
        this.data = data;
        return this;
    }

    public String getDataResultType() {
        return dataResultType;
    }

    public RemoteReadResponse setDataResultType(String dataResultType) {
        this.dataResultType = dataResultType;
        return this;
    }

    public List<Object> getDataResult() {
        return dataResult;
    }

    public RemoteReadResponse setDataResult(List<Object> dataResult) {
        this.dataResult = dataResult;
        return this;
    }

    public Map<String, Object> getDataResultMetric() {
        return dataResultMetric;
    }

    public RemoteReadResponse setDataResultMetric(Map<String, Object> dataResultMetric) {
        this.dataResultMetric = dataResultMetric;
        return this;
    }

    public List<Object> getDataResultValues() {
        return dataResultValues;
    }

    public RemoteReadResponse setDataResultValues(List<Object> dataResultValues) {
        this.dataResultValues = dataResultValues;
        return this;
    }

    public List<Object> getDataResultValue() {
        return dataResultValue;
    }

    public RemoteReadResponse setDataResultValue(List<Object> dataResultValue) {
        this.dataResultValue = dataResultValue;
        return this;
    }

    @Override
    public String toString() {
        return "RemoteReadResponse{" + "status=" + status + "\n" + "isPartial=" + isPartial + "\n" + "data=" + data + "\n" + "dataResultType=" + dataResultType + "\n"
                + "dataResult=" + dataResult + "\n" + "dataResultMetric=" + dataResultMetric + "\n" + "dataResultValues=" + dataResultValues + "\n" + "dataResultValue="
                + dataResultValue + "\n" + "}";
    }

}
