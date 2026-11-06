package com.baidubce.rds.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EncryptPolicyRequest {
    /**
     * 是否开启存储加密
     */
    private Boolean encryptEnable;

    /**
     * 密钥管理方式，自托管(self\_kms)/百度KMS(baidu\_kms)，当前仅支持self\_kms
     */
    private String keyManagementType;

    /**
     * 密钥管理服务名称，当前为 rds
     */
    private String keyManagementServiceName;

    /**
     * 密钥ID
     */
    private String secretKeyID;

    public EncryptPolicyRequest setEncryptEnable(Boolean encryptEnable) {
        this.encryptEnable = encryptEnable;
        return this;
    }

    public Boolean getEncryptEnable() {
        return this.encryptEnable;
    }

    public EncryptPolicyRequest setKeyManagementType(String keyManagementType) {
        this.keyManagementType = keyManagementType;
        return this;
    }

    public String getKeyManagementType() {
        return this.keyManagementType;
    }

    public EncryptPolicyRequest setKeyManagementServiceName(String keyManagementServiceName) {
        this.keyManagementServiceName = keyManagementServiceName;
        return this;
    }

    public String getKeyManagementServiceName() {
        return this.keyManagementServiceName;
    }

    public EncryptPolicyRequest setSecretKeyID(String secretKeyID) {
        this.secretKeyID = secretKeyID;
        return this;
    }

    public String getSecretKeyID() {
        return this.secretKeyID;
    }

    @Override
    public String toString() {
        return "EncryptPolicyRequest{" + "encryptEnable=" + encryptEnable + "\n" + "keyManagementType=" + keyManagementType + "\n" + "keyManagementServiceName="
                + keyManagementServiceName + "\n" + "secretKeyID=" + secretKeyID + "\n" + "}";
    }

}