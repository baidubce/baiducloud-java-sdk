package com.baidubce.privatezone.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DnsResolver {
    /**
     * 解析器ID
     */
    private String id;

    /**
     * 解析器名称
     */
    private String name;

    /**
     * 解析器状态：CREATING（创建中）、CREATE_FAILED（创建失败）、RUNNING（运行中）、STOPPED（停止运行）、DELETING（删除中）
     */
    private String status;

    /**
     * 解析器描述
     */
    private String description;

    /**
     * VPC ID，解析器所有出站或入站的 DNS 查询流量都将经由该 VPC 进行流量转发
     */
    private String vpcId;

    /**
     * 解析器类型：outbound（出站解析器）、inbound（入站解析器）
     */
    private String type;

    /**
     * 解析器所在的地区
     */
    private String vpcRegion;

    /**
     * 入站 / 出站的流量地址
     */
    private List<IpModel> ipModels;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 更新时间
     */
    private String updateTime;

    public DnsResolver setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public DnsResolver setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public DnsResolver setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public DnsResolver setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public DnsResolver setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public DnsResolver setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public DnsResolver setVpcRegion(String vpcRegion) {
        this.vpcRegion = vpcRegion;
        return this;
    }

    public String getVpcRegion() {
        return this.vpcRegion;
    }

    public DnsResolver setIpModels(List<IpModel> ipModels) {
        this.ipModels = ipModels;
        return this;
    }

    public List<IpModel> getIpModels() {
        return this.ipModels;
    }

    public DnsResolver setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public DnsResolver setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    @Override
    public String toString() {
        return "DnsResolver{" + "id=" + id + "\n" + "name=" + name + "\n" + "status=" + status + "\n" + "description=" + description + "\n" + "vpcId=" + vpcId + "\n" + "type="
                + type + "\n" + "vpcRegion=" + vpcRegion + "\n" + "ipModels=" + ipModels + "\n" + "createTime=" + createTime + "\n" + "updateTime=" + updateTime + "\n" + "}";
    }

}