package com.baidubce.dbsc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BigKeyTask {
    /**
     * 节点ID
     */
    private String nodeId;

    /**
     * 任务ID
     */
    private Integer taskId;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 结束时间
     */
    private String endTime;

    /**
     * 开始时间
     */
    private String startTime;

    /**
     * 任务状态：1：等待调度2：等待分析3：分析中4：分析成功5：分析失败6：已删除
     */
    private Integer status;

    /**
     * 状态的描述：等待调度等待分析分析中分析成功分析失败已删除
     */
    private String statusDesc;

    public BigKeyTask setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    public String getNodeId() {
        return this.nodeId;
    }

    public BigKeyTask setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }

    public Integer getTaskId() {
        return this.taskId;
    }

    public BigKeyTask setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public BigKeyTask setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public BigKeyTask setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public BigKeyTask setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Integer getStatus() {
        return this.status;
    }

    public BigKeyTask setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
        return this;
    }

    public String getStatusDesc() {
        return this.statusDesc;
    }

    @Override
    public String toString() {
        return "BigKeyTask{" + "nodeId=" + nodeId + "\n" + "taskId=" + taskId + "\n" + "createTime=" + createTime + "\n" + "endTime=" + endTime + "\n" + "startTime=" + startTime
                + "\n" + "status=" + status + "\n" + "statusDesc=" + statusDesc + "\n" + "}";
    }

}