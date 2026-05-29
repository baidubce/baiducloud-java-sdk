package com.baidubce.bls.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LogTag {
    /**
     * 标签键
     */
    private String k;

    /**
     * 标签值
     */
    private String v;

    public LogTag setK(String k) {
        this.k = k;
        return this;
    }

    public String getK() {
        return this.k;
    }

    public LogTag setV(String v) {
        this.v = v;
        return this;
    }

    public String getV() {
        return this.v;
    }

    @Override
    public String toString() {
        return "LogTag{" + "k=" + k + "\n" + "v=" + v + "\n" + "}";
    }

}