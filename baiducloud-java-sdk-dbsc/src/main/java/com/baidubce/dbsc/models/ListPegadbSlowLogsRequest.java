package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListPegadbSlowLogsRequest extends BaseBceRequest {

    /**
    * nodeId
    */
    @JsonIgnore
    private String nodeId;

    /**
    * start
    */
    @JsonIgnore
    private String start;

    /**
    * end
    */
    @JsonIgnore
    private String end;

    /**
    * dbEngine
    */
    @JsonIgnore
    private String dbEngine;

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

    public String getNodeId() {
        return nodeId;
    }

    public ListPegadbSlowLogsRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    public String getStart() {
        return start;
    }

    public ListPegadbSlowLogsRequest setStart(String start) {
        this.start = start;
        return this;
    }

    public String getEnd() {
        return end;
    }

    public ListPegadbSlowLogsRequest setEnd(String end) {
        this.end = end;
        return this;
    }

    public String getDbEngine() {
        return dbEngine;
    }

    public ListPegadbSlowLogsRequest setDbEngine(String dbEngine) {
        this.dbEngine = dbEngine;
        return this;
    }

    public Integer getPage() {
        return page;
    }

    public ListPegadbSlowLogsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListPegadbSlowLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public ListPegadbSlowLogsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public ListPegadbSlowLogsRequest setOrder(String order) {
        this.order = order;
        return this;
    }

}
