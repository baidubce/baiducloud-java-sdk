package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdPerL2BktLnkInfoRequest extends BaseBceRequest {

    /**
    * 数据流动所属PFS实例ID
    */
    private String instanceId;

    /**
    * 需要更新的数据流动ID
    */
    private String bucketLinkId;

    /**
    * 新触发周期cron表达式
    */
    private String newCron;

    /**
    * 新的bucketlink名字
    */
    private String newBucketLinkName;

    /**
    * 新的冲突策略
    */
    private Integer newConflictPolicy;

    /**
    * 新的吞吐限制
    */
    private Integer newThroughputLimitBytes;

    /**
    * 新的可见范围，设置仅对2026-01-01之后创建的数据流动任务生效。
    */
    private Integer newScope;

    public String getInstanceId() {
        return instanceId;
    }

    public UpdPerL2BktLnkInfoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getBucketLinkId() {
        return bucketLinkId;
    }

    public UpdPerL2BktLnkInfoRequest setBucketLinkId(String bucketLinkId) {
        this.bucketLinkId = bucketLinkId;
        return this;
    }

    public String getNewCron() {
        return newCron;
    }

    public UpdPerL2BktLnkInfoRequest setNewCron(String newCron) {
        this.newCron = newCron;
        return this;
    }

    public String getNewBucketLinkName() {
        return newBucketLinkName;
    }

    public UpdPerL2BktLnkInfoRequest setNewBucketLinkName(String newBucketLinkName) {
        this.newBucketLinkName = newBucketLinkName;
        return this;
    }

    public Integer getNewConflictPolicy() {
        return newConflictPolicy;
    }

    public UpdPerL2BktLnkInfoRequest setNewConflictPolicy(Integer newConflictPolicy) {
        this.newConflictPolicy = newConflictPolicy;
        return this;
    }

    public Integer getNewThroughputLimitBytes() {
        return newThroughputLimitBytes;
    }

    public UpdPerL2BktLnkInfoRequest setNewThroughputLimitBytes(Integer newThroughputLimitBytes) {
        this.newThroughputLimitBytes = newThroughputLimitBytes;
        return this;
    }

    public Integer getNewScope() {
        return newScope;
    }

    public UpdPerL2BktLnkInfoRequest setNewScope(Integer newScope) {
        this.newScope = newScope;
        return this;
    }

}
