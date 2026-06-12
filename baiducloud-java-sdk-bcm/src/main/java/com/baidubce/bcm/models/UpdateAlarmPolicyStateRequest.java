package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateAlarmPolicyStateRequest extends BaseBceRequest {

    /**
    * 策略ID列表
    */
    private List<String> ids;

    /**
    * 报警策略状态，可选值：ENABLED / DISABLED
    */
    private String state;

    public List<String> getIds() {
        return ids;
    }

    public UpdateAlarmPolicyStateRequest setIds(List<String> ids) {
        this.ids = ids;
        return this;
    }

    public String getState() {
        return state;
    }

    public UpdateAlarmPolicyStateRequest setState(String state) {
        this.state = state;
        return this;
    }

}
