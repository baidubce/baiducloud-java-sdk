package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPostgresqlSlowLogTemplateResponse extends BaseBceResponse {

    /**
    * 总记录数
    */
    private Long totalCount;

    /**
    * 慢日志模板项
    */
    private List<APIPGSlowLogTemplateItem> items;

    public Long getTotalCount() {
        return totalCount;
    }

    public GetPostgresqlSlowLogTemplateResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public List<APIPGSlowLogTemplateItem> getItems() {
        return items;
    }

    public GetPostgresqlSlowLogTemplateResponse setItems(List<APIPGSlowLogTemplateItem> items) {
        this.items = items;
        return this;
    }

    @Override
    public String toString() {
        return "GetPostgresqlSlowLogTemplateResponse{" + "totalCount=" + totalCount + "\n" + "items=" + items + "\n" + "}";
    }

}
