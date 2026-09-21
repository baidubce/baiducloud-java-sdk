package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetRedisSlowLogTemplateResponse extends BaseBceResponse {

    /**
    * 慢日志数量
    */
    private Long totalCount;

    /**
    * 统计信息
    */
    private List<SCSSlowLogSummaryItem> result;

    public Long getTotalCount() {
        return totalCount;
    }

    public GetRedisSlowLogTemplateResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public List<SCSSlowLogSummaryItem> getResult() {
        return result;
    }

    public GetRedisSlowLogTemplateResponse setResult(List<SCSSlowLogSummaryItem> result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "GetRedisSlowLogTemplateResponse{" + "totalCount=" + totalCount + "\n" + "result=" + result + "\n" + "}";
    }

}
