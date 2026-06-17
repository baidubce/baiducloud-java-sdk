package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateLogStoreRequest extends BaseBceRequest {

    /**
    * logStoreName
    */
    @JsonIgnore
    private String logStoreName;

    /**
    * project
    */
    @JsonIgnore
    private String project;

    /**
    * 日志集的租期，最大3650天，表示永久保存。单位：天数
    */
    private Integer retention;

    /**
    * 待创建的标签列表，具体参数格式参见下述
    */
    private List<Tag> tags;

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

    public String getLogStoreName() {
        return logStoreName;
    }

    public UpdateLogStoreRequest setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }

    public String getProject() {
        return project;
    }

    public UpdateLogStoreRequest setProject(String project) {
        this.project = project;
        return this;
    }

    public Integer getRetention() {
        return retention;
    }

    public UpdateLogStoreRequest setRetention(Integer retention) {
        this.retention = retention;
        return this;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public UpdateLogStoreRequest setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public Integer getShardCount() {
        return shardCount;
    }

    public UpdateLogStoreRequest setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
        return this;
    }

    public Integer getMaxShardCount() {
        return maxShardCount;
    }

    public UpdateLogStoreRequest setMaxShardCount(Integer maxShardCount) {
        this.maxShardCount = maxShardCount;
        return this;
    }

    public Boolean getDisableShardAutoSplit() {
        return disableShardAutoSplit;
    }

    public UpdateLogStoreRequest setDisableShardAutoSplit(Boolean disableShardAutoSplit) {
        this.disableShardAutoSplit = disableShardAutoSplit;
        return this;
    }

    public Boolean getIndexEnabled() {
        return indexEnabled;
    }

    public UpdateLogStoreRequest setIndexEnabled(Boolean indexEnabled) {
        this.indexEnabled = indexEnabled;
        return this;
    }

    public Integer getHotRetention() {
        return hotRetention;
    }

    public UpdateLogStoreRequest setHotRetention(Integer hotRetention) {
        this.hotRetention = hotRetention;
        return this;
    }

}
