package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetMongodbCollectionSpaceResponse extends BaseBceResponse {

    /**
    * 集合空间信息列表
    */
    private List<MongodbCollectionSpaceItem> items;

    /**
    * 集合总数
    */
    private Integer totalCount;

    /**
    * 采集时间
    */
    private String collectionTime;

    public List<MongodbCollectionSpaceItem> getItems() {
        return items;
    }

    public GetMongodbCollectionSpaceResponse setItems(List<MongodbCollectionSpaceItem> items) {
        this.items = items;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public GetMongodbCollectionSpaceResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public String getCollectionTime() {
        return collectionTime;
    }

    public GetMongodbCollectionSpaceResponse setCollectionTime(String collectionTime) {
        this.collectionTime = collectionTime;
        return this;
    }

    @Override
    public String toString() {
        return "GetMongodbCollectionSpaceResponse{" + "items=" + items + "\n" + "totalCount=" + totalCount + "\n" + "collectionTime=" + collectionTime + "\n" + "}";
    }

}
