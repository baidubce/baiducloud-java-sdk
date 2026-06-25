package com.baidubce.cprom.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MonitorInstance {
    /**
     * 监控实例ID
     */
    private String instanceId;

    /**
     * 监控实例名字
     */
    private String instanceName;

    /**
     * 实例规格类型，默认为基础版"free-v1"，可选值：advance-v1，advance-v2，free-v1
     */
    private String instanceSpec;

    /**
     * 监控实例类型，默认为CCE，代表CCE型监控实例，可选值：CCE、BCM
     */
    private String instanceType;

    /**
     * 数据存储时长，示例格式: 15d
     */
    private String retentionPeriod;

    /**
     * 监控实例创建时间（0时区），格式: 2025-02-05T08:14:23Z
     */
    private String createTime;

    /**
     * Grafana ID
     */
    private String grafanaId;

    /**
     * Grafana名称
     */
    private String grafanaName;

    /**
     * status
     */
    private Status status;

    public MonitorInstance setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public MonitorInstance setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public MonitorInstance setInstanceSpec(String instanceSpec) {
        this.instanceSpec = instanceSpec;
        return this;
    }

    public String getInstanceSpec() {
        return this.instanceSpec;
    }

    public MonitorInstance setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    public String getInstanceType() {
        return this.instanceType;
    }

    public MonitorInstance setRetentionPeriod(String retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
        return this;
    }

    public String getRetentionPeriod() {
        return this.retentionPeriod;
    }

    public MonitorInstance setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public MonitorInstance setGrafanaId(String grafanaId) {
        this.grafanaId = grafanaId;
        return this;
    }

    public String getGrafanaId() {
        return this.grafanaId;
    }

    public MonitorInstance setGrafanaName(String grafanaName) {
        this.grafanaName = grafanaName;
        return this;
    }

    public String getGrafanaName() {
        return this.grafanaName;
    }

    public MonitorInstance setStatus(Status status) {
        this.status = status;
        return this;
    }

    public Status getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        return "MonitorInstance{" + "instanceId=" + instanceId + "\n" + "instanceName=" + instanceName + "\n" + "instanceSpec=" + instanceSpec + "\n" + "instanceType="
                + instanceType + "\n" + "retentionPeriod=" + retentionPeriod + "\n" + "createTime=" + createTime + "\n" + "grafanaId=" + grafanaId + "\n" + "grafanaName="
                + grafanaName + "\n" + "status=" + status + "\n" + "}";
    }

}