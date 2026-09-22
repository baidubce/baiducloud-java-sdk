package com.baidubce.face.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserGetRequest extends BaseBceRequest {

    /**
    * 用户ID（由数字、字母、下划线组成），长度限制48B
    */
    @JsonProperty("user_id")
    private String userId;

    /**
    * 用户组ID(由数字、字母、下划线组成，长度限制48B)，如传入"@ALL"则从所有组中查询用户信息。注：处于不同组，但uid相同的用户，我们认为是同一个用户。
    */
    @JsonProperty("group_id")
    private String groupId;

    public String getUserId() {
        return userId;
    }

    public UserGetRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getGroupId() {
        return groupId;
    }

    public UserGetRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

}
