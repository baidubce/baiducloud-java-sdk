package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListOauth2ClientsRequest extends BaseBceRequest {

    /**
    * 用户池 ID
    */
    private String userPoolId;

    /**
    * 模糊搜索（匹配 clientId / name）
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

    public ListOauth2ClientsRequest setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    public String getKeyword() {
        return keyword;
    }

    public ListOauth2ClientsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListOauth2ClientsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListOauth2ClientsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
