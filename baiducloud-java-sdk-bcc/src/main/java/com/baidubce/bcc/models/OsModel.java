package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OsModel {
    /**
     * 实例ID
     */
    private String instanceId;

    /**
     * 操作系统架构
     */
    private String osArch;

    /**
     * 操作系统名称
     */
    private String osName;

    /**
     * 操作系统版本
     */
    private String osVersion;

    /**
     * 操作系统类型，如linux、windows
     */
    private String osType;

    /**
     * 操作系统语言
     */
    private String osLang;

    /**
     * 特殊版本信息
     */
    private String specialVersion;

    public OsModel setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public OsModel setOsArch(String osArch) {
        this.osArch = osArch;
        return this;
    }

    public String getOsArch() {
        return this.osArch;
    }

    public OsModel setOsName(String osName) {
        this.osName = osName;
        return this;
    }

    public String getOsName() {
        return this.osName;
    }

    public OsModel setOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public OsModel setOsType(String osType) {
        this.osType = osType;
        return this;
    }

    public String getOsType() {
        return this.osType;
    }

    public OsModel setOsLang(String osLang) {
        this.osLang = osLang;
        return this;
    }

    public String getOsLang() {
        return this.osLang;
    }

    public OsModel setSpecialVersion(String specialVersion) {
        this.specialVersion = specialVersion;
        return this;
    }

    public String getSpecialVersion() {
        return this.specialVersion;
    }

    @Override
    public String toString() {
        return "OsModel{" + "instanceId=" + instanceId + "\n" + "osArch=" + osArch + "\n" + "osName=" + osName + "\n" + "osVersion=" + osVersion + "\n" + "osType=" + osType + "\n"
                + "osLang=" + osLang + "\n" + "specialVersion=" + specialVersion + "\n" + "}";
    }

}