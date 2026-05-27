package com.baidubce.csn.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Billing {
    /**
     * 付款方式，预支付（Prepaid）和后支付（Postpaid）
     */
    private String paymentTiming;

    /**
     * 后付费需要传该参数。ByTraffic按量计费 ByBandwidth按带宽计费 PeakBandwidth_Percent_95 95计费 Enhanced_Percent_95增强型95计费
     */
    private String billingMethod;

    /**
     * reservation
     */
    private Reservation reservation;

    public Billing setPaymentTiming(String paymentTiming) {
        this.paymentTiming = paymentTiming;
        return this;
    }

    public String getPaymentTiming() {
        return this.paymentTiming;
    }

    public Billing setBillingMethod(String billingMethod) {
        this.billingMethod = billingMethod;
        return this;
    }

    public String getBillingMethod() {
        return this.billingMethod;
    }

    public Billing setReservation(Reservation reservation) {
        this.reservation = reservation;
        return this;
    }

    public Reservation getReservation() {
        return this.reservation;
    }

    @Override
    public String toString() {
        return "Billing{" + "paymentTiming=" + paymentTiming + "\n" + "billingMethod=" + billingMethod + "\n" + "reservation=" + reservation + "\n" + "}";
    }

}