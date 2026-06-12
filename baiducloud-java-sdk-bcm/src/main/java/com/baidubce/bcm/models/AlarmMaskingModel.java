package com.baidubce.bcm.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlarmMaskingModel {
    /**
     * 屏蔽规则ID
     */
    private String id;

    /**
     * 创建时间
     */
    private String createdTime;

    /**
     * 更新时间
     */
    private String updatedTime;

    /**
     * 屏蔽规则状态，ENABLED/DISABLED
     */
    private String state;

    /**
     * 屏蔽规则名称
     */
    private String name;

    /**
     * 云产品命名空间
     */
    private String scope;

    /**
     * 资源类型
     */
    private String resourceType;

    /**
     * 报警策略ID
     */
    private String policyId;

    /**
     * 屏蔽的实例列表
     */
    private List<TargetInstance> instances;

    /**
     * 地域
     */
    private String region;

    /**
     * 屏蔽的指标名称列表
     */
    private List<String> metricNames;

    /**
     * 屏蔽时间类型，FOREVER/FIXED/RELATIVE
     */
    private String periodType;

    /**
     * 屏蔽开始时间
     */
    private String beginTime;

    /**
     * 屏蔽结束时间
     */
    private String endTime;

    /**
     * 时区
     */
    private String tz;

    /**
     * 每日屏蔽开始时间戳
     */
    private Integer dailyBeginTimestamp;

    /**
     * 每日屏蔽结束时间戳
     */
    private Integer dailyEndTimestamp;

    public AlarmMaskingModel setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public AlarmMaskingModel setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getCreatedTime() {
        return this.createdTime;
    }

    public AlarmMaskingModel setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    public String getUpdatedTime() {
        return this.updatedTime;
    }

    public AlarmMaskingModel setState(String state) {
        this.state = state;
        return this;
    }

    public String getState() {
        return this.state;
    }

    public AlarmMaskingModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public AlarmMaskingModel setScope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getScope() {
        return this.scope;
    }

    public AlarmMaskingModel setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public String getResourceType() {
        return this.resourceType;
    }

    public AlarmMaskingModel setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    public String getPolicyId() {
        return this.policyId;
    }

    public AlarmMaskingModel setInstances(List<TargetInstance> instances) {
        this.instances = instances;
        return this;
    }

    public List<TargetInstance> getInstances() {
        return this.instances;
    }

    public AlarmMaskingModel setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getRegion() {
        return this.region;
    }

    public AlarmMaskingModel setMetricNames(List<String> metricNames) {
        this.metricNames = metricNames;
        return this;
    }

    public List<String> getMetricNames() {
        return this.metricNames;
    }

    public AlarmMaskingModel setPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }

    public String getPeriodType() {
        return this.periodType;
    }

    public AlarmMaskingModel setBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    public String getBeginTime() {
        return this.beginTime;
    }

    public AlarmMaskingModel setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public AlarmMaskingModel setTz(String tz) {
        this.tz = tz;
        return this;
    }

    public String getTz() {
        return this.tz;
    }

    public AlarmMaskingModel setDailyBeginTimestamp(Integer dailyBeginTimestamp) {
        this.dailyBeginTimestamp = dailyBeginTimestamp;
        return this;
    }

    public Integer getDailyBeginTimestamp() {
        return this.dailyBeginTimestamp;
    }

    public AlarmMaskingModel setDailyEndTimestamp(Integer dailyEndTimestamp) {
        this.dailyEndTimestamp = dailyEndTimestamp;
        return this;
    }

    public Integer getDailyEndTimestamp() {
        return this.dailyEndTimestamp;
    }

    @Override
    public String toString() {
        return "AlarmMaskingModel{" + "id=" + id + "\n" + "createdTime=" + createdTime + "\n" + "updatedTime=" + updatedTime + "\n" + "state=" + state + "\n" + "name=" + name
                + "\n" + "scope=" + scope + "\n" + "resourceType=" + resourceType + "\n" + "policyId=" + policyId + "\n" + "instances=" + instances + "\n" + "region=" + region
                + "\n" + "metricNames=" + metricNames + "\n" + "periodType=" + periodType + "\n" + "beginTime=" + beginTime + "\n" + "endTime=" + endTime + "\n" + "tz=" + tz
                + "\n" + "dailyBeginTimestamp=" + dailyBeginTimestamp + "\n" + "dailyEndTimestamp=" + dailyEndTimestamp + "\n" + "}";
    }

}