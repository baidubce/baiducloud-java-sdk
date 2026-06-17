package com.baidubce.bls.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListLogStoreResponse extends BaseBceResponse {

    /**
    * 接口返回码
    */
    private String code;

    /**
    * 请求是否成功
    */
    private Boolean success;

    /**
    * 列表排序方式
    */
    private String order;

    /**
    * 列表排序列
    */
    private String orderBy;

    /**
    * 页码
    */
    private Integer pageNo;

    /**
    * 每页数量
    */
    private Integer pageSize;

    /**
    * 接口返回码
    */
    private List<LogStoreDetail> result;

    /**
    * 日志集总数
    */
    private Integer totalCount;

    public String getCode() {
        return code;
    }

    public ListLogStoreResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public Boolean getSuccess() {
        return success;
    }

    public ListLogStoreResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public ListLogStoreResponse setOrder(String order) {
        this.order = order;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public ListLogStoreResponse setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListLogStoreResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListLogStoreResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public List<LogStoreDetail> getResult() {
        return result;
    }

    public ListLogStoreResponse setResult(List<LogStoreDetail> result) {
        this.result = result;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public ListLogStoreResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    @Override
    public String toString() {
        return "ListLogStoreResponse{" + "code=" + code + "\n" + "success=" + success + "\n" + "order=" + order + "\n" + "orderBy=" + orderBy + "\n" + "pageNo=" + pageNo + "\n"
                + "pageSize=" + pageSize + "\n" + "result=" + result + "\n" + "totalCount=" + totalCount + "\n" + "}";
    }

}
