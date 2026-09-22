package com.baidubce.face.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Thresholds {
    /**
     * 万分之一误识率的阈值
     */
    @JsonProperty("frr_1e-4")
    private Float frr1e4;

    /**
     * 千分之一误识率的阈值
     */
    @JsonProperty("frr_1e-3")
    private Float frr1e3;

    /**
     * 百分之一误识率的阈值
     */
    @JsonProperty("frr_1e-2")
    private Float frr1e2;

    public Thresholds setFrr1e4(Float frr1e4) {
        this.frr1e4 = frr1e4;
        return this;
    }

    public Float getFrr1e4() {
        return this.frr1e4;
    }

    public Thresholds setFrr1e3(Float frr1e3) {
        this.frr1e3 = frr1e3;
        return this;
    }

    public Float getFrr1e3() {
        return this.frr1e3;
    }

    public Thresholds setFrr1e2(Float frr1e2) {
        this.frr1e2 = frr1e2;
        return this;
    }

    public Float getFrr1e2() {
        return this.frr1e2;
    }

    @Override
    public String toString() {
        return "Thresholds{" + "frr1e4=" + frr1e4 + "\n" + "frr1e3=" + frr1e3 + "\n" + "frr1e2=" + frr1e2 + "\n" + "}";
    }

}