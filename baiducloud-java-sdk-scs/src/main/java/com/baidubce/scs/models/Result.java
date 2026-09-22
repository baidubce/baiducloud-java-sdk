package com.baidubce.scs.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result {
    /**
     * 参数模板数字ID
     */
    private Integer templateId;

    /**
     * 参数模板ID
     */
    private String templateShowId;

    /**
     * 参数模板名称
     */
    private String templateName;

    /**
     * 参数模板参数数量
     */
    private Integer parametersNum;

    /**
     * 集群类型
     */
    private String clusterType;

    /**
     * 引擎类型
     */
    private String engine;

    /**
     * 引擎版本
     */
    private String engineVersion;

    /**
     * 参数模板类型（1为自定义参数模板）
     */
    private Integer templateType;

    /**
     * 该参数是否需要重启，0：不需要，1：需要
     */
    private Integer needReboot;

    /**
     * 备注
     */
    private String comment;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 更新时间
     */
    private String updateTime;

    /**
     * 参数列表
     */
    private List<Parameters> parameters;

    /**
     * 集群ID
     */
    private String cacheClusterShowId;

    /**
     * 集群名称
     */
    private String cacheClusterName;

    /**
     * 可用区
     */
    private String availabilityZone;

    /**
     * 集群版本
     */
    private Integer version;

    /**
     * 集群状态
     */
    private String status;

    /**
     * 应用时间
     */
    private String applyTime;

    /**
     * 参数名称
     */
    private String confName;

    /**
     * 参数默认值
     */
    private String confDefault;

    /**
     * 参数值
     */
    private String confValue;

    /**
     * 参数类型（1:单选类型 2.数字类型 3.多选类型 4.多选类型，单值）
     */
    private Integer confType;

    /**
     * 
     */
    private String confRange;

    /**
     * 1:redis 2:proxy 3.redis+proxy 4.metaserver
     */
    private Integer confModule;

    /**
     * 配置对用户展示含义(转码后的一串字符)
     */
    private String confDesc;

    /**
     * 参数对应的redis版本。例如：2.6、3.2、 4.0、5.0、 all(所有版本都适配)
     */
    private String confRedisVersion;

    /**
     * 生效redis version（和VERSION_TYPE保持一致）
     */
    private Integer confCacheVersion;

    /**
     * 主角色的名称
     */
    private String leaderName;

    /**
     * 主角色的ID
     */
    private String leaderShowId;

    /**
     * 主角色的地域
     */
    private String leaderRegion;

    /**
     * 实例组ID
     */
    private String groupId;

    /**
     * 实例组名称
     */
    private String groupName;

    /**
     * 实例组状态
     */
    private String groupStatus;

    /**
     * 实例组的集群数量
     */
    private Integer clusterNum;

    /**
     * 实例组创建时间
     */
    private String groupCreateTime;

    /**
     * 禁写标志（0 未禁写， 1 禁写）
     */
    private Integer forbidWrite;

    /**
     * 实例组类型。标准版：standalone；集群版：bdrp
     */
    private String groupType;

    public Result setTemplateId(Integer templateId) {
        this.templateId = templateId;
        return this;
    }

    public Integer getTemplateId() {
        return this.templateId;
    }

    public Result setTemplateShowId(String templateShowId) {
        this.templateShowId = templateShowId;
        return this;
    }

    public String getTemplateShowId() {
        return this.templateShowId;
    }

    public Result setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    public String getTemplateName() {
        return this.templateName;
    }

    public Result setParametersNum(Integer parametersNum) {
        this.parametersNum = parametersNum;
        return this;
    }

    public Integer getParametersNum() {
        return this.parametersNum;
    }

    public Result setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    public String getClusterType() {
        return this.clusterType;
    }

    public Result setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public String getEngine() {
        return this.engine;
    }

    public Result setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    public String getEngineVersion() {
        return this.engineVersion;
    }

    public Result setTemplateType(Integer templateType) {
        this.templateType = templateType;
        return this;
    }

    public Integer getTemplateType() {
        return this.templateType;
    }

    public Result setNeedReboot(Integer needReboot) {
        this.needReboot = needReboot;
        return this;
    }

    public Integer getNeedReboot() {
        return this.needReboot;
    }

    public Result setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getComment() {
        return this.comment;
    }

    public Result setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public Result setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public Result setParameters(List<Parameters> parameters) {
        this.parameters = parameters;
        return this;
    }

    public List<Parameters> getParameters() {
        return this.parameters;
    }

    public Result setCacheClusterShowId(String cacheClusterShowId) {
        this.cacheClusterShowId = cacheClusterShowId;
        return this;
    }

    public String getCacheClusterShowId() {
        return this.cacheClusterShowId;
    }

    public Result setCacheClusterName(String cacheClusterName) {
        this.cacheClusterName = cacheClusterName;
        return this;
    }

    public String getCacheClusterName() {
        return this.cacheClusterName;
    }

    public Result setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    public Result setVersion(Integer version) {
        this.version = version;
        return this;
    }

    public Integer getVersion() {
        return this.version;
    }

    public Result setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public Result setApplyTime(String applyTime) {
        this.applyTime = applyTime;
        return this;
    }

    public String getApplyTime() {
        return this.applyTime;
    }

    public Result setConfName(String confName) {
        this.confName = confName;
        return this;
    }

    public String getConfName() {
        return this.confName;
    }

    public Result setConfDefault(String confDefault) {
        this.confDefault = confDefault;
        return this;
    }

    public String getConfDefault() {
        return this.confDefault;
    }

    public Result setConfValue(String confValue) {
        this.confValue = confValue;
        return this;
    }

    public String getConfValue() {
        return this.confValue;
    }

    public Result setConfType(Integer confType) {
        this.confType = confType;
        return this;
    }

    public Integer getConfType() {
        return this.confType;
    }

    public Result setConfRange(String confRange) {
        this.confRange = confRange;
        return this;
    }

    public String getConfRange() {
        return this.confRange;
    }

    public Result setConfModule(Integer confModule) {
        this.confModule = confModule;
        return this;
    }

    public Integer getConfModule() {
        return this.confModule;
    }

    public Result setConfDesc(String confDesc) {
        this.confDesc = confDesc;
        return this;
    }

    public String getConfDesc() {
        return this.confDesc;
    }

    public Result setConfRedisVersion(String confRedisVersion) {
        this.confRedisVersion = confRedisVersion;
        return this;
    }

    public String getConfRedisVersion() {
        return this.confRedisVersion;
    }

    public Result setConfCacheVersion(Integer confCacheVersion) {
        this.confCacheVersion = confCacheVersion;
        return this;
    }

    public Integer getConfCacheVersion() {
        return this.confCacheVersion;
    }

    public Result setLeaderName(String leaderName) {
        this.leaderName = leaderName;
        return this;
    }

    public String getLeaderName() {
        return this.leaderName;
    }

    public Result setLeaderShowId(String leaderShowId) {
        this.leaderShowId = leaderShowId;
        return this;
    }

    public String getLeaderShowId() {
        return this.leaderShowId;
    }

    public Result setLeaderRegion(String leaderRegion) {
        this.leaderRegion = leaderRegion;
        return this;
    }

    public String getLeaderRegion() {
        return this.leaderRegion;
    }

    public Result setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public Result setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public Result setGroupStatus(String groupStatus) {
        this.groupStatus = groupStatus;
        return this;
    }

    public String getGroupStatus() {
        return this.groupStatus;
    }

    public Result setClusterNum(Integer clusterNum) {
        this.clusterNum = clusterNum;
        return this;
    }

    public Integer getClusterNum() {
        return this.clusterNum;
    }

    public Result setGroupCreateTime(String groupCreateTime) {
        this.groupCreateTime = groupCreateTime;
        return this;
    }

    public String getGroupCreateTime() {
        return this.groupCreateTime;
    }

    public Result setForbidWrite(Integer forbidWrite) {
        this.forbidWrite = forbidWrite;
        return this;
    }

    public Integer getForbidWrite() {
        return this.forbidWrite;
    }

    public Result setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }

    public String getGroupType() {
        return this.groupType;
    }

    @Override
    public String toString() {
        return "Result{" + "templateId=" + templateId + "\n" + "templateShowId=" + templateShowId + "\n" + "templateName=" + templateName + "\n" + "parametersNum=" + parametersNum
                + "\n" + "clusterType=" + clusterType + "\n" + "engine=" + engine + "\n" + "engineVersion=" + engineVersion + "\n" + "templateType=" + templateType + "\n"
                + "needReboot=" + needReboot + "\n" + "comment=" + comment + "\n" + "createTime=" + createTime + "\n" + "updateTime=" + updateTime + "\n" + "parameters="
                + parameters + "\n" + "cacheClusterShowId=" + cacheClusterShowId + "\n" + "cacheClusterName=" + cacheClusterName + "\n" + "availabilityZone=" + availabilityZone
                + "\n" + "version=" + version + "\n" + "status=" + status + "\n" + "applyTime=" + applyTime + "\n" + "confName=" + confName + "\n" + "confDefault=" + confDefault
                + "\n" + "confValue=" + confValue + "\n" + "confType=" + confType + "\n" + "confRange=" + confRange + "\n" + "confModule=" + confModule + "\n" + "confDesc="
                + confDesc + "\n" + "confRedisVersion=" + confRedisVersion + "\n" + "confCacheVersion=" + confCacheVersion + "\n" + "leaderName=" + leaderName + "\n"
                + "leaderShowId=" + leaderShowId + "\n" + "leaderRegion=" + leaderRegion + "\n" + "groupId=" + groupId + "\n" + "groupName=" + groupName + "\n" + "groupStatus="
                + groupStatus + "\n" + "clusterNum=" + clusterNum + "\n" + "groupCreateTime=" + groupCreateTime + "\n" + "forbidWrite=" + forbidWrite + "\n" + "groupType="
                + groupType + "\n" + "}";
    }

}