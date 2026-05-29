package com.baidubce.bls.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryLogRecordResponse extends BaseBceResponse {

    /**
    * 当query为检索语句时，如果还有日志数据，将会返回nextMarker字段，标记下一条位置，用于获取下一页日志数据
    */
    private String nextMarker;

    /**
    * resultSet
    */
    private ResultSet resultSet;

    /**
    * datasetScanInfo
    */
    private DatasetScanInfo datasetScanInfo;

    public String getNextMarker() {
        return nextMarker;
    }

    public QueryLogRecordResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public QueryLogRecordResponse setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
        return this;
    }

    public DatasetScanInfo getDatasetScanInfo() {
        return datasetScanInfo;
    }

    public QueryLogRecordResponse setDatasetScanInfo(DatasetScanInfo datasetScanInfo) {
        this.datasetScanInfo = datasetScanInfo;
        return this;
    }

    @Override
    public String toString() {
        return "QueryLogRecordResponse{" + "nextMarker=" + nextMarker + "\n" + "resultSet=" + resultSet + "\n" + "datasetScanInfo=" + datasetScanInfo + "\n" + "}";
    }

}
