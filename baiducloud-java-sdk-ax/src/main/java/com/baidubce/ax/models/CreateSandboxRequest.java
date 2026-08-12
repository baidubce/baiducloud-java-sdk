package com.baidubce.ax.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateSandboxRequest extends BaseBceRequest {

    /**
    * 沙箱模板 ID。
    */
    private String templateID;

    /**
    * 沙箱超时时间，单位秒。
    */
    private Integer timeout;

    /**
    * 沙箱标签元数据。
    */
    private Map<String, String> metadata;

    /**
    * 沙箱环境变量。
    */
    private Map<String, String> envVars;

    /**
    * 是否对沙箱的全部系统通信进行加密。
    */
    private Boolean secure;

    /**
    * 是否允许沙箱访问公网。
    */
    @JsonProperty("allow_internet_access")
    private Boolean allowInternetAccess;

    /**
    * 超时后是否自动暂停沙箱。
    */
    private Boolean autoPause;

    /**
    * 暂停沙箱后的自动恢复配置，含 enabled（Boolean）字段。
    */
    private Map<String, Object> autoResume;

    /**
    * 沙箱运行时类型，可选 kata；仅白名单用户可指定，默认空为 CRIU。
    */
    private String runtimeType;

    /**
    * 沙箱的 MCP 配置。
    */
    private Map<String, Object> mcp;

    /**
    * 挂载到沙箱的 NFS 卷列表，元素含 name、path、subPath、readOnly 字段。
    */
    private List<Map<String, Object>> volumeMounts;

    public String getTemplateID() {
        return templateID;
    }

    public CreateSandboxRequest setTemplateID(String templateID) {
        this.templateID = templateID;
        return this;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public CreateSandboxRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }

    public CreateSandboxRequest setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    public Map<String, String> getEnvVars() {
        return envVars;
    }

    public CreateSandboxRequest setEnvVars(Map<String, String> envVars) {
        this.envVars = envVars;
        return this;
    }

    public Boolean getSecure() {
        return secure;
    }

    public CreateSandboxRequest setSecure(Boolean secure) {
        this.secure = secure;
        return this;
    }

    public Boolean getAllowInternetAccess() {
        return allowInternetAccess;
    }

    public CreateSandboxRequest setAllowInternetAccess(Boolean allowInternetAccess) {
        this.allowInternetAccess = allowInternetAccess;
        return this;
    }

    public Boolean getAutoPause() {
        return autoPause;
    }

    public CreateSandboxRequest setAutoPause(Boolean autoPause) {
        this.autoPause = autoPause;
        return this;
    }

    public Map<String, Object> getAutoResume() {
        return autoResume;
    }

    public CreateSandboxRequest setAutoResume(Map<String, Object> autoResume) {
        this.autoResume = autoResume;
        return this;
    }

    public String getRuntimeType() {
        return runtimeType;
    }

    public CreateSandboxRequest setRuntimeType(String runtimeType) {
        this.runtimeType = runtimeType;
        return this;
    }

    public Map<String, Object> getMcp() {
        return mcp;
    }

    public CreateSandboxRequest setMcp(Map<String, Object> mcp) {
        this.mcp = mcp;
        return this;
    }

    public List<Map<String, Object>> getVolumeMounts() {
        return volumeMounts;
    }

    public CreateSandboxRequest setVolumeMounts(List<Map<String, Object>> volumeMounts) {
        this.volumeMounts = volumeMounts;
        return this;
    }

}
