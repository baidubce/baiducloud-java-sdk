package com.baidubce.rapidfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AIHCCacheNodeInfo {
    /**
     * 缓存部署组
     */
    private String cacheDeployGroup;

    /**
     * 百舸资源池 ID
     */
    private String aihcResourcePoolId;

    /**
     * 容器所在百舸节点 ID
     */
    private String hostNodeId;

    /**
     * 容器所在百舸节点名称
     */
    private String hostNodeName;

    /**
     * 容器所在节点可用区
     */
    private String hostZone;

    public AIHCCacheNodeInfo setCacheDeployGroup(String cacheDeployGroup) {
        this.cacheDeployGroup = cacheDeployGroup;
        return this;
    }

    public String getCacheDeployGroup() {
        return this.cacheDeployGroup;
    }

    public AIHCCacheNodeInfo setAihcResourcePoolId(String aihcResourcePoolId) {
        this.aihcResourcePoolId = aihcResourcePoolId;
        return this;
    }

    public String getAihcResourcePoolId() {
        return this.aihcResourcePoolId;
    }

    public AIHCCacheNodeInfo setHostNodeId(String hostNodeId) {
        this.hostNodeId = hostNodeId;
        return this;
    }

    public String getHostNodeId() {
        return this.hostNodeId;
    }

    public AIHCCacheNodeInfo setHostNodeName(String hostNodeName) {
        this.hostNodeName = hostNodeName;
        return this;
    }

    public String getHostNodeName() {
        return this.hostNodeName;
    }

    public AIHCCacheNodeInfo setHostZone(String hostZone) {
        this.hostZone = hostZone;
        return this;
    }

    public String getHostZone() {
        return this.hostZone;
    }

    @Override
    public String toString() {
        return "AIHCCacheNodeInfo{" + "cacheDeployGroup=" + cacheDeployGroup + "\n" + "aihcResourcePoolId=" + aihcResourcePoolId + "\n" + "hostNodeId=" + hostNodeId + "\n"
                + "hostNodeName=" + hostNodeName + "\n" + "hostZone=" + hostZone + "\n" + "}";
    }

}