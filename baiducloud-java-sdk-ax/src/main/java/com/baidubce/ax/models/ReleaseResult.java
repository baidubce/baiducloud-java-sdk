package com.baidubce.ax.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReleaseResult {
    /**
     * 沙箱实例 ID。
     */
    private String sandboxId;

    /**
     * 是否释放成功。
     */
    private Boolean success;

    /**
     * 失败原因。
     */
    private String error;

    public ReleaseResult setSandboxId(String sandboxId) {
        this.sandboxId = sandboxId;
        return this;
    }

    public String getSandboxId() {
        return this.sandboxId;
    }

    public ReleaseResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public Boolean getSuccess() {
        return this.success;
    }

    public ReleaseResult setError(String error) {
        this.error = error;
        return this;
    }

    public String getError() {
        return this.error;
    }

    @Override
    public String toString() {
        return "ReleaseResult{" + "sandboxId=" + sandboxId + "\n" + "success=" + success + "\n" + "error=" + error + "\n" + "}";
    }

}