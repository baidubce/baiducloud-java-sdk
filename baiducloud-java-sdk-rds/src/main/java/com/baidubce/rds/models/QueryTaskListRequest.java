package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryTaskListRequest extends BaseBceRequest {

    /**
    * 每页的大小
    */
    private String pageSize;

    /**
    * 页码
    */
    private String pageNo;

    /**
    * 实例ID
    */
    private String instanceId;

    /**
    * 实例名称
    */
    private String instanceName;

    /**
    * 任务ID
    */
    private Integer taskId;

    /**
    * 任务类型，可取值：resize/switch/reboot/changeAzone
    */
    private String taskType;

    /**
    * 任务状态，可取值：created/running/success/failed/cancelled
    */
    private String taskStatus;

    /**
    * 任务开始时间
    */
    private String startTime;

    /**
    * 任务结束时间
    */
    private String endTime;

    public String getPageSize() {
        return pageSize;
    }

    public QueryTaskListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public String getPageNo() {
        return pageNo;
    }

    public QueryTaskListRequest setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public QueryTaskListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public QueryTaskListRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public QueryTaskListRequest setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }

    public String getTaskType() {
        return taskType;
    }

    public QueryTaskListRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public QueryTaskListRequest setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    public String getStartTime() {
        return startTime;
    }

    public QueryTaskListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getEndTime() {
        return endTime;
    }

    public QueryTaskListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

}
