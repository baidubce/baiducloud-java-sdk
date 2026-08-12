package com.baidubce.ax.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateSandboxResponse extends BaseBceResponse {

    /**
    * 新建沙箱实例 ID。
    */
    private String sandboxID;

    /**
    * 使用的模板 ID。
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

    /**
    * 模板别名。
    */
    private String alias;

    /**
    * 客户端 ID。
    */
    private String clientID;

    /**
    * envd 版本号。
    */
    private String envdVersion;

    /**
    * 沙箱 VPC 访问域名。
    */
    private String vpcDomain;

    public String getSandboxID() {
        return sandboxID;
    }

    public CreateSandboxResponse setSandboxID(String sandboxID) {
        this.sandboxID = sandboxID;
        return this;
    }

    public String getTemplateID() {
        return templateID;
    }

    public CreateSandboxResponse setTemplateID(String templateID) {
        this.templateID = templateID;
        return this;
    }

    public String getEnvdAccessToken() {
        return envdAccessToken;
    }

    public CreateSandboxResponse setEnvdAccessToken(String envdAccessToken) {
        this.envdAccessToken = envdAccessToken;
        return this;
    }

    public String getDomain() {
        return domain;
    }

    public CreateSandboxResponse setDomain(String domain) {
        this.domain = domain;
        return this;
    }

    public String getAlias() {
        return alias;
    }

    public CreateSandboxResponse setAlias(String alias) {
        this.alias = alias;
        return this;
    }

    public String getClientID() {
        return clientID;
    }

    public CreateSandboxResponse setClientID(String clientID) {
        this.clientID = clientID;
        return this;
    }

    public String getEnvdVersion() {
        return envdVersion;
    }

    public CreateSandboxResponse setEnvdVersion(String envdVersion) {
        this.envdVersion = envdVersion;
        return this;
    }

    public String getVpcDomain() {
        return vpcDomain;
    }

    public CreateSandboxResponse setVpcDomain(String vpcDomain) {
        this.vpcDomain = vpcDomain;
        return this;
    }

    @Override
    public String toString() {
        return "CreateSandboxResponse{" + "sandboxID=" + sandboxID + "\n" + "templateID=" + templateID + "\n" + "envdAccessToken=" + envdAccessToken + "\n" + "domain=" + domain
                + "\n" + "alias=" + alias + "\n" + "clientID=" + clientID + "\n" + "envdVersion=" + envdVersion + "\n" + "vpcDomain=" + vpcDomain + "\n" + "}";
    }

}
