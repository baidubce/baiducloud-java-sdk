package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MasterSlaveSwitchRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 切换的分片列表。
    */
    private List<SwitchMasterSlaveShard> shards;

    public String getInstanceId() {
        return instanceId;
    }

    public MasterSlaveSwitchRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public List<SwitchMasterSlaveShard> getShards() {
        return shards;
    }

    public MasterSlaveSwitchRequest setShards(List<SwitchMasterSlaveShard> shards) {
        this.shards = shards;
        return this;
    }

}
