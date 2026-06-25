package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClaimAlertEventRequest extends BaseBceRequest {

    /**
    * 要认领的事件 ID 列表（1-100 个）
    */
    private List<String> eventIds;

    /**
    * 认领原因（最大 500 字符）
    */
    private String claimReason;

    public List<String> getEventIds() {
        return eventIds;
    }

    public ClaimAlertEventRequest setEventIds(List<String> eventIds) {
        this.eventIds = eventIds;
        return this;
    }

    public String getClaimReason() {
        return claimReason;
    }

    public ClaimAlertEventRequest setClaimReason(String claimReason) {
        this.claimReason = claimReason;
        return this;
    }

}
