package com.baidubce.bls.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShipperSummary {
    /**
     * 投递任务ID
     */
    private String logShipperID;

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
     * 投递目的端类型
     */
    private String destType;

    /**
     * 任务状态
     */
    private String status;

    /**
     * 创建时间
     */
    private String createDateTime;

    /**
     * 错误信息
     */
    private String errMessage;

    public ShipperSummary setLogShipperID(String logShipperID) {
        this.logShipperID = logShipperID;
        return this;
    }

    public String getLogShipperID() {
        return this.logShipperID;
    }

    public ShipperSummary setLogShipperName(String logShipperName) {
        this.logShipperName = logShipperName;
        return this;
    }

    public String getLogShipperName() {
        return this.logShipperName;
    }

    public ShipperSummary setProject(String project) {
        this.project = project;
        return this;
    }

    public String getProject() {
        return this.project;
    }

    public ShipperSummary setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }

    public String getLogStoreName() {
        return this.logStoreName;
    }

    public ShipperSummary setDestType(String destType) {
        this.destType = destType;
        return this;
    }

    public String getDestType() {
        return this.destType;
    }

    public ShipperSummary setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public ShipperSummary setCreateDateTime(String createDateTime) {
        this.createDateTime = createDateTime;
        return this;
    }

    public String getCreateDateTime() {
        return this.createDateTime;
    }

    public ShipperSummary setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }

    public String getErrMessage() {
        return this.errMessage;
    }

    @Override
    public String toString() {
        return "ShipperSummary{" + "logShipperID=" + logShipperID + "\n" + "logShipperName=" + logShipperName + "\n" + "project=" + project + "\n" + "logStoreName=" + logStoreName
                + "\n" + "destType=" + destType + "\n" + "status=" + status + "\n" + "createDateTime=" + createDateTime + "\n" + "errMessage=" + errMessage + "\n" + "}";
    }

}