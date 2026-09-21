package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetMysqlRateLimitTaskDetailResponse extends BaseBceResponse {

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

    public GetMysqlRateLimitTaskDetailResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public List<MySQLFilterItem> getItems() {
        return items;
    }

    public GetMysqlRateLimitTaskDetailResponse setItems(List<MySQLFilterItem> items) {
        this.items = items;
        return this;
    }

    @Override
    public String toString() {
        return "GetMysqlRateLimitTaskDetailResponse{" + "totalCount=" + totalCount + "\n" + "items=" + items + "\n" + "}";
    }

}
