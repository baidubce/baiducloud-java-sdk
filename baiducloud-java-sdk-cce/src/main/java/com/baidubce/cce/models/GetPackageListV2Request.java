package com.baidubce.cce.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPackageListV2Request extends BaseBceRequest {

    /**
    * type
    */
    @JsonIgnore
    private String type;

    /**
    * 查询指定套餐
    */
    private List<String> machineSpecList;

    public String getType() {
        return type;
    }

    public GetPackageListV2Request setType(String type) {
        this.type = type;
        return this;
    }

    public List<String> getMachineSpecList() {
        return machineSpecList;
    }

    public GetPackageListV2Request setMachineSpecList(List<String> machineSpecList) {
        this.machineSpecList = machineSpecList;
        return this;
    }

}
