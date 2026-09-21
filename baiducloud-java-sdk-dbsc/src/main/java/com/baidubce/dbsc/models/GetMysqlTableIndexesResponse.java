package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetMysqlTableIndexesResponse extends BaseBceResponse {

    /**
    * 表索引信息列表
    */
    private List<TableIndexDetailItem> indexes;

    public List<TableIndexDetailItem> getIndexes() {
        return indexes;
    }

    public GetMysqlTableIndexesResponse setIndexes(List<TableIndexDetailItem> indexes) {
        this.indexes = indexes;
        return this;
    }

    @Override
    public String toString() {
        return "GetMysqlTableIndexesResponse{" + "indexes=" + indexes + "\n" + "}";
    }

}
