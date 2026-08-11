package com.baidubce.ax.models;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueriedSandbox {
    /**
     * 沙箱实例 ID。
     */
    private String sandboxID;

    /**
     * 沙箱当前状态，可取 running、paused、killing、killed。
     */
    private String state;

    /**
     * 沙箱 metadata。
     */
    private Map<String, String> metadata;

    /**
     * CPU 核数。
     */
    private Integer cpuCount;

    /**
     * 内存大小，单位为 MiB。
     */
    private Integer memoryMB;

    /**
     * 沙箱启动时间，RFC3339 格式。
     */
    private String startedAt;

    /**
     * 沙箱结束时间，RFC3339 格式。
     */
    private String endAt;

    /**
     * 沙箱运行时 envd 版本。
     */
    private String envdVersion;

    /**
     * 访问沙箱 envd 的临时 token。
     */
    private String envdAccessToken;

    /**
     * 创建沙箱使用的模板 ID。
     */
    private String templateID;

    /**
     * 沙箱实际使用的镜像地址。
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