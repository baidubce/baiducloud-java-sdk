package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyReservedInstancesRequest extends BaseBceRequest {

    /**
    * 要调整的预留实例券列表
    */
    private List<ReservedInstance> reservedInstances;

    public List<ReservedInstance> getReservedInstances() {
        return reservedInstances;
    }

    public ModifyReservedInstancesRequest setReservedInstances(List<ReservedInstance> reservedInstances) {
        this.reservedInstances = reservedInstances;
        return this;
    }

}
