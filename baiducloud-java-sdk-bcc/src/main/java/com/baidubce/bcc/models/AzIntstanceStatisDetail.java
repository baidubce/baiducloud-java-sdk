package com.baidubce.bcc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AzIntstanceStatisDetail {
    /**
     * 可用区名称
     */
    private String zoneName;

    /**
     * 部署集关联的实例数量
     */
    private Integer instanceCount;

    /**
     * 当前部署集strategy类型下指定可用区配额
     */
    private Integer instanceTotal;

    /**
     * 部署集关联的BCC实例数量
     */
    private Integer bccInstanceCnt;

    /**
     * 部署集关联的BBC实例数量
     */
    private Integer bbcInstanceCnt;

    /**
     * 部署集关联的实例列表（查询部署集详情返回）
     */
    private List<String> instanceIds;

    /**
     * 部署集关联的BCC实例ID列表（查询部署集详情返回）
     */
    private List<String> bccInstanceIds;

    /**
     * 部署集关联的BBC实例数量（查询部署集详情返回）
     */
    private List<String> bbcInstanceIds;

    public AzIntstanceStatisDetail setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getZoneName() {
        return this.zoneName;
    }

    public AzIntstanceStatisDetail setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    public AzIntstanceStatisDetail setInstanceTotal(Integer instanceTotal) {
        this.instanceTotal = instanceTotal;
        return this;
    }

    public Integer getInstanceTotal() {
        return this.instanceTotal;
    }

    public AzIntstanceStatisDetail setBccInstanceCnt(Integer bccInstanceCnt) {
        this.bccInstanceCnt = bccInstanceCnt;
        return this;
    }

    public Integer getBccInstanceCnt() {
        return this.bccInstanceCnt;
    }

    public AzIntstanceStatisDetail setBbcInstanceCnt(Integer bbcInstanceCnt) {
        this.bbcInstanceCnt = bbcInstanceCnt;
        return this;
    }

    public Integer getBbcInstanceCnt() {
        return this.bbcInstanceCnt;
    }

    public AzIntstanceStatisDetail setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public AzIntstanceStatisDetail setBccInstanceIds(List<String> bccInstanceIds) {
        this.bccInstanceIds = bccInstanceIds;
        return this;
    }

    public List<String> getBccInstanceIds() {
        return this.bccInstanceIds;
    }

    public AzIntstanceStatisDetail setBbcInstanceIds(List<String> bbcInstanceIds) {
        this.bbcInstanceIds = bbcInstanceIds;
        return this;
    }

    public List<String> getBbcInstanceIds() {
        return this.bbcInstanceIds;
    }

    @Override
    public String toString() {
        return "AzIntstanceStatisDetail{" + "zoneName=" + zoneName + "\n" + "instanceCount=" + instanceCount + "\n" + "instanceTotal=" + instanceTotal + "\n" + "bccInstanceCnt="
                + bccInstanceCnt + "\n" + "bbcInstanceCnt=" + bbcInstanceCnt + "\n" + "instanceIds=" + instanceIds + "\n" + "bccInstanceIds=" + bccInstanceIds + "\n"
                + "bbcInstanceIds=" + bbcInstanceIds + "\n" + "}";
    }

}