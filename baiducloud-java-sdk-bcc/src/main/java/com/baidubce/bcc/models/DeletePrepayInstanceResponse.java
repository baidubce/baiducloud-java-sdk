package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeletePrepayInstanceResponse extends BaseBceResponse {

    /**
    * successResources
    */
    private InstanceDeleteResultModel successResources;

    /**
    * failResources
    */
    private InstanceDeleteResultModel failResources;

    /**
    * 实例是否成功释放
    */
    private Boolean instanceRefundFlag;

    public InstanceDeleteResultModel getSuccessResources() {
        return successResources;
    }

    public DeletePrepayInstanceResponse setSuccessResources(InstanceDeleteResultModel successResources) {
        this.successResources = successResources;
        return this;
    }

    public InstanceDeleteResultModel getFailResources() {
        return failResources;
    }

    public DeletePrepayInstanceResponse setFailResources(InstanceDeleteResultModel failResources) {
        this.failResources = failResources;
        return this;
    }

    public Boolean getInstanceRefundFlag() {
        return instanceRefundFlag;
    }

    public DeletePrepayInstanceResponse setInstanceRefundFlag(Boolean instanceRefundFlag) {
        this.instanceRefundFlag = instanceRefundFlag;
        return this;
    }

    @Override
    public String toString() {
        return "DeletePrepayInstanceResponse{" + "successResources=" + successResources + "\n" + "failResources=" + failResources + "\n" + "instanceRefundFlag="
                + instanceRefundFlag + "\n" + "}";
    }

}
