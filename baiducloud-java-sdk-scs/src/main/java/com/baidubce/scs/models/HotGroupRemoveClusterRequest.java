package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HotGroupRemoveClusterRequest extends BaseBceRequest {

    /**
    * groupId
    */
    @JsonIgnore
    private String groupId;

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    public String getGroupId() {
        return groupId;
    }

    public HotGroupRemoveClusterRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public HotGroupRemoveClusterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

}
