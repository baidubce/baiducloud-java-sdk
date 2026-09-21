package com.baidubce.cce.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetReportListResponse extends BaseBceResponse {

    /**
    * 排序字段，默认为巡检开始时间
    */
    private String orderBy;

    /**
    * 排序方式，desc 倒序（默认），asc 升序
    */
    private String order;

    /**
    * 当前页码
    */
    private Integer pageNo;

    /**
    * 当前页巡检任务个数
    */
    private Integer pageSize;

    /**
    * 巡检任务总个数
    */
    private Integer totalCount;

    /**
    * 巡检任务列表
    */
    private List<InspectionTaskInfo> reportAbstract;

    public String getOrderBy() {
        return orderBy;
    }

    public GetReportListResponse setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public GetReportListResponse setOrder(String order) {
        this.order = order;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public GetReportListResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public GetReportListResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public GetReportListResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public List<InspectionTaskInfo> getReportAbstract() {
        return reportAbstract;
    }

    public GetReportListResponse setReportAbstract(List<InspectionTaskInfo> reportAbstract) {
        this.reportAbstract = reportAbstract;
        return this;
    }

    @Override
    public String toString() {
        return "GetReportListResponse{" + "orderBy=" + orderBy + "\n" + "order=" + order + "\n" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "totalCount="
                + totalCount + "\n" + "reportAbstract=" + reportAbstract + "\n" + "}";
    }

}
