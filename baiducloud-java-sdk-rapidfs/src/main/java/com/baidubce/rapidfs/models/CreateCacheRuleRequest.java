package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateCacheRuleRequest extends BaseBceRequest {

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
    * 缓存管理规则名称
    */
    private String cacheRuleName;

    /**
    * 缓存管理规则类型：<br> • WARMUP：缓存预热，将缓存从持久存储预热到 RapidFS 实例内；<br> • EVICTION：缓存淘汰，将已预热到 RapidFS 实例的缓存淘汰
    */
    private String type;

    /**
    * RapidFS 目录前缀，默认值为 /
    */
    private String directory;

    /**
    * 是否立即执行，默认 false
    */
    private Boolean executeOnCreate;

    /**
    * 缓存管理规则描述信息
    */
    private String description;

    public String getClientToken() {
        return clientToken;
    }

    public CreateCacheRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public CreateCacheRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getDataSrcId() {
        return dataSrcId;
    }

    public CreateCacheRuleRequest setDataSrcId(String dataSrcId) {
        this.dataSrcId = dataSrcId;
        return this;
    }

    public String getCacheRuleName() {
        return cacheRuleName;
    }

    public CreateCacheRuleRequest setCacheRuleName(String cacheRuleName) {
        this.cacheRuleName = cacheRuleName;
        return this;
    }

    public String getType() {
        return type;
    }

    public CreateCacheRuleRequest setType(String type) {
        this.type = type;
        return this;
    }

    public String getDirectory() {
        return directory;
    }

    public CreateCacheRuleRequest setDirectory(String directory) {
        this.directory = directory;
        return this;
    }

    public Boolean getExecuteOnCreate() {
        return executeOnCreate;
    }

    public CreateCacheRuleRequest setExecuteOnCreate(Boolean executeOnCreate) {
        this.executeOnCreate = executeOnCreate;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateCacheRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
