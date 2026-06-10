package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateVolumeResponse extends BaseBceResponse {

    /**
    * 订单id
    */
    private String orderId;

    /**
    * 磁盘ID，符合BCE规范，必须是一个定长字符串，且只允许包含大小写字母、数字、连字号（-）和下划线（_）。
    */
    private List<String> volumeIds;

    /**
    * 挂载磁盘产生的warning信息
    */
    private List<String> warningList;

    public String getOrderId() {
        return orderId;
    }

    public CreateVolumeResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public List<String> getVolumeIds() {
        return volumeIds;
    }

    public CreateVolumeResponse setVolumeIds(List<String> volumeIds) {
        this.volumeIds = volumeIds;
        return this;
    }

    public List<String> getWarningList() {
        return warningList;
    }

    public CreateVolumeResponse setWarningList(List<String> warningList) {
        this.warningList = warningList;
        return this;
    }

    @Override
    public String toString() {
        return "CreateVolumeResponse{" + "orderId=" + orderId + "\n" + "volumeIds=" + volumeIds + "\n" + "warningList=" + warningList + "\n" + "}";
    }

}
