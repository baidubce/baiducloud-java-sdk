package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Billing {
  /** 付款时间，预支付（Prepaid）和后支付（Postpaid），创建订单需要设置，续费订单无需设置 */
  private String paymentTiming;

  /** reservation */
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
    return "Billing{"
        + "paymentTiming="
        + paymentTiming
        + "\n"
        + "reservation="
        + reservation
        + "\n"
        + "}";
  }
}
