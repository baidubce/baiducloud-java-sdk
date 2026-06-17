package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListTaskRequest extends BaseBceRequest {

    /**
    * 任务ID列表，最多100个。
    */
    private List<String> taskIds;

    /**
    * marker 任务ID
    */
    private String marker;

    /**
    * 默认值10，最大100。
    */
    private Integer maxKeys;

    /**
    * 取值范围：AttachDeploymentSets：调整部署集
    */
    private String taskAction;

    /**
    * 任务状态。取值范围：Finished：已完成（非运行中）。Processing：运行中。Failed：失败（全部子任务失败）。默认值为空。
    */
    private String taskStatus;

    /**
    * 主任务按创建时间查询，创建时间区间的起始点。按照ISO 8601标准表示，并需要使用 UTC +0 时间，格式为 yyyy-MM-ddTHH:mm:ssZ。支持查近7天
    */
    private String startTime;

    /**
    * 主任务按创建时间查询，创建时间区间的终止点。按照ISO 8601标准表示，并需要使用 UTC +0 时间，格式为 yyyy-MM-ddTHH:mm:ssZ。
    */
    private String endTime;

    /**
    * 资源ID。单次最多支持指定 100 个，当taskAction为调整部署集时为实例ID
    */
    private List<String> resourceIds;

    public List<String> getTaskIds() {
        return taskIds;
    }

    public ListTaskRequest setTaskIds(List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public ListTaskRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public ListTaskRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getTaskAction() {
        return taskAction;
    }

    public ListTaskRequest setTaskAction(String taskAction) {
        this.taskAction = taskAction;
        return this;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public ListTaskRequest setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    public String getStartTime() {
        return startTime;
    }

    public ListTaskRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getEndTime() {
        return endTime;
    }

    public ListTaskRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public List<String> getResourceIds() {
        return resourceIds;
    }

    public ListTaskRequest setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }

}
