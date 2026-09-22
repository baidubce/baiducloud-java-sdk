package com.baidubce.face.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDeleteRequest extends BaseBceRequest {

    /**
    * 用户组ID(由数字、字母、下划线组成，长度限制48B) ，如传入"@ALL"则从所有组中删除用户
    */
    @JsonProperty("group_id")
    private String groupId;

    /**
    * 用户ID（由数字、字母、下划线组成），长度限制48B
    */
    @JsonProperty("user_id")
    private String userId;

    public String getGroupId() {
        return groupId;
    }

    public UserDeleteRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public UserDeleteRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }

}
