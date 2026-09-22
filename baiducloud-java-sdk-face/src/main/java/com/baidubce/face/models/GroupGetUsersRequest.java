package com.baidubce.face.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupGetUsersRequest extends BaseBceRequest {

    /**
    * 用户组ID，长度限制48B
    */
    @JsonProperty("group_id")
    private String groupId;

    /**
    * 起始序号，默认为0
    */
    private Integer start;

    /**
    * 返回数量，默认100，最大1000
    */
    private Integer length;

    public String getGroupId() {
        return groupId;
    }

    public GroupGetUsersRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public Integer getStart() {
        return start;
    }

    public GroupGetUsersRequest setStart(Integer start) {
        this.start = start;
        return this;
    }

    public Integer getLength() {
        return length;
    }

    public GroupGetUsersRequest setLength(Integer length) {
        this.length = length;
        return this;
    }

}
