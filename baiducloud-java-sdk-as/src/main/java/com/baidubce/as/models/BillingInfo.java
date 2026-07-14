package com.baidubce.as.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BillingInfo {
    /**
     * 伸缩组Billing，后付费：postpay，抢占式：bidding
     */
    private String paymentTiming;

    /**
     * reservation
     */
    private Reservation reservation;

    public BillingInfo setPaymentTiming(String paymentTiming) {
        this.paymentTiming = paymentTiming;
        return this;
    }

    public String getPaymentTiming() {
        return this.paymentTiming;
    }

    public BillingInfo setReservation(Reservation reservation) {
        this.reservation = reservation;
        return this;
    }

    public Reservation getReservation() {
        return this.reservation;
    }

    @Override
    public String toString() {
        return "BillingInfo{" + "paymentTiming=" + paymentTiming + "\n" + "reservation=" + reservation + "\n" + "}";
    }

}