package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetMongodbSlowQueryTemplateResponse extends BaseBceResponse {

    /**
    * 全量日志列表
    */
    private List<MongoDBSlowLogTemplate> items;

    /**
    * 日志总数
    */
    private Integer totalCount;

    public List<MongoDBSlowLogTemplate> getItems() {
        return items;
    }

    public GetMongodbSlowQueryTemplateResponse setItems(List<MongoDBSlowLogTemplate> items) {
        this.items = items;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public GetMongodbSlowQueryTemplateResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    @Override
    public String toString() {
        return "GetMongodbSlowQueryTemplateResponse{" + "items=" + items + "\n" + "totalCount=" + totalCount + "\n" + "}";
    }

}
