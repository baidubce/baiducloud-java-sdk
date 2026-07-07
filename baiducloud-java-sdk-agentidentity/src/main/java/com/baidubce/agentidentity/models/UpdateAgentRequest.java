package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateAgentRequest extends BaseBceRequest {

    /**
    * Agent ID
    */
    private String agentId;

    /**
    * 新的描述，1-128 字符
    */
    private String description;

    /**
    * OAuth2 回调 URL 白名单列表，最多 10 个（全量替换）
    */
    private List<String> allowedResourceOauth2ReturnUrls;

    public String getAgentId() {
        return agentId;
    }

    public UpdateAgentRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateAgentRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public List<String> getAllowedResourceOauth2ReturnUrls() {
        return allowedResourceOauth2ReturnUrls;
    }

    public UpdateAgentRequest setAllowedResourceOauth2ReturnUrls(List<String> allowedResourceOauth2ReturnUrls) {
        this.allowedResourceOauth2ReturnUrls = allowedResourceOauth2ReturnUrls;
        return this;
    }

}
