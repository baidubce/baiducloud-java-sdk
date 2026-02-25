
package com.baidubce.eip.models;



import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RecycleEipModel  {
    /**
     * EIP名称
     */
    private String name;

    /**
     * EIP地址，点分十进制表示
     */
    private String eip;

    /**
     * EIP ID
     */
    private String eipId;

    /**
     * EIP状态
     */
    private String status;

    /**
     * EIP线路类型
     */
    private String routeType;

    /**
     * 公网带宽，单位为Mbps
     */
    private Integer bandwidthInMbps;

    /**
     * 付款时间，预支付（Prepaid）和后支付（Postpaid）
     */
    private String paymentTiming;

    /**
     * 计费方式，按流量（ByTraffic）或按带宽（ByBandwidth）等
     */
    private String billingMethod;

    /**
     * EIP进入回收站时间
     */
    private String recycleTime;

    /**
     * EIP计划删除时间
     */
    private String scheduledDeleteTime;

    public RecycleEipModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public RecycleEipModel setEip(String eip) {
        this.eip = eip;
        return this;
    }

    public String getEip() {
        return this.eip;
    }

    public RecycleEipModel setEipId(String eipId) {
        this.eipId = eipId;
        return this;
    }

    public String getEipId() {
        return this.eipId;
    }

    public RecycleEipModel setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public RecycleEipModel setRouteType(String routeType) {
        this.routeType = routeType;
        return this;
    }

    public String getRouteType() {
        return this.routeType;
    }

    public RecycleEipModel setBandwidthInMbps(Integer bandwidthInMbps) {
        this.bandwidthInMbps = bandwidthInMbps;
        return this;
    }

    public Integer getBandwidthInMbps() {
        return this.bandwidthInMbps;
    }

    public RecycleEipModel setPaymentTiming(String paymentTiming) {
        this.paymentTiming = paymentTiming;
        return this;
    }

    public String getPaymentTiming() {
        return this.paymentTiming;
    }

    public RecycleEipModel setBillingMethod(String billingMethod) {
        this.billingMethod = billingMethod;
        return this;
    }

    public String getBillingMethod() {
        return this.billingMethod;
    }

    public RecycleEipModel setRecycleTime(String recycleTime) {
        this.recycleTime = recycleTime;
        return this;
    }

    public String getRecycleTime() {
        return this.recycleTime;
    }

    public RecycleEipModel setScheduledDeleteTime(String scheduledDeleteTime) {
        this.scheduledDeleteTime = scheduledDeleteTime;
        return this;
    }

    public String getScheduledDeleteTime() {
        return this.scheduledDeleteTime;
    }

    @Override
    public String toString() {
        return "RecycleEipModel{"
                + "name=" + name + "\n"
                + "eip=" + eip + "\n"
                + "eipId=" + eipId + "\n"
                + "status=" + status + "\n"
                + "routeType=" + routeType + "\n"
                + "bandwidthInMbps=" + bandwidthInMbps + "\n"
                + "paymentTiming=" + paymentTiming + "\n"
                + "billingMethod=" + billingMethod + "\n"
                + "recycleTime=" + recycleTime + "\n"
                + "scheduledDeleteTime=" + scheduledDeleteTime + "\n"
                + "}";
    }




}