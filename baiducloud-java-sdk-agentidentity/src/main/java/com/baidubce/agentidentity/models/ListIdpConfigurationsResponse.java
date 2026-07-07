package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListIdpConfigurationsResponse extends BaseBceResponse {

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
    private List<UserPoolIdpConfigDTO> result;

    public Integer getTotalCount() {
        return totalCount;
    }

    public ListIdpConfigurationsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListIdpConfigurationsResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListIdpConfigurationsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public List<UserPoolIdpConfigDTO> getResult() {
        return result;
    }

    public ListIdpConfigurationsResponse setResult(List<UserPoolIdpConfigDTO> result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "ListIdpConfigurationsResponse{" + "totalCount=" + totalCount + "\n" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "result=" + result + "\n" + "}";
    }

}
