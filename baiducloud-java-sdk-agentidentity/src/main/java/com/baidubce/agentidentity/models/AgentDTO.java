package com.baidubce.agentidentity.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgentDTO {
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

    public AgentDTO setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public AgentDTO setBceDomainId(String bceDomainId) {
        this.bceDomainId = bceDomainId;
        return this;
    }

    public String getBceDomainId() {
        return this.bceDomainId;
    }

    public AgentDTO setBceUserId(String bceUserId) {
        this.bceUserId = bceUserId;
        return this;
    }

    public String getBceUserId() {
        return this.bceUserId;
    }

    public AgentDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public AgentDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public AgentDTO setExtra(String extra) {
        this.extra = extra;
        return this;
    }

    public String getExtra() {
        return this.extra;
    }

    public AgentDTO setAllowedResourceOauth2ReturnUrls(List<String> allowedResourceOauth2ReturnUrls) {
        this.allowedResourceOauth2ReturnUrls = allowedResourceOauth2ReturnUrls;
        return this;
    }

    public List<String> getAllowedResourceOauth2ReturnUrls() {
        return this.allowedResourceOauth2ReturnUrls;
    }

    public AgentDTO setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public AgentDTO setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }

    @Override
    public String toString() {
        return "AgentDTO{" + "id=" + id + "\n" + "bceDomainId=" + bceDomainId + "\n" + "bceUserId=" + bceUserId + "\n" + "name=" + name + "\n" + "description=" + description
                + "\n" + "extra=" + extra + "\n" + "allowedResourceOauth2ReturnUrls=" + allowedResourceOauth2ReturnUrls + "\n" + "createdAt=" + createdAt + "\n" + "updatedAt="
                + updatedAt + "\n" + "}";
    }

}