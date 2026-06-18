package com.baidubce.iam.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Idp {
    /**
     * 用户联合功能状态，开启状态返回enable，关闭状态为disable
     */
    private String status;

    /**
     * 账户ID
     */
    private String domainId;

    /**
     * Base64编码后的IdP元数据
     */
    private String encodeMetadata;

    /**
     * IdP元数据文件名称
     */
    private String fileName;

    /**
     * 辅助域名
     */
    private String auxiliaryDomain;

    public Idp setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public Idp setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    public String getDomainId() {
        return this.domainId;
    }

    public Idp setEncodeMetadata(String encodeMetadata) {
        this.encodeMetadata = encodeMetadata;
        return this;
    }

    public String getEncodeMetadata() {
        return this.encodeMetadata;
    }

    public Idp setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    public String getFileName() {
        return this.fileName;
    }

    public Idp setAuxiliaryDomain(String auxiliaryDomain) {
        this.auxiliaryDomain = auxiliaryDomain;
        return this;
    }

    public String getAuxiliaryDomain() {
        return this.auxiliaryDomain;
    }

    @Override
    public String toString() {
        return "Idp{" + "status=" + status + "\n" + "domainId=" + domainId + "\n" + "encodeMetadata=" + encodeMetadata + "\n" + "fileName=" + fileName + "\n" + "auxiliaryDomain="
                + auxiliaryDomain + "\n" + "}";
    }

}