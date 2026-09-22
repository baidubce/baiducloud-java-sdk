package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteInstanceWhiteGroupRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * groupName
    */
    @JsonIgnore
    private String groupName;

    public String getInstanceId() {
        return instanceId;
    }

    public DeleteInstanceWhiteGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getGroupName() {
        return groupName;
    }

    public DeleteInstanceWhiteGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

}
