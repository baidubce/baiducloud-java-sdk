package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchStopTrainingTasksV2Response extends BaseBceResponse {

    /**
    * 请求ID
    */
    private String requestId;

    /**
    * result
    */
    private StopBatchResult result;

    public String getRequestId() {
        return requestId;
    }

    public BatchStopTrainingTasksV2Response setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public StopBatchResult getResult() {
        return result;
    }

    public BatchStopTrainingTasksV2Response setResult(StopBatchResult result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "BatchStopTrainingTasksV2Response{" + "requestId=" + requestId + "\n" + "result=" + result + "\n" + "}";
    }

}
