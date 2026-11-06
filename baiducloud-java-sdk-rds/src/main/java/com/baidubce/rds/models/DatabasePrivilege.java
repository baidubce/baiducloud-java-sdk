package com.baidubce.rds.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DatabasePrivilege {
    /**
     * 数据库名称
     */
    private String dbName;

    /**
     * 授权类型。ReadOnly：只读，ReadWrite：读写
     */
    private String authType;

    public DatabasePrivilege setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    public String getDbName() {
        return this.dbName;
    }

    public DatabasePrivilege setAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    public String getAuthType() {
        return this.authType;
    }

    @Override
    public String toString() {
        return "DatabasePrivilege{" + "dbName=" + dbName + "\n" + "authType=" + authType + "\n" + "}";
    }

}