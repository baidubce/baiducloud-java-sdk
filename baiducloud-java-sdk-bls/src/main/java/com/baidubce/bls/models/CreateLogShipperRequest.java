package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateLogShipperRequest extends BaseBceRequest {

    /**
    * 日志组名称，默认default
    */
    private String project;

    /**
    * 日志集名称
    */
    private String logStoreName;

    /**
    * 投递任务名称
    */
    private String logShipperName;

    /**
    * 投递开始时间
    */
    private String startTime;

    /**
    * 投递目的端类型，支持BOS/KAFKA
    */
    private String destType;

    /**
    * destConfig
    */
    private DestConfig destConfig;

    public String getProject() {
        return project;
    }

    public CreateLogShipperRequest setProject(String project) {
        this.project = project;
        return this;
    }

    public String getLogStoreName() {
        return logStoreName;
    }

    public CreateLogShipperRequest setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }

    public String getLogShipperName() {
        return logShipperName;
    }

    public CreateLogShipperRequest setLogShipperName(String logShipperName) {
        this.logShipperName = logShipperName;
        return this;
    }

    public String getStartTime() {
        return startTime;
    }

    public CreateLogShipperRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getDestType() {
        return destType;
    }

    public CreateLogShipperRequest setDestType(String destType) {
        this.destType = destType;
        return this;
    }

    public DestConfig getDestConfig() {
        return destConfig;
    }

    public CreateLogShipperRequest setDestConfig(DestConfig destConfig) {
        this.destConfig = destConfig;
        return this;
    }

}
