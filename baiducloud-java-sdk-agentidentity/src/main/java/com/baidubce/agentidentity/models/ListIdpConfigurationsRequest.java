package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListIdpConfigurationsRequest extends BaseBceRequest {

    /**
    * 用户池 ID
    */
    private String userPoolId;

    /**
    * 按名称模糊搜索
    */
    private String keyword;

    /**
    * 页码，默认 1
    */
    private Integer pageNo;

    /**
    * 每页数量，默认 10
    */
    private Integer pageSize;

    public String getUserPoolId() {
        return userPoolId;
    }

    public ListIdpConfigurationsRequest setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    public String getKeyword() {
        return keyword;
    }

    public ListIdpConfigurationsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListIdpConfigurationsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListIdpConfigurationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
