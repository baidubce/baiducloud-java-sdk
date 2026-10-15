package com.baidubce.rds.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RecoveryToSourceInstanceModel {
    /**
     * 表示恢复模式，支持database和table两种
     */
    private String restoreMode;

    /**
     * 要恢复库的名称
     */
    private String dbName;

    /**
     * 表示恢复后库的名称
     */
    private String newDbname;

    /**
     * 表示恢复后库的名称
     */
    private List<Table> tables;

    public RecoveryToSourceInstanceModel setRestoreMode(String restoreMode) {
        this.restoreMode = restoreMode;
        return this;
    }

    public String getRestoreMode() {
        return this.restoreMode;
    }

    public RecoveryToSourceInstanceModel setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    public String getDbName() {
        return this.dbName;
    }

    public RecoveryToSourceInstanceModel setNewDbname(String newDbname) {
        this.newDbname = newDbname;
        return this;
    }

    public String getNewDbname() {
        return this.newDbname;
    }

    public RecoveryToSourceInstanceModel setTables(List<Table> tables) {
        this.tables = tables;
        return this;
    }

    public List<Table> getTables() {
        return this.tables;
    }

    @Override
    public String toString() {
        return "RecoveryToSourceInstanceModel{" + "restoreMode=" + restoreMode + "\n" + "dbName=" + dbName + "\n" + "newDbname=" + newDbname + "\n" + "tables=" + tables + "\n"
                + "}";
    }

}