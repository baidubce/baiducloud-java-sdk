package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyMetaSyncRuleRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * RapidFS 实例 ID
    */
    private String instanceId;

    /**
    * 数据源 ID
    */
    private String dataSrcId;

    /**
    * 元数据同步规则 ID
    */
    private String metaSyncRuleId;

    /**
    * 修改后的同步规则名称
    */
    private String metaSyncRuleName;

    /**
    * 修改后的周期同步间隔，单位 min。有效范围 [1, 28800(20 天)]。单次同步规则忽略该字段
    */
    private Integer intervalMinutes;

    /**
    * 修改后的描述信息
    */
    private String description;

    public String getClientToken() {
        return clientToken;
    }

    public ModifyMetaSyncRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public ModifyMetaSyncRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getDataSrcId() {
        return dataSrcId;
    }

    public ModifyMetaSyncRuleRequest setDataSrcId(String dataSrcId) {
        this.dataSrcId = dataSrcId;
        return this;
    }

    public String getMetaSyncRuleId() {
        return metaSyncRuleId;
    }

    public ModifyMetaSyncRuleRequest setMetaSyncRuleId(String metaSyncRuleId) {
        this.metaSyncRuleId = metaSyncRuleId;
        return this;
    }

    public String getMetaSyncRuleName() {
        return metaSyncRuleName;
    }

    public ModifyMetaSyncRuleRequest setMetaSyncRuleName(String metaSyncRuleName) {
        this.metaSyncRuleName = metaSyncRuleName;
        return this;
    }

    public Integer getIntervalMinutes() {
        return intervalMinutes;
    }

    public ModifyMetaSyncRuleRequest setIntervalMinutes(Integer intervalMinutes) {
        this.intervalMinutes = intervalMinutes;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ModifyMetaSyncRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
