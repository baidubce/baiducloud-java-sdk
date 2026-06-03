package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LstPerL2BktLnkExecLogRequest extends BaseBceRequest {

    /**
    * PFS实例ID
    */
    private String instanceId;

    /**
    * 数据流动ID
    */
    private String bucketLinkId;

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

    public LstPerL2BktLnkExecLogRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getBucketLinkId() {
        return bucketLinkId;
    }

    public LstPerL2BktLnkExecLogRequest setBucketLinkId(String bucketLinkId) {
        this.bucketLinkId = bucketLinkId;
        return this;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public LstPerL2BktLnkExecLogRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public LstPerL2BktLnkExecLogRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }

}
