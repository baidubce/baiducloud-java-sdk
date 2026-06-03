package com.baidubce.rapidfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class K8SCacheNodeInfo {
    /**
     * 缓存部署组
     */
    private String cacheDeployGroup;

    /**
     * 容器控制器 ID
     */
    private String k8sControllerId;

    public K8SCacheNodeInfo setCacheDeployGroup(String cacheDeployGroup) {
        this.cacheDeployGroup = cacheDeployGroup;
        return this;
    }

    public String getCacheDeployGroup() {
        return this.cacheDeployGroup;
    }

    public K8SCacheNodeInfo setK8sControllerId(String k8sControllerId) {
        this.k8sControllerId = k8sControllerId;
        return this;
    }

    public String getK8sControllerId() {
        return this.k8sControllerId;
    }

    @Override
    public String toString() {
        return "K8SCacheNodeInfo{" + "cacheDeployGroup=" + cacheDeployGroup + "\n" + "k8sControllerId=" + k8sControllerId + "\n" + "}";
    }

}