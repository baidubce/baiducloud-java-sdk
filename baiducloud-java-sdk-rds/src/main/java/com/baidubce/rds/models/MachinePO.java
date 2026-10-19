package com.baidubce.rds.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MachinePO {
    /**
     * dcc主机ID。
     */
    private Integer id;

    /**
     * 更新时间，规范参考[时间与日期](/doc/RDS/s/9jwvz0wd3#%E6%97%B6%E9%97%B4%E4%B8%8E%E6%97%A5%E6%9C%9F)。
     */
    private String updatedTime;

    /**
     * 实例ID。
     */
    private String instanceId;

    /**
     * 机器实例ID。
     */
    private String machineInstanceId;

    /**
     * 机器实例名。
     */
    private String machineInstanceName;

    /**
     * 实例状态，参见[实例状态表](/doc/RDS/s/9jwvz0wd3#%E5%AE%9E%E4%BE%8B%E7%8A%B6%E6%80%81)。
     */
    private String machineInstanceStatus;

    /**
     * 是否可用，true：是 false：否。
     */
    private Boolean available;

    /**
     * 实例角色。
     */
    private String instanceRole;

    /**
     * 主机类型，默认只有dcc。
     */
    private String machineType;

    /**
     * 实例的逻辑可用区。
     */
    private String azone;

    public MachinePO setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getId() {
        return this.id;
    }

    public MachinePO setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    public String getUpdatedTime() {
        return this.updatedTime;
    }

    public MachinePO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public MachinePO setMachineInstanceId(String machineInstanceId) {
        this.machineInstanceId = machineInstanceId;
        return this;
    }

    public String getMachineInstanceId() {
        return this.machineInstanceId;
    }

    public MachinePO setMachineInstanceName(String machineInstanceName) {
        this.machineInstanceName = machineInstanceName;
        return this;
    }

    public String getMachineInstanceName() {
        return this.machineInstanceName;
    }

    public MachinePO setMachineInstanceStatus(String machineInstanceStatus) {
        this.machineInstanceStatus = machineInstanceStatus;
        return this;
    }

    public String getMachineInstanceStatus() {
        return this.machineInstanceStatus;
    }

    public MachinePO setAvailable(Boolean available) {
        this.available = available;
        return this;
    }

    public Boolean getAvailable() {
        return this.available;
    }

    public MachinePO setInstanceRole(String instanceRole) {
        this.instanceRole = instanceRole;
        return this;
    }

    public String getInstanceRole() {
        return this.instanceRole;
    }

    public MachinePO setMachineType(String machineType) {
        this.machineType = machineType;
        return this;
    }

    public String getMachineType() {
        return this.machineType;
    }

    public MachinePO setAzone(String azone) {
        this.azone = azone;
        return this;
    }

    public String getAzone() {
        return this.azone;
    }

    @Override
    public String toString() {
        return "MachinePO{" + "id=" + id + "\n" + "updatedTime=" + updatedTime + "\n" + "instanceId=" + instanceId + "\n" + "machineInstanceId=" + machineInstanceId + "\n"
                + "machineInstanceName=" + machineInstanceName + "\n" + "machineInstanceStatus=" + machineInstanceStatus + "\n" + "available=" + available + "\n" + "instanceRole="
                + instanceRole + "\n" + "machineType=" + machineType + "\n" + "azone=" + azone + "\n" + "}";
    }

}