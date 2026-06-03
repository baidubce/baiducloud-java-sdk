package com.baidubce.rapidfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CCECacheNodeInfo {
    /**
     * 缓存部署组
     */
    private String cacheDeployGroup;

    /**
     * CCE 集群 ID
     */
    private String cceClusterId;

    /**
     * 容器所在 BCC ID
     */
    private String hostBccId;

    /**
     * 容器所在 BCC 名称
     */
    private String hostBccName;

    /**
     * 容器所在 BCC 可用区
     */
    private String hostZone;

    public CCECacheNodeInfo setCacheDeployGroup(String cacheDeployGroup) {
        this.cacheDeployGroup = cacheDeployGroup;
        return this;
    }

    public String getCacheDeployGroup() {
        return this.cacheDeployGroup;
    }

    public CCECacheNodeInfo setCceClusterId(String cceClusterId) {
        this.cceClusterId = cceClusterId;
        return this;
    }

    public String getCceClusterId() {
        return this.cceClusterId;
    }

    public CCECacheNodeInfo setHostBccId(String hostBccId) {
        this.hostBccId = hostBccId;
        return this;
    }

    public String getHostBccId() {
        return this.hostBccId;
    }

    public CCECacheNodeInfo setHostBccName(String hostBccName) {
        this.hostBccName = hostBccName;
        return this;
    }

    public String getHostBccName() {
        return this.hostBccName;
    }

    public CCECacheNodeInfo setHostZone(String hostZone) {
        this.hostZone = hostZone;
        return this;
    }

    public String getHostZone() {
        return this.hostZone;
    }

    @Override
    public String toString() {
        return "CCECacheNodeInfo{" + "cacheDeployGroup=" + cacheDeployGroup + "\n" + "cceClusterId=" + cceClusterId + "\n" + "hostBccId=" + hostBccId + "\n" + "hostBccName="
                + hostBccName + "\n" + "hostZone=" + hostZone + "\n" + "}";
    }

}