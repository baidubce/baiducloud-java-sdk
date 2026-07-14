package com.baidubce.as.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetAsGroupV2Response extends BaseBceResponse {

    /**
    * 伸缩组ID
    */
    private String groupId;

    /**
    * 伸缩组名称
    */
    private String groupName;

    /**
    * 伸缩组Region
    */
    private String region;

    /**
    * 伸缩组状态
    */
    private String status;

    /**
    * vpcInfo
    */
    private VpcInfo vpcInfo;

    /**
    * 伸缩组可用区信息
    */
    private List<Object> zoneInfo;

    /**
    * config
    */
    private GroupConfig config;

    /**
    * 创建实例时使用的密钥对ID，非必填
    */
    private String keypairId;

    /**
    * 创建实例时使用的密钥对名称，非必填
    */
    private String keypairName;

    /**
    * 是否使用镜像预置密码
    */
    private Boolean keepImageLogin;

    /**
    * 伸缩组绑定BLB，可绑定多个
    */
    private List<BlbInfo> blb;

    /**
    * BLB等待时间
    */
    private Integer blbUnbindWaitTime;

    /**
    * 伸缩组节点
    */
    private Integer nodeNum;

    /**
    * 创建时间
    */
    private String createTime;

    /**
    * rds的id
    */
    private String rdsIds;

    /**
    * scs的id
    */
    private String scsIds;

    /**
    * 伸缩组扩容策略
    */
    private String expansionStrategy;

    /**
    * 伸缩组缩容策略
    */
    private String shrinkageStrategy;

    /**
    * 是否绑定标签
    */
    private Boolean relationTag;

    /**
    * 伸缩组绑定标签
    */
    private List<TagInfo> tags;

    /**
    * cmdConfig
    */
    private CmdConfig cmdConfig;

    /**
    * bccNameConfig
    */
    private BccNameConfig bccNameConfig;

    /**
    * eipConfig
    */
    private EipConfig eipConfig;

    /**
    * healthCheck
    */
    private HealthCheckConfig healthCheck;

    public String getGroupId() {
        return groupId;
    }

    public GetAsGroupV2Response setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getGroupName() {
        return groupName;
    }

    public GetAsGroupV2Response setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public GetAsGroupV2Response setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public GetAsGroupV2Response setStatus(String status) {
        this.status = status;
        return this;
    }

    public VpcInfo getVpcInfo() {
        return vpcInfo;
    }

    public GetAsGroupV2Response setVpcInfo(VpcInfo vpcInfo) {
        this.vpcInfo = vpcInfo;
        return this;
    }

    public List<Object> getZoneInfo() {
        return zoneInfo;
    }

    public GetAsGroupV2Response setZoneInfo(List<Object> zoneInfo) {
        this.zoneInfo = zoneInfo;
        return this;
    }

    public GroupConfig getConfig() {
        return config;
    }

    public GetAsGroupV2Response setConfig(GroupConfig config) {
        this.config = config;
        return this;
    }

    public String getKeypairId() {
        return keypairId;
    }

    public GetAsGroupV2Response setKeypairId(String keypairId) {
        this.keypairId = keypairId;
        return this;
    }

    public String getKeypairName() {
        return keypairName;
    }

    public GetAsGroupV2Response setKeypairName(String keypairName) {
        this.keypairName = keypairName;
        return this;
    }

    public Boolean getKeepImageLogin() {
        return keepImageLogin;
    }

    public GetAsGroupV2Response setKeepImageLogin(Boolean keepImageLogin) {
        this.keepImageLogin = keepImageLogin;
        return this;
    }

    public List<BlbInfo> getBlb() {
        return blb;
    }

    public GetAsGroupV2Response setBlb(List<BlbInfo> blb) {
        this.blb = blb;
        return this;
    }

    public Integer getBlbUnbindWaitTime() {
        return blbUnbindWaitTime;
    }

    public GetAsGroupV2Response setBlbUnbindWaitTime(Integer blbUnbindWaitTime) {
        this.blbUnbindWaitTime = blbUnbindWaitTime;
        return this;
    }

    public Integer getNodeNum() {
        return nodeNum;
    }

    public GetAsGroupV2Response setNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public GetAsGroupV2Response setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getRdsIds() {
        return rdsIds;
    }

    public GetAsGroupV2Response setRdsIds(String rdsIds) {
        this.rdsIds = rdsIds;
        return this;
    }

    public String getScsIds() {
        return scsIds;
    }

    public GetAsGroupV2Response setScsIds(String scsIds) {
        this.scsIds = scsIds;
        return this;
    }

    public String getExpansionStrategy() {
        return expansionStrategy;
    }

    public GetAsGroupV2Response setExpansionStrategy(String expansionStrategy) {
        this.expansionStrategy = expansionStrategy;
        return this;
    }

    public String getShrinkageStrategy() {
        return shrinkageStrategy;
    }

    public GetAsGroupV2Response setShrinkageStrategy(String shrinkageStrategy) {
        this.shrinkageStrategy = shrinkageStrategy;
        return this;
    }

    public Boolean getRelationTag() {
        return relationTag;
    }

    public GetAsGroupV2Response setRelationTag(Boolean relationTag) {
        this.relationTag = relationTag;
        return this;
    }

    public List<TagInfo> getTags() {
        return tags;
    }

    public GetAsGroupV2Response setTags(List<TagInfo> tags) {
        this.tags = tags;
        return this;
    }

    public CmdConfig getCmdConfig() {
        return cmdConfig;
    }

    public GetAsGroupV2Response setCmdConfig(CmdConfig cmdConfig) {
        this.cmdConfig = cmdConfig;
        return this;
    }

    public BccNameConfig getBccNameConfig() {
        return bccNameConfig;
    }

    public GetAsGroupV2Response setBccNameConfig(BccNameConfig bccNameConfig) {
        this.bccNameConfig = bccNameConfig;
        return this;
    }

    public EipConfig getEipConfig() {
        return eipConfig;
    }

    public GetAsGroupV2Response setEipConfig(EipConfig eipConfig) {
        this.eipConfig = eipConfig;
        return this;
    }

    public HealthCheckConfig getHealthCheck() {
        return healthCheck;
    }

    public GetAsGroupV2Response setHealthCheck(HealthCheckConfig healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }

    @Override
    public String toString() {
        return "GetAsGroupV2Response{" + "groupId=" + groupId + "\n" + "groupName=" + groupName + "\n" + "region=" + region + "\n" + "status=" + status + "\n" + "vpcInfo="
                + vpcInfo + "\n" + "zoneInfo=" + zoneInfo + "\n" + "config=" + config + "\n" + "keypairId=" + keypairId + "\n" + "keypairName=" + keypairName + "\n"
                + "keepImageLogin=" + keepImageLogin + "\n" + "blb=" + blb + "\n" + "blbUnbindWaitTime=" + blbUnbindWaitTime + "\n" + "nodeNum=" + nodeNum + "\n" + "createTime="
                + createTime + "\n" + "rdsIds=" + rdsIds + "\n" + "scsIds=" + scsIds + "\n" + "expansionStrategy=" + expansionStrategy + "\n" + "shrinkageStrategy="
                + shrinkageStrategy + "\n" + "relationTag=" + relationTag + "\n" + "tags=" + tags + "\n" + "cmdConfig=" + cmdConfig + "\n" + "bccNameConfig=" + bccNameConfig
                + "\n" + "eipConfig=" + eipConfig + "\n" + "healthCheck=" + healthCheck + "\n" + "}";
    }

}
