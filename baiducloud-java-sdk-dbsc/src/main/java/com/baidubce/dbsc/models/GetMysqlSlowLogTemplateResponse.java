package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetMysqlSlowLogTemplateResponse extends BaseBceResponse {

    /**
    * 全量日志模版列表
    */
    private List<MySQLSlowLogTemplate> items;

    /**
    * 记录总数
    */
    private Integer totalCount;

    public List<MySQLSlowLogTemplate> getItems() {
        return items;
    }

    public GetMysqlSlowLogTemplateResponse setItems(List<MySQLSlowLogTemplate> items) {
        this.items = items;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public GetMysqlSlowLogTemplateResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    @Override
    public String toString() {
        return "GetMysqlSlowLogTemplateResponse{" + "items=" + items + "\n" + "totalCount=" + totalCount + "\n" + "}";
    }

}
