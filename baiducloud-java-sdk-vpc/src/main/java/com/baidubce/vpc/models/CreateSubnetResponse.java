package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateSubnetResponse extends BaseBceResponse {

    /**
    * 创建子网的ID
    */
    private String subnetId;

    public String getSubnetId() {
        return subnetId;
    }

    public CreateSubnetResponse setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateSubnetResponse{" + "subnetId=" + subnetId + "\n" + "}";
    }

}
