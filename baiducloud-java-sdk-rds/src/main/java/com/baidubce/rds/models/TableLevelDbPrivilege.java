package com.baidubce.rds.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TableLevelDbPrivilege {
    /**
     * 数据库名
     */
    private String db;

    /**
     * 该库授予的权限项列表
     */
    private List<String> privs;

    public TableLevelDbPrivilege setDb(String db) {
        this.db = db;
        return this;
    }

    public String getDb() {
        return this.db;
    }

    public TableLevelDbPrivilege setPrivs(List<String> privs) {
        this.privs = privs;
        return this;
    }

    public List<String> getPrivs() {
        return this.privs;
    }

    @Override
    public String toString() {
        return "TableLevelDbPrivilege{" + "db=" + db + "\n" + "privs=" + privs + "\n" + "}";
    }

}