package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyReservedInstancesResponse extends BaseBceResponse {

    /**
    * 调整预留实例券的返回集合
    */
    private List<ModifyReservedInstanceOrder> modifyReservedInstanceOrders;

    public List<ModifyReservedInstanceOrder> getModifyReservedInstanceOrders() {
        return modifyReservedInstanceOrders;
    }

    public ModifyReservedInstancesResponse setModifyReservedInstanceOrders(List<ModifyReservedInstanceOrder> modifyReservedInstanceOrders) {
        this.modifyReservedInstanceOrders = modifyReservedInstanceOrders;
        return this;
    }

    @Override
    public String toString() {
        return "ModifyReservedInstancesResponse{" + "modifyReservedInstanceOrders=" + modifyReservedInstanceOrders + "\n" + "}";
    }

}
