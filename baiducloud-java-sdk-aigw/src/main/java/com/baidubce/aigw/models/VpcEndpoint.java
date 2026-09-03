package com.baidubce.aigw.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VpcEndpoint {
    /**
     * VPC Endpoint ID
     */
    private String vpcEndpointId;

    /**
     * VPC ID
     */
    private String vpcId;

    /**
     * 协议
     */
    private String protocol;

    /**
     * 后端 IP
     */
    private String backendIp;

    /**
     * 后端端口
     */
    private String backendPort;

    /**
     * Endpoint IP
     */
    private String endpointIp;

    /**
     * Endpoint 端口
     */
    private String endpointPort;

    /**
     * Endpoint 名称
     */
    private String name;

    /**
     * Endpoint 描述
     */
    private String description;

    /**
     * Endpoint 类型
     */
    private String type;

    /**
     * Endpoint 状态
     */
    private String status;

    public VpcEndpoint setVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
        return this;
    }

    public String getVpcEndpointId() {
        return this.vpcEndpointId;
    }

    public VpcEndpoint setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public VpcEndpoint setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public VpcEndpoint setBackendIp(String backendIp) {
        this.backendIp = backendIp;
        return this;
    }

    public String getBackendIp() {
        return this.backendIp;
    }

    public VpcEndpoint setBackendPort(String backendPort) {
        this.backendPort = backendPort;
        return this;
    }

    public String getBackendPort() {
        return this.backendPort;
    }

    public VpcEndpoint setEndpointIp(String endpointIp) {
        this.endpointIp = endpointIp;
        return this;
    }

    public String getEndpointIp() {
        return this.endpointIp;
    }

    public VpcEndpoint setEndpointPort(String endpointPort) {
        this.endpointPort = endpointPort;
        return this;
    }

    public String getEndpointPort() {
        return this.endpointPort;
    }

    public VpcEndpoint setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public VpcEndpoint setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public VpcEndpoint setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public VpcEndpoint setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        return "VpcEndpoint{" + "vpcEndpointId=" + vpcEndpointId + "\n" + "vpcId=" + vpcId + "\n" + "protocol=" + protocol + "\n" + "backendIp=" + backendIp + "\n"
                + "backendPort=" + backendPort + "\n" + "endpointIp=" + endpointIp + "\n" + "endpointPort=" + endpointPort + "\n" + "name=" + name + "\n" + "description="
                + description + "\n" + "type=" + type + "\n" + "status=" + status + "\n" + "}";
    }

}