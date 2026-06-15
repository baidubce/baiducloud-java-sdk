package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchRefundResourceResponse extends BaseBceResponse {

    /**
    * 删除失败的实例列表
    */
    private List<String> failedInstanceIds;

    public List<String> getFailedInstanceIds() {
        return failedInstanceIds;
    }

    public BatchRefundResourceResponse setFailedInstanceIds(List<String> failedInstanceIds) {
        this.failedInstanceIds = failedInstanceIds;
        return this;
    }

    @Override
    public String toString() {
        return "BatchRefundResourceResponse{" + "failedInstanceIds=" + failedInstanceIds + "\n" + "}";
    }

}
