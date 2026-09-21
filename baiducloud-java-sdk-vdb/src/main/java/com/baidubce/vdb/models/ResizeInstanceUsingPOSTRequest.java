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
    * components
    */
    private List<MilvusComponent> components;

    /**
    * dataNodeNum
    */
    private Integer dataNodeNum;

    /**
    * diskFlavor
    */
    private Integer diskFlavor;

    /**
    * diskType
    */
    private String diskType;

    /**
    * env
    */
    private String env;

    /**
    * instanceId
    */
    private String instanceId;

    /**
    * masterNodeSpec
    */
    private String masterNodeSpec;

    /**
    * masterNum
    */
    private Integer masterNum;

    /**
    * nodeSpec
    */
    private String nodeSpec;

    /**
    * nodeType
    */
    private String nodeType;

    /**
    * orderId
    */
    private String orderId;

    /**
    * proxyNodeSpec
    */
    private String proxyNodeSpec;

    /**
    * proxyNum
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
