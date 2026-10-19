package com.baidubce.rds.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Topology {
    /**
     * 主实例列表。
     */
    private List<String> master;

    /**
     * 只读实列列表。
     */
    private List<String> readReplica;

    /**
     * 代理实例列表。
     */
    private List<String> rdsproxy;

    /**
     * 只读实例映射。
     */
    private List<ReadReplicaIdMapping> readReplicaIdMapping;

    /**
     * masterIdMapping
     */
    private MasterIdMapping masterIdMapping;

    /**
     * rdsproxyIdMapping
     */
    private ReadReplicaIdMapping rdsproxyIdMapping;

    /**
     * 代理实例映射列表。
     */
    private List<ReadReplicaIdMapping> rdsproxyIdMappings;

    public Topology setMaster(List<String> master) {
        this.master = master;
        return this;
    }

    public List<String> getMaster() {
        return this.master;
    }

    public Topology setReadReplica(List<String> readReplica) {
        this.readReplica = readReplica;
        return this;
    }

    public List<String> getReadReplica() {
        return this.readReplica;
    }

    public Topology setRdsproxy(List<String> rdsproxy) {
        this.rdsproxy = rdsproxy;
        return this;
    }

    public List<String> getRdsproxy() {
        return this.rdsproxy;
    }

    public Topology setReadReplicaIdMapping(List<ReadReplicaIdMapping> readReplicaIdMapping) {
        this.readReplicaIdMapping = readReplicaIdMapping;
        return this;
    }

    public List<ReadReplicaIdMapping> getReadReplicaIdMapping() {
        return this.readReplicaIdMapping;
    }

    public Topology setMasterIdMapping(MasterIdMapping masterIdMapping) {
        this.masterIdMapping = masterIdMapping;
        return this;
    }

    public MasterIdMapping getMasterIdMapping() {
        return this.masterIdMapping;
    }

    public Topology setRdsproxyIdMapping(ReadReplicaIdMapping rdsproxyIdMapping) {
        this.rdsproxyIdMapping = rdsproxyIdMapping;
        return this;
    }

    public ReadReplicaIdMapping getRdsproxyIdMapping() {
        return this.rdsproxyIdMapping;
    }

    public Topology setRdsproxyIdMappings(List<ReadReplicaIdMapping> rdsproxyIdMappings) {
        this.rdsproxyIdMappings = rdsproxyIdMappings;
        return this;
    }

    public List<ReadReplicaIdMapping> getRdsproxyIdMappings() {
        return this.rdsproxyIdMappings;
    }

    @Override
    public String toString() {
        return "Topology{" + "master=" + master + "\n" + "readReplica=" + readReplica + "\n" + "rdsproxy=" + rdsproxy + "\n" + "readReplicaIdMapping=" + readReplicaIdMapping
                + "\n" + "masterIdMapping=" + masterIdMapping + "\n" + "rdsproxyIdMapping=" + rdsproxyIdMapping + "\n" + "rdsproxyIdMappings=" + rdsproxyIdMappings + "\n" + "}";
    }

}