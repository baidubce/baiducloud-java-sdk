package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetMysqlTableSpaceResponse extends BaseBceResponse {

    /**
    * 全量日志列表
    */
    private List<MysqlTableSpaceModel> items;

    /**
    * 日志总数
    */
    private Integer totalCount;

    public List<MysqlTableSpaceModel> getItems() {
        return items;
    }

    public GetMysqlTableSpaceResponse setItems(List<MysqlTableSpaceModel> items) {
        this.items = items;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public GetMysqlTableSpaceResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    @Override
    public String toString() {
        return "GetMysqlTableSpaceResponse{" + "items=" + items + "\n" + "totalCount=" + totalCount + "\n" + "}";
    }

}
