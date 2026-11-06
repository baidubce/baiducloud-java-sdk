package com.baidubce.rds.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TableGranularityQueryUserListApiResponse extends BaseBceResponse {

    /**
    * 账号列表，见下表
    */
    private List<TableLevelAccountListResponse> users;

    public List<TableLevelAccountListResponse> getUsers() {
        return users;
    }

    public TableGranularityQueryUserListApiResponse setUsers(List<TableLevelAccountListResponse> users) {
        this.users = users;
        return this;
    }

    @Override
    public String toString() {
        return "TableGranularityQueryUserListApiResponse{" + "users=" + users + "\n" + "}";
    }

}
