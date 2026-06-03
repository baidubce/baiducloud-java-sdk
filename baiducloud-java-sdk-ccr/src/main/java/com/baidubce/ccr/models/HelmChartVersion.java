package com.baidubce.ccr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HelmChartVersion {
    /**
     * Chart 包的名称
     */
    private String name;

    /**
     * 描述信息
     */
    private String description;

    /**
     * API 版本号
     */
    private String apiVersion;

    /**
     * 包含的应用程序版本
     */
    private String appVersion;

    /**
     * Chart 包版本号
     */
    private String version;

    /**
     * Chart 包文件的 URL 列表
     */
    private List<String> urls;

    /**
     * Chart 摘要
     */
    private String digest;

    /**
     * 模板引擎名称
     */
    private String engine;

    /**
     * Chart 主页的 URL 地址
     */
    private String home;

    /**
     * Chart 图标的地址
     */
    private String icon;

    /**
     * Chart 包含的源代码 URL 列表
     */
    private List<String> sources;

    /**
     * 版本创建时间
     */
    private String created;

    /**
     * 是否弃用
     */
    private Boolean deprecated;

    /**
     * 是否删除
     */
    private Boolean removed;

    /**
     * 维护者信息
     */
    private List<String> maintainers;

    public HelmChartVersion setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public HelmChartVersion setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public HelmChartVersion setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public String getApiVersion() {
        return this.apiVersion;
    }

    public HelmChartVersion setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public HelmChartVersion setVersion(String version) {
        this.version = version;
        return this;
    }

    public String getVersion() {
        return this.version;
    }

    public HelmChartVersion setUrls(List<String> urls) {
        this.urls = urls;
        return this;
    }

    public List<String> getUrls() {
        return this.urls;
    }

    public HelmChartVersion setDigest(String digest) {
        this.digest = digest;
        return this;
    }

    public String getDigest() {
        return this.digest;
    }

    public HelmChartVersion setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public String getEngine() {
        return this.engine;
    }

    public HelmChartVersion setHome(String home) {
        this.home = home;
        return this;
    }

    public String getHome() {
        return this.home;
    }

    public HelmChartVersion setIcon(String icon) {
        this.icon = icon;
        return this;
    }

    public String getIcon() {
        return this.icon;
    }

    public HelmChartVersion setSources(List<String> sources) {
        this.sources = sources;
        return this;
    }

    public List<String> getSources() {
        return this.sources;
    }

    public HelmChartVersion setCreated(String created) {
        this.created = created;
        return this;
    }

    public String getCreated() {
        return this.created;
    }

    public HelmChartVersion setDeprecated(Boolean deprecated) {
        this.deprecated = deprecated;
        return this;
    }

    public Boolean getDeprecated() {
        return this.deprecated;
    }

    public HelmChartVersion setRemoved(Boolean removed) {
        this.removed = removed;
        return this;
    }

    public Boolean getRemoved() {
        return this.removed;
    }

    public HelmChartVersion setMaintainers(List<String> maintainers) {
        this.maintainers = maintainers;
        return this;
    }

    public List<String> getMaintainers() {
        return this.maintainers;
    }

    @Override
    public String toString() {
        return "HelmChartVersion{" + "name=" + name + "\n" + "description=" + description + "\n" + "apiVersion=" + apiVersion + "\n" + "appVersion=" + appVersion + "\n"
                + "version=" + version + "\n" + "urls=" + urls + "\n" + "digest=" + digest + "\n" + "engine=" + engine + "\n" + "home=" + home + "\n" + "icon=" + icon + "\n"
                + "sources=" + sources + "\n" + "created=" + created + "\n" + "deprecated=" + deprecated + "\n" + "removed=" + removed + "\n" + "maintainers=" + maintainers + "\n"
                + "}";
    }

}