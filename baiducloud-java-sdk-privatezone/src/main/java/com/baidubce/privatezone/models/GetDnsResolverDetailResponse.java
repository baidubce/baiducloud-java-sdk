package com.baidubce.privatezone.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetDnsResolverDetailResponse extends BaseBceResponse {

    /**
    * 解析器id
    */
    private String id;

    /**
    * 解析器名称
    */
    private String name;

    /**
    * 解析器状态，描述：CREATING：创建中；CREATE_FAILED：创建失败；RUNNING：运行中；STOPPED：停止运行；DELETING：删除中
    */
    private String status;

    /**
    * 解析器描述
    */
    private String description;

    /**
    * VPC ID，解析器所有出站或入站的 DNS 查询流量都将经由此 VPC 进行流量转发
    */
    private String vpcId;

    /**
    * 解析器所在的地区
    */
    private String vpcRegion;

    /**
    * 解析器类型，描述：outbound：出站解析器；inbound：入站解析器
    */
    private String type;

    /**
    * 入站/出站的流量地址
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

    public String getId() {
        return id;
    }

    public GetDnsResolverDetailResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public GetDnsResolverDetailResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public GetDnsResolverDetailResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public GetDnsResolverDetailResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public GetDnsResolverDetailResponse setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcRegion() {
        return vpcRegion;
    }

    public GetDnsResolverDetailResponse setVpcRegion(String vpcRegion) {
        this.vpcRegion = vpcRegion;
        return this;
    }

    public String getType() {
        return type;
    }

    public GetDnsResolverDetailResponse setType(String type) {
        this.type = type;
        return this;
    }

    public List<IpModel> getIpModels() {
        return ipModels;
    }

    public GetDnsResolverDetailResponse setIpModels(List<IpModel> ipModels) {
        this.ipModels = ipModels;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public GetDnsResolverDetailResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public GetDnsResolverDetailResponse setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public String toString() {
        return "GetDnsResolverDetailResponse{" + "id=" + id + "\n" + "name=" + name + "\n" + "status=" + status + "\n" + "description=" + description + "\n" + "vpcId=" + vpcId
                + "\n" + "vpcRegion=" + vpcRegion + "\n" + "type=" + type + "\n" + "ipModels=" + ipModels + "\n" + "createTime=" + createTime + "\n" + "updateTime=" + updateTime
                + "\n" + "}";
    }

}
