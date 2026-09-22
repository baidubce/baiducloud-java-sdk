package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateHotGroupRequest extends BaseBceRequest {

    /**
    * leader
    */
    private Leader leader;

    public Leader getLeader() {
        return leader;
    }

    public CreateHotGroupRequest setLeader(Leader leader) {
        this.leader = leader;
        return this;
    }

}
