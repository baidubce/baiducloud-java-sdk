package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetTagBuildHistoryResponse extends BaseBceResponse {

    /**
    * 目标Tag构建历史集合
    */
    private List<BuildHistory> items;

    public List<BuildHistory> getItems() {
        return items;
    }

    public GetTagBuildHistoryResponse setItems(List<BuildHistory> items) {
        this.items = items;
        return this;
    }

    @Override
    public String toString() {
        return "GetTagBuildHistoryResponse{" + "items=" + items + "\n" + "}";
    }

}
