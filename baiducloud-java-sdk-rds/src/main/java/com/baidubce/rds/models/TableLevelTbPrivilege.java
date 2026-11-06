package com.baidubce.rds.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TableLevelTbPrivilege {
    /**
     * 数据库名
     */
    private String db;

    /**
     * 表名
     */
    private String table;

    /**
     * 该表授予的权限项列表
     */
    private List<String> privs;

    public TableLevelTbPrivilege setDb(String db) {
        this.db = db;
        return this;
    }

    public String getDb() {
        return this.db;
    }

    public TableLevelTbPrivilege setTable(String table) {
        this.table = table;
        return this;
    }

    public String getTable() {
        return this.table;
    }

    public TableLevelTbPrivilege setPrivs(List<String> privs) {
        this.privs = privs;
        return this;
    }

    public List<String> getPrivs() {
        return this.privs;
    }

    @Override
    public String toString() {
        return "TableLevelTbPrivilege{" + "db=" + db + "\n" + "table=" + table + "\n" + "privs=" + privs + "\n" + "}";
    }

}