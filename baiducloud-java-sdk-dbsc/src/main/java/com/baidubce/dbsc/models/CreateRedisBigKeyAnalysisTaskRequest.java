package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateRedisBigKeyAnalysisTaskRequest extends BaseBceRequest {

    /**
    * 集群ID
    */
    private String appId;

    /**
    * 分片ID
    */
    private String clusterId;

    /**
    * BackupType 使用的备份方式1：新建备份 2.：使用历史备份
    */
    private Integer backupType;

    /**
    * 备份ID，当BackupType为2时，必须指定该字段
    */
    private String backupId;

    public String getAppId() {
        return appId;
    }

    public CreateRedisBigKeyAnalysisTaskRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getClusterId() {
        return clusterId;
    }

    public CreateRedisBigKeyAnalysisTaskRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    public Integer getBackupType() {
        return backupType;
    }

    public CreateRedisBigKeyAnalysisTaskRequest setBackupType(Integer backupType) {
        this.backupType = backupType;
        return this;
    }

    public String getBackupId() {
        return backupId;
    }

    public CreateRedisBigKeyAnalysisTaskRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

}
