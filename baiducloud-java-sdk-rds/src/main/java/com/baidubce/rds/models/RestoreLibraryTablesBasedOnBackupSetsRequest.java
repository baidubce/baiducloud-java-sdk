package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RestoreLibraryTablesBasedOnBackupSetsRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 源实例ID,与URL参数instanceId一样，可以不写
    */
    private String sourceInstanceId;

    /**
    * 恢复指定的实例ID，忽略此参数默认恢复到原实例
    */
    private String targetInstanceId;

    /**
    * 备份 ID
    */
    private String snapshotId;

    /**
    * 要恢复的数据信息
    */
    private List<RecoveryToSourceInstanceModel> data;

    /**
    * 需要恢复的库名称
    */
    private String dbName;

    /**
    * 恢复后库名称。恢复至原实例时，dbName和newDbname不一样。恢复至指定实例时，dbName和newDbname可以一样
    */
    private String newDbname;

    /**
    * 恢复模式，database（数据库），table（表）任选其一
    */
    private String restoreMode;

    /**
    * 表的对象集合，当restoreMode为table必填项，恢复目标实例 为database必项为非填项
    */
    private List<RecoveryToSourceInstanceTableModel> tables;

    /**
    * 需要恢复的表名
    */
    private String tableName;

    /**
    * 恢复后表名
    */
    private String newTablename;

    public String getInstanceId() {
        return instanceId;
    }

    public RestoreLibraryTablesBasedOnBackupSetsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getSourceInstanceId() {
        return sourceInstanceId;
    }

    public RestoreLibraryTablesBasedOnBackupSetsRequest setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }

    public String getTargetInstanceId() {
        return targetInstanceId;
    }

    public RestoreLibraryTablesBasedOnBackupSetsRequest setTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
        return this;
    }

    public String getSnapshotId() {
        return snapshotId;
    }

    public RestoreLibraryTablesBasedOnBackupSetsRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    public List<RecoveryToSourceInstanceModel> getData() {
        return data;
    }

    public RestoreLibraryTablesBasedOnBackupSetsRequest setData(List<RecoveryToSourceInstanceModel> data) {
        this.data = data;
        return this;
    }

    public String getDbName() {
        return dbName;
    }

    public RestoreLibraryTablesBasedOnBackupSetsRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    public String getNewDbname() {
        return newDbname;
    }

    public RestoreLibraryTablesBasedOnBackupSetsRequest setNewDbname(String newDbname) {
        this.newDbname = newDbname;
        return this;
    }

    public String getRestoreMode() {
        return restoreMode;
    }

    public RestoreLibraryTablesBasedOnBackupSetsRequest setRestoreMode(String restoreMode) {
        this.restoreMode = restoreMode;
        return this;
    }

    public List<RecoveryToSourceInstanceTableModel> getTables() {
        return tables;
    }

    public RestoreLibraryTablesBasedOnBackupSetsRequest setTables(List<RecoveryToSourceInstanceTableModel> tables) {
        this.tables = tables;
        return this;
    }

    public String getTableName() {
        return tableName;
    }

    public RestoreLibraryTablesBasedOnBackupSetsRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    public String getNewTablename() {
        return newTablename;
    }

    public RestoreLibraryTablesBasedOnBackupSetsRequest setNewTablename(String newTablename) {
        this.newTablename = newTablename;
        return this;
    }

}
