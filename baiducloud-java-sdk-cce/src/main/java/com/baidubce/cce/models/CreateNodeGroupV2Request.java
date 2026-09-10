package com.baidubce.cce.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateNodeGroupV2Request extends BaseBceRequest {

    /**
    * clusterID
    */
    @JsonIgnore
    private String clusterID;

    /**
    * 节点组名称，不可为空
    */
    private String instanceGroupName;

    /**
    * 节点在集群中的角色. 目前仅支持Node类型阶段组, 默认值为node
    */
    private String clusterRole;

    /**
    * 节点组收缩规则. 可选 [ Priority, Uniform]. 默认为 Priority. Priority 优先收缩掉节点优先值低的节点, Uniform 多子网平均缩容
    */
    private String shrinkPolicy;

    /**
    * 节点组更新规则. 可选 [ Rolling, Concurrency ]. 默认为 Concurrency. Concurrency 并发更新, Rolling 滚动更新. 该参数暂未启用
    */
    private String updatePolicy;

    /**
    * 节点清理规则. 可选 [ Remain, Delete ]. 默认为 Delete.
    */
    private String cleanPolicy;

    /**
    * instanceTemplate
    */
    private InstanceTemplate instanceTemplate;

    /**
    * 节点组节点要求的副本数. 取值范围是自然数集
    */
    private Integer replicas;

    /**
    * clusterAutoscalerSpec
    */
    private ClusterAutoscalerSpec clusterAutoscalerSpec;

    public String getClusterID() {
        return clusterID;
    }

    public CreateNodeGroupV2Request setClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }

    public String getInstanceGroupName() {
        return instanceGroupName;
    }

    public CreateNodeGroupV2Request setInstanceGroupName(String instanceGroupName) {
        this.instanceGroupName = instanceGroupName;
        return this;
    }

    public String getClusterRole() {
        return clusterRole;
    }

    public CreateNodeGroupV2Request setClusterRole(String clusterRole) {
        this.clusterRole = clusterRole;
        return this;
    }

    public String getShrinkPolicy() {
        return shrinkPolicy;
    }

    public CreateNodeGroupV2Request setShrinkPolicy(String shrinkPolicy) {
        this.shrinkPolicy = shrinkPolicy;
        return this;
    }

    public String getUpdatePolicy() {
        return updatePolicy;
    }

    public CreateNodeGroupV2Request setUpdatePolicy(String updatePolicy) {
        this.updatePolicy = updatePolicy;
        return this;
    }

    public String getCleanPolicy() {
        return cleanPolicy;
    }

    public CreateNodeGroupV2Request setCleanPolicy(String cleanPolicy) {
        this.cleanPolicy = cleanPolicy;
        return this;
    }

    public InstanceTemplate getInstanceTemplate() {
        return instanceTemplate;
    }

    public CreateNodeGroupV2Request setInstanceTemplate(InstanceTemplate instanceTemplate) {
        this.instanceTemplate = instanceTemplate;
        return this;
    }

    public Integer getReplicas() {
        return replicas;
    }

    public CreateNodeGroupV2Request setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }

    public ClusterAutoscalerSpec getClusterAutoscalerSpec() {
        return clusterAutoscalerSpec;
    }

    public CreateNodeGroupV2Request setClusterAutoscalerSpec(ClusterAutoscalerSpec clusterAutoscalerSpec) {
        this.clusterAutoscalerSpec = clusterAutoscalerSpec;
        return this;
    }

}
