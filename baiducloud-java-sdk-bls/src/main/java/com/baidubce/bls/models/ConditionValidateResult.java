package com.baidubce.bls.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConditionValidateResult {
    /**
     * 是否通过验证
     */
    private Boolean valid;

    /**
     * 验证失败时的错误信息
     */
    private String message;

    public ConditionValidateResult setValid(Boolean valid) {
        this.valid = valid;
        return this;
    }

    public Boolean getValid() {
        return this.valid;
    }

    public ConditionValidateResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    @Override
    public String toString() {
        return "ConditionValidateResult{" + "valid=" + valid + "\n" + "message=" + message + "\n" + "}";
    }

}