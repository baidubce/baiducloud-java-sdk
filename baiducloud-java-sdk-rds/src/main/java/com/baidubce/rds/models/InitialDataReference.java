package com.baidubce.rds.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InitialDataReference {
    /**
     * 数据源的InstanceId
     */
    private String instanceId;

    /**
     * 仅限两种取值：datetime, snapshot
     */
    private String referenceType;

    /**
     * 库表恢复到新实例，恢复的目标时间点 referenceType为datetime时，必须，初始数据导入的目标时间，标准时间格式，中国+8时区
     */
    private String datetime;

    /**
     * referenceType为snapshot时必须，初始数据导入的目标备份集，取备份集ID
     */
    private String snapshotId;

    public InitialDataReference setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public InitialDataReference setReferenceType(String referenceType) {
        this.referenceType = referenceType;
        return this;
    }

    public String getReferenceType() {
        return this.referenceType;
    }

    public InitialDataReference setDatetime(String datetime) {
        this.datetime = datetime;
        return this;
    }

    public String getDatetime() {
        return this.datetime;
    }

    public InitialDataReference setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    public String getSnapshotId() {
        return this.snapshotId;
    }

    @Override
    public String toString() {
        return "InitialDataReference{" + "instanceId=" + instanceId + "\n" + "referenceType=" + referenceType + "\n" + "datetime=" + datetime + "\n" + "snapshotId=" + snapshotId
                + "\n" + "}";
    }

}