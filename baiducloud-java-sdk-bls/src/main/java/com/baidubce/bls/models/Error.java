package com.baidubce.bls.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Error {
    /**
     * 根原因
     */
    private List<Error> rootCause;

    /**
     * 错误类型
     */
    private String type;

    /**
     * 错误原因
     */
    private String reason;

    public Error setRootCause(List<Error> rootCause) {
        this.rootCause = rootCause;
        return this;
    }

    public List<Error> getRootCause() {
        return this.rootCause;
    }

    public Error setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public Error setReason(String reason) {
        this.reason = reason;
        return this;
    }

    public String getReason() {
        return this.reason;
    }

    @Override
    public String toString() {
        return "Error{" + "rootCause=" + rootCause + "\n" + "type=" + type + "\n" + "reason=" + reason + "\n" + "}";
    }

}