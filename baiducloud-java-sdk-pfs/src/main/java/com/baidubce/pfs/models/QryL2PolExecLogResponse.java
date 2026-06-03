package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QryL2PolExecLogResponse extends BaseBceResponse {

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    private String requestId;

    /**
    * 规则ID
    */
    private String policyId;

    /**
    * 规则所属实例ID
    */
    private String instanceId;

    /**
    * 执行详情列表
    */
    private List<ExecuteInfo> executeInfos;

    public String getRequestId() {
        return requestId;
    }

    public QryL2PolExecLogResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getPolicyId() {
        return policyId;
    }

    public QryL2PolExecLogResponse setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public QryL2PolExecLogResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public List<ExecuteInfo> getExecuteInfos() {
        return executeInfos;
    }

    public QryL2PolExecLogResponse setExecuteInfos(List<ExecuteInfo> executeInfos) {
        this.executeInfos = executeInfos;
        return this;
    }

    @Override
    public String toString() {
        return "QryL2PolExecLogResponse{" + "requestId=" + requestId + "\n" + "policyId=" + policyId + "\n" + "instanceId=" + instanceId + "\n" + "executeInfos=" + executeInfos
                + "\n" + "}";
    }

}
