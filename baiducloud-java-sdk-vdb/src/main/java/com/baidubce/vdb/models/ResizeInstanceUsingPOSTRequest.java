package com.baidubce.vdb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResizeInstanceUsingPOSTRequest extends BaseBceRequest {

    /**
    * engineType
    */
    @JsonIgnore
    private String engineType;

    /**
    * 组件配置
    */
    private List<MilvusComponent> components;

    /**
    * 数据节点数量
    */
    private Integer dataNodeNum;

    /**
    * 磁盘容量（GB）
    */
    private Integer diskFlavor;

    /**
    * 磁盘类型
    */
    private String diskType;

    /**
    * 环境
    */
    private String env;

    /**
    * 实例ID
    */
    private String instanceId;

    /**
    * 主节点规格
    */
    private String masterNodeSpec;

    /**
    * 主节点数量
    */
    private Integer masterNum;

    /**
    * 节点规格
    */
    private String nodeSpec;

    /**
    * 节点类型
    */
    private String nodeType;

    /**
    * 订单ID
    */
    private String orderId;

    /**
    * 代理节点规格
    */
    private String proxyNodeSpec;

    /**
    * 代理节点数量
    */
    private Integer proxyNum;

    public String getEngineType() {
        return engineType;
    }

    public ResizeInstanceUsingPOSTRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    public List<MilvusComponent> getComponents() {
        return components;
    }

    public ResizeInstanceUsingPOSTRequest setComponents(List<MilvusComponent> components) {
        this.components = components;
        return this;
    }

    public Integer getDataNodeNum() {
        return dataNodeNum;
    }

    public ResizeInstanceUsingPOSTRequest setDataNodeNum(Integer dataNodeNum) {
        this.dataNodeNum = dataNodeNum;
        return this;
    }

    public Integer getDiskFlavor() {
        return diskFlavor;
    }

    public ResizeInstanceUsingPOSTRequest setDiskFlavor(Integer diskFlavor) {
        this.diskFlavor = diskFlavor;
        return this;
    }

    public String getDiskType() {
        return diskType;
    }

    public ResizeInstanceUsingPOSTRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }

    public String getEnv() {
        return env;
    }

    public ResizeInstanceUsingPOSTRequest setEnv(String env) {
        this.env = env;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public ResizeInstanceUsingPOSTRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getMasterNodeSpec() {
        return masterNodeSpec;
    }

    public ResizeInstanceUsingPOSTRequest setMasterNodeSpec(String masterNodeSpec) {
        this.masterNodeSpec = masterNodeSpec;
        return this;
    }

    public Integer getMasterNum() {
        return masterNum;
    }

    public ResizeInstanceUsingPOSTRequest setMasterNum(Integer masterNum) {
        this.masterNum = masterNum;
        return this;
    }

    public String getNodeSpec() {
        return nodeSpec;
    }

    public ResizeInstanceUsingPOSTRequest setNodeSpec(String nodeSpec) {
        this.nodeSpec = nodeSpec;
        return this;
    }

    public String getNodeType() {
        return nodeType;
    }

    public ResizeInstanceUsingPOSTRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    public String getOrderId() {
        return orderId;
    }

    public ResizeInstanceUsingPOSTRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public String getProxyNodeSpec() {
        return proxyNodeSpec;
    }

    public ResizeInstanceUsingPOSTRequest setProxyNodeSpec(String proxyNodeSpec) {
        this.proxyNodeSpec = proxyNodeSpec;
        return this;
    }

    public Integer getProxyNum() {
        return proxyNum;
    }

    public ResizeInstanceUsingPOSTRequest setProxyNum(Integer proxyNum) {
        this.proxyNum = proxyNum;
        return this;
    }

}
