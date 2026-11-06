package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAccountRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 账号名称，不能为保留关键字，由小写字母、数字、下划线组成、字母开头，字母或数字结尾，最长16个字符。
    */
    private String accountName;

    /**
    * 账号的密码，由字母、数字或下划线组成，长度6～32位。 密码需要加密传输，禁止明文传输，详情请参考密码加密传输规范定义
    */
    private String password;

    /**
    * 账号权限类型 Common：普通账号,Super：super账号。不传递此参数默认:普通账号详情参考
    */
    private String accountType;

    /**
    * MySQL和SQL Server实例可设置此项
    */
    private List<DatabasePrivilege> databasePrivileges;

    /**
    * 账号的描述信息
    */
    private String desc;

    /**
    * 账号归属类型： OnlyMaster：主实例上使用的账号,RdsProxy：该主实例对应的代理实例上使用的账号，默认为OnlyMaster账号，详情参考
    */
    private String type;

    public String getInstanceId() {
        return instanceId;
    }

    public CreateAccountRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getAccountName() {
        return accountName;
    }

    public CreateAccountRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public CreateAccountRequest setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getAccountType() {
        return accountType;
    }

    public CreateAccountRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }

    public List<DatabasePrivilege> getDatabasePrivileges() {
        return databasePrivileges;
    }

    public CreateAccountRequest setDatabasePrivileges(List<DatabasePrivilege> databasePrivileges) {
        this.databasePrivileges = databasePrivileges;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public CreateAccountRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getType() {
        return type;
    }

    public CreateAccountRequest setType(String type) {
        this.type = type;
        return this;
    }

}
