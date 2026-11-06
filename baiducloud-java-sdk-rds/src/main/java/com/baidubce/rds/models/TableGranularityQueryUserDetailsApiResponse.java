package com.baidubce.rds.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TableGranularityQueryUserDetailsApiResponse extends BaseBceResponse {

    /**
    * 账号名
    */
    private String user;

    /**
    * 来源主机
    */
    private String host;

    /**
    * 密码（一般不返回明文）
    */
    private String password;

    /**
    * 账号类型
    */
    private String type;

    /**
    * 是否超级用户
    */
    private String superUserFlag;

    /**
    * 备注
    */
    private String remark;

    /**
    * privilege
    */
    private TableLevelPrivilegeRequest privilege;

    public String getUser() {
        return user;
    }

    public TableGranularityQueryUserDetailsApiResponse setUser(String user) {
        this.user = user;
        return this;
    }

    public String getHost() {
        return host;
    }

    public TableGranularityQueryUserDetailsApiResponse setHost(String host) {
        this.host = host;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public TableGranularityQueryUserDetailsApiResponse setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getType() {
        return type;
    }

    public TableGranularityQueryUserDetailsApiResponse setType(String type) {
        this.type = type;
        return this;
    }

    public String getSuperUserFlag() {
        return superUserFlag;
    }

    public TableGranularityQueryUserDetailsApiResponse setSuperUserFlag(String superUserFlag) {
        this.superUserFlag = superUserFlag;
        return this;
    }

    public String getRemark() {
        return remark;
    }

    public TableGranularityQueryUserDetailsApiResponse setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    public TableLevelPrivilegeRequest getPrivilege() {
        return privilege;
    }

    public TableGranularityQueryUserDetailsApiResponse setPrivilege(TableLevelPrivilegeRequest privilege) {
        this.privilege = privilege;
        return this;
    }

    @Override
    public String toString() {
        return "TableGranularityQueryUserDetailsApiResponse{" + "user=" + user + "\n" + "host=" + host + "\n" + "password=" + password + "\n" + "type=" + type + "\n"
                + "superUserFlag=" + superUserFlag + "\n" + "remark=" + remark + "\n" + "privilege=" + privilege + "\n" + "}";
    }

}
