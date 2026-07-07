package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListUserPoolsRequest extends BaseBceRequest {

    /**
    * 模糊搜索（匹配 name / id）
    */
    private String keyword;

    /**
    * 页码，默认 1
    */
    private Integer pageNo;

    /**
    * 每页数量，默认 10，最大 100
    */
    private Integer pageSize;

    public String getKeyword() {
        return keyword;
    }

    public ListUserPoolsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListUserPoolsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListUserPoolsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
