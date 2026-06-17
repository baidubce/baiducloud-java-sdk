package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CancelAutoRenewReservedInstanceRequest extends BaseBceRequest {

    /**
    * 实例券id集合
    */
    private List<String> reservedInstanceIds;

    public List<String> getReservedInstanceIds() {
        return reservedInstanceIds;
    }

    public CancelAutoRenewReservedInstanceRequest setReservedInstanceIds(List<String> reservedInstanceIds) {
        this.reservedInstanceIds = reservedInstanceIds;
        return this;
    }

}
