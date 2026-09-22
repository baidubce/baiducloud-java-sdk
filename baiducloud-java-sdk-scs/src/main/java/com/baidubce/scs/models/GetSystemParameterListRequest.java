package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetSystemParameterListRequest extends BaseBceRequest {

    /**
    * engine
    */
    @JsonIgnore
    private String engine;

    /**
    * engineVersion
    */
    @JsonIgnore
    private String engineVersion;

    /**
    * clusterType
    */
    @JsonIgnore
    private String clusterType;

    public String getEngine() {
        return engine;
    }

    public GetSystemParameterListRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public String getEngineVersion() {
        return engineVersion;
    }

    public GetSystemParameterListRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    public String getClusterType() {
        return clusterType;
    }

    public GetSystemParameterListRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

}
