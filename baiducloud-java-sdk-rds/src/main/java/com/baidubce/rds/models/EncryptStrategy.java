package com.baidubce.rds.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EncryptStrategy {
    /**
     * 是否开启加密。
     */
    private Boolean encryptEnable;

    /**
     * 密钥管理服务名称。
     */
    private String keyManagementServiceName;

    /**
     * 密钥管理类型。
     */
    private String keyManagementType;

    /**
     * 密钥ID。
     */
    private String secretKeyID;

    public EncryptStrategy setEncryptEnable(Boolean encryptEnable) {
        this.encryptEnable = encryptEnable;
        return this;
    }

    public Boolean getEncryptEnable() {
        return this.encryptEnable;
    }

    public EncryptStrategy setKeyManagementServiceName(String keyManagementServiceName) {
        this.keyManagementServiceName = keyManagementServiceName;
        return this;
    }

    public String getKeyManagementServiceName() {
        return this.keyManagementServiceName;
    }

    public EncryptStrategy setKeyManagementType(String keyManagementType) {
        this.keyManagementType = keyManagementType;
        return this;
    }

    public String getKeyManagementType() {
        return this.keyManagementType;
    }

    public EncryptStrategy setSecretKeyID(String secretKeyID) {
        this.secretKeyID = secretKeyID;
        return this;
    }

    public String getSecretKeyID() {
        return this.secretKeyID;
    }

    @Override
    public String toString() {
        return "EncryptStrategy{" + "encryptEnable=" + encryptEnable + "\n" + "keyManagementServiceName=" + keyManagementServiceName + "\n" + "keyManagementType="
                + keyManagementType + "\n" + "secretKeyID=" + secretKeyID + "\n" + "}";
    }

}