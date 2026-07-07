package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListOauth2ClientsResponse extends BaseBceResponse {

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
    private List<UserPoolOAuth2ClientDTO> result;

    public Integer getTotalCount() {
        return totalCount;
    }

    public ListOauth2ClientsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListOauth2ClientsResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListOauth2ClientsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public List<UserPoolOAuth2ClientDTO> getResult() {
        return result;
    }

    public ListOauth2ClientsResponse setResult(List<UserPoolOAuth2ClientDTO> result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "ListOauth2ClientsResponse{" + "totalCount=" + totalCount + "\n" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "result=" + result + "\n" + "}";
    }

}
