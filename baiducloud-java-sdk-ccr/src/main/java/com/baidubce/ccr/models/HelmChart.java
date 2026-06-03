package com.baidubce.ccr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HelmChart {
    /**
     * Chart 名称
     */
    private String name;

    /**
     * 版本个数
     */
    private Integer totalVersions;

    /**
     * 最新版本号
     */
    private String latestVersion;

    /**
     * Chart 主页的 URL 地址
     */
    private String home;

    /**
     * Chart 图标的地址
     */
    private String icon;

    /**
     * 是否弃用
     */
    private Boolean deprecated;

    /**
     * 创建时间
     */
    private String created;

    /**
     * 更新时间
     */
    private String updated;

    public HelmChart setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public HelmChart setTotalVersions(Integer totalVersions) {
        this.totalVersions = totalVersions;
        return this;
    }

    public Integer getTotalVersions() {
        return this.totalVersions;
    }

    public HelmChart setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }

    public String getLatestVersion() {
        return this.latestVersion;
    }

    public HelmChart setHome(String home) {
        this.home = home;
        return this;
    }

    public String getHome() {
        return this.home;
    }

    public HelmChart setIcon(String icon) {
        this.icon = icon;
        return this;
    }

    public String getIcon() {
        return this.icon;
    }

    public HelmChart setDeprecated(Boolean deprecated) {
        this.deprecated = deprecated;
        return this;
    }

    public Boolean getDeprecated() {
        return this.deprecated;
    }

    public HelmChart setCreated(String created) {
        this.created = created;
        return this;
    }

    public String getCreated() {
        return this.created;
    }

    public HelmChart setUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    public String getUpdated() {
        return this.updated;
    }

    @Override
    public String toString() {
        return "HelmChart{" + "name=" + name + "\n" + "totalVersions=" + totalVersions + "\n" + "latestVersion=" + latestVersion + "\n" + "home=" + home + "\n" + "icon=" + icon
                + "\n" + "deprecated=" + deprecated + "\n" + "created=" + created + "\n" + "updated=" + updated + "\n" + "}";
    }

}