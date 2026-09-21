package com.baidubce.vdb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetNodeSpecListUsingGETRequest extends BaseBceRequest {

    /**
    * engineType
    */
    @JsonIgnore
    private String engineType;

    public String getEngineType() {
        return engineType;
    }

    public GetNodeSpecListUsingGETRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

}
