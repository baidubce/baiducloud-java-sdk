package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchStopInstanceRequest extends BaseBceRequest {

    /**
    * 实例id组成的集合，集合元素数量不超过100个
    */
    private List<String> instanceIds;

    /**
    * 指定实例是否强制关机，可选值：true、false，缺省为false
    */
    private Boolean forceStop;

    /**
    * 指定实例是否关机不计费，可选值：true、false，缺省为false
    */
    private Boolean stopWithNoCharge;

    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public BatchStopInstanceRequest setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public Boolean getForceStop() {
        return forceStop;
    }

    public BatchStopInstanceRequest setForceStop(Boolean forceStop) {
        this.forceStop = forceStop;
        return this;
    }

    public Boolean getStopWithNoCharge() {
        return stopWithNoCharge;
    }

    public BatchStopInstanceRequest setStopWithNoCharge(Boolean stopWithNoCharge) {
        this.stopWithNoCharge = stopWithNoCharge;
        return this;
    }

}
