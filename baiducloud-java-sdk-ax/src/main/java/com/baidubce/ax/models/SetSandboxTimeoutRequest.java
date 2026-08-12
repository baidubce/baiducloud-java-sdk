package com.baidubce.ax.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SetSandboxTimeoutRequest extends BaseBceRequest {

    /**
    * sandboxID
    */
    @JsonIgnore
    private String sandboxID;

    /**
    * 从当前时间起的存活时间，单位秒。
    */
    private Integer timeout;

    public String getSandboxID() {
        return sandboxID;
    }

    public SetSandboxTimeoutRequest setSandboxID(String sandboxID) {
        this.sandboxID = sandboxID;
        return this;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public SetSandboxTimeoutRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

}
