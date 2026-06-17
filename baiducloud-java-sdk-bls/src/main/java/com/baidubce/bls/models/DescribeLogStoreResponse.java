package com.baidubce.bls.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeLogStoreResponse extends BaseBceResponse {

    /**
    * 请求是否成功
    */
    private Boolean success;

    /**
    * 请求码，成功为OK，错误为具体的错误码
    */
    private String code;

    /**
    * 日志集创建的日期时间
    */
    private String creationDateTime;

    /**
    * 最后修改的日期时间
    */
    private String lastModifiedTime;

    /**
    * 日志组名称
    */
    private String project;

    /**
    * 日志集名称
    */
    private String logStoreName;

    /**
    * 存储时长
    */
    private Integer retention;

    /**
    * 日志短id
    */
    private String shortID;

    /**
    * 分片数量
    */
    private Integer shardCount;

    /**
    * 最大分片数量
    */
    private Integer maxShardCount;

    /**
    * 是否禁止自动分裂
    */
    private Boolean disableShardAutoSplit;

    /**
    * 是否开启索引
    */
    private Boolean indexEnabled;

    /**
    * 热存时长
    */
    private Integer hotRetention;

    /**
    * index
    */
    private Index index;

    public Boolean getSuccess() {
        return success;
    }

    public DescribeLogStoreResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public DescribeLogStoreResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getCreationDateTime() {
        return creationDateTime;
    }

    public DescribeLogStoreResponse setCreationDateTime(String creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    public String getLastModifiedTime() {
        return lastModifiedTime;
    }

    public DescribeLogStoreResponse setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public String getProject() {
        return project;
    }

    public DescribeLogStoreResponse setProject(String project) {
        this.project = project;
        return this;
    }

    public String getLogStoreName() {
        return logStoreName;
    }

    public DescribeLogStoreResponse setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }

    public Integer getRetention() {
        return retention;
    }

    public DescribeLogStoreResponse setRetention(Integer retention) {
        this.retention = retention;
        return this;
    }

    public String getShortID() {
        return shortID;
    }

    public DescribeLogStoreResponse setShortID(String shortID) {
        this.shortID = shortID;
        return this;
    }

    public Integer getShardCount() {
        return shardCount;
    }

    public DescribeLogStoreResponse setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
        return this;
    }

    public Integer getMaxShardCount() {
        return maxShardCount;
    }

    public DescribeLogStoreResponse setMaxShardCount(Integer maxShardCount) {
        this.maxShardCount = maxShardCount;
        return this;
    }

    public Boolean getDisableShardAutoSplit() {
        return disableShardAutoSplit;
    }

    public DescribeLogStoreResponse setDisableShardAutoSplit(Boolean disableShardAutoSplit) {
        this.disableShardAutoSplit = disableShardAutoSplit;
        return this;
    }

    public Boolean getIndexEnabled() {
        return indexEnabled;
    }

    public DescribeLogStoreResponse setIndexEnabled(Boolean indexEnabled) {
        this.indexEnabled = indexEnabled;
        return this;
    }

    public Integer getHotRetention() {
        return hotRetention;
    }

    public DescribeLogStoreResponse setHotRetention(Integer hotRetention) {
        this.hotRetention = hotRetention;
        return this;
    }

    public Index getIndex() {
        return index;
    }

    public DescribeLogStoreResponse setIndex(Index index) {
        this.index = index;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeLogStoreResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "creationDateTime=" + creationDateTime + "\n" + "lastModifiedTime="
                + lastModifiedTime + "\n" + "project=" + project + "\n" + "logStoreName=" + logStoreName + "\n" + "retention=" + retention + "\n" + "shortID=" + shortID + "\n"
                + "shardCount=" + shardCount + "\n" + "maxShardCount=" + maxShardCount + "\n" + "disableShardAutoSplit=" + disableShardAutoSplit + "\n" + "indexEnabled="
                + indexEnabled + "\n" + "hotRetention=" + hotRetention + "\n" + "index=" + index + "\n" + "}";
    }

}
