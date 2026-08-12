package com.baidubce.ax.models;

import java.lang.String;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListedSandbox {
    /**
     * 沙箱实例 ID。
     */
    private String sandboxID;

    /**
     * 沙箱状态，例如 running、paused、killing、killed。
     */
    private String state;

    /**
     * 沙箱 metadata 标签。
     */
    private Map<String, String> metadata;

    /**
     * 沙箱模板 ID。
     */
    private String templateID;

    /**
     * CPU 核数。
     */
    private Integer cpuCount;

    /**
     * 内存大小，单位 MiB。
     */
    private Integer memoryMB;

    /**
     * 磁盘大小，单位 MiB。
     */
    private Integer diskSizeMB;

    /**
     * 沙箱启动时间。
     */
    private String startedAt;

    /**
     * 沙箱结束时间。
     */
    private String endAt;

    /**
     * envd 版本。
     */
    private String envdVersion;

    /**
     * 客户端 ID，已废弃。
     */
    private String clientID;

    /**
     * 模板别名。
     */
    private String alias;

    public ListedSandbox setSandboxID(String sandboxID) {
        this.sandboxID = sandboxID;
        return this;
    }

    public String getSandboxID() {
        return this.sandboxID;
    }

    public ListedSandbox setState(String state) {
        this.state = state;
        return this;
    }

    public String getState() {
        return this.state;
    }

    public ListedSandbox setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    public ListedSandbox setTemplateID(String templateID) {
        this.templateID = templateID;
        return this;
    }

    public String getTemplateID() {
        return this.templateID;
    }

    public ListedSandbox setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }

    public Integer getCpuCount() {
        return this.cpuCount;
    }

    public ListedSandbox setMemoryMB(Integer memoryMB) {
        this.memoryMB = memoryMB;
        return this;
    }

    public Integer getMemoryMB() {
        return this.memoryMB;
    }

    public ListedSandbox setDiskSizeMB(Integer diskSizeMB) {
        this.diskSizeMB = diskSizeMB;
        return this;
    }

    public Integer getDiskSizeMB() {
        return this.diskSizeMB;
    }

    public ListedSandbox setStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    public String getStartedAt() {
        return this.startedAt;
    }

    public ListedSandbox setEndAt(String endAt) {
        this.endAt = endAt;
        return this;
    }

    public String getEndAt() {
        return this.endAt;
    }

    public ListedSandbox setEnvdVersion(String envdVersion) {
        this.envdVersion = envdVersion;
        return this;
    }

    public String getEnvdVersion() {
        return this.envdVersion;
    }

    public ListedSandbox setClientID(String clientID) {
        this.clientID = clientID;
        return this;
    }

    public String getClientID() {
        return this.clientID;
    }

    public ListedSandbox setAlias(String alias) {
        this.alias = alias;
        return this;
    }

    public String getAlias() {
        return this.alias;
    }

    @Override
    public String toString() {
        return "ListedSandbox{" + "sandboxID=" + sandboxID + "\n" + "state=" + state + "\n" + "metadata=" + metadata + "\n" + "templateID=" + templateID + "\n" + "cpuCount="
                + cpuCount + "\n" + "memoryMB=" + memoryMB + "\n" + "diskSizeMB=" + diskSizeMB + "\n" + "startedAt=" + startedAt + "\n" + "endAt=" + endAt + "\n" + "envdVersion="
                + envdVersion + "\n" + "clientID=" + clientID + "\n" + "alias=" + alias + "\n" + "}";
    }

}