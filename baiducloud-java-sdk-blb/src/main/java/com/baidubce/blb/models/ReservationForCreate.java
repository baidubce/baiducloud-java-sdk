package com.baidubce.blb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReservationForCreate {
    /**
     * 购买月份时长，[1,2,3,4,5,6,7,8,9,12,24,36]
     */
    private Integer reservationLength;

    public ReservationForCreate setReservationLength(Integer reservationLength) {
        this.reservationLength = reservationLength;
        return this;
    }

    public Integer getReservationLength() {
        return this.reservationLength;
    }

    @Override
    public String toString() {
        return "ReservationForCreate{" + "reservationLength=" + reservationLength + "\n" + "}";
    }

}