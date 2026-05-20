package com.baidubce.dns.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BillingForRenew {
    /**
     * reservation
     */
    private Reservation reservation;

    public BillingForRenew setReservation(Reservation reservation) {
        this.reservation = reservation;
        return this;
    }

    public Reservation getReservation() {
        return this.reservation;
    }

    @Override
    public String toString() {
        return "BillingForRenew{" + "reservation=" + reservation + "\n" + "}";
    }

}