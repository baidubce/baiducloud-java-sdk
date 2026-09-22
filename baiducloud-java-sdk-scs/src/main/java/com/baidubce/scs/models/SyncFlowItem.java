package com.baidubce.scs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SyncFlowItem {
    /**
     * 同步流目标端BLBIP。
     */
    private String targetBLBIp;

    /**
     * 同步流目标端BLB端口。
     */
    private String targetBLBPort;

    /**
     * 同步流目标端集群ID。
     */
    private String targetClusterShowId;

    public SyncFlowItem setTargetBLBIp(String targetBLBIp) {
        this.targetBLBIp = targetBLBIp;
        return this;
    }

    public String getTargetBLBIp() {
        return this.targetBLBIp;
    }

    public SyncFlowItem setTargetBLBPort(String targetBLBPort) {
        this.targetBLBPort = targetBLBPort;
        return this;
    }

    public String getTargetBLBPort() {
        return this.targetBLBPort;
    }

    public SyncFlowItem setTargetClusterShowId(String targetClusterShowId) {
        this.targetClusterShowId = targetClusterShowId;
        return this;
    }

    public String getTargetClusterShowId() {
        return this.targetClusterShowId;
    }

    @Override
    public String toString() {
        return "SyncFlowItem{" + "targetBLBIp=" + targetBLBIp + "\n" + "targetBLBPort=" + targetBLBPort + "\n" + "targetClusterShowId=" + targetClusterShowId + "\n" + "}";
    }

}