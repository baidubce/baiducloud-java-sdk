package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CancelCacheRuleJobRequest extends BaseBceRequest {

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
    * 缓存管理规则 ID
    */
    private String cacheRuleId;

    public String getClientToken() {
        return clientToken;
    }

    public CancelCacheRuleJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public CancelCacheRuleJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getDataSrcId() {
        return dataSrcId;
    }

    public CancelCacheRuleJobRequest setDataSrcId(String dataSrcId) {
        this.dataSrcId = dataSrcId;
        return this;
    }

    public String getCacheRuleId() {
        return cacheRuleId;
    }

    public CancelCacheRuleJobRequest setCacheRuleId(String cacheRuleId) {
        this.cacheRuleId = cacheRuleId;
        return this;
    }

}
