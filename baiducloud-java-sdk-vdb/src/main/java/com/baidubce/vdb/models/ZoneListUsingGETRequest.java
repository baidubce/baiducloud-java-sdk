package com.baidubce.vdb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ZoneListUsingGETRequest extends BaseBceRequest {

    /**
    * from
    */
    @JsonIgnore
    private String from;

    /**
    * engineType
    */
    @JsonIgnore
    private String engineType;

    public String getFrom() {
        return from;
    }

    public ZoneListUsingGETRequest setFrom(String from) {
        this.from = from;
        return this;
    }

    public String getEngineType() {
        return engineType;
    }

    public ZoneListUsingGETRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

}
