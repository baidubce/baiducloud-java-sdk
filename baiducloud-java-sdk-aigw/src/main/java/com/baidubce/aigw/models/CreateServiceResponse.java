package com.baidubce.aigw.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateServiceResponse extends BaseBceResponse {

    /**
    * 成功登记的服务数量
    */
    private Integer addedCount;

    public Integer getAddedCount() {
        return addedCount;
    }

    public CreateServiceResponse setAddedCount(Integer addedCount) {
        this.addedCount = addedCount;
        return this;
    }

    @Override
    public String toString() {
        return "CreateServiceResponse{" + "addedCount=" + addedCount + "\n" + "}";
    }

}
