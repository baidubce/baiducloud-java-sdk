package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPegadbSlowLogTemplateRequest extends BaseBceRequest {

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

    public GetPegadbSlowLogTemplateRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    public String getStart() {
        return start;
    }

    public GetPegadbSlowLogTemplateRequest setStart(String start) {
        this.start = start;
        return this;
    }

    public String getEnd() {
        return end;
    }

    public GetPegadbSlowLogTemplateRequest setEnd(String end) {
        this.end = end;
        return this;
    }

    public String getDbEngine() {
        return dbEngine;
    }

    public GetPegadbSlowLogTemplateRequest setDbEngine(String dbEngine) {
        this.dbEngine = dbEngine;
        return this;
    }

    public Integer getPage() {
        return page;
    }

    public GetPegadbSlowLogTemplateRequest setPage(Integer page) {
        this.page = page;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public GetPegadbSlowLogTemplateRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public GetPegadbSlowLogTemplateRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public GetPegadbSlowLogTemplateRequest setOrder(String order) {
        this.order = order;
        return this;
    }

}
