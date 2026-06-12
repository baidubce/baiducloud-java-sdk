package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateAlarmPolicyNotifyEnabledRequest extends BaseBceRequest {

    /**
    * 策略ID列表
    */
    private List<String> ids;

    /**
    * 是否开启通知
    */
    private Boolean notifyEnabled;

    public List<String> getIds() {
        return ids;
    }

    public UpdateAlarmPolicyNotifyEnabledRequest setIds(List<String> ids) {
        this.ids = ids;
        return this;
    }

    public Boolean getNotifyEnabled() {
        return notifyEnabled;
    }

    public UpdateAlarmPolicyNotifyEnabledRequest setNotifyEnabled(Boolean notifyEnabled) {
        this.notifyEnabled = notifyEnabled;
        return this;
    }

}
