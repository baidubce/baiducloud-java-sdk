package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAgentRequest extends BaseBceRequest {

    /**
    * Agent 名称，1-64 字符，仅允许字母、数字、下划线和连字符（^[a-zA-Z0-9_-]+$）
    */
    private String name;

    /**
    * Agent 描述，1-128 字符
    */
    private String description;

    /**
    * OAuth2 回调 URL 白名单列表，最多 10 个，每个最长 512 字符
    */
    private List<String> allowedResourceOauth2ReturnUrls;

    public String getName() {
        return name;
    }

    public CreateAgentRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateAgentRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public List<String> getAllowedResourceOauth2ReturnUrls() {
        return allowedResourceOauth2ReturnUrls;
    }

    public CreateAgentRequest setAllowedResourceOauth2ReturnUrls(List<String> allowedResourceOauth2ReturnUrls) {
        this.allowedResourceOauth2ReturnUrls = allowedResourceOauth2ReturnUrls;
        return this;
    }

}
