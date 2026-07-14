package com.baidubce.as.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsGroup {
    /**
     * 伸缩组id
     */
    private String groupId;

    /**
     * 伸缩组名称
     */
    private String groupName;

    /**
     * 分区
     */
    private String region;

    /**
     * 状态
     */
    private String status;

    /**
     * 标签信息
     */
    private List<TagInfo> tags;

    /**
     * 是否绑定标签
     */
    private Boolean relationTag;

    /**
     * vpc的id
     */
    private String vpcId;

    /**
     * 伸缩组所在可用区
     */
    private List<Object> zoneInfo;

    /**
     * config
     */
    private GroupConfig config;

    /**
     * 伸缩组绑定BLB，可绑定多个
     */
    private List<BlbInfo> blb;

    /**
     * 节点数量
     */
    private Integer nodeNum;

    /**
     * 规则数量
     */
    private Integer ruleCount;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * healthCheckState
     */
    private HealthCheckState healthCheckState;

    public AsGroup setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public AsGroup setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public AsGroup setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getRegion() {
        return this.region;
    }

    public AsGroup setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public AsGroup setTags(List<TagInfo> tags) {
        this.tags = tags;
        return this;
    }

    public List<TagInfo> getTags() {
        return this.tags;
    }

    public AsGroup setRelationTag(Boolean relationTag) {
        this.relationTag = relationTag;
        return this;
    }

    public Boolean getRelationTag() {
        return this.relationTag;
    }

    public AsGroup setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public AsGroup setZoneInfo(List<Object> zoneInfo) {
        this.zoneInfo = zoneInfo;
        return this;
    }

    public List<Object> getZoneInfo() {
        return this.zoneInfo;
    }

    public AsGroup setConfig(GroupConfig config) {
        this.config = config;
        return this;
    }

    public GroupConfig getConfig() {
        return this.config;
    }

    public AsGroup setBlb(List<BlbInfo> blb) {
        this.blb = blb;
        return this;
    }

    public List<BlbInfo> getBlb() {
        return this.blb;
    }

    public AsGroup setNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }

    public Integer getNodeNum() {
        return this.nodeNum;
    }

    public AsGroup setRuleCount(Integer ruleCount) {
        this.ruleCount = ruleCount;
        return this;
    }

    public Integer getRuleCount() {
        return this.ruleCount;
    }

    public AsGroup setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public AsGroup setHealthCheckState(HealthCheckState healthCheckState) {
        this.healthCheckState = healthCheckState;
        return this;
    }

    public HealthCheckState getHealthCheckState() {
        return this.healthCheckState;
    }

    @Override
    public String toString() {
        return "AsGroup{" + "groupId=" + groupId + "\n" + "groupName=" + groupName + "\n" + "region=" + region + "\n" + "status=" + status + "\n" + "tags=" + tags + "\n"
                + "relationTag=" + relationTag + "\n" + "vpcId=" + vpcId + "\n" + "zoneInfo=" + zoneInfo + "\n" + "config=" + config + "\n" + "blb=" + blb + "\n" + "nodeNum="
                + nodeNum + "\n" + "ruleCount=" + ruleCount + "\n" + "createTime=" + createTime + "\n" + "healthCheckState=" + healthCheckState + "\n" + "}";
    }

}