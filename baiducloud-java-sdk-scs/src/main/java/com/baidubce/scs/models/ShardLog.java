package com.baidubce.scs.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShardLog {
    /**
     * 分片ID
     */
    private String shardShowId;

    /**
     * 总数
     */
    private Integer totalNum;

    /**
     * 分片日志列表
     */
    private List<LogItem> logItem;

    /**
     * 分片数字ID
     */
    private Integer shardId;

    public ShardLog setShardShowId(String shardShowId) {
        this.shardShowId = shardShowId;
        return this;
    }

    public String getShardShowId() {
        return this.shardShowId;
    }

    public ShardLog setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    public Integer getTotalNum() {
        return this.totalNum;
    }

    public ShardLog setLogItem(List<LogItem> logItem) {
        this.logItem = logItem;
        return this;
    }

    public List<LogItem> getLogItem() {
        return this.logItem;
    }

    public ShardLog setShardId(Integer shardId) {
        this.shardId = shardId;
        return this;
    }

    public Integer getShardId() {
        return this.shardId;
    }

    @Override
    public String toString() {
        return "ShardLog{" + "shardShowId=" + shardShowId + "\n" + "totalNum=" + totalNum + "\n" + "logItem=" + logItem + "\n" + "shardId=" + shardId + "\n" + "}";
    }

}