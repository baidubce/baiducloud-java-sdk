package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HotGroupChangeMasterRoleRequest extends BaseBceRequest {

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

    public HotGroupChangeMasterRoleRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public HotGroupChangeMasterRoleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

}
