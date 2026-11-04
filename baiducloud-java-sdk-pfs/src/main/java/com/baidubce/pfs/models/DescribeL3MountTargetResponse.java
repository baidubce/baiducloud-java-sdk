package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeL3MountTargetResponse extends BaseBceResponse {

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    private String requestId;

    /**
    * 挂载地址
    */
    private String domain;

    /**
    * 挂载点ID
    */
    private String mountTargetId;

    /**
    * 挂载点IP
    */
    private String ovip;

    /**
    * 挂载点所在VPCID
    */
    private String vpcId;

    /**
    * 挂载点所在子网ID
    */
    private String subnetId;

    /**
    * response body
    */
    private String name;

    /**
    * 协议类型
    */
    private String protocol;

    /**
    * 权限组名称
    */
    private String accessGroupName;

    /**
    * 挂载客户端数量
    */
    private Integer clientCount;

    /**
    * 挂载点状态（0 启动；1 禁用）
    */
    private Integer admissionStatus;

    public String getRequestId() {
        return requestId;
    }

    public DescribeL3MountTargetResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getDomain() {
        return domain;
    }

    public DescribeL3MountTargetResponse setDomain(String domain) {
        this.domain = domain;
        return this;
    }

    public String getMountTargetId() {
        return mountTargetId;
    }

    public DescribeL3MountTargetResponse setMountTargetId(String mountTargetId) {
        this.mountTargetId = mountTargetId;
        return this;
    }

    public String getOvip() {
        return ovip;
    }

    public DescribeL3MountTargetResponse setOvip(String ovip) {
        this.ovip = ovip;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public DescribeL3MountTargetResponse setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public DescribeL3MountTargetResponse setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getName() {
        return name;
    }

    public DescribeL3MountTargetResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getProtocol() {
        return protocol;
    }

    public DescribeL3MountTargetResponse setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public String getAccessGroupName() {
        return accessGroupName;
    }

    public DescribeL3MountTargetResponse setAccessGroupName(String accessGroupName) {
        this.accessGroupName = accessGroupName;
        return this;
    }

    public Integer getClientCount() {
        return clientCount;
    }

    public DescribeL3MountTargetResponse setClientCount(Integer clientCount) {
        this.clientCount = clientCount;
        return this;
    }

    public Integer getAdmissionStatus() {
        return admissionStatus;
    }

    public DescribeL3MountTargetResponse setAdmissionStatus(Integer admissionStatus) {
        this.admissionStatus = admissionStatus;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeL3MountTargetResponse{" + "requestId=" + requestId + "\n" + "domain=" + domain + "\n" + "mountTargetId=" + mountTargetId + "\n" + "ovip=" + ovip + "\n"
                + "vpcId=" + vpcId + "\n" + "subnetId=" + subnetId + "\n" + "name=" + name + "\n" + "protocol=" + protocol + "\n" + "accessGroupName=" + accessGroupName + "\n"
                + "clientCount=" + clientCount + "\n" + "admissionStatus=" + admissionStatus + "\n" + "}";
    }

}
