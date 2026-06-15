package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetInstanceResponse extends BaseBceResponse {

    /**
    * instance
    */
    private InstanceModel instance;

    public InstanceModel getInstance() {
        return instance;
    }

    public GetInstanceResponse setInstance(InstanceModel instance) {
        this.instance = instance;
        return this;
    }

    @Override
    public String toString() {
        return "GetInstanceResponse{" + "instance=" + instance + "\n" + "}";
    }

}
