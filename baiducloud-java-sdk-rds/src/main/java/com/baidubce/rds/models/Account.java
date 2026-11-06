package com.baidubce.rds.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Account {
    /**
     * 账号名称，不能为保留关键字
     */
    private String accountName;

    /**
     * MySQL和SQL Server实例可设置此项
     */
    private List<DatabasePrivilege> databasePrivileges;

    /**
     * 账号归属类型。 OnlyMaster：主实例上使用的账号,RdsProxy：该主实例对应的代理实例上使用的账号。默认为OnlyMaster账号，详情参考
     */
    private String type;

    /**
     * 账号状态，同status
     */
    private String accountStatus;

    /**
     * 同accountType字段值
     */
    private String superUserFlag;

    /**
     * 账号权限类型。 Common：普通账号,Super：super账号。默认为普通账号，详情参考
     */
    private String accountType;

    /**
     * 账号的描述信息
     */
    private String desc;

    /**
     * 账号状态，Available：可用
     */
    private String status;

    /**
     * 账号操作时间， 如："2023-07-28 02:45:53"
     */
    @JsonProperty("ETag")
    private String etag;

    public Account setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public Account setDatabasePrivileges(List<DatabasePrivilege> databasePrivileges) {
        this.databasePrivileges = databasePrivileges;
        return this;
    }

    public List<DatabasePrivilege> getDatabasePrivileges() {
        return this.databasePrivileges;
    }

    public Account setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public Account setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
        return this;
    }

    public String getAccountStatus() {
        return this.accountStatus;
    }

    public Account setSuperUserFlag(String superUserFlag) {
        this.superUserFlag = superUserFlag;
        return this;
    }

    public String getSuperUserFlag() {
        return this.superUserFlag;
    }

    public Account setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public Account setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getDesc() {
        return this.desc;
    }

    public Account setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public Account setEtag(String etag) {
        this.etag = etag;
        return this;
    }

    public String getEtag() {
        return this.etag;
    }

    @Override
    public String toString() {
        return "Account{" + "accountName=" + accountName + "\n" + "databasePrivileges=" + databasePrivileges + "\n" + "type=" + type + "\n" + "accountStatus=" + accountStatus
                + "\n" + "superUserFlag=" + superUserFlag + "\n" + "accountType=" + accountType + "\n" + "desc=" + desc + "\n" + "status=" + status + "\n" + "etag=" + etag + "\n"
                + "}";
    }

}