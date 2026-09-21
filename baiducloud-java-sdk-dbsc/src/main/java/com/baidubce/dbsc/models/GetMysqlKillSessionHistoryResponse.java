package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetMysqlKillSessionHistoryResponse extends BaseBceResponse {

    /**
    * 查杀历史会话总数
    */
    private Integer totalCount;

    /**
    * 查杀历史会话详情
    */
    private List<SessionKillHistory> items;

    public Integer getTotalCount() {
        return totalCount;
    }

    public GetMysqlKillSessionHistoryResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public List<SessionKillHistory> getItems() {
        return items;
    }

    public GetMysqlKillSessionHistoryResponse setItems(List<SessionKillHistory> items) {
        this.items = items;
        return this;
    }

    @Override
    public String toString() {
        return "GetMysqlKillSessionHistoryResponse{" + "totalCount=" + totalCount + "\n" + "items=" + items + "\n" + "}";
    }

}
