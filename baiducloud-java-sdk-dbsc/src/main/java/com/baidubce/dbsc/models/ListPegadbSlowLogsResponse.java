package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListPegadbSlowLogsResponse extends BaseBceResponse {

    /**
    * 集群ID
    */
    private String appId;

    /**
    * 节点ID
    */
    private String nodeId;

    /**
    * 请求ID
    */
    private String requestId;

    /**
    * 慢日志起始时间范围节点
    */
    private String start;

    /**
    * 慢日志结束时间范围节点
    */
    private String end;

    /**
    * 慢日志总数
    */
    private Integer totalRecordCount;

    /**
    * 每页返回日志的最大数量
    */
    private Integer maxRecordCountPerPage;

    /**
    * 当前页码
    */
    private Integer pageNumber;

    /**
    * 当前页慢日志数量
    */
    private Integer recordCountInCurrentPage;

    /**
    * 慢日志信息列表
    */
    private List<SCSSlowLogInfo> records;

    public String getAppId() {
        return appId;
    }

    public ListPegadbSlowLogsResponse setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getNodeId() {
        return nodeId;
    }

    public ListPegadbSlowLogsResponse setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    public String getRequestId() {
        return requestId;
    }

    public ListPegadbSlowLogsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getStart() {
        return start;
    }

    public ListPegadbSlowLogsResponse setStart(String start) {
        this.start = start;
        return this;
    }

    public String getEnd() {
        return end;
    }

    public ListPegadbSlowLogsResponse setEnd(String end) {
        this.end = end;
        return this;
    }

    public Integer getTotalRecordCount() {
        return totalRecordCount;
    }

    public ListPegadbSlowLogsResponse setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }

    public Integer getMaxRecordCountPerPage() {
        return maxRecordCountPerPage;
    }

    public ListPegadbSlowLogsResponse setMaxRecordCountPerPage(Integer maxRecordCountPerPage) {
        this.maxRecordCountPerPage = maxRecordCountPerPage;
        return this;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public ListPegadbSlowLogsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    public Integer getRecordCountInCurrentPage() {
        return recordCountInCurrentPage;
    }

    public ListPegadbSlowLogsResponse setRecordCountInCurrentPage(Integer recordCountInCurrentPage) {
        this.recordCountInCurrentPage = recordCountInCurrentPage;
        return this;
    }

    public List<SCSSlowLogInfo> getRecords() {
        return records;
    }

    public ListPegadbSlowLogsResponse setRecords(List<SCSSlowLogInfo> records) {
        this.records = records;
        return this;
    }

    @Override
    public String toString() {
        return "ListPegadbSlowLogsResponse{" + "appId=" + appId + "\n" + "nodeId=" + nodeId + "\n" + "requestId=" + requestId + "\n" + "start=" + start + "\n" + "end=" + end
                + "\n" + "totalRecordCount=" + totalRecordCount + "\n" + "maxRecordCountPerPage=" + maxRecordCountPerPage + "\n" + "pageNumber=" + pageNumber + "\n"
                + "recordCountInCurrentPage=" + recordCountInCurrentPage + "\n" + "records=" + records + "\n" + "}";
    }

}
