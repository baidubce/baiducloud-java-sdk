package com.baidubce.scs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShardBandwidth {
    /**
     * 分片hashName
     */
    private String shardName;

    /**
     * 当前分片带宽大小，不能小于默认带宽。增量带宽额外收费。单位：MB。
     */
    private Integer nodeBandwidthInMB;

    public ShardBandwidth setShardName(String shardName) {
        this.shardName = shardName;
        return this;
    }

    public String getShardName() {
        return this.shardName;
    }

    public ShardBandwidth setNodeBandwidthInMB(Integer nodeBandwidthInMB) {
        this.nodeBandwidthInMB = nodeBandwidthInMB;
        return this;
    }

    public Integer getNodeBandwidthInMB() {
        return this.nodeBandwidthInMB;
    }

    @Override
    public String toString() {
        return "ShardBandwidth{" + "shardName=" + shardName + "\n" + "nodeBandwidthInMB=" + nodeBandwidthInMB + "\n" + "}";
    }

}