package com.baidubce.blb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Billing {
    /**
     * 付款时间，预支付（Prepaid）和后支付（Postpaid）
     */
    private String paymentTiming;

    /**
     * 计费方式，预付费的时候不要传，后付费的时候传，按固定规格计费（BySpec）和按使用量计费（ByCapacityUnit）
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