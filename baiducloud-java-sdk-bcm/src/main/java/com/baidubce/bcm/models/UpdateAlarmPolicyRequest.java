package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateAlarmPolicyRequest extends BaseBceRequest {

    /**
    * 策略ID
    */
    private String id;

    /**
    * 策略状态，可选值：ENABLED / DISABLED
    */
    private String state;

    /**
    * 策略名称
    */
    private String name;

    /**
    * 云产品类型
    */
    private String scope;

    /**
    * 资源类型
    */
    private String resourceType;

    /**
    * target
    */
    private AlarmTarget target;

    /**
    * 报警规则列表（OR规则）
    */
    private List<AlarmRule> rules;

    /**
    * 连续触发阈值，取值范围：大于0
    */
    private Integer pendingCount;

    /**
    * 无数据处理方式，可选值：IGNORE / SHOW_NO_DATA_AND_NOTIFY / SHOW_OK
    */
    private String onMissingData;

    /**
    * 无数据判定间隔，单位：分钟，onMissingData非IGNORE时必填
    */
    private Integer noDataNotifyPendingMinutes;

    /**
    * 策略类型，可选值：APP / SITE / CLOUD / CUSTOM
    */
    private String type;

    /**
    * 报警级别，可选值：NOTICE / WARNING / MAJOR / CRITICAL
    */
    private String level;

    /**
    * 通知配置列表
    */
    private List<PolicyAction> actions;

    /**
    * 是否启用通知
    */
    private Boolean notifyEnabled;

    /**
    * 回调地址列表
    */
    private List<Callback> callbacks;

    /**
    * 最大重复报警次数，0表示关闭
    */
    private Integer renotifyCount;

    /**
    * 重复通知间隔，单位：分钟，renotifyCount>0时必填
    */
    private Integer renotifyIntervalMinutes;

    /**
    * 通知合并窗口，单位：秒，0表示关闭
    */
    private Integer notifyMergeWindowSeconds;

    public String getId() {
        return id;
    }

    public UpdateAlarmPolicyRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getState() {
        return state;
    }

    public UpdateAlarmPolicyRequest setState(String state) {
        this.state = state;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateAlarmPolicyRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getScope() {
        return scope;
    }

    public UpdateAlarmPolicyRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getResourceType() {
        return resourceType;
    }

    public UpdateAlarmPolicyRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public AlarmTarget getTarget() {
        return target;
    }

    public UpdateAlarmPolicyRequest setTarget(AlarmTarget target) {
        this.target = target;
        return this;
    }

    public List<AlarmRule> getRules() {
        return rules;
    }

    public UpdateAlarmPolicyRequest setRules(List<AlarmRule> rules) {
        this.rules = rules;
        return this;
    }

    public Integer getPendingCount() {
        return pendingCount;
    }

    public UpdateAlarmPolicyRequest setPendingCount(Integer pendingCount) {
        this.pendingCount = pendingCount;
        return this;
    }

    public String getOnMissingData() {
        return onMissingData;
    }

    public UpdateAlarmPolicyRequest setOnMissingData(String onMissingData) {
        this.onMissingData = onMissingData;
        return this;
    }

    public Integer getNoDataNotifyPendingMinutes() {
        return noDataNotifyPendingMinutes;
    }

    public UpdateAlarmPolicyRequest setNoDataNotifyPendingMinutes(Integer noDataNotifyPendingMinutes) {
        this.noDataNotifyPendingMinutes = noDataNotifyPendingMinutes;
        return this;
    }

    public String getType() {
        return type;
    }

    public UpdateAlarmPolicyRequest setType(String type) {
        this.type = type;
        return this;
    }

    public String getLevel() {
        return level;
    }

    public UpdateAlarmPolicyRequest setLevel(String level) {
        this.level = level;
        return this;
    }

    public List<PolicyAction> getActions() {
        return actions;
    }

    public UpdateAlarmPolicyRequest setActions(List<PolicyAction> actions) {
        this.actions = actions;
        return this;
    }

    public Boolean getNotifyEnabled() {
        return notifyEnabled;
    }

    public UpdateAlarmPolicyRequest setNotifyEnabled(Boolean notifyEnabled) {
        this.notifyEnabled = notifyEnabled;
        return this;
    }

    public List<Callback> getCallbacks() {
        return callbacks;
    }

    public UpdateAlarmPolicyRequest setCallbacks(List<Callback> callbacks) {
        this.callbacks = callbacks;
        return this;
    }

    public Integer getRenotifyCount() {
        return renotifyCount;
    }

    public UpdateAlarmPolicyRequest setRenotifyCount(Integer renotifyCount) {
        this.renotifyCount = renotifyCount;
        return this;
    }

    public Integer getRenotifyIntervalMinutes() {
        return renotifyIntervalMinutes;
    }

    public UpdateAlarmPolicyRequest setRenotifyIntervalMinutes(Integer renotifyIntervalMinutes) {
        this.renotifyIntervalMinutes = renotifyIntervalMinutes;
        return this;
    }

    public Integer getNotifyMergeWindowSeconds() {
        return notifyMergeWindowSeconds;
    }

    public UpdateAlarmPolicyRequest setNotifyMergeWindowSeconds(Integer notifyMergeWindowSeconds) {
        this.notifyMergeWindowSeconds = notifyMergeWindowSeconds;
        return this;
    }

}
