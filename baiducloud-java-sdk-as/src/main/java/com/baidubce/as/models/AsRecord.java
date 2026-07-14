package com.baidubce.as.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsRecord {
    /**
     * 伸缩组ID
     */
    private String groupId;

    /**
     * 记录ID
     */
    private String recordId;

    /**
     * 开始时间
     */
    private String startTime;

    /**
     * 执行结果
     */
    private String result;

    /**
     * 实际操作的节点列表
     */
    private List<String> actualScaleNode;

    /**
     * 实际扩容后的带宽值
     */
    private Integer actualScaleBandwidth;

    /**
     * 当前带宽值
     */
    private Integer currentBandwidth;

    /**
     * 剩余的节点列表
     */
    private List<String> remainedNode;

    /**
     * 动作
     */
    private String action;

    /**
     * scaleCondition
     */
    private ScaleCondition scaleCondition;

    /**
     * 规则 ID
     */
    private String ruleId;

    /**
     * 消息
     */
    private String message;

    /**
     * expectAction
     */
    private ExpectAction expectAction;

    /**
     * 执行类型
     */
    private String executeType;

    /**
     * DAG编号
     */
    private String dagId;

    /**
     * resource
     */
    private Resource resource;

    public AsRecord setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public AsRecord setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }

    public String getRecordId() {
        return this.recordId;
    }

    public AsRecord setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public AsRecord setResult(String result) {
        this.result = result;
        return this;
    }

    public String getResult() {
        return this.result;
    }

    public AsRecord setActualScaleNode(List<String> actualScaleNode) {
        this.actualScaleNode = actualScaleNode;
        return this;
    }

    public List<String> getActualScaleNode() {
        return this.actualScaleNode;
    }

    public AsRecord setActualScaleBandwidth(Integer actualScaleBandwidth) {
        this.actualScaleBandwidth = actualScaleBandwidth;
        return this;
    }

    public Integer getActualScaleBandwidth() {
        return this.actualScaleBandwidth;
    }

    public AsRecord setCurrentBandwidth(Integer currentBandwidth) {
        this.currentBandwidth = currentBandwidth;
        return this;
    }

    public Integer getCurrentBandwidth() {
        return this.currentBandwidth;
    }

    public AsRecord setRemainedNode(List<String> remainedNode) {
        this.remainedNode = remainedNode;
        return this;
    }

    public List<String> getRemainedNode() {
        return this.remainedNode;
    }

    public AsRecord setAction(String action) {
        this.action = action;
        return this;
    }

    public String getAction() {
        return this.action;
    }

    public AsRecord setScaleCondition(ScaleCondition scaleCondition) {
        this.scaleCondition = scaleCondition;
        return this;
    }

    public ScaleCondition getScaleCondition() {
        return this.scaleCondition;
    }

    public AsRecord setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    public String getRuleId() {
        return this.ruleId;
    }

    public AsRecord setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public AsRecord setExpectAction(ExpectAction expectAction) {
        this.expectAction = expectAction;
        return this;
    }

    public ExpectAction getExpectAction() {
        return this.expectAction;
    }

    public AsRecord setExecuteType(String executeType) {
        this.executeType = executeType;
        return this;
    }

    public String getExecuteType() {
        return this.executeType;
    }

    public AsRecord setDagId(String dagId) {
        this.dagId = dagId;
        return this;
    }

    public String getDagId() {
        return this.dagId;
    }

    public AsRecord setResource(Resource resource) {
        this.resource = resource;
        return this;
    }

    public Resource getResource() {
        return this.resource;
    }

    @Override
    public String toString() {
        return "AsRecord{" + "groupId=" + groupId + "\n" + "recordId=" + recordId + "\n" + "startTime=" + startTime + "\n" + "result=" + result + "\n" + "actualScaleNode="
                + actualScaleNode + "\n" + "actualScaleBandwidth=" + actualScaleBandwidth + "\n" + "currentBandwidth=" + currentBandwidth + "\n" + "remainedNode=" + remainedNode
                + "\n" + "action=" + action + "\n" + "scaleCondition=" + scaleCondition + "\n" + "ruleId=" + ruleId + "\n" + "message=" + message + "\n" + "expectAction="
                + expectAction + "\n" + "executeType=" + executeType + "\n" + "dagId=" + dagId + "\n" + "resource=" + resource + "\n" + "}";
    }

}