package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClaimAlertEventResponse extends BaseBceResponse {

    /**
    * 成功认领数量
    */
    private Integer successCount;

    /**
    * 失败认领数量
    */
    private Integer failedCount;

    /**
    * 认领详情
    */
    private List<EventClaimDetail> details;

    public Integer getSuccessCount() {
        return successCount;
    }

    public ClaimAlertEventResponse setSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }

    public Integer getFailedCount() {
        return failedCount;
    }

    public ClaimAlertEventResponse setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
        return this;
    }

    public List<EventClaimDetail> getDetails() {
        return details;
    }

    public ClaimAlertEventResponse setDetails(List<EventClaimDetail> details) {
        this.details = details;
        return this;
    }

    @Override
    public String toString() {
        return "ClaimAlertEventResponse{" + "successCount=" + successCount + "\n" + "failedCount=" + failedCount + "\n" + "details=" + details + "\n" + "}";
    }

}
