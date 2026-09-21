package com.baidubce.vdb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataNode {
    /**
     * 
     */
    private String fixedIp;

    /**
     * 
     */
    private Double flavorInGB;

    /**
     * 
     */
    private String floatingIp;

    /**
     * 
     */
    private String nodeShowID;

    /**
     * 
     */
    private Integer port;

    public DataNode setFixedIp(String fixedIp) {
        this.fixedIp = fixedIp;
        return this;
    }

    public String getFixedIp() {
        return this.fixedIp;
    }

    public DataNode setFlavorInGB(Double flavorInGB) {
        this.flavorInGB = flavorInGB;
        return this;
    }

    public Double getFlavorInGB() {
        return this.flavorInGB;
    }

    public DataNode setFloatingIp(String floatingIp) {
        this.floatingIp = floatingIp;
        return this;
    }

    public String getFloatingIp() {
        return this.floatingIp;
    }

    public DataNode setNodeShowID(String nodeShowID) {
        this.nodeShowID = nodeShowID;
        return this;
    }

    public String getNodeShowID() {
        return this.nodeShowID;
    }

    public DataNode setPort(Integer port) {
        this.port = port;
        return this;
    }

    public Integer getPort() {
        return this.port;
    }

    @Override
    public String toString() {
        return "DataNode{" + "fixedIp=" + fixedIp + "\n" + "flavorInGB=" + flavorInGB + "\n" + "floatingIp=" + floatingIp + "\n" + "nodeShowID=" + nodeShowID + "\n" + "port="
                + port + "\n" + "}";
    }

}