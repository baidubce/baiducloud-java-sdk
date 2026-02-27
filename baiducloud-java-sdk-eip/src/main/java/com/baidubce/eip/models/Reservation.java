package com.baidubce.eip.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Reservation {
  /** 时长，[1,2,3,4,5,6,7,8,9,12,24,36] */
  private Integer reservationLength;

  /** 时间单位，month，当前仅支持按月 */
  private String reservationTimeUnit;

  public Reservation setReservationLength(Integer reservationLength) {
    this.reservationLength = reservationLength;
    return this;
  }

  public Integer getReservationLength() {
    return this.reservationLength;
  }

  public Reservation setReservationTimeUnit(String reservationTimeUnit) {
    this.reservationTimeUnit = reservationTimeUnit;
    return this;
  }

  public String getReservationTimeUnit() {
    return this.reservationTimeUnit;
  }

  @Override
  public String toString() {
    return "Reservation{"
        + "reservationLength="
        + reservationLength
        + "\n"
        + "reservationTimeUnit="
        + reservationTimeUnit
        + "\n"
        + "}";
  }
}
