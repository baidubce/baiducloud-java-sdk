package com.baidubce.cce.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExistedInstanceInCluster {
    /**
     * 
     */
    private String existedInstanceID;

    public ExistedInstanceInCluster setExistedInstanceID(String existedInstanceID) {
        this.existedInstanceID = existedInstanceID;
        return this;
    }

    public String getExistedInstanceID() {
        return this.existedInstanceID;
    }

    @Override
    public String toString() {
        return "ExistedInstanceInCluster{" + "existedInstanceID=" + existedInstanceID + "\n" + "}";
    }

}