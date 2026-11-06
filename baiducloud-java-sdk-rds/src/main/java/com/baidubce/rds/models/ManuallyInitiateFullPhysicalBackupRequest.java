package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ManuallyInitiateFullPhysicalBackupRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 窗口字段。操作执行方式，有两种取值：timewindow、immediate。其中timewindow表示在时间窗口内执行，immediate表示立即执行。默认为immediate。实例默认的时间窗口为05:00~06:00
    */
    private String effectiveTime;

    /**
    * 备份类型，支持physical/snapshot， 取值为：snapshot，磁盘类型为ssd将不支持快照备份
    */
    private String dataBackupType;

    public String getInstanceId() {
        return instanceId;
    }

    public ManuallyInitiateFullPhysicalBackupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getEffectiveTime() {
        return effectiveTime;
    }

    public ManuallyInitiateFullPhysicalBackupRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }

    public String getDataBackupType() {
        return dataBackupType;
    }

    public ManuallyInitiateFullPhysicalBackupRequest setDataBackupType(String dataBackupType) {
        this.dataBackupType = dataBackupType;
        return this;
    }

}
