package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetHotGroupListResponse extends BaseBceResponse {

    /**
    * 列表结果
    */
    private List<Result> result;

    /**
    * 数据总量
    */
    private Integer totalCount;

    /**
    * 当前页码
    */
    private Integer pageNo;

    /**
    * 每页显示的数量
    */
    private Integer pageSize;

    public List<Result> getResult() {
        return result;
    }

    public GetHotGroupListResponse setResult(List<Result> result) {
        this.result = result;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public GetHotGroupListResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public GetHotGroupListResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public GetHotGroupListResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    @Override
    public String toString() {
        return "GetHotGroupListResponse{" + "result=" + result + "\n" + "totalCount=" + totalCount + "\n" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "}";
    }

}
