package com.baidubce.face.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupGetListResult {
    /**
     * 用户组ID列表
     */
    @JsonProperty("group_id_list")
    private List<String> groupIdList;

    public GroupGetListResult setGroupIdList(List<String> groupIdList) {
        this.groupIdList = groupIdList;
        return this;
    }

    public List<String> getGroupIdList() {
        return this.groupIdList;
    }

    @Override
    public String toString() {
        return "GroupGetListResult{" + "groupIdList=" + groupIdList + "\n" + "}";
    }

}