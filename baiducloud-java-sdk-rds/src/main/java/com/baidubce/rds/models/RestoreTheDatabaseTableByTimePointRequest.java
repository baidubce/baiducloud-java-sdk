package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RestoreTheDatabaseTableByTimePointRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 与instanceId是一样的，此项不用填写
    */
    private String sourceInstanceId;

    /**
    * 要恢复的实例ID。 恢复到指定实例时，必填，值为指定的实例ID，如果恢复到原有实例，可以不写
    */
    private String targetInstanceId;

    /**
    * 备份时间点
    */
    private String datetime;

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

    public RestoreTheDatabaseTableByTimePointRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getSourceInstanceId() {
        return sourceInstanceId;
    }

    public RestoreTheDatabaseTableByTimePointRequest setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }

    public String getTargetInstanceId() {
        return targetInstanceId;
    }

    public RestoreTheDatabaseTableByTimePointRequest setTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
        return this;
    }

    public String getDatetime() {
        return datetime;
    }

    public RestoreTheDatabaseTableByTimePointRequest setDatetime(String datetime) {
        this.datetime = datetime;
        return this;
    }

    public List<RecoveryToSourceInstanceModel> getData() {
        return data;
    }

    public RestoreTheDatabaseTableByTimePointRequest setData(List<RecoveryToSourceInstanceModel> data) {
        this.data = data;
        return this;
    }

    public String getDbName() {
        return dbName;
    }

    public RestoreTheDatabaseTableByTimePointRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    public String getNewDbname() {
        return newDbname;
    }

    public RestoreTheDatabaseTableByTimePointRequest setNewDbname(String newDbname) {
        this.newDbname = newDbname;
        return this;
    }

    public String getRestoreMode() {
        return restoreMode;
    }

    public RestoreTheDatabaseTableByTimePointRequest setRestoreMode(String restoreMode) {
        this.restoreMode = restoreMode;
        return this;
    }

    public List<RecoveryToSourceInstanceTableModel> getTables() {
        return tables;
    }

    public RestoreTheDatabaseTableByTimePointRequest setTables(List<RecoveryToSourceInstanceTableModel> tables) {
        this.tables = tables;
        return this;
    }

    public String getTableName() {
        return tableName;
    }

    public RestoreTheDatabaseTableByTimePointRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    public String getNewTablename() {
        return newTablename;
    }

    public RestoreTheDatabaseTableByTimePointRequest setNewTablename(String newTablename) {
        this.newTablename = newTablename;
        return this;
    }

}
