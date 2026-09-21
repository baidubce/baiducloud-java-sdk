package com.baidubce.vdb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetInstanceListUsingGETRequest extends BaseBceRequest {

    /**
    * engineType
    */
    @JsonIgnore
    private String engineType;

    /**
    * instanceType
    */
    @JsonIgnore
    private String instanceType;

    public String getEngineType() {
        return engineType;
    }

    public GetInstanceListUsingGETRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public GetInstanceListUsingGETRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

}
