package com.baidubce.bls.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetLogShipperResponse extends BaseBceResponse {

    /**
    * 请求是否成功
    */
    private Boolean success;

    /**
    * 请求码，成功为OK，错误为具体的错误码
    */
    private String code;

    /**
    * 运行状态, 可为运行中（Running）、异常（Abnormal）、已暂停（Paused）
    */
    private String status;

    /**
    * 投递任务名称
    */
    private String logShipperName;

    /**
    * 日志组名称
    */
    private String project;

    /**
    * 日志集名称
    */
    private String logStoreName;

    /**
    * 指定投递开始时间
    */
    private String startTime;

    /**
    * 目的端类型
    */
    private String destType;

    /**
    * destConfig
    */
    private DestConfig destConfig;

    public Boolean getSuccess() {
        return success;
    }

    public GetLogShipperResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public GetLogShipperResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public GetLogShipperResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getLogShipperName() {
        return logShipperName;
    }

    public GetLogShipperResponse setLogShipperName(String logShipperName) {
        this.logShipperName = logShipperName;
        return this;
    }

    public String getProject() {
        return project;
    }

    public GetLogShipperResponse setProject(String project) {
        this.project = project;
        return this;
    }

    public String getLogStoreName() {
        return logStoreName;
    }

    public GetLogShipperResponse setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }

    public String getStartTime() {
        return startTime;
    }

    public GetLogShipperResponse setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getDestType() {
        return destType;
    }

    public GetLogShipperResponse setDestType(String destType) {
        this.destType = destType;
        return this;
    }

    public DestConfig getDestConfig() {
        return destConfig;
    }

    public GetLogShipperResponse setDestConfig(DestConfig destConfig) {
        this.destConfig = destConfig;
        return this;
    }

    @Override
    public String toString() {
        return "GetLogShipperResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "status=" + status + "\n" + "logShipperName=" + logShipperName + "\n" + "project="
                + project + "\n" + "logStoreName=" + logStoreName + "\n" + "startTime=" + startTime + "\n" + "destType=" + destType + "\n" + "destConfig=" + destConfig + "\n"
                + "}";
    }

}
