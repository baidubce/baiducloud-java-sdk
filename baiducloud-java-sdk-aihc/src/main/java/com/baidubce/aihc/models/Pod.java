package com.baidubce.aihc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Pod {
    /**
     * Pod IP
     */
    private String podIP;

    /**
     * 任务pod所在节点的名称
     */
    private String nodeName;

    /**
     * Pod创建时间
     */
    private String creationAt;

    /**
     * Pod的id
     */
    private String uid;

    /**
     * 任务Pod名称
     */
    private String name;

    /**
     * 
     */
    private String status;

    /**
     * 任务Pod的副本类型，pytorch中包含master和worker两种副本类型
     */
    private String replicaType;

    /**
     * 任务Pod重启次数
     */
    private Integer restartCount;

    /**
     * Pod环境变量
     */
    private List<Env> envs;

    /**
     * Pod完成时间
     */
    private String finishedAt;

    /**
     * Pod失败原因
     */
    private String reason;

    public Pod setPodIP(String podIP) {
        this.podIP = podIP;
        return this;
    }

    public String getPodIP() {
        return this.podIP;
    }

    public Pod setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    public String getNodeName() {
        return this.nodeName;
    }

    public Pod setCreationAt(String creationAt) {
        this.creationAt = creationAt;
        return this;
    }

    public String getCreationAt() {
        return this.creationAt;
    }

    public Pod setUid(String uid) {
        this.uid = uid;
        return this;
    }

    public String getUid() {
        return this.uid;
    }

    public Pod setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Pod setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public Pod setReplicaType(String replicaType) {
        this.replicaType = replicaType;
        return this;
    }

    public String getReplicaType() {
        return this.replicaType;
    }

    public Pod setRestartCount(Integer restartCount) {
        this.restartCount = restartCount;
        return this;
    }

    public Integer getRestartCount() {
        return this.restartCount;
    }

    public Pod setEnvs(List<Env> envs) {
        this.envs = envs;
        return this;
    }

    public List<Env> getEnvs() {
        return this.envs;
    }

    public Pod setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }

    public String getFinishedAt() {
        return this.finishedAt;
    }

    public Pod setReason(String reason) {
        this.reason = reason;
        return this;
    }

    public String getReason() {
        return this.reason;
    }

    @Override
    public String toString() {
        return "Pod{" + "podIP=" + podIP + "\n" + "nodeName=" + nodeName + "\n" + "creationAt=" + creationAt + "\n" + "uid=" + uid + "\n" + "name=" + name + "\n" + "status="
                + status + "\n" + "replicaType=" + replicaType + "\n" + "restartCount=" + restartCount + "\n" + "envs=" + envs + "\n" + "finishedAt=" + finishedAt + "\n"
                + "reason=" + reason + "\n" + "}";
    }

}