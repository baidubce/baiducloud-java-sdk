package com.baidubce.ax.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResumeSandboxRequest extends BaseBceRequest {

    /**
    * sandboxID
    */
    @JsonIgnore
    private String sandboxID;

    /**
    * 恢复后存活时间，单位秒。
    */
    private Integer timeout;

    /**
    * 是否自动暂停。
    */
    private Boolean autoPause;

    public String getSandboxID() {
        return sandboxID;
    }

    public ResumeSandboxRequest setSandboxID(String sandboxID) {
        this.sandboxID = sandboxID;
        return this;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public ResumeSandboxRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    public Boolean getAutoPause() {
        return autoPause;
    }

    public ResumeSandboxRequest setAutoPause(Boolean autoPause) {
        this.autoPause = autoPause;
        return this;
    }

}
