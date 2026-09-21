package com.baidubce.vdb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MultiYearResult {
    /**
     * 
     */
    private Double multiDiscount;

    /**
     * 
     */
    private Double multiYear;

    public MultiYearResult setMultiDiscount(Double multiDiscount) {
        this.multiDiscount = multiDiscount;
        return this;
    }

    public Double getMultiDiscount() {
        return this.multiDiscount;
    }

    public MultiYearResult setMultiYear(Double multiYear) {
        this.multiYear = multiYear;
        return this;
    }

    public Double getMultiYear() {
        return this.multiYear;
    }

    @Override
    public String toString() {
        return "MultiYearResult{" + "multiDiscount=" + multiDiscount + "\n" + "multiYear=" + multiYear + "\n" + "}";
    }

}