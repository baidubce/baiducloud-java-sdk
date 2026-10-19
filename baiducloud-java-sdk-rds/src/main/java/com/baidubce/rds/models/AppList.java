package com.baidubce.rds.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppList {
    /**
     * 只读实例ID。
     */
    private String appId;

    /**
     * 只读实例名称。
     */
    private String appName;

    /**
     * 只读实例权重。
     */
    private Integer weight;

    /**
     * 只读组ID。
     */
    private String roGroupId;

    /**
     * 资源ID。
     */
    private String sourceAppId;

    /**
     * 
     */
    private String status;

    /**
     * 创建时间。
     */
    private String createTime;

    /**
     * 更新时间。
     */
    private String updateTime;

    /**
     * 只读实例状态，参见[实例状态表](/doc/RDS/s/9jwvz0wd3#%E5%AE%9E%E4%BE%8B%E7%8A%B6%E6%80%81)。
     */
    private String appStatus;

    /**
     * 只读实例短ID。
     */
    private String appIdShort;

    public AppList setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getAppId() {
        return this.appId;
    }

    public AppList setAppName(String appName) {
        this.appName = appName;
        return this;
    }

    public String getAppName() {
        return this.appName;
    }

    public AppList setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public AppList setRoGroupId(String roGroupId) {
        this.roGroupId = roGroupId;
        return this;
    }

    public String getRoGroupId() {
        return this.roGroupId;
    }

    public AppList setSourceAppId(String sourceAppId) {
        this.sourceAppId = sourceAppId;
        return this;
    }

    public String getSourceAppId() {
        return this.sourceAppId;
    }

    public AppList setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public AppList setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public AppList setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public AppList setAppStatus(String appStatus) {
        this.appStatus = appStatus;
        return this;
    }

    public String getAppStatus() {
        return this.appStatus;
    }

    public AppList setAppIdShort(String appIdShort) {
        this.appIdShort = appIdShort;
        return this;
    }

    public String getAppIdShort() {
        return this.appIdShort;
    }

    @Override
    public String toString() {
        return "AppList{" + "appId=" + appId + "\n" + "appName=" + appName + "\n" + "weight=" + weight + "\n" + "roGroupId=" + roGroupId + "\n" + "sourceAppId=" + sourceAppId
                + "\n" + "status=" + status + "\n" + "createTime=" + createTime + "\n" + "updateTime=" + updateTime + "\n" + "appStatus=" + appStatus + "\n" + "appIdShort="
                + appIdShort + "\n" + "}";
    }

}