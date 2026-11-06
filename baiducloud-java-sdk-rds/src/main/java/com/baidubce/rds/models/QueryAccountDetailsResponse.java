package com.baidubce.rds.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryAccountDetailsResponse extends BaseBceResponse {

    /**
    * 账号名称，不能为保留关键字
    */
    private String accountName;

    /**
    * MySQL和SQL Server实例可设置此项
    */
    private List<DatabasePrivilege> databasePrivileges;

    /**
    * 账号归属类型。 OnlyMaster：主实例上使用的账号,RdsProxy：该主实例对应的代理实例上使用的账号。默认为OnlyMaster账号，具体参考详情
    */
    private String type;

    /**
    * 账号状态，Available：可用
    */
    private String accountStatus;

    /**
    * 账号权限类型。 Common：普通账号,Super：super账号。默认为普通账号。详情参考
    */
    private String superUserFlag;

    /**
    * 账号权限类型。 Common：普通账号,Super：super账号。默认为普通账号。详情参考
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
    * 创建时间，格式：yyyy-mm-dd hh:mm:ss；如：\"2023-07-28 02:45:53\"
    */
    @JsonProperty("ETag")
    private String etag;

    public String getAccountName() {
        return accountName;
    }

    public QueryAccountDetailsResponse setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    public List<DatabasePrivilege> getDatabasePrivileges() {
        return databasePrivileges;
    }

    public QueryAccountDetailsResponse setDatabasePrivileges(List<DatabasePrivilege> databasePrivileges) {
        this.databasePrivileges = databasePrivileges;
        return this;
    }

    public String getType() {
        return type;
    }

    public QueryAccountDetailsResponse setType(String type) {
        this.type = type;
        return this;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public QueryAccountDetailsResponse setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
        return this;
    }

    public String getSuperUserFlag() {
        return superUserFlag;
    }

    public QueryAccountDetailsResponse setSuperUserFlag(String superUserFlag) {
        this.superUserFlag = superUserFlag;
        return this;
    }

    public String getAccountType() {
        return accountType;
    }

    public QueryAccountDetailsResponse setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public QueryAccountDetailsResponse setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public QueryAccountDetailsResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getEtag() {
        return etag;
    }

    public QueryAccountDetailsResponse setEtag(String etag) {
        this.etag = etag;
        return this;
    }

    @Override
    public String toString() {
        return "QueryAccountDetailsResponse{" + "accountName=" + accountName + "\n" + "databasePrivileges=" + databasePrivileges + "\n" + "type=" + type + "\n" + "accountStatus="
                + accountStatus + "\n" + "superUserFlag=" + superUserFlag + "\n" + "accountType=" + accountType + "\n" + "desc=" + desc + "\n" + "status=" + status + "\n"
                + "etag=" + etag + "\n" + "}";
    }

}
