package com.baidubce.rds.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateEncryptPolicyRequest {
    /**
     * 加密策略配置
     */
    private List<EncryptPolicyRequest> encryptStrategy;

    public UpdateEncryptPolicyRequest setEncryptStrategy(List<EncryptPolicyRequest> encryptStrategy) {
        this.encryptStrategy = encryptStrategy;
        return this;
    }

    public List<EncryptPolicyRequest> getEncryptStrategy() {
        return this.encryptStrategy;
    }

    @Override
    public String toString() {
        return "UpdateEncryptPolicyRequest{" + "encryptStrategy=" + encryptStrategy + "\n" + "}";
    }

}