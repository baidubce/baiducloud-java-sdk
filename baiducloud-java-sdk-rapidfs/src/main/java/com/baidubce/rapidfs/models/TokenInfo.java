package com.baidubce.rapidfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TokenInfo {
    /**
     * 实例 Token 唯一 Id
     */
    private String tokenId;

    /**
     * RapidFS 实例唯一 Id
     */
    private String instanceId;

    /**
     * Token，仅在 DescribeToken 接口中返回
     */
    private String tokenValue;

    /**
     * Token更新周期，单位分钟，0 表示永不更新，取值范围：[0，43200]
     */
    private Integer tokenRefreshIntervalMinutes;

    /**
     * Token失效时刻
     */
    private String tokenExpireTime;

    public TokenInfo setTokenId(String tokenId) {
        this.tokenId = tokenId;
        return this;
    }

    public String getTokenId() {
        return this.tokenId;
    }

    public TokenInfo setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public TokenInfo setTokenValue(String tokenValue) {
        this.tokenValue = tokenValue;
        return this;
    }

    public String getTokenValue() {
        return this.tokenValue;
    }

    public TokenInfo setTokenRefreshIntervalMinutes(Integer tokenRefreshIntervalMinutes) {
        this.tokenRefreshIntervalMinutes = tokenRefreshIntervalMinutes;
        return this;
    }

    public Integer getTokenRefreshIntervalMinutes() {
        return this.tokenRefreshIntervalMinutes;
    }

    public TokenInfo setTokenExpireTime(String tokenExpireTime) {
        this.tokenExpireTime = tokenExpireTime;
        return this;
    }

    public String getTokenExpireTime() {
        return this.tokenExpireTime;
    }

    @Override
    public String toString() {
        return "TokenInfo{" + "tokenId=" + tokenId + "\n" + "instanceId=" + instanceId + "\n" + "tokenValue=" + tokenValue + "\n" + "tokenRefreshIntervalMinutes="
                + tokenRefreshIntervalMinutes + "\n" + "tokenExpireTime=" + tokenExpireTime + "\n" + "}";
    }

}