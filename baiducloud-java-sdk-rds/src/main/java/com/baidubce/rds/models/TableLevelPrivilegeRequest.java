package com.baidubce.rds.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TableLevelPrivilegeRequest {
    /**
     * 权限类型
     */
    private String type;

    /**
     * 全局权限项列表
     */
    private List<String> globals;

    /**
     * 库级权限列表，见下表
     */
    private List<TableLevelDbPrivilege> databases;

    /**
     * 表级权限列表，见下表
     */
    private List<TableLevelTbPrivilege> tables;

    /**
     * Proxy 读写配置列表，见下表
     */
    private List<ProxyWrFlagInfo> proxys;

    public TableLevelPrivilegeRequest setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public TableLevelPrivilegeRequest setGlobals(List<String> globals) {
        this.globals = globals;
        return this;
    }

    public List<String> getGlobals() {
        return this.globals;
    }

    public TableLevelPrivilegeRequest setDatabases(List<TableLevelDbPrivilege> databases) {
        this.databases = databases;
        return this;
    }

    public List<TableLevelDbPrivilege> getDatabases() {
        return this.databases;
    }

    public TableLevelPrivilegeRequest setTables(List<TableLevelTbPrivilege> tables) {
        this.tables = tables;
        return this;
    }

    public List<TableLevelTbPrivilege> getTables() {
        return this.tables;
    }

    public TableLevelPrivilegeRequest setProxys(List<ProxyWrFlagInfo> proxys) {
        this.proxys = proxys;
        return this;
    }

    public List<ProxyWrFlagInfo> getProxys() {
        return this.proxys;
    }

    @Override
    public String toString() {
        return "TableLevelPrivilegeRequest{" + "type=" + type + "\n" + "globals=" + globals + "\n" + "databases=" + databases + "\n" + "tables=" + tables + "\n" + "proxys="
                + proxys + "\n" + "}";
    }

}