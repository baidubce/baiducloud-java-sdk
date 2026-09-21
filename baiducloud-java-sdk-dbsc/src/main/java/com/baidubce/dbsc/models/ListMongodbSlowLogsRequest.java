package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListMongodbSlowLogsRequest extends BaseBceRequest {

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
    * users
    */
    @JsonIgnore
    private String users;

    /**
    * dbNames
    */
    @JsonIgnore
    private String dbNames;

    /**
    * clientIps
    */
    @JsonIgnore
    private String clientIps;

    /**
    * namespace
    */
    @JsonIgnore
    private String namespace;

    /**
    * fingerprintMd5
    */
    @JsonIgnore
    private String fingerprintMd5;

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

    public ListMongodbSlowLogsRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    public String getStart() {
        return start;
    }

    public ListMongodbSlowLogsRequest setStart(String start) {
        this.start = start;
        return this;
    }

    public String getEnd() {
        return end;
    }

    public ListMongodbSlowLogsRequest setEnd(String end) {
        this.end = end;
        return this;
    }

    public String getUsers() {
        return users;
    }

    public ListMongodbSlowLogsRequest setUsers(String users) {
        this.users = users;
        return this;
    }

    public String getDbNames() {
        return dbNames;
    }

    public ListMongodbSlowLogsRequest setDbNames(String dbNames) {
        this.dbNames = dbNames;
        return this;
    }

    public String getClientIps() {
        return clientIps;
    }

    public ListMongodbSlowLogsRequest setClientIps(String clientIps) {
        this.clientIps = clientIps;
        return this;
    }

    public String getNamespace() {
        return namespace;
    }

    public ListMongodbSlowLogsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getFingerprintMd5() {
        return fingerprintMd5;
    }

    public ListMongodbSlowLogsRequest setFingerprintMd5(String fingerprintMd5) {
        this.fingerprintMd5 = fingerprintMd5;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public ListMongodbSlowLogsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public ListMongodbSlowLogsRequest setOrder(String order) {
        this.order = order;
        return this;
    }

    public Integer getPage() {
        return page;
    }

    public ListMongodbSlowLogsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListMongodbSlowLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
