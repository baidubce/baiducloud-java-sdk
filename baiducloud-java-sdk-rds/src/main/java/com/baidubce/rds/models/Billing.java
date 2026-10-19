package com.baidubce.rds.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Billing {
    /**
     * 
     */
    private String paymentTiming;

    /**
     * 
     */
    private Object reservation;

    public Billing setPaymentTiming(String paymentTiming) {
        this.paymentTiming = paymentTiming;
        return this;
    }

    public String getPaymentTiming() {
        return this.paymentTiming;
    }

    public Billing setReservation(Object reservation) {
        this.reservation = reservation;
        return this;
    }

    public Object getReservation() {
        return this.reservation;
    }

    @Override
    public String toString() {
        return "Billing{" + "paymentTiming=" + paymentTiming + "\n" + "reservation=" + reservation + "\n" + "}";
    }

}