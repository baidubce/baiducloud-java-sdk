package com.baidubce.as.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EipConfig {
    /**
     * 共享带宽扩容时与BCC绑定策略
     */
    private String eipGroupBindStrategy;

    /**
     * 共享带宽缩容时策略
     */
    private String eipGroupUnbindStrategy;

    /**
     * 共享带宽组id列表
     */
    private List<String> eipGroupIdList;

    /**
     * increase
     */
    private EipGroupIncrease increase;

    /**
     * decrease
     */
    private EipGroupDecrease decrease;

    /**
     * bandwidth
     */
    private EipGroupBandwidth bandwidth;

    public EipConfig setEipGroupBindStrategy(String eipGroupBindStrategy) {
        this.eipGroupBindStrategy = eipGroupBindStrategy;
        return this;
    }

    public String getEipGroupBindStrategy() {
        return this.eipGroupBindStrategy;
    }

    public EipConfig setEipGroupUnbindStrategy(String eipGroupUnbindStrategy) {
        this.eipGroupUnbindStrategy = eipGroupUnbindStrategy;
        return this;
    }

    public String getEipGroupUnbindStrategy() {
        return this.eipGroupUnbindStrategy;
    }

    public EipConfig setEipGroupIdList(List<String> eipGroupIdList) {
        this.eipGroupIdList = eipGroupIdList;
        return this;
    }

    public List<String> getEipGroupIdList() {
        return this.eipGroupIdList;
    }

    public EipConfig setIncrease(EipGroupIncrease increase) {
        this.increase = increase;
        return this;
    }

    public EipGroupIncrease getIncrease() {
        return this.increase;
    }

    public EipConfig setDecrease(EipGroupDecrease decrease) {
        this.decrease = decrease;
        return this;
    }

    public EipGroupDecrease getDecrease() {
        return this.decrease;
    }

    public EipConfig setBandwidth(EipGroupBandwidth bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public EipGroupBandwidth getBandwidth() {
        return this.bandwidth;
    }

    @Override
    public String toString() {
        return "EipConfig{" + "eipGroupBindStrategy=" + eipGroupBindStrategy + "\n" + "eipGroupUnbindStrategy=" + eipGroupUnbindStrategy + "\n" + "eipGroupIdList="
                + eipGroupIdList + "\n" + "increase=" + increase + "\n" + "decrease=" + decrease + "\n" + "bandwidth=" + bandwidth + "\n" + "}";
    }

}