package com.baidubce.cce.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstanceSet {
    /**
     * 
     */
    private Object instanceSpec;

    public InstanceSet setInstanceSpec(Object instanceSpec) {
        this.instanceSpec = instanceSpec;
        return this;
    }

    public Object getInstanceSpec() {
        return this.instanceSpec;
    }

    @Override
    public String toString() {
        return "InstanceSet{" + "instanceSpec=" + instanceSpec + "\n" + "}";
    }

}