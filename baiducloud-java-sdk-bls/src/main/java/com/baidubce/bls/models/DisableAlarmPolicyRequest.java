package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DisableAlarmPolicyRequest extends BaseBceRequest {

    /**
    * 报警策略名称
    */
    private List<String> name;

    public List<String> getName() {
        return name;
    }

    public DisableAlarmPolicyRequest setName(List<String> name) {
        this.name = name;
        return this;
    }

}
