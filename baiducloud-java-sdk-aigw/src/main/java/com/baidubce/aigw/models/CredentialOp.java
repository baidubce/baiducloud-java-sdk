package com.baidubce.aigw.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CredentialOp {
    /**
     * add、delete 或 rotate
     */
    private String operation;

    /**
     * 凭证名称
     */
    private String credentialName;

    /**
     * 凭证值
     */
    private String value;

    public CredentialOp setOperation(String operation) {
        this.operation = operation;
        return this;
    }

    public String getOperation() {
        return this.operation;
    }

    public CredentialOp setCredentialName(String credentialName) {
        this.credentialName = credentialName;
        return this;
    }

    public String getCredentialName() {
        return this.credentialName;
    }

    public CredentialOp setValue(String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "CredentialOp{" + "operation=" + operation + "\n" + "credentialName=" + credentialName + "\n" + "value=" + value + "\n" + "}";
    }

}