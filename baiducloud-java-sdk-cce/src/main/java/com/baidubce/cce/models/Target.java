package com.baidubce.cce.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Target {
    /**
     * 必填。节点名或 Pod 所在节点名。节点诊断支持批量选择多个节点，但每次最多选择 20 个
     */
    private String nodeName;

    /**
     * Pod 诊断时必填。Pod 的命名空间，仅支持单个命名空间
     */
    private String namespace;

    /**
     * Pod 诊断时必填。Pod 名，仅支持单个 Pod
     */
    private String podName;

    public Target setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    public String getNodeName() {
        return this.nodeName;
    }

    public Target setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public Target setPodName(String podName) {
        this.podName = podName;
        return this;
    }

    public String getPodName() {
        return this.podName;
    }

    @Override
    public String toString() {
        return "Target{" + "nodeName=" + nodeName + "\n" + "namespace=" + namespace + "\n" + "podName=" + podName + "\n" + "}";
    }

}