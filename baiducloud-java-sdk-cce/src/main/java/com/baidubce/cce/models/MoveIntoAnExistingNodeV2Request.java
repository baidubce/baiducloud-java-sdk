package com.baidubce.cce.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MoveIntoAnExistingNodeV2Request extends BaseBceRequest {

    /**
    * clusterID
    */
    @JsonIgnore
    private String clusterID;

    /**
    * instanceGroupID
    */
    @JsonIgnore
    private String instanceGroupID;

    /**
    * 是否是集群内节点。
    */
    private Boolean inCluster;

    /**
    * 针对集群外节点生效，设置为 true 将使用节点组配置。
    */
    private Boolean useInstanceGroupConfig;

    /**
    * 针对集群外节点生效，设置为 true 将使用节点组配置（含磁盘信息）。
    */
    private Boolean useInstanceGroupConfigWithDiskInfo;

    /**
    * 是否安装 GPU 驱动
    */
    private Boolean installGpuDriver;

    /**
    * 配置集群外节点的详细信息。
    */
    private List<InstanceSet> existedInstances;

    /**
    * 配置集群内节点的详细信息。
    */
    private List<ExistedInstanceInCluster> existedInstancesInCluster;

    public String getClusterID() {
        return clusterID;
    }

    public MoveIntoAnExistingNodeV2Request setClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }

    public String getInstanceGroupID() {
        return instanceGroupID;
    }

    public MoveIntoAnExistingNodeV2Request setInstanceGroupID(String instanceGroupID) {
        this.instanceGroupID = instanceGroupID;
        return this;
    }

    public Boolean getInCluster() {
        return inCluster;
    }

    public MoveIntoAnExistingNodeV2Request setInCluster(Boolean inCluster) {
        this.inCluster = inCluster;
        return this;
    }

    public Boolean getUseInstanceGroupConfig() {
        return useInstanceGroupConfig;
    }

    public MoveIntoAnExistingNodeV2Request setUseInstanceGroupConfig(Boolean useInstanceGroupConfig) {
        this.useInstanceGroupConfig = useInstanceGroupConfig;
        return this;
    }

    public Boolean getUseInstanceGroupConfigWithDiskInfo() {
        return useInstanceGroupConfigWithDiskInfo;
    }

    public MoveIntoAnExistingNodeV2Request setUseInstanceGroupConfigWithDiskInfo(Boolean useInstanceGroupConfigWithDiskInfo) {
        this.useInstanceGroupConfigWithDiskInfo = useInstanceGroupConfigWithDiskInfo;
        return this;
    }

    public Boolean getInstallGpuDriver() {
        return installGpuDriver;
    }

    public MoveIntoAnExistingNodeV2Request setInstallGpuDriver(Boolean installGpuDriver) {
        this.installGpuDriver = installGpuDriver;
        return this;
    }

    public List<InstanceSet> getExistedInstances() {
        return existedInstances;
    }

    public MoveIntoAnExistingNodeV2Request setExistedInstances(List<InstanceSet> existedInstances) {
        this.existedInstances = existedInstances;
        return this;
    }

    public List<ExistedInstanceInCluster> getExistedInstancesInCluster() {
        return existedInstancesInCluster;
    }

    public MoveIntoAnExistingNodeV2Request setExistedInstancesInCluster(List<ExistedInstanceInCluster> existedInstancesInCluster) {
        this.existedInstancesInCluster = existedInstancesInCluster;
        return this;
    }

}
