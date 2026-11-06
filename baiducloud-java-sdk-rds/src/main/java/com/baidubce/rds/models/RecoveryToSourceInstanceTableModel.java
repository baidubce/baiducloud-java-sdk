package com.baidubce.rds.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RecoveryToSourceInstanceTableModel {
    /**
     * 需要恢复的表名
     */
    private String tableName;

    /**
     * 恢复后表名
     */
    private String newTablename;

    public RecoveryToSourceInstanceTableModel setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    public String getTableName() {
        return this.tableName;
    }

    public RecoveryToSourceInstanceTableModel setNewTablename(String newTablename) {
        this.newTablename = newTablename;
        return this;
    }

    public String getNewTablename() {
        return this.newTablename;
    }

    @Override
    public String toString() {
        return "RecoveryToSourceInstanceTableModel{" + "tableName=" + tableName + "\n" + "newTablename=" + newTablename + "\n" + "}";
    }

}