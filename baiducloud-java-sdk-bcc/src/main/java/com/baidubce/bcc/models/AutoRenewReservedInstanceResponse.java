package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AutoRenewReservedInstanceResponse extends BaseBceResponse {

    /**
    * 预留实例券的id集合
    */
    private List<String> reservedInstanceIds;

    public List<String> getReservedInstanceIds() {
        return reservedInstanceIds;
    }

    public AutoRenewReservedInstanceResponse setReservedInstanceIds(List<String> reservedInstanceIds) {
        this.reservedInstanceIds = reservedInstanceIds;
        return this;
    }

    @Override
    public String toString() {
        return "AutoRenewReservedInstanceResponse{" + "reservedInstanceIds=" + reservedInstanceIds + "\n" + "}";
    }

}
