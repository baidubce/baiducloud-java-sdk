package com.baidubce.bci.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetInstanceResponse extends BaseBceResponse {

    /**
    * instance
    */
    private InstanceDetailModel instance;

    public InstanceDetailModel getInstance() {
        return instance;
    }

    public GetInstanceResponse setInstance(InstanceDetailModel instance) {
        this.instance = instance;
        return this;
    }

    @Override
    public String toString() {
        return "GetInstanceResponse{" + "instance=" + instance + "\n" + "}";
    }

}
