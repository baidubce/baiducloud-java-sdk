package com.baidubce.apm.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApmUpdateAlarmPolicyStateRequest extends BaseBceRequest {

    /**
    * 策略ID列表，支持批量启停
    */
    private List<String> ids;

    /**
    * 目标状态，可选值：ENABLED-启动策略，DISABLED-停用策略
    */
    private String state;

    public List<String> getIds() {
        return ids;
    }

    public ApmUpdateAlarmPolicyStateRequest setIds(List<String> ids) {
        this.ids = ids;
        return this;
    }

    public String getState() {
        return state;
    }

    public ApmUpdateAlarmPolicyStateRequest setState(String state) {
        this.state = state;
        return this;
    }

}
