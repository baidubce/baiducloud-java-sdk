package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListAgentsRequest extends BaseBceRequest {

    /**
    * 页码，默认 1
    */
    private Integer pageNo;

    /**
    * 每页数量，默认 10
    */
    private Integer pageSize;

    /**
    * 关键词过滤（匹配名称/描述/ID）
    */
    private String keyword;

    public Integer getPageNo() {
        return pageNo;
    }

    public ListAgentsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListAgentsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public String getKeyword() {
        return keyword;
    }

    public ListAgentsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

}
