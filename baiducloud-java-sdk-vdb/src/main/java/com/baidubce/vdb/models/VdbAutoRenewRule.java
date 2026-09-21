package com.baidubce.vdb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VdbAutoRenewRule {
    /**
     * 
     */
    private Integer renewTime;

    /**
     * 
     */
    private String renewTimeUnit;

    public VdbAutoRenewRule setRenewTime(Integer renewTime) {
        this.renewTime = renewTime;
        return this;
    }

    public Integer getRenewTime() {
        return this.renewTime;
    }

    public VdbAutoRenewRule setRenewTimeUnit(String renewTimeUnit) {
        this.renewTimeUnit = renewTimeUnit;
        return this;
    }

    public String getRenewTimeUnit() {
        return this.renewTimeUnit;
    }

    @Override
    public String toString() {
        return "VdbAutoRenewRule{" + "renewTime=" + renewTime + "\n" + "renewTimeUnit=" + renewTimeUnit + "\n" + "}";
    }

}