package com.baidubce.cprom.models;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RuleDetail {
    /**
     * 告警ID
     */
    private String alertId;

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
     * 是否开启告警
     */
    private Boolean enable;

    /**
     * 通知策略ID
     */
    private String notifyRuleId;

    /**
     * 告警级别，取值为 `notice`、`warning`、`major`、`critical`
     */
    private String severity;

    /**
     * 标签列表, 告警级别等
     */
    private Map<String, String> labels;

    /**
     * 注解列表
     */
    private Map<String, String> annotations;

    public RuleDetail setAlertId(String alertId) {
        this.alertId = alertId;
        return this;
    }

    public String getAlertId() {
        return this.alertId;
    }

    public RuleDetail setAlertName(String alertName) {
        this.alertName = alertName;
        return this;
    }

    public String getAlertName() {
        return this.alertName;
    }

    public RuleDetail setExpr(String expr) {
        this.expr = expr;
        return this;
    }

    public String getExpr() {
        return this.expr;
    }

    public RuleDetail setFor(String cpromFor) {
        this.cpromFor = cpromFor;
        return this;
    }

    public String getFor() {
        return this.cpromFor;
    }

    public RuleDetail setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public RuleDetail setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    public Boolean getEnable() {
        return this.enable;
    }

    public RuleDetail setNotifyRuleId(String notifyRuleId) {
        this.notifyRuleId = notifyRuleId;
        return this;
    }

    public String getNotifyRuleId() {
        return this.notifyRuleId;
    }

    public RuleDetail setSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    public String getSeverity() {
        return this.severity;
    }

    public RuleDetail setLabels(Map<String, String> labels) {
        this.labels = labels;
        return this;
    }

    public Map<String, String> getLabels() {
        return this.labels;
    }

    public RuleDetail setAnnotations(Map<String, String> annotations) {
        this.annotations = annotations;
        return this;
    }

    public Map<String, String> getAnnotations() {
        return this.annotations;
    }

    @Override
    public String toString() {
        return "RuleDetail{" + "alertId=" + alertId + "\n" + "alertName=" + alertName + "\n" + "expr=" + expr + "\n" + "cpromFor=" + cpromFor + "\n" + "description=" + description
                + "\n" + "enable=" + enable + "\n" + "notifyRuleId=" + notifyRuleId + "\n" + "severity=" + severity + "\n" + "labels=" + labels + "\n" + "annotations="
                + annotations + "\n" + "}";
    }

}