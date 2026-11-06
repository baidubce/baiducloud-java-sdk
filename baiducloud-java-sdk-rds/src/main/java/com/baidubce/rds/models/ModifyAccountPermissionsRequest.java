package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyAccountPermissionsRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * accountName
    */
    @JsonIgnore
    private String accountName;

    /**
    * 具体的数据库权，为具体的一个库添加权限。MySQL和SQL Server实例可设置此项。
    */
    private List<DatabasePrivilege> databasePrivileges;

    public String getInstanceId() {
        return instanceId;
    }

    public ModifyAccountPermissionsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getAccountName() {
        return accountName;
    }

    public ModifyAccountPermissionsRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    public List<DatabasePrivilege> getDatabasePrivileges() {
        return databasePrivileges;
    }

    public ModifyAccountPermissionsRequest setDatabasePrivileges(List<DatabasePrivilege> databasePrivileges) {
        this.databasePrivileges = databasePrivileges;
        return this;
    }

}
