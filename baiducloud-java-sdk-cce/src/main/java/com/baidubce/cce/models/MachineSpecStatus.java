package com.baidubce.cce.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MachineSpecStatus {
    /**
     * 
     */
    private String machineSpec;

    /**
     * 
     */
    private String status;

    public MachineSpecStatus setMachineSpec(String machineSpec) {
        this.machineSpec = machineSpec;
        return this;
    }

    public String getMachineSpec() {
        return this.machineSpec;
    }

    public MachineSpecStatus setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        return "MachineSpecStatus{" + "machineSpec=" + machineSpec + "\n" + "status=" + status + "\n" + "}";
    }

}