package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListPostgresqlSlowLogsRequest extends BaseBceRequest {

    /**
    * appId
    */
    @JsonIgnore
    private String appId;

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
    * dbNames
    */
    @JsonIgnore
    private List dbNames;

    /**
    * clientIPs
    */
    @JsonIgnore
    private List clientIPs;

    /**
    * users
    */
    @JsonIgnore
    private List users;

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

    public String getAppId() {
        return appId;
    }

    public ListPostgresqlSlowLogsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getNodeId() {
        return nodeId;
    }

    public ListPostgresqlSlowLogsRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    public String getStart() {
        return start;
    }

    public ListPostgresqlSlowLogsRequest setStart(String start) {
        this.start = start;
        return this;
    }

    public String getEnd() {
        return end;
    }

    public ListPostgresqlSlowLogsRequest setEnd(String end) {
        this.end = end;
        return this;
    }

    public Integer getPage() {
        return page;
    }

    public ListPostgresqlSlowLogsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListPostgresqlSlowLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public List getDbNames() {
        return dbNames;
    }

    public ListPostgresqlSlowLogsRequest setDbNames(List dbNames) {
        this.dbNames = dbNames;
        return this;
    }

    public List getClientIPs() {
        return clientIPs;
    }

    public ListPostgresqlSlowLogsRequest setClientIPs(List clientIPs) {
        this.clientIPs = clientIPs;
        return this;
    }

    public List getUsers() {
        return users;
    }

    public ListPostgresqlSlowLogsRequest setUsers(List users) {
        this.users = users;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public ListPostgresqlSlowLogsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public ListPostgresqlSlowLogsRequest setOrder(String order) {
        this.order = order;
        return this;
    }

}
