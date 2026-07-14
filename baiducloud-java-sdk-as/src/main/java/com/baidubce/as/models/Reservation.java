package com.baidubce.as.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Reservation {
    /**
     * 时长，[1,2,3,4,5,6,7,8,9,12,24,36]
     */
    private Integer reservationLengthInMonth;

    public Reservation setReservationLengthInMonth(Integer reservationLengthInMonth) {
        this.reservationLengthInMonth = reservationLengthInMonth;
        return this;
    }

    public Integer getReservationLengthInMonth() {
        return this.reservationLengthInMonth;
    }

    @Override
    public String toString() {
        return "Reservation{" + "reservationLengthInMonth=" + reservationLengthInMonth + "\n" + "}";
    }

}