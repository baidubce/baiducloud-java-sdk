package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListUserPoolsResponse extends BaseBceResponse {

    /**
    * 总数量
    */
    private Integer totalCount;

    /**
    * 当前页码
    */
    private Integer pageNo;

    /**
    * 每页数量
    */
    private Integer pageSize;

    /**
    * result
    */
    private UserPoolDTO result;

    public Integer getTotalCount() {
        return totalCount;
    }

    public ListUserPoolsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListUserPoolsResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListUserPoolsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public UserPoolDTO getResult() {
        return result;
    }

    public ListUserPoolsResponse setResult(UserPoolDTO result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "ListUserPoolsResponse{" + "totalCount=" + totalCount + "\n" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "result=" + result + "\n" + "}";
    }

}
