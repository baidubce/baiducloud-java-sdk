package com.baidubce.aigw.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConsumerCredentialInfo {
    /**
     * 身份 ID
     */
    private Long identityId;

    /**
     * 凭证名称
     */
    private String name;

    /**
     * 凭证值
     */
    private String value;

    /**
     * 脱敏凭证值
     */
    private String maskedValue;

    /**
     * 生成模式
     */
    private String generateMode;

    /**
     * 是否放入请求头
     */
    private Boolean inHeader;

    /**
     * 是否放入查询参数
     */
    private Boolean inQuery;

    public ConsumerCredentialInfo setIdentityId(Long identityId) {
        this.identityId = identityId;
        return this;
    }

    public Long getIdentityId() {
        return this.identityId;
    }

    public ConsumerCredentialInfo setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public ConsumerCredentialInfo setValue(String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    public ConsumerCredentialInfo setMaskedValue(String maskedValue) {
        this.maskedValue = maskedValue;
        return this;
    }

    public String getMaskedValue() {
        return this.maskedValue;
    }

    public ConsumerCredentialInfo setGenerateMode(String generateMode) {
        this.generateMode = generateMode;
        return this;
    }

    public String getGenerateMode() {
        return this.generateMode;
    }

    public ConsumerCredentialInfo setInHeader(Boolean inHeader) {
        this.inHeader = inHeader;
        return this;
    }

    public Boolean getInHeader() {
        return this.inHeader;
    }

    public ConsumerCredentialInfo setInQuery(Boolean inQuery) {
        this.inQuery = inQuery;
        return this;
    }

    public Boolean getInQuery() {
        return this.inQuery;
    }

    @Override
    public String toString() {
        return "ConsumerCredentialInfo{" + "identityId=" + identityId + "\n" + "name=" + name + "\n" + "value=" + value + "\n" + "maskedValue=" + maskedValue + "\n"
                + "generateMode=" + generateMode + "\n" + "inHeader=" + inHeader + "\n" + "inQuery=" + inQuery + "\n" + "}";
    }

}