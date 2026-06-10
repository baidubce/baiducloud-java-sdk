package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Billing {
    /**
     * 付费方式，包括预支付（Prepaid）、后支付（Postpaid）和抢占实例（bidding）（创建实例、创建抢占实例、实例续费）
     */
    private String paymentTiming;

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

    public Billing setReservation(Reservation reservation) {
        this.reservation = reservation;
        return this;
    }

    public Reservation getReservation() {
        return this.reservation;
    }

    @Override
    public String toString() {
        return "Billing{" + "paymentTiming=" + paymentTiming + "\n" + "reservation=" + reservation + "\n" + "}";
    }

}