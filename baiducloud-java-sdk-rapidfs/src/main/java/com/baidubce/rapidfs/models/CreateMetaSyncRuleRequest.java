package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateMetaSyncRuleRequest extends BaseBceRequest {

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
    * 元数据同步规则名称
    */
    private String metaSyncRuleName;

    /**
    * 元数据同步规则类型，枚举值：<br> • MANUAL：单次同步，手动执行；<br> • PERIODIC：周期同步，自动执行
    */
    private String type;

    /**
    * RapidFS 目录前缀，默认值为 /
    */
    private String directory;

    /**
    * 同步间隔时间，单位 min，默认 5min。有效范围 [1, 28800(20 天)]
    */
    private Integer intervalMinutes;

    /**
    * 单次同步创建之后是否立即执行，默认 false
    */
    private Boolean executeOnCreate;

    /**
    * 周期同步创建之后是否默认开启，默认 true
    */
    private Boolean enableOnCreate;

    /**
    * 元数据同步描述信息
    */
    private String description;

    public String getClientToken() {
        return clientToken;
    }

    public CreateMetaSyncRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public CreateMetaSyncRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getDataSrcId() {
        return dataSrcId;
    }

    public CreateMetaSyncRuleRequest setDataSrcId(String dataSrcId) {
        this.dataSrcId = dataSrcId;
        return this;
    }

    public String getMetaSyncRuleName() {
        return metaSyncRuleName;
    }

    public CreateMetaSyncRuleRequest setMetaSyncRuleName(String metaSyncRuleName) {
        this.metaSyncRuleName = metaSyncRuleName;
        return this;
    }

    public String getType() {
        return type;
    }

    public CreateMetaSyncRuleRequest setType(String type) {
        this.type = type;
        return this;
    }

    public String getDirectory() {
        return directory;
    }

    public CreateMetaSyncRuleRequest setDirectory(String directory) {
        this.directory = directory;
        return this;
    }

    public Integer getIntervalMinutes() {
        return intervalMinutes;
    }

    public CreateMetaSyncRuleRequest setIntervalMinutes(Integer intervalMinutes) {
        this.intervalMinutes = intervalMinutes;
        return this;
    }

    public Boolean getExecuteOnCreate() {
        return executeOnCreate;
    }

    public CreateMetaSyncRuleRequest setExecuteOnCreate(Boolean executeOnCreate) {
        this.executeOnCreate = executeOnCreate;
        return this;
    }

    public Boolean getEnableOnCreate() {
        return enableOnCreate;
    }

    public CreateMetaSyncRuleRequest setEnableOnCreate(Boolean enableOnCreate) {
        this.enableOnCreate = enableOnCreate;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateMetaSyncRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
