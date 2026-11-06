package com.baidubce.rds.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TableLevelAccountListResponse {
    /**
     * 账号名
     */
    private String user;

    /**
     * 来源主机
     */
    private String host;

    /**
     * 账号状态
     */
    private String status;

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
     * 是否支持 BNS，默认 `false`
     */
    private Boolean supportBns;

    /**
     * 读写标识
     */
    private String wrFlag;

    public TableLevelAccountListResponse setUser(String user) {
        this.user = user;
        return this;
    }

    public String getUser() {
        return this.user;
    }

    public TableLevelAccountListResponse setHost(String host) {
        this.host = host;
        return this;
    }

    public String getHost() {
        return this.host;
    }

    public TableLevelAccountListResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public TableLevelAccountListResponse setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public TableLevelAccountListResponse setSuperUserFlag(String superUserFlag) {
        this.superUserFlag = superUserFlag;
        return this;
    }

    public String getSuperUserFlag() {
        return this.superUserFlag;
    }

    public TableLevelAccountListResponse setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    public String getRemark() {
        return this.remark;
    }

    public TableLevelAccountListResponse setSupportBns(Boolean supportBns) {
        this.supportBns = supportBns;
        return this;
    }

    public Boolean getSupportBns() {
        return this.supportBns;
    }

    public TableLevelAccountListResponse setWrFlag(String wrFlag) {
        this.wrFlag = wrFlag;
        return this;
    }

    public String getWrFlag() {
        return this.wrFlag;
    }

    @Override
    public String toString() {
        return "TableLevelAccountListResponse{" + "user=" + user + "\n" + "host=" + host + "\n" + "status=" + status + "\n" + "type=" + type + "\n" + "superUserFlag="
                + superUserFlag + "\n" + "remark=" + remark + "\n" + "supportBns=" + supportBns + "\n" + "wrFlag=" + wrFlag + "\n" + "}";
    }

}