package com.baidubce.scs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReplicationItem {
    /**
     * 可用区。示例：cn-bj-a
     */
    private String availabilityZone;

    /**
     * 子网ID。示例：sbn-x94w3r601111
     */
    private String subnetId;

    /**
     * 是否是主节点。主节点有且仅有一个。  <li>1：主节点 <li> 0：从节点
     */
    private Integer isMaster;

    /**
     * 只读实例权重，取值 1~100（只读实例时需要）
     */
    private Integer weight;

    public ReplicationItem setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    public ReplicationItem setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public ReplicationItem setIsMaster(Integer isMaster) {
        this.isMaster = isMaster;
        return this;
    }

    public Integer getIsMaster() {
        return this.isMaster;
    }

    public ReplicationItem setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    public Integer getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return "ReplicationItem{" + "availabilityZone=" + availabilityZone + "\n" + "subnetId=" + subnetId + "\n" + "isMaster=" + isMaster + "\n" + "weight=" + weight + "\n"
                + "}";
    }

}