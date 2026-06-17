package com.baidubce.bcc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlannedEventResponse {
    /**
     * 事件id（查询预期事件列表、查询预期时间记录列表接口返回）
     */
    private String serverEventId;

    /**
     * 
     */
    private String serverEventType;

    /**
     * 事件状态，支持状态：Inquiring，Processing，Executing，Executed，Abnormal，Closed（查询预期事件列表、查询预期时间记录列表接口返回）
     */
    private String serverEventStatus;

    /**
     * 故障实例ID（查询预期事件列表、查询预期时间记录列表接口返回）
     */
    private String instanceId;

    /**
     * 故障实例产品类型（查询预期事件列表、查询预期时间记录列表接口返回）
     */
    private String productCategory;

    /**
     * 故障实例规格（查询预期事件列表、查询预期时间记录列表接口返回）
     */
    private String instanceSpec;

    /**
     * 故障实例名（查询预期事件列表、查询预期时间记录列表接口返回）
     */
    private String instanceName;

    /**
     * 故障实例的内网IP。（查询预期事件列表、查询预期时间记录列表接口返回）
     */
    private String privateIp;

    /**
     * 
     */
    private List<TagModel> tags;

    /**
     * 创建时间，符合BCE规范的日期格式，例如：2025-02-13T00:00:00Z（查询预期事件列表、查询预期时间记录列表接口返回）
     */
    private String serverEventCreatedTime;

    /**
     * 事件结束时间，符合BCE规范的日期格式，例如：2025-02-13T00:00:00Z（查询预期事件列表、查询预期时间记录列表接口返回）
     */
    private String serverEventEndedTime;

    /**
     * 该事件支持的运维操作，可能支持的类型：Repair、Reboot（查询预期事件列表、查询预期时间记录列表接口返回）
     */
    private List<String> maintenanceOptions;

    /**
     * 
     */
    private List<String> supportMaintenanceOptions;

    /**
     * 该事件已授权的维修方式，与授权时使用的方式一致（查询预期事件列表、查询预期时间记录列表接口返回）
     */
    private String authorizedMaintenanceOperation;

    /**
     * 多事件情况下该实例关联计划内运维事件ID列表（查询预期事件列表、查询预期时间记录列表接口返回）
     */
    private List<String> associatedPlannedMaintenanceServerEventIds;

    /**
     * 多事件情况下该实例关联非预期运维事件ID列表（查询预期事件列表、查询预期时间记录列表接口返回）
     */
    private List<String> associatedUnplannedMaintenanceServerEventIds;

    /**
     * 事件执行时间，符合BCE规范的日期格式，例如：2025-02-13T00:00:00Z（查询预期事件列表、查询预期时间记录列表接口返回）
     */
    private String executeTime;

    /**
     * 操作日志，包括用户授权、运维、验收等操作记录。（查询预期事件列表、查询预期时间记录列表接口返回）
     */
    private List<OperationRecordResponse> serverEventLogs;

    /**
     * 是否有快速修复库存（查询预期事件列表、查询预期时间记录列表接口返回）
     */
    private Boolean hasFastRepairStock;

    /**
     * 事件风险项（查询预期事件列表、查询预期时间记录列表接口返回）
     */
    private List<IssueResponse> risks;

    public PlannedEventResponse setServerEventId(String serverEventId) {
        this.serverEventId = serverEventId;
        return this;
    }

    public String getServerEventId() {
        return this.serverEventId;
    }

    public PlannedEventResponse setServerEventType(String serverEventType) {
        this.serverEventType = serverEventType;
        return this;
    }

    public String getServerEventType() {
        return this.serverEventType;
    }

    public PlannedEventResponse setServerEventStatus(String serverEventStatus) {
        this.serverEventStatus = serverEventStatus;
        return this;
    }

    public String getServerEventStatus() {
        return this.serverEventStatus;
    }

    public PlannedEventResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public PlannedEventResponse setProductCategory(String productCategory) {
        this.productCategory = productCategory;
        return this;
    }

    public String getProductCategory() {
        return this.productCategory;
    }

    public PlannedEventResponse setInstanceSpec(String instanceSpec) {
        this.instanceSpec = instanceSpec;
        return this;
    }

    public String getInstanceSpec() {
        return this.instanceSpec;
    }

    public PlannedEventResponse setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public PlannedEventResponse setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    public String getPrivateIp() {
        return this.privateIp;
    }

    public PlannedEventResponse setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    public List<TagModel> getTags() {
        return this.tags;
    }

    public PlannedEventResponse setServerEventCreatedTime(String serverEventCreatedTime) {
        this.serverEventCreatedTime = serverEventCreatedTime;
        return this;
    }

    public String getServerEventCreatedTime() {
        return this.serverEventCreatedTime;
    }

    public PlannedEventResponse setServerEventEndedTime(String serverEventEndedTime) {
        this.serverEventEndedTime = serverEventEndedTime;
        return this;
    }

    public String getServerEventEndedTime() {
        return this.serverEventEndedTime;
    }

    public PlannedEventResponse setMaintenanceOptions(List<String> maintenanceOptions) {
        this.maintenanceOptions = maintenanceOptions;
        return this;
    }

    public List<String> getMaintenanceOptions() {
        return this.maintenanceOptions;
    }

    public PlannedEventResponse setSupportMaintenanceOptions(List<String> supportMaintenanceOptions) {
        this.supportMaintenanceOptions = supportMaintenanceOptions;
        return this;
    }

    public List<String> getSupportMaintenanceOptions() {
        return this.supportMaintenanceOptions;
    }

    public PlannedEventResponse setAuthorizedMaintenanceOperation(String authorizedMaintenanceOperation) {
        this.authorizedMaintenanceOperation = authorizedMaintenanceOperation;
        return this;
    }

    public String getAuthorizedMaintenanceOperation() {
        return this.authorizedMaintenanceOperation;
    }

    public PlannedEventResponse setAssociatedPlannedMaintenanceServerEventIds(List<String> associatedPlannedMaintenanceServerEventIds) {
        this.associatedPlannedMaintenanceServerEventIds = associatedPlannedMaintenanceServerEventIds;
        return this;
    }

    public List<String> getAssociatedPlannedMaintenanceServerEventIds() {
        return this.associatedPlannedMaintenanceServerEventIds;
    }

    public PlannedEventResponse setAssociatedUnplannedMaintenanceServerEventIds(List<String> associatedUnplannedMaintenanceServerEventIds) {
        this.associatedUnplannedMaintenanceServerEventIds = associatedUnplannedMaintenanceServerEventIds;
        return this;
    }

    public List<String> getAssociatedUnplannedMaintenanceServerEventIds() {
        return this.associatedUnplannedMaintenanceServerEventIds;
    }

    public PlannedEventResponse setExecuteTime(String executeTime) {
        this.executeTime = executeTime;
        return this;
    }

    public String getExecuteTime() {
        return this.executeTime;
    }

    public PlannedEventResponse setServerEventLogs(List<OperationRecordResponse> serverEventLogs) {
        this.serverEventLogs = serverEventLogs;
        return this;
    }

    public List<OperationRecordResponse> getServerEventLogs() {
        return this.serverEventLogs;
    }

    public PlannedEventResponse setHasFastRepairStock(Boolean hasFastRepairStock) {
        this.hasFastRepairStock = hasFastRepairStock;
        return this;
    }

    public Boolean getHasFastRepairStock() {
        return this.hasFastRepairStock;
    }

    public PlannedEventResponse setRisks(List<IssueResponse> risks) {
        this.risks = risks;
        return this;
    }

    public List<IssueResponse> getRisks() {
        return this.risks;
    }

    @Override
    public String toString() {
        return "PlannedEventResponse{" + "serverEventId=" + serverEventId + "\n" + "serverEventType=" + serverEventType + "\n" + "serverEventStatus=" + serverEventStatus + "\n"
                + "instanceId=" + instanceId + "\n" + "productCategory=" + productCategory + "\n" + "instanceSpec=" + instanceSpec + "\n" + "instanceName=" + instanceName + "\n"
                + "privateIp=" + privateIp + "\n" + "tags=" + tags + "\n" + "serverEventCreatedTime=" + serverEventCreatedTime + "\n" + "serverEventEndedTime="
                + serverEventEndedTime + "\n" + "maintenanceOptions=" + maintenanceOptions + "\n" + "supportMaintenanceOptions=" + supportMaintenanceOptions + "\n"
                + "authorizedMaintenanceOperation=" + authorizedMaintenanceOperation + "\n" + "associatedPlannedMaintenanceServerEventIds="
                + associatedPlannedMaintenanceServerEventIds + "\n" + "associatedUnplannedMaintenanceServerEventIds=" + associatedUnplannedMaintenanceServerEventIds + "\n"
                + "executeTime=" + executeTime + "\n" + "serverEventLogs=" + serverEventLogs + "\n" + "hasFastRepairStock=" + hasFastRepairStock + "\n" + "risks=" + risks + "\n"
                + "}";
    }

}