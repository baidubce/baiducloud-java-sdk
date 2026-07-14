package com.baidubce.as.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAsGroupV2Request extends BaseBceRequest {

    /**
    * 伸缩组名称
    */
    private String groupName;

    /**
    * 伸缩组所在可用区
    */
    private List<ZoneInfo> zoneInfo;

    /**
    * config
    */
    private GroupConfig config;

    /**
    * 创建实例时使用的密钥对 ID
    */
    private String keypairId;

    /**
    * 创建实例时使用的密钥对名称
    */
    private String keypairName;

    /**
    * 是否使用镜像预置密码，非必填，默认为0，当为1时使用预置密码，这时镜像类型必须为自定义镜像
    */
    private Integer keepImageLogin;

    /**
    * 伸缩组绑定BLB，可绑定多个
    */
    private List<BlbInfo> blb;

    /**
    * blbUnbindWaitTime
    */
    private Integer blbUnbindWaitTime;

    /**
    * 伸缩组扩容时节点配置
    */
    private List<NodeInfo> nodes;

    /**
    * eip
    */
    private EipInfo eip;

    /**
    * eipConfig
    */
    private EipConfig eipConfig;

    /**
    * billing
    */
    private BillingInfo billing;

    /**
    * 伸缩组绑定RDS，可绑定多个
    */
    private List<String> rds;

    /**
    * 伸缩组绑定SCS，可绑定多个
    */
    private List<String> scs;

    /**
    * healthCheck
    */
    private HealthCheckConfig healthCheck;

    /**
    * 伸缩组扩容时策略，单可用区时默认为Priority；Priority - 在单可用区优先创建，Balanced - 在所有可用区均衡创建
    */
    private String expansionStrategy;

    /**
    * 伸缩组缩容时策略；Earlier - 删除先创建实例，Later - 删除后创建实例
    */
    private String shrinkageStrategy;

    /**
    * assignTagInfo
    */
    private AssignTagInfo assignTagInfo;

    /**
    * cmdConfig
    */
    private CmdConfig cmdConfig;

    /**
    * bccNameConfig
    */
    private BccNameConfig bccNameConfig;

    public String getGroupName() {
        return groupName;
    }

    public CreateAsGroupV2Request setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    public List<ZoneInfo> getZoneInfo() {
        return zoneInfo;
    }

    public CreateAsGroupV2Request setZoneInfo(List<ZoneInfo> zoneInfo) {
        this.zoneInfo = zoneInfo;
        return this;
    }

    public GroupConfig getConfig() {
        return config;
    }

    public CreateAsGroupV2Request setConfig(GroupConfig config) {
        this.config = config;
        return this;
    }

    public String getKeypairId() {
        return keypairId;
    }

    public CreateAsGroupV2Request setKeypairId(String keypairId) {
        this.keypairId = keypairId;
        return this;
    }

    public String getKeypairName() {
        return keypairName;
    }

    public CreateAsGroupV2Request setKeypairName(String keypairName) {
        this.keypairName = keypairName;
        return this;
    }

    public Integer getKeepImageLogin() {
        return keepImageLogin;
    }

    public CreateAsGroupV2Request setKeepImageLogin(Integer keepImageLogin) {
        this.keepImageLogin = keepImageLogin;
        return this;
    }

    public List<BlbInfo> getBlb() {
        return blb;
    }

    public CreateAsGroupV2Request setBlb(List<BlbInfo> blb) {
        this.blb = blb;
        return this;
    }

    public Integer getBlbUnbindWaitTime() {
        return blbUnbindWaitTime;
    }

    public CreateAsGroupV2Request setBlbUnbindWaitTime(Integer blbUnbindWaitTime) {
        this.blbUnbindWaitTime = blbUnbindWaitTime;
        return this;
    }

    public List<NodeInfo> getNodes() {
        return nodes;
    }

    public CreateAsGroupV2Request setNodes(List<NodeInfo> nodes) {
        this.nodes = nodes;
        return this;
    }

    public EipInfo getEip() {
        return eip;
    }

    public CreateAsGroupV2Request setEip(EipInfo eip) {
        this.eip = eip;
        return this;
    }

    public EipConfig getEipConfig() {
        return eipConfig;
    }

    public CreateAsGroupV2Request setEipConfig(EipConfig eipConfig) {
        this.eipConfig = eipConfig;
        return this;
    }

    public BillingInfo getBilling() {
        return billing;
    }

    public CreateAsGroupV2Request setBilling(BillingInfo billing) {
        this.billing = billing;
        return this;
    }

    public List<String> getRds() {
        return rds;
    }

    public CreateAsGroupV2Request setRds(List<String> rds) {
        this.rds = rds;
        return this;
    }

    public List<String> getScs() {
        return scs;
    }

    public CreateAsGroupV2Request setScs(List<String> scs) {
        this.scs = scs;
        return this;
    }

    public HealthCheckConfig getHealthCheck() {
        return healthCheck;
    }

    public CreateAsGroupV2Request setHealthCheck(HealthCheckConfig healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }

    public String getExpansionStrategy() {
        return expansionStrategy;
    }

    public CreateAsGroupV2Request setExpansionStrategy(String expansionStrategy) {
        this.expansionStrategy = expansionStrategy;
        return this;
    }

    public String getShrinkageStrategy() {
        return shrinkageStrategy;
    }

    public CreateAsGroupV2Request setShrinkageStrategy(String shrinkageStrategy) {
        this.shrinkageStrategy = shrinkageStrategy;
        return this;
    }

    public AssignTagInfo getAssignTagInfo() {
        return assignTagInfo;
    }

    public CreateAsGroupV2Request setAssignTagInfo(AssignTagInfo assignTagInfo) {
        this.assignTagInfo = assignTagInfo;
        return this;
    }

    public CmdConfig getCmdConfig() {
        return cmdConfig;
    }

    public CreateAsGroupV2Request setCmdConfig(CmdConfig cmdConfig) {
        this.cmdConfig = cmdConfig;
        return this;
    }

    public BccNameConfig getBccNameConfig() {
        return bccNameConfig;
    }

    public CreateAsGroupV2Request setBccNameConfig(BccNameConfig bccNameConfig) {
        this.bccNameConfig = bccNameConfig;
        return this;
    }

}
