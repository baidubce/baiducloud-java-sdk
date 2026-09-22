package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetTimeWindowResponse extends BaseBceResponse {

    /**
    * maintainTime
    */
    private MaintainTime maintainTime;

    public MaintainTime getMaintainTime() {
        return maintainTime;
    }

    public GetTimeWindowResponse setMaintainTime(MaintainTime maintainTime) {
        this.maintainTime = maintainTime;
        return this;
    }

    @Override
    public String toString() {
        return "GetTimeWindowResponse{" + "maintainTime=" + maintainTime + "\n" + "}";
    }

}
