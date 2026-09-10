package com.baidubce.cce.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPackageListV2Response extends BaseBceResponse {

    /**
    * 套餐列表
    */
    private List<MachineSpecStatus> machineSpecList;

    public List<MachineSpecStatus> getMachineSpecList() {
        return machineSpecList;
    }

    public GetPackageListV2Response setMachineSpecList(List<MachineSpecStatus> machineSpecList) {
        this.machineSpecList = machineSpecList;
        return this;
    }

    @Override
    public String toString() {
        return "GetPackageListV2Response{" + "machineSpecList=" + machineSpecList + "\n" + "}";
    }

}
