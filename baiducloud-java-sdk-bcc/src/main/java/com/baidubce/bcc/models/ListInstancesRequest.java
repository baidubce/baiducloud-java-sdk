package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListInstancesRequest extends BaseBceRequest {

    /**
    * marker
    */
    @JsonIgnore
    private String marker;

    /**
    * maxKeys
    */
    @JsonIgnore
    private Integer maxKeys;

    /**
    * internalIp
    */
    @JsonIgnore
    private String internalIp;

    /**
    * dedicatedHostId
    */
    @JsonIgnore
    private String dedicatedHostId;

    /**
    * zoneName
    */
    @JsonIgnore
    private String zoneName;

    /**
    * showRdmaTopo
    */
    @JsonIgnore
    private String showRdmaTopo;

    /**
    * instanceIds
    */
    @JsonIgnore
    private String instanceIds;

    /**
    * instanceNames
    */
    @JsonIgnore
    private String instanceNames;

    /**
    * fuzzyInstanceName
    */
    @JsonIgnore
    private String fuzzyInstanceName;

    /**
    * volumeIds
    */
    @JsonIgnore
    private String volumeIds;

    /**
    * deploySetIds
    */
    @JsonIgnore
    private String deploySetIds;

    /**
    * securityGroupIds
    */
    @JsonIgnore
    private String securityGroupIds;

    /**
    * paymentTiming
    */
    @JsonIgnore
    private String paymentTiming;

    /**
    * status
    */
    @JsonIgnore
    private String status;

    /**
    * tags
    */
    @JsonIgnore
    private String tags;

    /**
    * vpcId
    */
    @JsonIgnore
    private String vpcId;

    /**
    * privateIps
    */
    @JsonIgnore
    private String privateIps;

    /**
    * ehcClusterId
    */
    @JsonIgnore
    private String ehcClusterId;

    public String getMarker() {
        return marker;
    }

    public ListInstancesRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public ListInstancesRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getInternalIp() {
        return internalIp;
    }

    public ListInstancesRequest setInternalIp(String internalIp) {
        this.internalIp = internalIp;
        return this;
    }

    public String getDedicatedHostId() {
        return dedicatedHostId;
    }

    public ListInstancesRequest setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }

    public String getZoneName() {
        return zoneName;
    }

    public ListInstancesRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getShowRdmaTopo() {
        return showRdmaTopo;
    }

    public ListInstancesRequest setShowRdmaTopo(String showRdmaTopo) {
        this.showRdmaTopo = showRdmaTopo;
        return this;
    }

    public String getInstanceIds() {
        return instanceIds;
    }

    public ListInstancesRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public String getInstanceNames() {
        return instanceNames;
    }

    public ListInstancesRequest setInstanceNames(String instanceNames) {
        this.instanceNames = instanceNames;
        return this;
    }

    public String getFuzzyInstanceName() {
        return fuzzyInstanceName;
    }

    public ListInstancesRequest setFuzzyInstanceName(String fuzzyInstanceName) {
        this.fuzzyInstanceName = fuzzyInstanceName;
        return this;
    }

    public String getVolumeIds() {
        return volumeIds;
    }

    public ListInstancesRequest setVolumeIds(String volumeIds) {
        this.volumeIds = volumeIds;
        return this;
    }

    public String getDeploySetIds() {
        return deploySetIds;
    }

    public ListInstancesRequest setDeploySetIds(String deploySetIds) {
        this.deploySetIds = deploySetIds;
        return this;
    }

    public String getSecurityGroupIds() {
        return securityGroupIds;
    }

    public ListInstancesRequest setSecurityGroupIds(String securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    public String getPaymentTiming() {
        return paymentTiming;
    }

    public ListInstancesRequest setPaymentTiming(String paymentTiming) {
        this.paymentTiming = paymentTiming;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ListInstancesRequest setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getTags() {
        return tags;
    }

    public ListInstancesRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public ListInstancesRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getPrivateIps() {
        return privateIps;
    }

    public ListInstancesRequest setPrivateIps(String privateIps) {
        this.privateIps = privateIps;
        return this;
    }

    public String getEhcClusterId() {
        return ehcClusterId;
    }

    public ListInstancesRequest setEhcClusterId(String ehcClusterId) {
        this.ehcClusterId = ehcClusterId;
        return this;
    }

}
