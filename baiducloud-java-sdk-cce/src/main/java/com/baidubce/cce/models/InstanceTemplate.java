package com.baidubce.cce.models;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstanceTemplate {
    /**
     * 
     */
    private String machineType;

    /**
     * 
     */
    private String instanceType;

    /**
     * 
     */
    private String instanceName;

    /**
     * 
     */
    private Object vpcConfig;

    /**
     * 
     */
    private Object instanceResource;

    /**
     * 
     */
    private Boolean checkGPUDriver;

    /**
     * 
     */
    private String imageID;

    /**
     * 
     */
    private Object userData;

    /**
     * 
     */
    private Object instanceOS;

    /**
     * 
     */
    private Boolean scaleDownDisabled;

    /**
     * 
     */
    private Boolean isOpenHostnameDomain;

    /**
     * 
     */
    private Boolean needEIP;

    /**
     * 
     */
    private Object eipOption;

    /**
     * 
     */
    private Object iamRole;

    /**
     * 
     */
    private Object deployCustomConfig;

    /**
     * 
     */
    private String runtimeType;

    /**
     * 
     */
    private String runtimeVersion;

    /**
     * 
     */
    private List<String> deploySetIDs;

    /**
     * 
     */
    private Map<String, String> labels;

    /**
     * 
     */
    private Map<String, String> annotations;

    /**
     * 
     */
    private List<String> tags;

    /**
     * 
     */
    private List<String> taints;

    /**
     * 
     */
    private Boolean relationTag;

    /**
     * 
     */
    private Object instancePreChargingOption;

    public InstanceTemplate setMachineType(String machineType) {
        this.machineType = machineType;
        return this;
    }

    public String getMachineType() {
        return this.machineType;
    }

    public InstanceTemplate setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    public String getInstanceType() {
        return this.instanceType;
    }

    public InstanceTemplate setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public InstanceTemplate setVpcConfig(Object vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }

    public Object getVpcConfig() {
        return this.vpcConfig;
    }

    public InstanceTemplate setInstanceResource(Object instanceResource) {
        this.instanceResource = instanceResource;
        return this;
    }

    public Object getInstanceResource() {
        return this.instanceResource;
    }

    public InstanceTemplate setCheckGPUDriver(Boolean checkGPUDriver) {
        this.checkGPUDriver = checkGPUDriver;
        return this;
    }

    public Boolean getCheckGPUDriver() {
        return this.checkGPUDriver;
    }

    public InstanceTemplate setImageID(String imageID) {
        this.imageID = imageID;
        return this;
    }

    public String getImageID() {
        return this.imageID;
    }

    public InstanceTemplate setUserData(Object userData) {
        this.userData = userData;
        return this;
    }

    public Object getUserData() {
        return this.userData;
    }

    public InstanceTemplate setInstanceOS(Object instanceOS) {
        this.instanceOS = instanceOS;
        return this;
    }

    public Object getInstanceOS() {
        return this.instanceOS;
    }

    public InstanceTemplate setScaleDownDisabled(Boolean scaleDownDisabled) {
        this.scaleDownDisabled = scaleDownDisabled;
        return this;
    }

    public Boolean getScaleDownDisabled() {
        return this.scaleDownDisabled;
    }

    public InstanceTemplate setIsOpenHostnameDomain(Boolean isOpenHostnameDomain) {
        this.isOpenHostnameDomain = isOpenHostnameDomain;
        return this;
    }

    public Boolean getIsOpenHostnameDomain() {
        return this.isOpenHostnameDomain;
    }

    public InstanceTemplate setNeedEIP(Boolean needEIP) {
        this.needEIP = needEIP;
        return this;
    }

    public Boolean getNeedEIP() {
        return this.needEIP;
    }

    public InstanceTemplate setEipOption(Object eipOption) {
        this.eipOption = eipOption;
        return this;
    }

    public Object getEipOption() {
        return this.eipOption;
    }

    public InstanceTemplate setIamRole(Object iamRole) {
        this.iamRole = iamRole;
        return this;
    }

    public Object getIamRole() {
        return this.iamRole;
    }

    public InstanceTemplate setDeployCustomConfig(Object deployCustomConfig) {
        this.deployCustomConfig = deployCustomConfig;
        return this;
    }

    public Object getDeployCustomConfig() {
        return this.deployCustomConfig;
    }

    public InstanceTemplate setRuntimeType(String runtimeType) {
        this.runtimeType = runtimeType;
        return this;
    }

    public String getRuntimeType() {
        return this.runtimeType;
    }

    public InstanceTemplate setRuntimeVersion(String runtimeVersion) {
        this.runtimeVersion = runtimeVersion;
        return this;
    }

    public String getRuntimeVersion() {
        return this.runtimeVersion;
    }

    public InstanceTemplate setDeploySetIDs(List<String> deploySetIDs) {
        this.deploySetIDs = deploySetIDs;
        return this;
    }

    public List<String> getDeploySetIDs() {
        return this.deploySetIDs;
    }

    public InstanceTemplate setLabels(Map<String, String> labels) {
        this.labels = labels;
        return this;
    }

    public Map<String, String> getLabels() {
        return this.labels;
    }

    public InstanceTemplate setAnnotations(Map<String, String> annotations) {
        this.annotations = annotations;
        return this;
    }

    public Map<String, String> getAnnotations() {
        return this.annotations;
    }

    public InstanceTemplate setTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public InstanceTemplate setTaints(List<String> taints) {
        this.taints = taints;
        return this;
    }

    public List<String> getTaints() {
        return this.taints;
    }

    public InstanceTemplate setRelationTag(Boolean relationTag) {
        this.relationTag = relationTag;
        return this;
    }

    public Boolean getRelationTag() {
        return this.relationTag;
    }

    public InstanceTemplate setInstancePreChargingOption(Object instancePreChargingOption) {
        this.instancePreChargingOption = instancePreChargingOption;
        return this;
    }

    public Object getInstancePreChargingOption() {
        return this.instancePreChargingOption;
    }

    @Override
    public String toString() {
        return "InstanceTemplate{" + "machineType=" + machineType + "\n" + "instanceType=" + instanceType + "\n" + "instanceName=" + instanceName + "\n" + "vpcConfig=" + vpcConfig
                + "\n" + "instanceResource=" + instanceResource + "\n" + "checkGPUDriver=" + checkGPUDriver + "\n" + "imageID=" + imageID + "\n" + "userData=" + userData + "\n"
                + "instanceOS=" + instanceOS + "\n" + "scaleDownDisabled=" + scaleDownDisabled + "\n" + "isOpenHostnameDomain=" + isOpenHostnameDomain + "\n" + "needEIP="
                + needEIP + "\n" + "eipOption=" + eipOption + "\n" + "iamRole=" + iamRole + "\n" + "deployCustomConfig=" + deployCustomConfig + "\n" + "runtimeType=" + runtimeType
                + "\n" + "runtimeVersion=" + runtimeVersion + "\n" + "deploySetIDs=" + deploySetIDs + "\n" + "labels=" + labels + "\n" + "annotations=" + annotations + "\n"
                + "tags=" + tags + "\n" + "taints=" + taints + "\n" + "relationTag=" + relationTag + "\n" + "instancePreChargingOption=" + instancePreChargingOption + "\n" + "}";
    }

}