package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListUsersResponse extends BaseBceResponse {

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
    * 结果列表
    */
    private List<UserPoolUserDTO> result;

    public Integer getTotalCount() {
        return totalCount;
    }

    public ListUsersResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListUsersResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListUsersResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public List<UserPoolUserDTO> getResult() {
        return result;
    }

    public ListUsersResponse setResult(List<UserPoolUserDTO> result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "ListUsersResponse{" + "totalCount=" + totalCount + "\n" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "result=" + result + "\n" + "}";
    }

}
