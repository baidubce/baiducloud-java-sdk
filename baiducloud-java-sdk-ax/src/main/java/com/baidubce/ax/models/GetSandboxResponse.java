package com.baidubce.ax.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetSandboxResponse extends BaseBceResponse {

    /**
    * 沙箱实例 ID。
    */
    private String sandboxID;

    /**
    * 沙箱状态，可选 running、paused、killing、killed。
    */
    private String state;

    /**
    * 沙箱元数据。
    */
    private Map<String, String> metadata;

    /**
    * 模板 ID。
    */
    private String templateID;

    /**
    * 模板别名。
    */
    private String alias;

    /**
    * 客户端 ID。
    */
    private String clientID;

    /**
    * 沙箱访问域名。
    */
    private String domain;

    /**
    * envd 访问令牌。
    */
    private String envdAccessToken;

    /**
    * envd 版本号。
    */
    private String envdVersion;

    /**
    * CPU 核数。
    */
    private Integer cpuCount;

    /**
    * 内存大小，单位 MB。
    */
    private Integer memoryMB;

    /**
    * 磁盘大小，单位 MB。
    */
    private Integer diskSizeMB;

    /**
    * 启动时间，RFC3339 格式。
    */
    private String startedAt;

    /**
    * 超时销毁时间，RFC3339 格式。
    */
    private String endAt;

    /**
    * 沙箱 VPC 访问域名。
    */
    private String vpcDomain;

    public String getSandboxID() {
        return sandboxID;
    }

    public GetSandboxResponse setSandboxID(String sandboxID) {
        this.sandboxID = sandboxID;
        return this;
    }

    public String getState() {
        return state;
    }

    public GetSandboxResponse setState(String state) {
        this.state = state;
        return this;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }

    public GetSandboxResponse setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    public String getTemplateID() {
        return templateID;
    }

    public GetSandboxResponse setTemplateID(String templateID) {
        this.templateID = templateID;
        return this;
    }

    public String getAlias() {
        return alias;
    }

    public GetSandboxResponse setAlias(String alias) {
        this.alias = alias;
        return this;
    }

    public String getClientID() {
        return clientID;
    }

    public GetSandboxResponse setClientID(String clientID) {
        this.clientID = clientID;
        return this;
    }

    public String getDomain() {
        return domain;
    }

    public GetSandboxResponse setDomain(String domain) {
        this.domain = domain;
        return this;
    }

    public String getEnvdAccessToken() {
        return envdAccessToken;
    }

    public GetSandboxResponse setEnvdAccessToken(String envdAccessToken) {
        this.envdAccessToken = envdAccessToken;
        return this;
    }

    public String getEnvdVersion() {
        return envdVersion;
    }

    public GetSandboxResponse setEnvdVersion(String envdVersion) {
        this.envdVersion = envdVersion;
        return this;
    }

    public Integer getCpuCount() {
        return cpuCount;
    }

    public GetSandboxResponse setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }

    public Integer getMemoryMB() {
        return memoryMB;
    }

    public GetSandboxResponse setMemoryMB(Integer memoryMB) {
        this.memoryMB = memoryMB;
        return this;
    }

    public Integer getDiskSizeMB() {
        return diskSizeMB;
    }

    public GetSandboxResponse setDiskSizeMB(Integer diskSizeMB) {
        this.diskSizeMB = diskSizeMB;
        return this;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public GetSandboxResponse setStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    public String getEndAt() {
        return endAt;
    }

    public GetSandboxResponse setEndAt(String endAt) {
        this.endAt = endAt;
        return this;
    }

    public String getVpcDomain() {
        return vpcDomain;
    }

    public GetSandboxResponse setVpcDomain(String vpcDomain) {
        this.vpcDomain = vpcDomain;
        return this;
    }

    @Override
    public String toString() {
        return "GetSandboxResponse{" + "sandboxID=" + sandboxID + "\n" + "state=" + state + "\n" + "metadata=" + metadata + "\n" + "templateID=" + templateID + "\n" + "alias="
                + alias + "\n" + "clientID=" + clientID + "\n" + "domain=" + domain + "\n" + "envdAccessToken=" + envdAccessToken + "\n" + "envdVersion=" + envdVersion + "\n"
                + "cpuCount=" + cpuCount + "\n" + "memoryMB=" + memoryMB + "\n" + "diskSizeMB=" + diskSizeMB + "\n" + "startedAt=" + startedAt + "\n" + "endAt=" + endAt + "\n"
                + "vpcDomain=" + vpcDomain + "\n" + "}";
    }

}
