package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteAlarmPolicyRequest extends BaseBceRequest {

    /**
    * 报警策略名称
    */
    private List<String> names;

    public List<String> getNames() {
        return names;
    }

    public DeleteAlarmPolicyRequest setNames(List<String> names) {
        this.names = names;
        return this;
    }

}
