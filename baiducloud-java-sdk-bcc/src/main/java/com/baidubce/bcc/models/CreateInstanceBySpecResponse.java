package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateInstanceBySpecResponse extends BaseBceResponse {

    /**
    * 订单ID
    */
    private String orderId;

    /**
    * 虚机实例ID的集合，其中ID符合BCE规范，必须是一个定长字符串，且只允许包含大小写字母、数字、连字号（-）和下划线（_）
    */
    private List<String> instanceIds;

    /**
    * 创建虚机产生的warning信息
    */
    private List<String> warningList;

    public String getOrderId() {
        return orderId;
    }

    public CreateInstanceBySpecResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public CreateInstanceBySpecResponse setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public List<String> getWarningList() {
        return warningList;
    }

    public CreateInstanceBySpecResponse setWarningList(List<String> warningList) {
        this.warningList = warningList;
        return this;
    }

    @Override
    public String toString() {
        return "CreateInstanceBySpecResponse{" + "orderId=" + orderId + "\n" + "instanceIds=" + instanceIds + "\n" + "warningList=" + warningList + "\n" + "}";
    }

}
