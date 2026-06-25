package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAlertRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 告警名称
    */
    private String alertName;

    /**
    * 告警规则，promQL查询语句
    */
    private String expr;

    /**
    * 告警持续时间
    */
    @JsonProperty("for")
    private String cpromFor;

    /**
    * 告警内容
    */
    private String description;

    /**
    * 通知策略ID
    */
    private String notifyRuleId;

    /**
    * 是否开启告警，创建时默认为true
    */
    private Boolean enable;

    /**
    * 告警级别，notice/warning/major/critical
    */
    private String severity;

    /**
    * 自定义label键值对
    */
    private Map<String, String> labels;

    /**
    * 自定义注解键值对
    */
    private Map<String, String> annotations;

    public String getInstanceId() {
        return instanceId;
    }

    public CreateAlertRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getAlertName() {
        return alertName;
    }

    public CreateAlertRequest setAlertName(String alertName) {
        this.alertName = alertName;
        return this;
    }

    public String getExpr() {
        return expr;
    }

    public CreateAlertRequest setExpr(String expr) {
        this.expr = expr;
        return this;
    }

    public String getCpromFor() {
        return cpromFor;
    }

    public CreateAlertRequest setCpromFor(String cpromFor) {
        this.cpromFor = cpromFor;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateAlertRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getNotifyRuleId() {
        return notifyRuleId;
    }

    public CreateAlertRequest setNotifyRuleId(String notifyRuleId) {
        this.notifyRuleId = notifyRuleId;
        return this;
    }

    public Boolean getEnable() {
        return enable;
    }

    public CreateAlertRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    public String getSeverity() {
        return severity;
    }

    public CreateAlertRequest setSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    public Map<String, String> getLabels() {
        return labels;
    }

    public CreateAlertRequest setLabels(Map<String, String> labels) {
        this.labels = labels;
        return this;
    }

    public Map<String, String> getAnnotations() {
        return annotations;
    }

    public CreateAlertRequest setAnnotations(Map<String, String> annotations) {
        this.annotations = annotations;
        return this;
    }

}
