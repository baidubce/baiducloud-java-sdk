package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetAlertDetailResponse extends BaseBceResponse {

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
    * 注解列表，支持自定义注解
    */
    private Map<String, String> annotations;

    public String getAlertId() {
        return alertId;
    }

    public GetAlertDetailResponse setAlertId(String alertId) {
        this.alertId = alertId;
        return this;
    }

    public String getAlertName() {
        return alertName;
    }

    public GetAlertDetailResponse setAlertName(String alertName) {
        this.alertName = alertName;
        return this;
    }

    public String getExpr() {
        return expr;
    }

    public GetAlertDetailResponse setExpr(String expr) {
        this.expr = expr;
        return this;
    }

    public String getCpromFor() {
        return cpromFor;
    }

    public GetAlertDetailResponse setCpromFor(String cpromFor) {
        this.cpromFor = cpromFor;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public GetAlertDetailResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public Boolean getEnable() {
        return enable;
    }

    public GetAlertDetailResponse setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    public String getNotifyRuleId() {
        return notifyRuleId;
    }

    public GetAlertDetailResponse setNotifyRuleId(String notifyRuleId) {
        this.notifyRuleId = notifyRuleId;
        return this;
    }

    public String getSeverity() {
        return severity;
    }

    public GetAlertDetailResponse setSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    public Map<String, String> getAnnotations() {
        return annotations;
    }

    public GetAlertDetailResponse setAnnotations(Map<String, String> annotations) {
        this.annotations = annotations;
        return this;
    }

    @Override
    public String toString() {
        return "GetAlertDetailResponse{" + "alertId=" + alertId + "\n" + "alertName=" + alertName + "\n" + "expr=" + expr + "\n" + "cpromFor=" + cpromFor + "\n" + "description="
                + description + "\n" + "enable=" + enable + "\n" + "notifyRuleId=" + notifyRuleId + "\n" + "severity=" + severity + "\n" + "annotations=" + annotations + "\n"
                + "}";
    }

}
