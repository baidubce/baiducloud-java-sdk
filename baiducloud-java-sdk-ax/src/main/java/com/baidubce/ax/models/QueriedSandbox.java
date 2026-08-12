package com.baidubce.ax.models;

import java.lang.String;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueriedSandbox {
    /**
     * 沙箱实例 ID。
     */
    private String sandboxID;

    /**
     * 当前沙箱状态。
     */
    private String state;

    /**
     * 沙箱 metadata 标签。
     */
    private Map<String, String> metadata;

    /**
     * CPU 核数。
     */
    private Integer cpuCount;

    /**
     * 内存大小，单位 MiB。
     */
    private Integer memoryMB;

    /**
     * 启动时间。
     */
    private String startedAt;

    /**
     * 结束时间。
     */
    private String endAt;

    /**
     * envd 版本。
     */
    private String envdVersion;

    /**
     * envd 访问令牌。
     */
    private String envdAccessToken;

    /**
     * 沙箱模板 ID。
     */
    private String templateID;

    /**
     * 当前沙箱镜像地址。
     */
    private String imagePath;

    public QueriedSandbox setSandboxID(String sandboxID) {
        this.sandboxID = sandboxID;
        return this;
    }

    public String getSandboxID() {
        return this.sandboxID;
    }

    public QueriedSandbox setState(String state) {
        this.state = state;
        return this;
    }

    public String getState() {
        return this.state;
    }

    public QueriedSandbox setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    public QueriedSandbox setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }

    public Integer getCpuCount() {
        return this.cpuCount;
    }

    public QueriedSandbox setMemoryMB(Integer memoryMB) {
        this.memoryMB = memoryMB;
        return this;
    }

    public Integer getMemoryMB() {
        return this.memoryMB;
    }

    public QueriedSandbox setStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    public String getStartedAt() {
        return this.startedAt;
    }

    public QueriedSandbox setEndAt(String endAt) {
        this.endAt = endAt;
        return this;
    }

    public String getEndAt() {
        return this.endAt;
    }

    public QueriedSandbox setEnvdVersion(String envdVersion) {
        this.envdVersion = envdVersion;
        return this;
    }

    public String getEnvdVersion() {
        return this.envdVersion;
    }

    public QueriedSandbox setEnvdAccessToken(String envdAccessToken) {
        this.envdAccessToken = envdAccessToken;
        return this;
    }

    public String getEnvdAccessToken() {
        return this.envdAccessToken;
    }

    public QueriedSandbox setTemplateID(String templateID) {
        this.templateID = templateID;
        return this;
    }

    public String getTemplateID() {
        return this.templateID;
    }

    public QueriedSandbox setImagePath(String imagePath) {
        this.imagePath = imagePath;
        return this;
    }

    public String getImagePath() {
        return this.imagePath;
    }

    @Override
    public String toString() {
        return "QueriedSandbox{" + "sandboxID=" + sandboxID + "\n" + "state=" + state + "\n" + "metadata=" + metadata + "\n" + "cpuCount=" + cpuCount + "\n" + "memoryMB="
                + memoryMB + "\n" + "startedAt=" + startedAt + "\n" + "endAt=" + endAt + "\n" + "envdVersion=" + envdVersion + "\n" + "envdAccessToken=" + envdAccessToken + "\n"
                + "templateID=" + templateID + "\n" + "imagePath=" + imagePath + "\n" + "}";
    }

}