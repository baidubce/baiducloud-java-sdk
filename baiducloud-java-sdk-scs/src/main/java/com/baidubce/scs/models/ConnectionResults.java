package com.baidubce.scs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConnectionResults {
    /**
     * 源端集群ID
     */
    private String sourceId;

    /**
     * 源端集群角色
     */
    private String sourceRole;

    /**
     * 目标端集群ID
     */
    private String targetId;

    /**
     * 目标端集群角色
     */
    private String targetRole;

    /**
     * 是否连通（true:连通 false：不连通）
     */
    private Boolean connectable;

    public ConnectionResults setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    public String getSourceId() {
        return this.sourceId;
    }

    public ConnectionResults setSourceRole(String sourceRole) {
        this.sourceRole = sourceRole;
        return this;
    }

    public String getSourceRole() {
        return this.sourceRole;
    }

    public ConnectionResults setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    public String getTargetId() {
        return this.targetId;
    }

    public ConnectionResults setTargetRole(String targetRole) {
        this.targetRole = targetRole;
        return this;
    }

    public String getTargetRole() {
        return this.targetRole;
    }

    public ConnectionResults setConnectable(Boolean connectable) {
        this.connectable = connectable;
        return this;
    }

    public Boolean getConnectable() {
        return this.connectable;
    }

    @Override
    public String toString() {
        return "ConnectionResults{" + "sourceId=" + sourceId + "\n" + "sourceRole=" + sourceRole + "\n" + "targetId=" + targetId + "\n" + "targetRole=" + targetRole + "\n"
                + "connectable=" + connectable + "\n" + "}";
    }

}