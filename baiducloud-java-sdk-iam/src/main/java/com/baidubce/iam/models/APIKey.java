package com.baidubce.iam.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class APIKey {
    /**
     * API Key在的标识
     */
    private String id;

    /**
     * API Key本身
     */
    private String tokenId;

    /**
     * API Key名称
     */
    private String name;

    /**
     * 
     */
    private String userId;

    /**
     * 
     */
    private String createTime;

    public APIKey setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public APIKey setTokenId(String tokenId) {
        this.tokenId = tokenId;
        return this;
    }

    public String getTokenId() {
        return this.tokenId;
    }

    public APIKey setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public APIKey setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getUserId() {
        return this.userId;
    }

    public APIKey setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    @Override
    public String toString() {
        return "APIKey{" + "id=" + id + "\n" + "tokenId=" + tokenId + "\n" + "name=" + name + "\n" + "userId=" + userId + "\n" + "createTime=" + createTime + "\n" + "}";
    }

}