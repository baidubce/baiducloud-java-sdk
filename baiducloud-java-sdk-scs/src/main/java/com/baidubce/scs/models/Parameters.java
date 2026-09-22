package com.baidubce.scs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Parameters {
    /**
     * 参数名称（可参考系统模版）
     */
    private String confName;

    /**
     * 参数默认值
     */
    private String confDefault;

    /**
     * 参数值（可修改对应的值，可参考系统模版在confRange的允许范围内修改）
     */
    private String confValue;

    /**
     * 参数类型（可参考系统模版）
     */
    private Integer confType;

    /**
     * 
     */
    private String confRange;

    /**
     * 可参考系统模版
     */
    private Integer confModule;

    /**
     * 配置对用户展示含义(转码后的一串字符)
     */
    private String confDesc;

    /**
     * 该参数是否需要重启，0：不需要，1：需要
     */
    private Integer needReboot;

    /**
     * 参数对应的redis版本。例如：2.6、3.2、 4.0、 all
     */
    private String confRedisVersion;

    /**
     * 生效redis version（和VERSION_TYPE保持一致）
     */
    private Integer confCacheVersion;

    /**
     * 用户是否可见（0 可见， 1 不可见）
     */
    private Integer confUserVisible;

    public Parameters setConfName(String confName) {
        this.confName = confName;
        return this;
    }

    public String getConfName() {
        return this.confName;
    }

    public Parameters setConfDefault(String confDefault) {
        this.confDefault = confDefault;
        return this;
    }

    public String getConfDefault() {
        return this.confDefault;
    }

    public Parameters setConfValue(String confValue) {
        this.confValue = confValue;
        return this;
    }

    public String getConfValue() {
        return this.confValue;
    }

    public Parameters setConfType(Integer confType) {
        this.confType = confType;
        return this;
    }

    public Integer getConfType() {
        return this.confType;
    }

    public Parameters setConfRange(String confRange) {
        this.confRange = confRange;
        return this;
    }

    public String getConfRange() {
        return this.confRange;
    }

    public Parameters setConfModule(Integer confModule) {
        this.confModule = confModule;
        return this;
    }

    public Integer getConfModule() {
        return this.confModule;
    }

    public Parameters setConfDesc(String confDesc) {
        this.confDesc = confDesc;
        return this;
    }

    public String getConfDesc() {
        return this.confDesc;
    }

    public Parameters setNeedReboot(Integer needReboot) {
        this.needReboot = needReboot;
        return this;
    }

    public Integer getNeedReboot() {
        return this.needReboot;
    }

    public Parameters setConfRedisVersion(String confRedisVersion) {
        this.confRedisVersion = confRedisVersion;
        return this;
    }

    public String getConfRedisVersion() {
        return this.confRedisVersion;
    }

    public Parameters setConfCacheVersion(Integer confCacheVersion) {
        this.confCacheVersion = confCacheVersion;
        return this;
    }

    public Integer getConfCacheVersion() {
        return this.confCacheVersion;
    }

    public Parameters setConfUserVisible(Integer confUserVisible) {
        this.confUserVisible = confUserVisible;
        return this;
    }

    public Integer getConfUserVisible() {
        return this.confUserVisible;
    }

    @Override
    public String toString() {
        return "Parameters{" + "confName=" + confName + "\n" + "confDefault=" + confDefault + "\n" + "confValue=" + confValue + "\n" + "confType=" + confType + "\n" + "confRange="
                + confRange + "\n" + "confModule=" + confModule + "\n" + "confDesc=" + confDesc + "\n" + "needReboot=" + needReboot + "\n" + "confRedisVersion=" + confRedisVersion
                + "\n" + "confCacheVersion=" + confCacheVersion + "\n" + "confUserVisible=" + confUserVisible + "\n" + "}";
    }

}