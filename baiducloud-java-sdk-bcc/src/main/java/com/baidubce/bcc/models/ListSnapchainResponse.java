package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListSnapchainResponse extends BaseBceResponse {

    /**
    * 排序属性
    */
    private String orderBy;

    /**
    * 快照链总数
    */
    private Integer totalCount;

    /**
    * 该页容量
    */
    private Integer pageSize;

    /**
    * 页数
    */
    private Integer pageNo;

    /**
    * true表示后面还有数据，false表示已经是最后一页
    */
    private Boolean isTruncated;

    /**
    * 快照链信息，由 SnapchainModel 组成的集合
    */
    private List<SnapchainModel> snapchains;

    public String getOrderBy() {
        return orderBy;
    }

    public ListSnapchainResponse setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public ListSnapchainResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListSnapchainResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListSnapchainResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Boolean getIsTruncated() {
        return isTruncated;
    }

    public ListSnapchainResponse setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    public List<SnapchainModel> getSnapchains() {
        return snapchains;
    }

    public ListSnapchainResponse setSnapchains(List<SnapchainModel> snapchains) {
        this.snapchains = snapchains;
        return this;
    }

    @Override
    public String toString() {
        return "ListSnapchainResponse{" + "orderBy=" + orderBy + "\n" + "totalCount=" + totalCount + "\n" + "pageSize=" + pageSize + "\n" + "pageNo=" + pageNo + "\n"
                + "isTruncated=" + isTruncated + "\n" + "snapchains=" + snapchains + "\n" + "}";
    }

}
