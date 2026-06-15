package com.baidubce.bcc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstanceDeleteResultModel {
    /**
     * 实例id
     */
    private String instanceId;

    /**
     * eip
     */
    private String eip;

    /**
     * 实例快照id列表
     */
    private List<String> insnapIds;

    /**
     * 快照id列表
     */
    private List<String> snapshotIds;

    /**
     * 磁盘id列表
     */
    private List<String> volumeIds;

    public InstanceDeleteResultModel setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public InstanceDeleteResultModel setEip(String eip) {
        this.eip = eip;
        return this;
    }

    public String getEip() {
        return this.eip;
    }

    public InstanceDeleteResultModel setInsnapIds(List<String> insnapIds) {
        this.insnapIds = insnapIds;
        return this;
    }

    public List<String> getInsnapIds() {
        return this.insnapIds;
    }

    public InstanceDeleteResultModel setSnapshotIds(List<String> snapshotIds) {
        this.snapshotIds = snapshotIds;
        return this;
    }

    public List<String> getSnapshotIds() {
        return this.snapshotIds;
    }

    public InstanceDeleteResultModel setVolumeIds(List<String> volumeIds) {
        this.volumeIds = volumeIds;
        return this;
    }

    public List<String> getVolumeIds() {
        return this.volumeIds;
    }

    @Override
    public String toString() {
        return "InstanceDeleteResultModel{" + "instanceId=" + instanceId + "\n" + "eip=" + eip + "\n" + "insnapIds=" + insnapIds + "\n" + "snapshotIds=" + snapshotIds + "\n"
                + "volumeIds=" + volumeIds + "\n" + "}";
    }

}