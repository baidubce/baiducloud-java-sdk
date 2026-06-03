package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QryL2PolExecLogRequest extends BaseBceRequest {

    /**
    * policyId对应的pfs实例短id
    */
    private String instanceId;

    /**
    * policyId
    */
    private String policyId;

    /**
    * 查询日志起始时间戳(秒级)
    */
    private Integer startTime;

    /**
    * 查询日志结束时间戳(秒级)
    */
    private Integer endTime;

    public String getInstanceId() {
        return instanceId;
    }

    public QryL2PolExecLogRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getPolicyId() {
        return policyId;
    }

    public QryL2PolExecLogRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public QryL2PolExecLogRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public QryL2PolExecLogRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }

}
