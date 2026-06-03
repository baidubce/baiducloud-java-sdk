package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetTagDetailResponse extends BaseBceResponse {

    /**
    * 镜像仓库(repository)架构
    */
    private String architecture;

    /**
    * 发布者
    */
    private String author;

    /**
    * 制品hash值
    */
    private String digest;

    /**
    * 操作系统类型
    */
    private String os;

    /**
    * 制品所属的命名空间ID
    */
    private Integer projectId;

    /**
    * Tag最新的拉取时间，格式为date-time
    */
    private String pullTime;

    /**
    * Tag推送时间，格式为date-time
    */
    private String pushTime;

    /**
    * 制品所属的镜像仓库ID
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
    * Tag名称
    */
    private String tagName;

    /**
    * 制品类别，例如：image，chart
    */
    private String type;

    public String getArchitecture() {
        return architecture;
    }

    public GetTagDetailResponse setArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public GetTagDetailResponse setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getDigest() {
        return digest;
    }

    public GetTagDetailResponse setDigest(String digest) {
        this.digest = digest;
        return this;
    }

    public String getOs() {
        return os;
    }

    public GetTagDetailResponse setOs(String os) {
        this.os = os;
        return this;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public GetTagDetailResponse setProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }

    public String getPullTime() {
        return pullTime;
    }

    public GetTagDetailResponse setPullTime(String pullTime) {
        this.pullTime = pullTime;
        return this;
    }

    public String getPushTime() {
        return pushTime;
    }

    public GetTagDetailResponse setPushTime(String pushTime) {
        this.pushTime = pushTime;
        return this;
    }

    public Integer getRepositoryId() {
        return repositoryId;
    }

    public GetTagDetailResponse setRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    public TagScanOverview getScanOverview() {
        return scanOverview;
    }

    public GetTagDetailResponse setScanOverview(TagScanOverview scanOverview) {
        this.scanOverview = scanOverview;
        return this;
    }

    public Integer getSize() {
        return size;
    }

    public GetTagDetailResponse setSize(Integer size) {
        this.size = size;
        return this;
    }

    public String getTagName() {
        return tagName;
    }

    public GetTagDetailResponse setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

    public String getType() {
        return type;
    }

    public GetTagDetailResponse setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        return "GetTagDetailResponse{" + "architecture=" + architecture + "\n" + "author=" + author + "\n" + "digest=" + digest + "\n" + "os=" + os + "\n" + "projectId="
                + projectId + "\n" + "pullTime=" + pullTime + "\n" + "pushTime=" + pushTime + "\n" + "repositoryId=" + repositoryId + "\n" + "scanOverview=" + scanOverview + "\n"
                + "size=" + size + "\n" + "tagName=" + tagName + "\n" + "type=" + type + "\n" + "}";
    }

}
