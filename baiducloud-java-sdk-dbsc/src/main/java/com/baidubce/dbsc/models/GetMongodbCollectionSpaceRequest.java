package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetMongodbCollectionSpaceRequest extends BaseBceRequest {

    /**
    * nodeId
    */
    @JsonIgnore
    private String nodeId;

    /**
    * database
    */
    @JsonIgnore
    private String database;

    /**
    * collection
    */
    @JsonIgnore
    private String collection;

    /**
    * orderBy
    */
    @JsonIgnore
    private String orderBy;

    /**
    * order
    */
    @JsonIgnore
    private String order;

    /**
    * page
    */
    @JsonIgnore
    private Integer page;

    /**
    * pageSize
    */
    @JsonIgnore
    private Integer pageSize;

    public String getNodeId() {
        return nodeId;
    }

    public GetMongodbCollectionSpaceRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    public String getDatabase() {
        return database;
    }

    public GetMongodbCollectionSpaceRequest setDatabase(String database) {
        this.database = database;
        return this;
    }

    public String getCollection() {
        return collection;
    }

    public GetMongodbCollectionSpaceRequest setCollection(String collection) {
        this.collection = collection;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public GetMongodbCollectionSpaceRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public GetMongodbCollectionSpaceRequest setOrder(String order) {
        this.order = order;
        return this;
    }

    public Integer getPage() {
        return page;
    }

    public GetMongodbCollectionSpaceRequest setPage(Integer page) {
        this.page = page;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public GetMongodbCollectionSpaceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
