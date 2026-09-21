package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetMongodbDatabaseSpaceResponse extends BaseBceResponse {

    /**
    * 数据库空间信息列表
    */
    private List<MongodbDatabaseSpaceItem> items;

    /**
    * 数据库总数
    */
    private Integer totalCount;

    /**
    * 采集时间
    */
    private String collectionTime;

    public List<MongodbDatabaseSpaceItem> getItems() {
        return items;
    }

    public GetMongodbDatabaseSpaceResponse setItems(List<MongodbDatabaseSpaceItem> items) {
        this.items = items;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public GetMongodbDatabaseSpaceResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public String getCollectionTime() {
        return collectionTime;
    }

    public GetMongodbDatabaseSpaceResponse setCollectionTime(String collectionTime) {
        this.collectionTime = collectionTime;
        return this;
    }

    @Override
    public String toString() {
        return "GetMongodbDatabaseSpaceResponse{" + "items=" + items + "\n" + "totalCount=" + totalCount + "\n" + "collectionTime=" + collectionTime + "\n" + "}";
    }

}
