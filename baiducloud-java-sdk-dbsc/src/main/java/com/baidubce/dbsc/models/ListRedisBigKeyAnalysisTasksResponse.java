package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListRedisBigKeyAnalysisTasksResponse extends BaseBceResponse {

    /**
    * 数据采集时间
    */
    private String dataCollectionTime;

    /**
    * 按数量分析结果
    */
    private List<BigKeyResultInfo> elementCountResult;

    /**
    * 按内存分析结果
    */
    private List<BigKeyResultInfo> memoryResult;

    public String getDataCollectionTime() {
        return dataCollectionTime;
    }

    public ListRedisBigKeyAnalysisTasksResponse setDataCollectionTime(String dataCollectionTime) {
        this.dataCollectionTime = dataCollectionTime;
        return this;
    }

    public List<BigKeyResultInfo> getElementCountResult() {
        return elementCountResult;
    }

    public ListRedisBigKeyAnalysisTasksResponse setElementCountResult(List<BigKeyResultInfo> elementCountResult) {
        this.elementCountResult = elementCountResult;
        return this;
    }

    public List<BigKeyResultInfo> getMemoryResult() {
        return memoryResult;
    }

    public ListRedisBigKeyAnalysisTasksResponse setMemoryResult(List<BigKeyResultInfo> memoryResult) {
        this.memoryResult = memoryResult;
        return this;
    }

    @Override
    public String toString() {
        return "ListRedisBigKeyAnalysisTasksResponse{" + "dataCollectionTime=" + dataCollectionTime + "\n" + "elementCountResult=" + elementCountResult + "\n" + "memoryResult="
                + memoryResult + "\n" + "}";
    }

}
