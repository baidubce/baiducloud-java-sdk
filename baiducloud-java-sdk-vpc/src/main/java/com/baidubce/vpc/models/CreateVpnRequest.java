package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateVpnRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 所属VPC的ID
    */
    private String vpcId;

    /**
    * 所属SUBNET的ID
    */
    private String subnetId;

    /**
    * VPN的名称，大小写字母、数字以及-_/.特殊字符，必须以字母开头，长度1-65
    */
    private String vpnName;

    /**
    * VPN网关类型，值“IPSec”表示IPSec-VPN网关，值“SSL”表示SSL-VPN网关，默认为“IPSec”
    */
    private String type;

    /**
    * VPN的描述
    */
    private String description;

    /**
    * VPN绑定的eip
    */
    private String eip;

    /**
    * VPN绑定的标签
    */
    private List<TagModel> tags;

    /**
    * VPN绑定的资源组
    */
    private String resourceGroupId;

    /**
    * billing
    */
    private Billing billing;

    /**
    * SSL-VPN最大客户端连接数。可选 [5, 10, 20, 50, 100, 200, 500, 1000]。仅SSL-VPN需要选这个参数。
    */
    private Integer maxConnection;

    /**
    * 是否开启释放保护。缺省值为false，代表允许删除
    */
    private Boolean deleteProtect;

    public String getClientToken() {
        return clientToken;
    }

    public CreateVpnRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public CreateVpnRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public CreateVpnRequest setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getVpnName() {
        return vpnName;
    }

    public CreateVpnRequest setVpnName(String vpnName) {
        this.vpnName = vpnName;
        return this;
    }

    public String getType() {
        return type;
    }

    public CreateVpnRequest setType(String type) {
        this.type = type;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateVpnRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getEip() {
        return eip;
    }

    public CreateVpnRequest setEip(String eip) {
        this.eip = eip;
        return this;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public CreateVpnRequest setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    public String getResourceGroupId() {
        return resourceGroupId;
    }

    public CreateVpnRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }

    public Billing getBilling() {
        return billing;
    }

    public CreateVpnRequest setBilling(Billing billing) {
        this.billing = billing;
        return this;
    }

    public Integer getMaxConnection() {
        return maxConnection;
    }

    public CreateVpnRequest setMaxConnection(Integer maxConnection) {
        this.maxConnection = maxConnection;
        return this;
    }

    public Boolean getDeleteProtect() {
        return deleteProtect;
    }

    public CreateVpnRequest setDeleteProtect(Boolean deleteProtect) {
        this.deleteProtect = deleteProtect;
        return this;
    }

}
