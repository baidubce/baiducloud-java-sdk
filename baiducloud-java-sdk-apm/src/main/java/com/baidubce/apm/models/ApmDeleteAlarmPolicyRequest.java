package com.baidubce.apm.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApmDeleteAlarmPolicyRequest extends BaseBceRequest {

    /**
    * 策略ID列表，支持批量删除
    */
    private List<String> ids;

    public List<String> getIds() {
        return ids;
    }

    public ApmDeleteAlarmPolicyRequest setIds(List<String> ids) {
        this.ids = ids;
        return this;
    }

}
