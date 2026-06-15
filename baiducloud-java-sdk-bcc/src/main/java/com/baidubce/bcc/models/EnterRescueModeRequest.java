package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnterRescueModeRequest extends BaseBceRequest {

    /**
    * 虚拟机实例ID
    */
    private String instanceId;

    /**
    * 是否强制关机（默认为false）
    */
    private Boolean forceStop;

    /**
    * 虚拟机密码
    */
    private String password;

    public String getInstanceId() {
        return instanceId;
    }

    public EnterRescueModeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Boolean getForceStop() {
        return forceStop;
    }

    public EnterRescueModeRequest setForceStop(Boolean forceStop) {
        this.forceStop = forceStop;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public EnterRescueModeRequest setPassword(String password) {
        this.password = password;
        return this;
    }

}
