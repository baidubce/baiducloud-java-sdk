package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAProxyInstanceRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * billing
    */
    private Billing billing;

    /**
    * 主实例ID
    */
    private String sourceInstanceId;

    /**
    * 用户自定义实例名，要求： 1）允许小写字母、数字； 2）长度限制为1~32； 默认为rdsproxy
    */
    private String instanceName;

    /**
    * 代理实例节点数。取值范围2，4，6，8，16。
    */
    private Integer nodeAmount;

    /**
    * 指定zone信息，默认为空，由系统自动选择，可通过调用[查询可用区列表](/doc/RDS/s/zka65zqz2)接口查询可用区列表。zoneName命名规范是小写的“国家-region-可用区序列"，例如北京可用区A为"cn-bj-a"。 建议与主实例的可用区保持一致。
    */
    private List<String> zoneNames;

    /**
    * 与主实例vpcId相同。
    */
    private String vpcId;

    /**
    * 是否进行直接支付，默认false，设置为直接支付的变配订单会直接扣款，不需要在走支付逻辑。
    */
    private Boolean isDirectPay;

    /**
    * 特定vpc内，可用区的subnetId；如果指定的vpcId为自定义vpc，则必须指定subnetId。可通过调用[查询子网列表](/doc/RDS/s/Wka66184u)接口查询子网列表。 建议与主实例的子网保持一致。
    */
    private List<SubnetMap> subnets;

    /**
    * RDS实例访问入口BLB的ovip，传该参数且值非空，会根据该值为blb的ovip去申请blb，否则申请blb随机分配IP。
    */
    private String ovip;

    /**
    * RDS实例访问入口BLB的端口，传该参数且值非空，会根据该值为blb的listener port去申请blb，否则默认3306，端口取值范围：1024-65535。
    */
    private Integer entryPort;

    /**
    * 资源分组Id，例如：RESG-bKMxbExtnoG。
    */
    private String resourceGroupId;

    public String getClientToken() {
        return clientToken;
    }

    public CreateAProxyInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Billing getBilling() {
        return billing;
    }

    public CreateAProxyInstanceRequest setBilling(Billing billing) {
        this.billing = billing;
        return this;
    }

    public String getSourceInstanceId() {
        return sourceInstanceId;
    }

    public CreateAProxyInstanceRequest setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public CreateAProxyInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    public Integer getNodeAmount() {
        return nodeAmount;
    }

    public CreateAProxyInstanceRequest setNodeAmount(Integer nodeAmount) {
        this.nodeAmount = nodeAmount;
        return this;
    }

    public List<String> getZoneNames() {
        return zoneNames;
    }

    public CreateAProxyInstanceRequest setZoneNames(List<String> zoneNames) {
        this.zoneNames = zoneNames;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public CreateAProxyInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public Boolean getIsDirectPay() {
        return isDirectPay;
    }

    public CreateAProxyInstanceRequest setIsDirectPay(Boolean isDirectPay) {
        this.isDirectPay = isDirectPay;
        return this;
    }

    public List<SubnetMap> getSubnets() {
        return subnets;
    }

    public CreateAProxyInstanceRequest setSubnets(List<SubnetMap> subnets) {
        this.subnets = subnets;
        return this;
    }

    public String getOvip() {
        return ovip;
    }

    public CreateAProxyInstanceRequest setOvip(String ovip) {
        this.ovip = ovip;
        return this;
    }

    public Integer getEntryPort() {
        return entryPort;
    }

    public CreateAProxyInstanceRequest setEntryPort(Integer entryPort) {
        this.entryPort = entryPort;
        return this;
    }

    public String getResourceGroupId() {
        return resourceGroupId;
    }

    public CreateAProxyInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }

}
