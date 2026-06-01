package com.baidubce.blb.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Service {
    /**
     * 服务发布点的id
     */
    private String serviceId;

    /**
     * 服务发布点的名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 服务名称
     */
    private String serviceName;

    /**
     * 绑定服务类型，目前仅支持绑定BLB实例
     */
    private String bindType;

    /**
     * 绑定实例ID
     */
    private String instanceId;

    /**
     * 发布点状态，取值范围inService/available/unavailable/dead/free，分别表示：服务中/可用/不可用/故障/未绑定
     */
    private String status;

    /**
     * 服务发布点唯一对应域名
     */
    private String service;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 关联的服务网卡数量
     */
    private Integer endpointCount;

    /**
     * 关联的服务网卡列表
     */
    private List<RelatedEndpoint> endpointList;

    /**
     * 授权列表
     */
    private List<Auth> authList;

    public Service setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public Service setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Service setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public Service setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public Service setBindType(String bindType) {
        this.bindType = bindType;
        return this;
    }

    public String getBindType() {
        return this.bindType;
    }

    public Service setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public Service setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public Service setService(String service) {
        this.service = service;
        return this;
    }

    public String getService() {
        return this.service;
    }

    public Service setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public Service setEndpointCount(Integer endpointCount) {
        this.endpointCount = endpointCount;
        return this;
    }

    public Integer getEndpointCount() {
        return this.endpointCount;
    }

    public Service setEndpointList(List<RelatedEndpoint> endpointList) {
        this.endpointList = endpointList;
        return this;
    }

    public List<RelatedEndpoint> getEndpointList() {
        return this.endpointList;
    }

    public Service setAuthList(List<Auth> authList) {
        this.authList = authList;
        return this;
    }

    public List<Auth> getAuthList() {
        return this.authList;
    }

    @Override
    public String toString() {
        return "Service{" + "serviceId=" + serviceId + "\n" + "name=" + name + "\n" + "description=" + description + "\n" + "serviceName=" + serviceName + "\n" + "bindType="
                + bindType + "\n" + "instanceId=" + instanceId + "\n" + "status=" + status + "\n" + "service=" + service + "\n" + "createTime=" + createTime + "\n"
                + "endpointCount=" + endpointCount + "\n" + "endpointList=" + endpointList + "\n" + "authList=" + authList + "\n" + "}";
    }

}