package com.baidubce.cprom.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RuleTemplate {
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

    public RuleTemplate setAlertName(String alertName) {
        this.alertName = alertName;
        return this;
    }

    public String getAlertName() {
        return this.alertName;
    }

    public RuleTemplate setExpr(String expr) {
        this.expr = expr;
        return this;
    }

    public String getExpr() {
        return this.expr;
    }

    public RuleTemplate setFor(String cpromFor) {
        this.cpromFor = cpromFor;
        return this;
    }

    public String getFor() {
        return this.cpromFor;
    }

    public RuleTemplate setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "RuleTemplate{" + "alertName=" + alertName + "\n" + "expr=" + expr + "\n" + "cpromFor=" + cpromFor + "\n" + "description=" + description + "\n" + "}";
    }

}