package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAgentResponse extends BaseBceResponse {

    /**
    * Agent ID
    */
    private String id;

    /**
    * BCE 账户 ID
    */
    private String bceDomainId;

    /**
    * BCE 用户 ID
    */
    private String bceUserId;

    /**
    * Agent 名称
    */
    private String name;

    /**
    * Agent 描述
    */
    private String description;

    /**
    * 扩展信息
    */
    private String extra;

    /**
    * OAuth2 回调 URL 白名单列表
    */
    private List<String> allowedResourceOauth2ReturnUrls;

    /**
    * 创建时间
    */
    private String createdAt;

    /**
    * 更新时间
    */
    private String updatedAt;

    public String getId() {
        return id;
    }

    public CreateAgentResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getBceDomainId() {
        return bceDomainId;
    }

    public CreateAgentResponse setBceDomainId(String bceDomainId) {
        this.bceDomainId = bceDomainId;
        return this;
    }

    public String getBceUserId() {
        return bceUserId;
    }

    public CreateAgentResponse setBceUserId(String bceUserId) {
        this.bceUserId = bceUserId;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateAgentResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateAgentResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getExtra() {
        return extra;
    }

    public CreateAgentResponse setExtra(String extra) {
        this.extra = extra;
        return this;
    }

    public List<String> getAllowedResourceOauth2ReturnUrls() {
        return allowedResourceOauth2ReturnUrls;
    }

    public CreateAgentResponse setAllowedResourceOauth2ReturnUrls(List<String> allowedResourceOauth2ReturnUrls) {
        this.allowedResourceOauth2ReturnUrls = allowedResourceOauth2ReturnUrls;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public CreateAgentResponse setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public CreateAgentResponse setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return "CreateAgentResponse{" + "id=" + id + "\n" + "bceDomainId=" + bceDomainId + "\n" + "bceUserId=" + bceUserId + "\n" + "name=" + name + "\n" + "description="
                + description + "\n" + "extra=" + extra + "\n" + "allowedResourceOauth2ReturnUrls=" + allowedResourceOauth2ReturnUrls + "\n" + "createdAt=" + createdAt + "\n"
                + "updatedAt=" + updatedAt + "\n" + "}";
    }

}
