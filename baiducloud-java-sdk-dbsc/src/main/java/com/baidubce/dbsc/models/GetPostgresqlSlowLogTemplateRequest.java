package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPostgresqlSlowLogTemplateRequest extends BaseBceRequest {

    /**
    * users
    */
    @JsonIgnore
    private String users;

    /**
    * page
    */
    @JsonIgnore
    private Integer page;

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

    public String getUsers() {
        return users;
    }

    public GetPostgresqlSlowLogTemplateRequest setUsers(String users) {
        this.users = users;
        return this;
    }

    public Integer getPage() {
        return page;
    }

    public GetPostgresqlSlowLogTemplateRequest setPage(Integer page) {
        this.page = page;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public GetPostgresqlSlowLogTemplateRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public GetPostgresqlSlowLogTemplateRequest setOrder(String order) {
        this.order = order;
        return this;
    }

}
