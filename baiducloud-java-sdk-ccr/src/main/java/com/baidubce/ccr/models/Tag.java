package com.baidubce.ccr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Tag {
    /**
     * 镜像仓库（repository）架构
     */
    private String architecture;

    /**
     * 发布者
     */
    private String author;

    /**
     * 制品 Hash 值
     */
    private String digest;

    /**
     * 操作系统类型
     */
    private String os;

    /**
     * 制品所属命名空间 ID
     */
    private Integer projectId;

    /**
     * Tag 最新拉取时间，格式为 `date-time`
     */
    private String pullTime;

    /**
     * Tag 推送时间，格式为 `date-time`
     */
    private String pushTime;

    /**
     * 制品所属镜像仓库 ID
     */
    private Integer repositoryId;

    /**
     * scanOverview
     */
    private TagScanOverview scanOverview;

    /**
     * 制品大小
     */
    private Integer size;

    /**
     * Tag 名称
     */
    private String tagName;

    /**
     * 制品类别，可选值：`image`、`chart`
     */
    private String type;

    public Tag setArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    public String getArchitecture() {
        return this.architecture;
    }

    public Tag setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getAuthor() {
        return this.author;
    }

    public Tag setDigest(String digest) {
        this.digest = digest;
        return this;
    }

    public String getDigest() {
        return this.digest;
    }

    public Tag setOs(String os) {
        this.os = os;
        return this;
    }

    public String getOs() {
        return this.os;
    }

    public Tag setProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }

    public Integer getProjectId() {
        return this.projectId;
    }

    public Tag setPullTime(String pullTime) {
        this.pullTime = pullTime;
        return this;
    }

    public String getPullTime() {
        return this.pullTime;
    }

    public Tag setPushTime(String pushTime) {
        this.pushTime = pushTime;
        return this;
    }

    public String getPushTime() {
        return this.pushTime;
    }

    public Tag setRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    public Integer getRepositoryId() {
        return this.repositoryId;
    }

    public Tag setScanOverview(TagScanOverview scanOverview) {
        this.scanOverview = scanOverview;
        return this;
    }

    public TagScanOverview getScanOverview() {
        return this.scanOverview;
    }

    public Tag setSize(Integer size) {
        this.size = size;
        return this;
    }

    public Integer getSize() {
        return this.size;
    }

    public Tag setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

    public String getTagName() {
        return this.tagName;
    }

    public Tag setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "Tag{" + "architecture=" + architecture + "\n" + "author=" + author + "\n" + "digest=" + digest + "\n" + "os=" + os + "\n" + "projectId=" + projectId + "\n"
                + "pullTime=" + pullTime + "\n" + "pushTime=" + pushTime + "\n" + "repositoryId=" + repositoryId + "\n" + "scanOverview=" + scanOverview + "\n" + "size=" + size
                + "\n" + "tagName=" + tagName + "\n" + "type=" + type + "\n" + "}";
    }

}