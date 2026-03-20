package com.baidubce.eip.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Billing {
    /**
     * 付款时间，预支付（Prepaid）和后支付（Postpaid）
     */
    private String paymentTiming;

    /**
     * 计费方式，按流量（ByTraffic）、按带宽（ByBandwidth）、按增强95（ByPeak95）（只有共享带宽后付费支持）、按主流量计费(ByNetrafficMax)（只有共享带宽后付费支持）
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