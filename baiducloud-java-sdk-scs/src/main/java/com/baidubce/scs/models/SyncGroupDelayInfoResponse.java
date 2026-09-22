package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SyncGroupDelayInfoResponse extends BaseBceResponse {

    /**
    * 延迟信息列表
    */
    private List<DelayInfoConsoleItem> delayInfo;

    public List<DelayInfoConsoleItem> getDelayInfo() {
        return delayInfo;
    }

    public SyncGroupDelayInfoResponse setDelayInfo(List<DelayInfoConsoleItem> delayInfo) {
        this.delayInfo = delayInfo;
        return this;
    }

    @Override
    public String toString() {
        return "SyncGroupDelayInfoResponse{" + "delayInfo=" + delayInfo + "\n" + "}";
    }

}
