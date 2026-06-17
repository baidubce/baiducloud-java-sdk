package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateLogStoreRequest extends BaseBceRequest {

    /**
    * 日志组名称，默认default
    */
    private String project;

    /**
    * 日志集名称
    */
    private String logStoreName;

    /**
    * 日志集的租期，最大3650天，表示永久保存。单位：天数
    */
    private Integer retention;

    /**
    * 待创建的标签列表，具体参数格式参见下述
    */
    private List<Tag> tags;

    /**
    * index
    */
    private Index index;

    /**
    * 日志集初始shard数量，默认为1，最大值为50
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
    * 是否开启热存
    */
    private Boolean enableHotRetention;

    public String getProject() {
        return project;
    }

    public CreateLogStoreRequest setProject(String project) {
        this.project = project;
        return this;
    }

    public String getLogStoreName() {
        return logStoreName;
    }

    public CreateLogStoreRequest setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }

    public Integer getRetention() {
        return retention;
    }

    public CreateLogStoreRequest setRetention(Integer retention) {
        this.retention = retention;
        return this;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public CreateLogStoreRequest setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public Index getIndex() {
        return index;
    }

    public CreateLogStoreRequest setIndex(Index index) {
        this.index = index;
        return this;
    }

    public Integer getShardCount() {
        return shardCount;
    }

    public CreateLogStoreRequest setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
        return this;
    }

    public Integer getMaxShardCount() {
        return maxShardCount;
    }

    public CreateLogStoreRequest setMaxShardCount(Integer maxShardCount) {
        this.maxShardCount = maxShardCount;
        return this;
    }

    public Boolean getDisableShardAutoSplit() {
        return disableShardAutoSplit;
    }

    public CreateLogStoreRequest setDisableShardAutoSplit(Boolean disableShardAutoSplit) {
        this.disableShardAutoSplit = disableShardAutoSplit;
        return this;
    }

    public Boolean getIndexEnabled() {
        return indexEnabled;
    }

    public CreateLogStoreRequest setIndexEnabled(Boolean indexEnabled) {
        this.indexEnabled = indexEnabled;
        return this;
    }

    public Integer getHotRetention() {
        return hotRetention;
    }

    public CreateLogStoreRequest setHotRetention(Integer hotRetention) {
        this.hotRetention = hotRetention;
        return this;
    }

    public Boolean getEnableHotRetention() {
        return enableHotRetention;
    }

    public CreateLogStoreRequest setEnableHotRetention(Boolean enableHotRetention) {
        this.enableHotRetention = enableHotRetention;
        return this;
    }

}
