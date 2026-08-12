package com.baidubce.ax.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConnectSandboxResponse extends BaseBceResponse {

    /**
    * 沙箱实例 ID。
    */
    private String sandboxID;

    /**
    * 模板 ID。
    */
    private String templateID;

    /**
    * envd 访问令牌。
    */
    private String envdAccessToken;

    /**
    * 沙箱访问域名。
    */
    private String domain;

    public String getSandboxID() {
        return sandboxID;
    }

    public ConnectSandboxResponse setSandboxID(String sandboxID) {
        this.sandboxID = sandboxID;
        return this;
    }

    public String getTemplateID() {
        return templateID;
    }

    public ConnectSandboxResponse setTemplateID(String templateID) {
        this.templateID = templateID;
        return this;
    }

    public String getEnvdAccessToken() {
        return envdAccessToken;
    }

    public ConnectSandboxResponse setEnvdAccessToken(String envdAccessToken) {
        this.envdAccessToken = envdAccessToken;
        return this;
    }

    public String getDomain() {
        return domain;
    }

    public ConnectSandboxResponse setDomain(String domain) {
        this.domain = domain;
        return this;
    }

    @Override
    public String toString() {
        return "ConnectSandboxResponse{" + "sandboxID=" + sandboxID + "\n" + "templateID=" + templateID + "\n" + "envdAccessToken=" + envdAccessToken + "\n" + "domain=" + domain
                + "\n" + "}";
    }

}
