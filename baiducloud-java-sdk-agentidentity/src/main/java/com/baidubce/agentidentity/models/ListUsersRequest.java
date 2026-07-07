package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListUsersRequest extends BaseBceRequest {

    /**
    * 用户池 ID
    */
    private String userPoolId;

    /**
    * 模糊搜索（匹配 username / id / displayName）
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

    public ListUsersRequest setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    public String getKeyword() {
        return keyword;
    }

    public ListUsersRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListUsersRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListUsersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
