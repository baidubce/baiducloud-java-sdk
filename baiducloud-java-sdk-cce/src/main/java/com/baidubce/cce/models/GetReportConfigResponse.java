package com.baidubce.cce.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetReportConfigResponse extends BaseBceResponse {

    /**
    * 报告发送类型配置列表
    */
    private List<ReporterTypeConfig> reporterTypeList;

    public List<ReporterTypeConfig> getReporterTypeList() {
        return reporterTypeList;
    }

    public GetReportConfigResponse setReporterTypeList(List<ReporterTypeConfig> reporterTypeList) {
        this.reporterTypeList = reporterTypeList;
        return this;
    }

    @Override
    public String toString() {
        return "GetReportConfigResponse{" + "reporterTypeList=" + reporterTypeList + "\n" + "}";
    }

}
