package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListL3AccessRuleResponse extends BaseBceResponse {

    /**
    * 唯一请求 ID，每次请求都会返回
    */
    private String requestId;

    /**
    * result
    */
    private Array result;

    /**
    * 总条数
    */
    private Integer totalCount;

    /**
    * 当前页码
    */
    private Integer pageNo;

    /**
    * 每页条数
    */
    private Integer pageSize;

    public String getRequestId() {
        return requestId;
    }

    public ListL3AccessRuleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public Array getResult() {
        return result;
    }

    public ListL3AccessRuleResponse setResult(Array result) {
        this.result = result;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public ListL3AccessRuleResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListL3AccessRuleResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListL3AccessRuleResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    @Override
    public String toString() {
        return "ListL3AccessRuleResponse{" + "requestId=" + requestId + "\n" + "result=" + result + "\n" + "totalCount=" + totalCount + "\n" + "pageNo=" + pageNo + "\n"
                + "pageSize=" + pageSize + "\n" + "}";
    }

}
