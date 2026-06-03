package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QryL2PolExecDetailResponse extends BaseBceResponse {

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    private String requestId;

    /**
    * bos获取链接（数据删除）或者报告在bos中的路径（数据导出）
    */
    private String report;

    public String getRequestId() {
        return requestId;
    }

    public QryL2PolExecDetailResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getReport() {
        return report;
    }

    public QryL2PolExecDetailResponse setReport(String report) {
        this.report = report;
        return this;
    }

    @Override
    public String toString() {
        return "QryL2PolExecDetailResponse{" + "requestId=" + requestId + "\n" + "report=" + report + "\n" + "}";
    }

}
