package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateAlarmMaskingRequest extends BaseBceRequest {

    /**
    * 屏蔽规则ID
    */
    private String id;

    /**
    * 屏蔽规则状态，可选ENABLED/DISABLED
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
    * 屏蔽时间类型，默认FOREVER，可选FOREVER/FIXED/RELATIVE
    */
    private String periodType;

    /**
    * 屏蔽开始时间，periodType为FIXED时必填
    */
    private String beginTime;

    /**
    * 屏蔽结束时间，periodType为FIXED时必填
    */
    private String endTime;

    /**
    * 时区
    */
    private String tz;

    /**
    * 每日屏蔽开始时间戳，periodType为RELATIVE时必填
    */
    private Integer dailyBeginTimestamp;

    /**
    * 每日屏蔽结束时间戳，periodType为RELATIVE时必填
    */
    private Integer dailyEndTimestamp;

    public String getId() {
        return id;
    }

    public UpdateAlarmMaskingRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getState() {
        return state;
    }

    public UpdateAlarmMaskingRequest setState(String state) {
        this.state = state;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateAlarmMaskingRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getScope() {
        return scope;
    }

    public UpdateAlarmMaskingRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getResourceType() {
        return resourceType;
    }

    public UpdateAlarmMaskingRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public String getPolicyId() {
        return policyId;
    }

    public UpdateAlarmMaskingRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    public List<TargetInstance> getInstances() {
        return instances;
    }

    public UpdateAlarmMaskingRequest setInstances(List<TargetInstance> instances) {
        this.instances = instances;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public UpdateAlarmMaskingRequest setRegion(String region) {
        this.region = region;
        return this;
    }

    public List<String> getMetricNames() {
        return metricNames;
    }

    public UpdateAlarmMaskingRequest setMetricNames(List<String> metricNames) {
        this.metricNames = metricNames;
        return this;
    }

    public String getPeriodType() {
        return periodType;
    }

    public UpdateAlarmMaskingRequest setPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public UpdateAlarmMaskingRequest setBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    public String getEndTime() {
        return endTime;
    }

    public UpdateAlarmMaskingRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getTz() {
        return tz;
    }

    public UpdateAlarmMaskingRequest setTz(String tz) {
        this.tz = tz;
        return this;
    }

    public Integer getDailyBeginTimestamp() {
        return dailyBeginTimestamp;
    }

    public UpdateAlarmMaskingRequest setDailyBeginTimestamp(Integer dailyBeginTimestamp) {
        this.dailyBeginTimestamp = dailyBeginTimestamp;
        return this;
    }

    public Integer getDailyEndTimestamp() {
        return dailyEndTimestamp;
    }

    public UpdateAlarmMaskingRequest setDailyEndTimestamp(Integer dailyEndTimestamp) {
        this.dailyEndTimestamp = dailyEndTimestamp;
        return this;
    }

}
