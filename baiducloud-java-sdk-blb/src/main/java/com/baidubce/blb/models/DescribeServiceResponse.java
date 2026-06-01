package com.baidubce.blb.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeServiceResponse extends BaseBceResponse {

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

    public String getServiceId() {
        return serviceId;
    }

    public DescribeServiceResponse setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    public String getName() {
        return name;
    }

    public DescribeServiceResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public DescribeServiceResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getServiceName() {
        return serviceName;
    }

    public DescribeServiceResponse setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    public String getBindType() {
        return bindType;
    }

    public DescribeServiceResponse setBindType(String bindType) {
        this.bindType = bindType;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public DescribeServiceResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public DescribeServiceResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getService() {
        return service;
    }

    public DescribeServiceResponse setService(String service) {
        this.service = service;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public DescribeServiceResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public Integer getEndpointCount() {
        return endpointCount;
    }

    public DescribeServiceResponse setEndpointCount(Integer endpointCount) {
        this.endpointCount = endpointCount;
        return this;
    }

    public List<RelatedEndpoint> getEndpointList() {
        return endpointList;
    }

    public DescribeServiceResponse setEndpointList(List<RelatedEndpoint> endpointList) {
        this.endpointList = endpointList;
        return this;
    }

    public List<Auth> getAuthList() {
        return authList;
    }

    public DescribeServiceResponse setAuthList(List<Auth> authList) {
        this.authList = authList;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeServiceResponse{" + "serviceId=" + serviceId + "\n" + "name=" + name + "\n" + "description=" + description + "\n" + "serviceName=" + serviceName + "\n"
                + "bindType=" + bindType + "\n" + "instanceId=" + instanceId + "\n" + "status=" + status + "\n" + "service=" + service + "\n" + "createTime=" + createTime + "\n"
                + "endpointCount=" + endpointCount + "\n" + "endpointList=" + endpointList + "\n" + "authList=" + authList + "\n" + "}";
    }

}
