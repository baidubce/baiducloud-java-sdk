package com.baidubce.vdb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MilvusNode {
    /**
     * 
     */
    private String availabilityZone;

    /**
     * 
     */
    private String componentType;

    /**
     * 
     */
    private String fixedIp;

    /**
     * 
     */
    private String floatingIp;

    /**
     * 
     */
    private String nodeId;

    /**
     * 
     */
    private Integer port;

    /**
     * 
     */
    private String status;

    public MilvusNode setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    public MilvusNode setComponentType(String componentType) {
        this.componentType = componentType;
        return this;
    }

    public String getComponentType() {
        return this.componentType;
    }

    public MilvusNode setFixedIp(String fixedIp) {
        this.fixedIp = fixedIp;
        return this;
    }

    public String getFixedIp() {
        return this.fixedIp;
    }

    public MilvusNode setFloatingIp(String floatingIp) {
        this.floatingIp = floatingIp;
        return this;
    }

    public String getFloatingIp() {
        return this.floatingIp;
    }

    public MilvusNode setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    public String getNodeId() {
        return this.nodeId;
    }

    public MilvusNode setPort(Integer port) {
        this.port = port;
        return this;
    }

    public Integer getPort() {
        return this.port;
    }

    public MilvusNode setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        return "MilvusNode{" + "availabilityZone=" + availabilityZone + "\n" + "componentType=" + componentType + "\n" + "fixedIp=" + fixedIp + "\n" + "floatingIp=" + floatingIp
                + "\n" + "nodeId=" + nodeId + "\n" + "port=" + port + "\n" + "status=" + status + "\n" + "}";
    }

}