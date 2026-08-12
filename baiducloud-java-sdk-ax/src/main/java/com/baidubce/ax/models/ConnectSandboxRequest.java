package com.baidubce.ax.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConnectSandboxRequest extends BaseBceRequest {

    /**
    * sandboxID
    */
    @JsonIgnore
    private String sandboxID;

    /**
    * 续期时间，单位秒；-1 表示永久。
    */
    private Integer timeout;

    /**
    * 恢复时使用的快照 ID。
    */
    private String snapshotID;

    public String getSandboxID() {
        return sandboxID;
    }

    public ConnectSandboxRequest setSandboxID(String sandboxID) {
        this.sandboxID = sandboxID;
        return this;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public ConnectSandboxRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    public String getSnapshotID() {
        return snapshotID;
    }

    public ConnectSandboxRequest setSnapshotID(String snapshotID) {
        this.snapshotID = snapshotID;
        return this;
    }

}
