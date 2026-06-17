package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateLogShipperRequest extends BaseBceRequest {

    /**
    * logShipperID
    */
    @JsonIgnore
    private String logShipperID;

    /**
    * 日志组名称，默认default
    */
    private String project;

    /**
    * 投递任务名称
    */
    private String logShipperName;

    /**
    * destConfig
    */
    private DestConfig destConfig;

    public String getLogShipperID() {
        return logShipperID;
    }

    public UpdateLogShipperRequest setLogShipperID(String logShipperID) {
        this.logShipperID = logShipperID;
        return this;
    }

    public String getProject() {
        return project;
    }

    public UpdateLogShipperRequest setProject(String project) {
        this.project = project;
        return this;
    }

    public String getLogShipperName() {
        return logShipperName;
    }

    public UpdateLogShipperRequest setLogShipperName(String logShipperName) {
        this.logShipperName = logShipperName;
        return this;
    }

    public DestConfig getDestConfig() {
        return destConfig;
    }

    public UpdateLogShipperRequest setDestConfig(DestConfig destConfig) {
        this.destConfig = destConfig;
        return this;
    }

}
