package com.baidubce.dns.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Reservation {
    /**
     * 购买年份时长，[1,2,3]。
     */
    private Integer reservationLength;

    public Reservation setReservationLength(Integer reservationLength) {
        this.reservationLength = reservationLength;
        return this;
    }

    public Integer getReservationLength() {
        return this.reservationLength;
    }

    @Override
    public String toString() {
        return "Reservation{" + "reservationLength=" + reservationLength + "\n" + "}";
    }

}