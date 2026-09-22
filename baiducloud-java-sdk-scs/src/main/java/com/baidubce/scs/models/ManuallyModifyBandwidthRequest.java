package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ManuallyModifyBandwidthRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 分片带宽列表。
    */
    private List<ShardBandwidth> shardBandwidthInfo;

    public String getInstanceId() {
        return instanceId;
    }

    public ManuallyModifyBandwidthRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public List<ShardBandwidth> getShardBandwidthInfo() {
        return shardBandwidthInfo;
    }

    public ManuallyModifyBandwidthRequest setShardBandwidthInfo(List<ShardBandwidth> shardBandwidthInfo) {
        this.shardBandwidthInfo = shardBandwidthInfo;
        return this;
    }

}
