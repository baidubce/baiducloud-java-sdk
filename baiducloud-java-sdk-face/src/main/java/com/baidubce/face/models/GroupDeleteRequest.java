package com.baidubce.face.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupDeleteRequest extends BaseBceRequest {

    /**
    * 用户组ID，标识一组用户（由数字、字母、下划线组成），长度限48B
    */
    @JsonProperty("group_id")
    private String groupId;

    public String getGroupId() {
        return groupId;
    }

    public GroupDeleteRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

}
