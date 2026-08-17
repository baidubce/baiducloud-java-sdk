package com.baidubce.aigw.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateConsumerResponse extends BaseBceResponse {

    /**
    * 是否成功
    */
    private Boolean success;

    /**
    * HTTP 状态码
    */
    private Integer status;

    /**
    * 消费者 ID
    */
    private String consumerId;

    /**
    * 创建后的凭证（敏感值）
    */
    private String credential;

    /**
    * 多凭证详情
    */
    private List<ConsumerCredentialInfo> credentials;

    /**
    * 凭证类型
    */
    private String credentialType;

    public Boolean getSuccess() {
        return success;
    }

    public CreateConsumerResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public CreateConsumerResponse setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String getConsumerId() {
        return consumerId;
    }

    public CreateConsumerResponse setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }

    public String getCredential() {
        return credential;
    }

    public CreateConsumerResponse setCredential(String credential) {
        this.credential = credential;
        return this;
    }

    public List<ConsumerCredentialInfo> getCredentials() {
        return credentials;
    }

    public CreateConsumerResponse setCredentials(List<ConsumerCredentialInfo> credentials) {
        this.credentials = credentials;
        return this;
    }

    public String getCredentialType() {
        return credentialType;
    }

    public CreateConsumerResponse setCredentialType(String credentialType) {
        this.credentialType = credentialType;
        return this;
    }

    @Override
    public String toString() {
        return "CreateConsumerResponse{" + "success=" + success + "\n" + "status=" + status + "\n" + "consumerId=" + consumerId + "\n" + "credential=" + credential + "\n"
                + "credentials=" + credentials + "\n" + "credentialType=" + credentialType + "\n" + "}";
    }

}
