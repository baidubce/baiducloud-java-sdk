package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetTagsScanOverviewResponse extends BaseBceResponse {

    /**
    * 漏洞扫描结果列表
    */
    private List<ArtifactScanOverview> items;

    /**
    * 最近一次扫描时间
    */
    private String lastScanTime;

    /**
    * 当前页，默认为1
    */
    private Integer pageNo;

    /**
    * 每页记录数，默认为10
    */
    private Integer pageSize;

    /**
    * 不同严重程度的漏洞数量
    */
    private Object summary;

    /**
    * 漏洞总数
    */
    private Integer total;

    public List<ArtifactScanOverview> getItems() {
        return items;
    }

    public GetTagsScanOverviewResponse setItems(List<ArtifactScanOverview> items) {
        this.items = items;
        return this;
    }

    public String getLastScanTime() {
        return lastScanTime;
    }

    public GetTagsScanOverviewResponse setLastScanTime(String lastScanTime) {
        this.lastScanTime = lastScanTime;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public GetTagsScanOverviewResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public GetTagsScanOverviewResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Object getSummary() {
        return summary;
    }

    public GetTagsScanOverviewResponse setSummary(Object summary) {
        this.summary = summary;
        return this;
    }

    public Integer getTotal() {
        return total;
    }

    public GetTagsScanOverviewResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }

    @Override
    public String toString() {
        return "GetTagsScanOverviewResponse{" + "items=" + items + "\n" + "lastScanTime=" + lastScanTime + "\n" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n"
                + "summary=" + summary + "\n" + "total=" + total + "\n" + "}";
    }

}
