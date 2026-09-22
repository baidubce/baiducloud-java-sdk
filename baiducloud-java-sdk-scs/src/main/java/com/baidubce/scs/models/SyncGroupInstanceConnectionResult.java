package com.baidubce.scs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SyncGroupInstanceConnectionResult {
    /**
     * 源实例ID
     */
    private String sourceId;

    /**
     * 源实例角色（可能不返回）
     */
    private String sourceRole;

    /**
     * 目标实例ID
     */
    private String targetId;

    /**
     * 目标实例角色（可能不返回）
     */
    private String targetRole;

    /**
     * 源实例与目标实例是否可连通
     */
    private Boolean connectable;

    public SyncGroupInstanceConnectionResult setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    public String getSourceId() {
        return this.sourceId;
    }

    public SyncGroupInstanceConnectionResult setSourceRole(String sourceRole) {
        this.sourceRole = sourceRole;
        return this;
    }

    public String getSourceRole() {
        return this.sourceRole;
    }

    public SyncGroupInstanceConnectionResult setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    public String getTargetId() {
        return this.targetId;
    }

    public SyncGroupInstanceConnectionResult setTargetRole(String targetRole) {
        this.targetRole = targetRole;
        return this;
    }

    public String getTargetRole() {
        return this.targetRole;
    }

    public SyncGroupInstanceConnectionResult setConnectable(Boolean connectable) {
        this.connectable = connectable;
        return this;
    }

    public Boolean getConnectable() {
        return this.connectable;
    }

    @Override
    public String toString() {
        return "SyncGroupInstanceConnectionResult{" + "sourceId=" + sourceId + "\n" + "sourceRole=" + sourceRole + "\n" + "targetId=" + targetId + "\n" + "targetRole="
                + targetRole + "\n" + "connectable=" + connectable + "\n" + "}";
    }

}