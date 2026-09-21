package com.baidubce.vdb.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Getinstancelistusingget1Response extends BaseBceResponse {

    /**
    * instances
    */
    private List<Instance> instances;

    public List<Instance> getInstances() {
        return instances;
    }

    public Getinstancelistusingget1Response setInstances(List<Instance> instances) {
        this.instances = instances;
        return this;
    }

    @Override
    public String toString() {
        return "Getinstancelistusingget1Response{" + "instances=" + instances + "\n" + "}";
    }

}
