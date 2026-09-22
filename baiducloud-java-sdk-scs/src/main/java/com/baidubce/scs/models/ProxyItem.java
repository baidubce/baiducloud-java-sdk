package com.baidubce.scs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProxyItem {
    /**
     * 代理节点UUID
     */
    private String uuid;

    /**
     * 代理节点展示ID
     */
    private String nodeShowId;

    /**
     * 可用区
     */
    private String availabilityZone;

    /**
     * api返回参数，同 nodeShowId
     */
    private String nodeId;

    public ProxyItem setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public String getUuid() {
        return this.uuid;
    }

    public ProxyItem setNodeShowId(String nodeShowId) {
        this.nodeShowId = nodeShowId;
        return this;
    }

    public String getNodeShowId() {
        return this.nodeShowId;
    }

    public ProxyItem setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    public ProxyItem setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    public String getNodeId() {
        return this.nodeId;
    }

    @Override
    public String toString() {
        return "ProxyItem{" + "uuid=" + uuid + "\n" + "nodeShowId=" + nodeShowId + "\n" + "availabilityZone=" + availabilityZone + "\n" + "nodeId=" + nodeId + "\n" + "}";
    }

}