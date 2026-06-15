package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopInstanceRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 指定实例是否强制关机，可选值：true、false，缺省为false
    */
    private Boolean forceStop;

    /**
    * 指定实例是否关机不计费，可选值：true、false，缺省为false
    */
    private Boolean stopWithNoCharge;

    public String getInstanceId() {
        return instanceId;
    }

    public StopInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Boolean getForceStop() {
        return forceStop;
    }

    public StopInstanceRequest setForceStop(Boolean forceStop) {
        this.forceStop = forceStop;
        return this;
    }

    public Boolean getStopWithNoCharge() {
        return stopWithNoCharge;
    }

    public StopInstanceRequest setStopWithNoCharge(Boolean stopWithNoCharge) {
        this.stopWithNoCharge = stopWithNoCharge;
        return this;
    }

}
