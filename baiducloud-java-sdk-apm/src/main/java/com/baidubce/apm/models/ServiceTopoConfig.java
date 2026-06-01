package com.baidubce.apm.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceTopoConfig {
    /**
     * 
     */
    private Boolean global;

    /**
     * 
     */
    private Double requestSecondsThreshold;

    /**
     * 
     */
    private Double errorRateThreshold;

    public ServiceTopoConfig setGlobal(Boolean global) {
        this.global = global;
        return this;
    }

    public Boolean getGlobal() {
        return this.global;
    }

    public ServiceTopoConfig setRequestSecondsThreshold(Double requestSecondsThreshold) {
        this.requestSecondsThreshold = requestSecondsThreshold;
        return this;
    }

    public Double getRequestSecondsThreshold() {
        return this.requestSecondsThreshold;
    }

    public ServiceTopoConfig setErrorRateThreshold(Double errorRateThreshold) {
        this.errorRateThreshold = errorRateThreshold;
        return this;
    }

    public Double getErrorRateThreshold() {
        return this.errorRateThreshold;
    }

    @Override
    public String toString() {
        return "ServiceTopoConfig{" + "global=" + global + "\n" + "requestSecondsThreshold=" + requestSecondsThreshold + "\n" + "errorRateThreshold=" + errorRateThreshold + "\n"
                + "}";
    }

}