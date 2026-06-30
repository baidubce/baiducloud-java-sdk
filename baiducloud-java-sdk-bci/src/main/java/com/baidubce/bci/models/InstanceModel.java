package com.baidubce.bci.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstanceModel {
    /**
     * 实例ID
     */
    private String instanceId;

    /**
     * 实例名称（容器组名称）
     */
    private String instanceName;

    /**
     * 状态：Pending、Running、Succeeded、Failed
     */
    private String status;

    /**
     * 所属可用区
     */
    private String zoneName;

    /**
     * cpu类型
     */
    private String cpuType;

    /**
     * gpu类型
     */
    private String gpuType;

    /**
     * cpu核数（核）
     */
    private Float cpu;

    /**
     * memory大小（GiB）
     */
    private Float memory;

    /**
     * 弹性公网IP带宽（Mb）
     */
    private Integer bandwidthInMbps;

    /**
     * 内网IP
     */
    private String internalIp;

    /**
     * 外网IP
     */
    private String publicIp;

    /**
     * 系统创建时间（UTC，RFC3339）
     */
    private String createTime;

    /**
     * 实例更新时间
     */
    private String updateTime;

    /**
     * 实例删除时间
     */
    private String deleteTime;

    /**
     * 重启策略：Never、Always、OnFailure
     */
    private String restartPolicy;

    /**
     * 标签键值对
     */
    private List<Tag> tags;

    public InstanceModel setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public InstanceModel setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public InstanceModel setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public InstanceModel setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getZoneName() {
        return this.zoneName;
    }

    public InstanceModel setCpuType(String cpuType) {
        this.cpuType = cpuType;
        return this;
    }

    public String getCpuType() {
        return this.cpuType;
    }

    public InstanceModel setGpuType(String gpuType) {
        this.gpuType = gpuType;
        return this;
    }

    public String getGpuType() {
        return this.gpuType;
    }

    public InstanceModel setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }

    public Float getCpu() {
        return this.cpu;
    }

    public InstanceModel setMemory(Float memory) {
        this.memory = memory;
        return this;
    }

    public Float getMemory() {
        return this.memory;
    }

    public InstanceModel setBandwidthInMbps(Integer bandwidthInMbps) {
        this.bandwidthInMbps = bandwidthInMbps;
        return this;
    }

    public Integer getBandwidthInMbps() {
        return this.bandwidthInMbps;
    }

    public InstanceModel setInternalIp(String internalIp) {
        this.internalIp = internalIp;
        return this;
    }

    public String getInternalIp() {
        return this.internalIp;
    }

    public InstanceModel setPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    public String getPublicIp() {
        return this.publicIp;
    }

    public InstanceModel setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public InstanceModel setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public InstanceModel setDeleteTime(String deleteTime) {
        this.deleteTime = deleteTime;
        return this;
    }

    public String getDeleteTime() {
        return this.deleteTime;
    }

    public InstanceModel setRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
        return this;
    }

    public String getRestartPolicy() {
        return this.restartPolicy;
    }

    public InstanceModel setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    @Override
    public String toString() {
        return "InstanceModel{" + "instanceId=" + instanceId + "\n" + "instanceName=" + instanceName + "\n" + "status=" + status + "\n" + "zoneName=" + zoneName + "\n"
                + "cpuType=" + cpuType + "\n" + "gpuType=" + gpuType + "\n" + "cpu=" + cpu + "\n" + "memory=" + memory + "\n" + "bandwidthInMbps=" + bandwidthInMbps + "\n"
                + "internalIp=" + internalIp + "\n" + "publicIp=" + publicIp + "\n" + "createTime=" + createTime + "\n" + "updateTime=" + updateTime + "\n" + "deleteTime="
                + deleteTime + "\n" + "restartPolicy=" + restartPolicy + "\n" + "tags=" + tags + "\n" + "}";
    }

}