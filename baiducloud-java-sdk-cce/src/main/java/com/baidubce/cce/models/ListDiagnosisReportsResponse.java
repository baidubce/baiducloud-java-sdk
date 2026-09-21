package com.baidubce.cce.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListDiagnosisReportsResponse extends BaseBceResponse {

    /**
    * 排序字段，默认为任务开始时间
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
    * 当前页诊断任务个数
    */
    private Integer pageSize;

    /**
    * 诊断任务总个数
    */
    private Integer totalCount;

    /**
    * 结果过滤条件
    */
    private String resultFilter;

    /**
    * 诊断任务列表
    */
    private List<DiagnosisTaskInfo> diagnosisReports;

    public String getOrderBy() {
        return orderBy;
    }

    public ListDiagnosisReportsResponse setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public ListDiagnosisReportsResponse setOrder(String order) {
        this.order = order;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListDiagnosisReportsResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListDiagnosisReportsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public ListDiagnosisReportsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public String getResultFilter() {
        return resultFilter;
    }

    public ListDiagnosisReportsResponse setResultFilter(String resultFilter) {
        this.resultFilter = resultFilter;
        return this;
    }

    public List<DiagnosisTaskInfo> getDiagnosisReports() {
        return diagnosisReports;
    }

    public ListDiagnosisReportsResponse setDiagnosisReports(List<DiagnosisTaskInfo> diagnosisReports) {
        this.diagnosisReports = diagnosisReports;
        return this;
    }

    @Override
    public String toString() {
        return "ListDiagnosisReportsResponse{" + "orderBy=" + orderBy + "\n" + "order=" + order + "\n" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "totalCount="
                + totalCount + "\n" + "resultFilter=" + resultFilter + "\n" + "diagnosisReports=" + diagnosisReports + "\n" + "}";
    }

}
