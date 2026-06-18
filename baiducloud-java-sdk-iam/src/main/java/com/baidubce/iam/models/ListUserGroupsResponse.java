package com.baidubce.iam.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListUserGroupsResponse extends BaseBceResponse {

    /**
    * 组对象的列表
    */
    private List<GroupModel> groups;

    public List<GroupModel> getGroups() {
        return groups;
    }

    public ListUserGroupsResponse setGroups(List<GroupModel> groups) {
        this.groups = groups;
        return this;
    }

    @Override
    public String toString() {
        return "ListUserGroupsResponse{" + "groups=" + groups + "\n" + "}";
    }

}
