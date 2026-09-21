package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetMongodbDatabaseSpaceRequest extends BaseBceRequest {

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

    public GetMongodbDatabaseSpaceRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    public String getDatabase() {
        return database;
    }

    public GetMongodbDatabaseSpaceRequest setDatabase(String database) {
        this.database = database;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public GetMongodbDatabaseSpaceRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public GetMongodbDatabaseSpaceRequest setOrder(String order) {
        this.order = order;
        return this;
    }

    public Integer getPage() {
        return page;
    }

    public GetMongodbDatabaseSpaceRequest setPage(Integer page) {
        this.page = page;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public GetMongodbDatabaseSpaceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
