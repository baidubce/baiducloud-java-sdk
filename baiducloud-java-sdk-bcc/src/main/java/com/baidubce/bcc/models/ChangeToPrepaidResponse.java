package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChangeToPrepaidResponse extends BaseBceResponse {

    /**
    * 虚机实例ID的集合，其中ID符合BCE规范，必须是一个定长字符串，且只允许包含大小写字母、数字、连字号（-）和下划线（_）。
    */
    private String orderId;

    public String getOrderId() {
        return orderId;
    }

    public ChangeToPrepaidResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    @Override
    public String toString() {
        return "ChangeToPrepaidResponse{" + "orderId=" + orderId + "\n" + "}";
    }

}
