package com.baidubce.iam.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListUsersWithinTheGroupResponse extends BaseBceResponse {

    /**
    * 用户对象的列表
    */
    private List<UserModel> users;

    public List<UserModel> getUsers() {
        return users;
    }

    public ListUsersWithinTheGroupResponse setUsers(List<UserModel> users) {
        this.users = users;
        return this;
    }

    @Override
    public String toString() {
        return "ListUsersWithinTheGroupResponse{" + "users=" + users + "\n" + "}";
    }

}
