package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SyncGroupPreCheckResponse extends BaseBceResponse {

    /**
    * 各成员校验结果列表
    */
    private List<CheckSyncGroupResultItem> checkResult;

    /**
    * 实例间连通性结果列表
    */
    private List<SyncGroupInstanceConnectionResult> connectionResults;

    public List<CheckSyncGroupResultItem> getCheckResult() {
        return checkResult;
    }

    public SyncGroupPreCheckResponse setCheckResult(List<CheckSyncGroupResultItem> checkResult) {
        this.checkResult = checkResult;
        return this;
    }

    public List<SyncGroupInstanceConnectionResult> getConnectionResults() {
        return connectionResults;
    }

    public SyncGroupPreCheckResponse setConnectionResults(List<SyncGroupInstanceConnectionResult> connectionResults) {
        this.connectionResults = connectionResults;
        return this;
    }

    @Override
    public String toString() {
        return "SyncGroupPreCheckResponse{" + "checkResult=" + checkResult + "\n" + "connectionResults=" + connectionResults + "\n" + "}";
    }

}
