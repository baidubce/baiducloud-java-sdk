package com.baidubce.rds.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Database {
    /**
     * 数据库名称
     */
    private String dbName;

    /**
     * 支持字符集。UTF8，LATIN1，SQL\_ASCII
     */
    private String characterSetName;

    /**
     * 账户权限由[AccountPrivilege](#AccountPrivilege)对象组成
     */
    private List<AccountPrivilege> accountPrivileges;

    /**
     * 
     */
    private String collate;

    /**
     * 
     */
    private String ctype;

    /**
     * 授权账号
     */
    private String owner;

    public Database setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    public String getDbName() {
        return this.dbName;
    }

    public Database setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
        return this;
    }

    public String getCharacterSetName() {
        return this.characterSetName;
    }

    public Database setAccountPrivileges(List<AccountPrivilege> accountPrivileges) {
        this.accountPrivileges = accountPrivileges;
        return this;
    }

    public List<AccountPrivilege> getAccountPrivileges() {
        return this.accountPrivileges;
    }

    public Database setCollate(String collate) {
        this.collate = collate;
        return this;
    }

    public String getCollate() {
        return this.collate;
    }

    public Database setCtype(String ctype) {
        this.ctype = ctype;
        return this;
    }

    public String getCtype() {
        return this.ctype;
    }

    public Database setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public String getOwner() {
        return this.owner;
    }

    @Override
    public String toString() {
        return "Database{" + "dbName=" + dbName + "\n" + "characterSetName=" + characterSetName + "\n" + "accountPrivileges=" + accountPrivileges + "\n" + "collate=" + collate
                + "\n" + "ctype=" + ctype + "\n" + "owner=" + owner + "\n" + "}";
    }

}