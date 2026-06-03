package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteMetaSyncRuleRequest extends BaseBceRequest {

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

    public String getClientToken() {
        return clientToken;
    }

    public DeleteMetaSyncRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public DeleteMetaSyncRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getDataSrcId() {
        return dataSrcId;
    }

    public DeleteMetaSyncRuleRequest setDataSrcId(String dataSrcId) {
        this.dataSrcId = dataSrcId;
        return this;
    }

    public String getMetaSyncRuleId() {
        return metaSyncRuleId;
    }

    public DeleteMetaSyncRuleRequest setMetaSyncRuleId(String metaSyncRuleId) {
        this.metaSyncRuleId = metaSyncRuleId;
        return this;
    }

}
