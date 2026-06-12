package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteAlarmPoliciesRequest extends BaseBceRequest {

    /**
    * 策略ID列表
    */
    private List<String> ids;

    public List<String> getIds() {
        return ids;
    }

    public DeleteAlarmPoliciesRequest setIds(List<String> ids) {
        this.ids = ids;
        return this;
    }

}
