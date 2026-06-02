package com.baidubce.blb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BillingForRenew {
    /**
     * reservation
     */
    private ReservationForCreate reservation;

    public BillingForRenew setReservation(ReservationForCreate reservation) {
        this.reservation = reservation;
        return this;
    }

    public ReservationForCreate getReservation() {
        return this.reservation;
    }

    @Override
    public String toString() {
        return "BillingForRenew{" + "reservation=" + reservation + "\n" + "}";
    }

}