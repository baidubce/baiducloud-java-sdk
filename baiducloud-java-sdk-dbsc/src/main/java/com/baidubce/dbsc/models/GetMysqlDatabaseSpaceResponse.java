package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetMysqlDatabaseSpaceResponse extends BaseBceResponse {

    /**
    * 数据库空间信息列表
    */
    private List<MysqlDatabaseSpaceModel> items;

    /**
    * 数据库总数
    */
    private Integer totalCount;

    public List<MysqlDatabaseSpaceModel> getItems() {
        return items;
    }

    public GetMysqlDatabaseSpaceResponse setItems(List<MysqlDatabaseSpaceModel> items) {
        this.items = items;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public GetMysqlDatabaseSpaceResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    @Override
    public String toString() {
        return "GetMysqlDatabaseSpaceResponse{" + "items=" + items + "\n" + "totalCount=" + totalCount + "\n" + "}";
    }

}
