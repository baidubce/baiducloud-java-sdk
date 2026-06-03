package com.baidubce.ccr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TriggerJob {
    /**
     * 触发器任务创建时间
     */
    private String creationTime;

    /**
     * 触发事件类型
     */
    private String eventType;

    /**
     * 触发器任务 ID
     */
    private Integer id;

    /**
     * 触发对象列表
     */
    private List<String> images;

    /**
     * 通知类型
     */
    private String notifyType;

    /**
     * 操作人员
     */
    private String operator;

    /**
     * 触发器策略 ID
     */
    private Integer policyId;

    /**
     * 触发器任务状态
     */
    private String status;

    /**
     * 触发器任务更新时间
     */
    private String updateTime;

    public TriggerJob setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public String getCreationTime() {
        return this.creationTime;
    }

    public TriggerJob setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    public String getEventType() {
        return this.eventType;
    }

    public TriggerJob setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getId() {
        return this.id;
    }

    public TriggerJob setImages(List<String> images) {
        this.images = images;
        return this;
    }

    public List<String> getImages() {
        return this.images;
    }

    public TriggerJob setNotifyType(String notifyType) {
        this.notifyType = notifyType;
        return this;
    }

    public String getNotifyType() {
        return this.notifyType;
    }

    public TriggerJob setOperator(String operator) {
        this.operator = operator;
        return this;
    }

    public String getOperator() {
        return this.operator;
    }

    public TriggerJob setPolicyId(Integer policyId) {
        this.policyId = policyId;
        return this;
    }

    public Integer getPolicyId() {
        return this.policyId;
    }

    public TriggerJob setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public TriggerJob setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    @Override
    public String toString() {
        return "TriggerJob{" + "creationTime=" + creationTime + "\n" + "eventType=" + eventType + "\n" + "id=" + id + "\n" + "images=" + images + "\n" + "notifyType=" + notifyType
                + "\n" + "operator=" + operator + "\n" + "policyId=" + policyId + "\n" + "status=" + status + "\n" + "updateTime=" + updateTime + "\n" + "}";
    }

}