package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LstPerL2BktLnkExecLogResponse extends BaseBceResponse {

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    private String requestId;

    /**
    * 数据流动ID
    */
    private String bucketLinkId;

    /**
    * PFS实例ID
    */
    private String instanceId;

    /**
    * 执行详情列表
    */
    private List<ExecuteInfo> executeInfos;

    public String getRequestId() {
        return requestId;
    }

    public LstPerL2BktLnkExecLogResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getBucketLinkId() {
        return bucketLinkId;
    }

    public LstPerL2BktLnkExecLogResponse setBucketLinkId(String bucketLinkId) {
        this.bucketLinkId = bucketLinkId;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public LstPerL2BktLnkExecLogResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public List<ExecuteInfo> getExecuteInfos() {
        return executeInfos;
    }

    public LstPerL2BktLnkExecLogResponse setExecuteInfos(List<ExecuteInfo> executeInfos) {
        this.executeInfos = executeInfos;
        return this;
    }

    @Override
    public String toString() {
        return "LstPerL2BktLnkExecLogResponse{" + "requestId=" + requestId + "\n" + "bucketLinkId=" + bucketLinkId + "\n" + "instanceId=" + instanceId + "\n" + "executeInfos="
                + executeInfos + "\n" + "}";
    }

}
