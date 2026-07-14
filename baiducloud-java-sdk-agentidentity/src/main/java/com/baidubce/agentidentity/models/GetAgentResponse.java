package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetAgentResponse extends BaseBceResponse {

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

    public GetAgentResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getBceDomainId() {
        return bceDomainId;
    }

    public GetAgentResponse setBceDomainId(String bceDomainId) {
        this.bceDomainId = bceDomainId;
        return this;
    }

    public String getBceUserId() {
        return bceUserId;
    }

    public GetAgentResponse setBceUserId(String bceUserId) {
        this.bceUserId = bceUserId;
        return this;
    }

    public String getName() {
        return name;
    }

    public GetAgentResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public GetAgentResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getExtra() {
        return extra;
    }

    public GetAgentResponse setExtra(String extra) {
        this.extra = extra;
        return this;
    }

    public List<String> getAllowedResourceOauth2ReturnUrls() {
        return allowedResourceOauth2ReturnUrls;
    }

    public GetAgentResponse setAllowedResourceOauth2ReturnUrls(List<String> allowedResourceOauth2ReturnUrls) {
        this.allowedResourceOauth2ReturnUrls = allowedResourceOauth2ReturnUrls;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public GetAgentResponse setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public GetAgentResponse setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return "GetAgentResponse{" + "id=" + id + "\n" + "bceDomainId=" + bceDomainId + "\n" + "bceUserId=" + bceUserId + "\n" + "name=" + name + "\n" + "description="
                + description + "\n" + "extra=" + extra + "\n" + "allowedResourceOauth2ReturnUrls=" + allowedResourceOauth2ReturnUrls + "\n" + "createdAt=" + createdAt + "\n"
                + "updatedAt=" + updatedAt + "\n" + "}";
    }

}
