package com.baidubce.scs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReplicationMap {
    /**
     * 可通过调用获取可用区列表接口查询可用区列表。zoneName命名规范是“国家-region-可用区序列"，小写，例如北京可用区A为"cn-bj-a"
     */
    private String availabilityZone;

    /**
     * 子网Id
     */
    private String subnetId;

    /**
     * 是否是主节点 1代表主 0代表从。主节点有且仅有一个。
     */
    private Integer isMaster;

    public ReplicationMap setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    public ReplicationMap setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public ReplicationMap setIsMaster(Integer isMaster) {
        this.isMaster = isMaster;
        return this;
    }

    public Integer getIsMaster() {
        return this.isMaster;
    }

    @Override
    public String toString() {
        return "ReplicationMap{" + "availabilityZone=" + availabilityZone + "\n" + "subnetId=" + subnetId + "\n" + "isMaster=" + isMaster + "\n" + "}";
    }

}