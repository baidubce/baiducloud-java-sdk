package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListMysqlRateLimitTasksResponse extends BaseBceResponse {

    /**
    * 限流任务总数
    */
    private Integer totalCount;

    /**
    * 限流任务详情
    */
    private List<MySQLFilterItem> items;

    public Integer getTotalCount() {
        return totalCount;
    }

    public ListMysqlRateLimitTasksResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public List<MySQLFilterItem> getItems() {
        return items;
    }

    public ListMysqlRateLimitTasksResponse setItems(List<MySQLFilterItem> items) {
        this.items = items;
        return this;
    }

    @Override
    public String toString() {
        return "ListMysqlRateLimitTasksResponse{" + "totalCount=" + totalCount + "\n" + "items=" + items + "\n" + "}";
    }

}
