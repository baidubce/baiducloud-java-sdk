package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateInstanceRequest extends BaseBceRequest {

    /**
    * 实例名称
    */
    private String instanceName;

    /**
    * 监控实例类型，默认为CCE，代表CCE型监控实例，可选值：CCE、BCM
    */
    private String instanceType;

    /**
    * 实例规格类型，默认为基础版"free-v1"，可选值：advance-v1，advance-v2，free-v1
    */
    private String instanceSpec;

    /**
    * 数据存储时长，默认值为 `15d`。
    */
    private String retentionPeriod;

    /**
    * 是否需要创建 Grafana。当前地域无 Grafana 实例时可创建，一个地域仅能创建一个 Grafana 实例。
    */
    private Boolean needGrafana;

    /**
    * 当 `needGrafana=true` 时提供，Grafana 名称，默认值为 `admin`。
    */
    private String grafanaName;

    /**
    * 当 `needGrafana=true` 时提供，Grafana 密码长度为 8~32 位，且必须同时包含英文、数字和符号，符号仅限 `!@#$%^*()`。
    */
    private String grafanaAdminPassword;

    public String getInstanceName() {
        return instanceName;
    }

    public CreateInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public CreateInstanceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    public String getInstanceSpec() {
        return instanceSpec;
    }

    public CreateInstanceRequest setInstanceSpec(String instanceSpec) {
        this.instanceSpec = instanceSpec;
        return this;
    }

    public String getRetentionPeriod() {
        return retentionPeriod;
    }

    public CreateInstanceRequest setRetentionPeriod(String retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
        return this;
    }

    public Boolean getNeedGrafana() {
        return needGrafana;
    }

    public CreateInstanceRequest setNeedGrafana(Boolean needGrafana) {
        this.needGrafana = needGrafana;
        return this;
    }

    public String getGrafanaName() {
        return grafanaName;
    }

    public CreateInstanceRequest setGrafanaName(String grafanaName) {
        this.grafanaName = grafanaName;
        return this;
    }

    public String getGrafanaAdminPassword() {
        return grafanaAdminPassword;
    }

    public CreateInstanceRequest setGrafanaAdminPassword(String grafanaAdminPassword) {
        this.grafanaAdminPassword = grafanaAdminPassword;
        return this;
    }

}
