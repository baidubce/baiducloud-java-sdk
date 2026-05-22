package com.baidubce.blb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BillingForCreate {
    /**
     * 付款时间，预支付（Prepaid）和后支付（Postpaid），目前只支持预支付
     */
    private String paymentTiming;

    /**
     * 计费方式，后付费的时候传，"BySpec"按固定规格、"ByCapacityUnit"按使用量
     */
    private String billingMethod;

    /**
     * reservation
     */
    private ReservationForCreate reservation;

    public BillingForCreate setPaymentTiming(String paymentTiming) {
        this.paymentTiming = paymentTiming;
        return this;
    }

    public String getPaymentTiming() {
        return this.paymentTiming;
    }

    public BillingForCreate setBillingMethod(String billingMethod) {
        this.billingMethod = billingMethod;
        return this;
    }

    public String getBillingMethod() {
        return this.billingMethod;
    }

    public BillingForCreate setReservation(ReservationForCreate reservation) {
        this.reservation = reservation;
        return this;
    }

    public ReservationForCreate getReservation() {
        return this.reservation;
    }

    @Override
    public String toString() {
        return "BillingForCreate{" + "paymentTiming=" + paymentTiming + "\n" + "billingMethod=" + billingMethod + "\n" + "reservation=" + reservation + "\n" + "}";
    }

}