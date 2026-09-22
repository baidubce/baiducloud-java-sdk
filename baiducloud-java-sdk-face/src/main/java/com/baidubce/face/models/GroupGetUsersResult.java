package com.baidubce.face.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupGetUsersResult {
    /**
     * 用户ID列表
     */
    @JsonProperty("user_id_list")
    private List<String> userIdList;

    public GroupGetUsersResult setUserIdList(List<String> userIdList) {
        this.userIdList = userIdList;
        return this;
    }

    public List<String> getUserIdList() {
        return this.userIdList;
    }

    @Override
    public String toString() {
        return "GroupGetUsersResult{" + "userIdList=" + userIdList + "\n" + "}";
    }

}