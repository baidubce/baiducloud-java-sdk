package com.baidubce.scs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstanceFullVersionInfo {
    /**
     * 当前集群代理版本，部分老集群可能为空
     */
    private String proxyFullVersion;

    /**
     * 当前集群版本，部分老集群可能为空
     */
    private String redisOrPegaFullVerison;

    /**
     * 代理最新版本
     */
    private String proxyLatestFullVersion;

    /**
     * 最新版本
     */
    private String redisOrPegaLatestFullVersion;

    /**
     * 代理是否有更新的版本
     */
    private Boolean isProxyCanUpgrade;

    /**
     * 是否有更新的版本
     */
    private Boolean isRedisOrPegaCanUpgrade;

    /**
     * pega 是否可以重启
     */
    private Boolean isPegaCanRestart;

    public InstanceFullVersionInfo setProxyFullVersion(String proxyFullVersion) {
        this.proxyFullVersion = proxyFullVersion;
        return this;
    }

    public String getProxyFullVersion() {
        return this.proxyFullVersion;
    }

    public InstanceFullVersionInfo setRedisOrPegaFullVerison(String redisOrPegaFullVerison) {
        this.redisOrPegaFullVerison = redisOrPegaFullVerison;
        return this;
    }

    public String getRedisOrPegaFullVerison() {
        return this.redisOrPegaFullVerison;
    }

    public InstanceFullVersionInfo setProxyLatestFullVersion(String proxyLatestFullVersion) {
        this.proxyLatestFullVersion = proxyLatestFullVersion;
        return this;
    }

    public String getProxyLatestFullVersion() {
        return this.proxyLatestFullVersion;
    }

    public InstanceFullVersionInfo setRedisOrPegaLatestFullVersion(String redisOrPegaLatestFullVersion) {
        this.redisOrPegaLatestFullVersion = redisOrPegaLatestFullVersion;
        return this;
    }

    public String getRedisOrPegaLatestFullVersion() {
        return this.redisOrPegaLatestFullVersion;
    }

    public InstanceFullVersionInfo setIsProxyCanUpgrade(Boolean isProxyCanUpgrade) {
        this.isProxyCanUpgrade = isProxyCanUpgrade;
        return this;
    }

    public Boolean getIsProxyCanUpgrade() {
        return this.isProxyCanUpgrade;
    }

    public InstanceFullVersionInfo setIsRedisOrPegaCanUpgrade(Boolean isRedisOrPegaCanUpgrade) {
        this.isRedisOrPegaCanUpgrade = isRedisOrPegaCanUpgrade;
        return this;
    }

    public Boolean getIsRedisOrPegaCanUpgrade() {
        return this.isRedisOrPegaCanUpgrade;
    }

    public InstanceFullVersionInfo setIsPegaCanRestart(Boolean isPegaCanRestart) {
        this.isPegaCanRestart = isPegaCanRestart;
        return this;
    }

    public Boolean getIsPegaCanRestart() {
        return this.isPegaCanRestart;
    }

    @Override
    public String toString() {
        return "InstanceFullVersionInfo{" + "proxyFullVersion=" + proxyFullVersion + "\n" + "redisOrPegaFullVerison=" + redisOrPegaFullVerison + "\n" + "proxyLatestFullVersion="
                + proxyLatestFullVersion + "\n" + "redisOrPegaLatestFullVersion=" + redisOrPegaLatestFullVersion + "\n" + "isProxyCanUpgrade=" + isProxyCanUpgrade + "\n"
                + "isRedisOrPegaCanUpgrade=" + isRedisOrPegaCanUpgrade + "\n" + "isPegaCanRestart=" + isPegaCanRestart + "\n" + "}";
    }

}