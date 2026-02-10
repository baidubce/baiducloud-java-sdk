
package com.baidubce.vpc.models;

import java.util.List;



import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryTheIpAddressesOccupiedByProductsWithinVpcResponse extends BaseBceResponse  {
    /**
     * page number
     */
    private Integer pageNo;

    /**
     * page size
     */
    private Integer pageSize;

    /**
     * 满足查询条件的结果集总数
     */
    private Integer totalCount;

    /**
     * VPC内产品占用IP分页信息
     */
    private List<ResourceIp> result;

    public QueryTheIpAddressesOccupiedByProductsWithinVpcResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryTheIpAddressesOccupiedByProductsWithinVpcResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTheIpAddressesOccupiedByProductsWithinVpcResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryTheIpAddressesOccupiedByProductsWithinVpcResponse setResult(List<ResourceIp> result) {
        this.result = result;
        return this;
    }

    public List<ResourceIp> getResult() {
        return this.result;
    }

    @Override
    public String toString() {
        return "QueryTheIpAddressesOccupiedByProductsWithinVpcResponse{"
                + "pageNo=" + pageNo + "\n"
                + "pageSize=" + pageSize + "\n"
                + "totalCount=" + totalCount + "\n"
                + "result=" + result + "\n"
                + "}";
    }




}