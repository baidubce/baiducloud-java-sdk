package com.baidubce.ccr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ArtifactScanOverview {
    /**
     * 缺陷简介
     */
    private String description;

    /**
     * 修复版本
     */
    private String fixVersion;

    /**
     * 缺陷码
     */
    private String id;

    /**
     * 缺陷详情页面链接
     */
    private List<String> links;

    /**
     * 组件
     */
    @JsonProperty("package")
    private String ccrPackage;

    /**
     * 严重程度
     */
    private String severity;

    /**
     * 当前版本
     */
    private String version;

    public ArtifactScanOverview setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public ArtifactScanOverview setFixVersion(String fixVersion) {
        this.fixVersion = fixVersion;
        return this;
    }

    public String getFixVersion() {
        return this.fixVersion;
    }

    public ArtifactScanOverview setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public ArtifactScanOverview setLinks(List<String> links) {
        this.links = links;
        return this;
    }

    public List<String> getLinks() {
        return this.links;
    }

    public ArtifactScanOverview setPackage(String ccrPackage) {
        this.ccrPackage = ccrPackage;
        return this;
    }

    public String getPackage() {
        return this.ccrPackage;
    }

    public ArtifactScanOverview setSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    public String getSeverity() {
        return this.severity;
    }

    public ArtifactScanOverview setVersion(String version) {
        this.version = version;
        return this;
    }

    public String getVersion() {
        return this.version;
    }

    @Override
    public String toString() {
        return "ArtifactScanOverview{" + "description=" + description + "\n" + "fixVersion=" + fixVersion + "\n" + "id=" + id + "\n" + "links=" + links + "\n" + "ccrPackage="
                + ccrPackage + "\n" + "severity=" + severity + "\n" + "version=" + version + "\n" + "}";
    }

}