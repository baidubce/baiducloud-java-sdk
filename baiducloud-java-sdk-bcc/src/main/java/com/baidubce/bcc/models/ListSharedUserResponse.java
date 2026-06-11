package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListSharedUserResponse extends BaseBceResponse {

    /**
    * 返回的共享用户列表
    */
    private List<SharedUser> users;

    public List<SharedUser> getUsers() {
        return users;
    }

    public ListSharedUserResponse setUsers(List<SharedUser> users) {
        this.users = users;
        return this;
    }

    @Override
    public String toString() {
        return "ListSharedUserResponse{" + "users=" + users + "\n" + "}";
    }

}
