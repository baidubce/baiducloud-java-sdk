package com.baidubce.bci.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateInstanceRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * BCI实例名称（容器组名称），长度2-252，由字母数字、"-"或"."组成，必须以字母数字开头和结尾
    */
    private String name;

    /**
    * 可用区名称
    */
    private String zoneName;

    /**
    * 安全组ID，所有安全组、子网应属于同一VPC，上限10
    */
    private List<String> securityGroupIds;

    /**
    * 子网ID，属于同一VPC，不可重复，上限10
    */
    private List<String> subnetIds;

    /**
    * 重启策略：Always（默认）、Never、OnFailure
    */
    private String restartPolicy;

    /**
    * 弹性公网IP
    */
    private String eipIp;

    /**
    * 是否自动创建EIP并绑定，仅eipIp为空时生效，默认false
    */
    private Boolean autoCreateEip;

    /**
    * 弹性公网名称，autoCreateEip为true时生效，默认"eip"
    */
    private String eipName;

    /**
    * EIP线路类型：BGP（标准）或BGP_S（增强），默认BGP
    */
    private String eipRouteType;

    /**
    * 公网带宽(Mbps)，标准BGP 1-500，增强BGP 100-5000，按流量计费标准BGP 1-200，默认100
    */
    private Integer eipBandwidthInMbps;

    /**
    * 计费方式：ByTraffic（按流量，默认）、ByBandwidth（按带宽）、ByPeak95（按增强95）
    */
    private String eipBillingMethod;

    /**
    * GPU资源型号，目前仅支持Nvidia A10 PCIE
    */
    private String gpuType;

    /**
    * 程序缓冲时间，用于关闭前操作
    */
    private Long terminationGracePeriodSeconds;

    /**
    * 主机名称
    */
    private String hostName;

    /**
    * 用户标签列表
    */
    private List<Tag> tags;

    /**
    * 镜像仓库凭证信息
    */
    private List<ImageRegistryCredential> imageRegistryCredentials;

    /**
    * 业务容器组
    */
    private List<Container> containers;

    /**
    * Init容器
    */
    private List<Container> initContainers;

    /**
    * volume
    */
    private Volume volume;

    public String getClientToken() {
        return clientToken;
    }

    public CreateInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateInstanceRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getZoneName() {
        return zoneName;
    }

    public CreateInstanceRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    public CreateInstanceRequest setSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    public List<String> getSubnetIds() {
        return subnetIds;
    }

    public CreateInstanceRequest setSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
        return this;
    }

    public String getRestartPolicy() {
        return restartPolicy;
    }

    public CreateInstanceRequest setRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
        return this;
    }

    public String getEipIp() {
        return eipIp;
    }

    public CreateInstanceRequest setEipIp(String eipIp) {
        this.eipIp = eipIp;
        return this;
    }

    public Boolean getAutoCreateEip() {
        return autoCreateEip;
    }

    public CreateInstanceRequest setAutoCreateEip(Boolean autoCreateEip) {
        this.autoCreateEip = autoCreateEip;
        return this;
    }

    public String getEipName() {
        return eipName;
    }

    public CreateInstanceRequest setEipName(String eipName) {
        this.eipName = eipName;
        return this;
    }

    public String getEipRouteType() {
        return eipRouteType;
    }

    public CreateInstanceRequest setEipRouteType(String eipRouteType) {
        this.eipRouteType = eipRouteType;
        return this;
    }

    public Integer getEipBandwidthInMbps() {
        return eipBandwidthInMbps;
    }

    public CreateInstanceRequest setEipBandwidthInMbps(Integer eipBandwidthInMbps) {
        this.eipBandwidthInMbps = eipBandwidthInMbps;
        return this;
    }

    public String getEipBillingMethod() {
        return eipBillingMethod;
    }

    public CreateInstanceRequest setEipBillingMethod(String eipBillingMethod) {
        this.eipBillingMethod = eipBillingMethod;
        return this;
    }

    public String getGpuType() {
        return gpuType;
    }

    public CreateInstanceRequest setGpuType(String gpuType) {
        this.gpuType = gpuType;
        return this;
    }

    public Long getTerminationGracePeriodSeconds() {
        return terminationGracePeriodSeconds;
    }

    public CreateInstanceRequest setTerminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
        return this;
    }

    public String getHostName() {
        return hostName;
    }

    public CreateInstanceRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public CreateInstanceRequest setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public List<ImageRegistryCredential> getImageRegistryCredentials() {
        return imageRegistryCredentials;
    }

    public CreateInstanceRequest setImageRegistryCredentials(List<ImageRegistryCredential> imageRegistryCredentials) {
        this.imageRegistryCredentials = imageRegistryCredentials;
        return this;
    }

    public List<Container> getContainers() {
        return containers;
    }

    public CreateInstanceRequest setContainers(List<Container> containers) {
        this.containers = containers;
        return this;
    }

    public List<Container> getInitContainers() {
        return initContainers;
    }

    public CreateInstanceRequest setInitContainers(List<Container> initContainers) {
        this.initContainers = initContainers;
        return this;
    }

    public Volume getVolume() {
        return volume;
    }

    public CreateInstanceRequest setVolume(Volume volume) {
        this.volume = volume;
        return this;
    }

}
