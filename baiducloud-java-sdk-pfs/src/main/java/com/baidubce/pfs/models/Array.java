package com.baidubce.pfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Array {
    /**
     * 
     */
    private String accessGroupName;

    /**
     * 
     */
    private String description;

    /**
     * 
     */
    private Integer ruleCount;

    /**
     * 
     */
    private Integer instanceCount;

    /**
     * 
     */
    private Integer mountCount;

    /**
     * 
     */
    private String createTime;

    /**
     * 
     */
    private String zoneName;

    /**
     * 
     */
    private Integer accessRuleId;

    /**
     * 
     */
    private String ip;

    /**
     * 
     */
    private Integer mask;

    /**
     * 
     */
    private Integer priority;

    /**
     * 
     */
    private String writeAccess;

    /**
     * 
     */
    private String userAccess;

    /**
     * 
     */
    private String mountTargetId;

    /**
     * 
     */
    private String mountTargetName;

    /**
     * 
     */
    private String instanceId;

    /**
     * 
     */
    private String instanceName;

    public Array setAccessGroupName(String accessGroupName) {
        this.accessGroupName = accessGroupName;
        return this;
    }

    public String getAccessGroupName() {
        return this.accessGroupName;
    }

    public Array setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public Array setRuleCount(Integer ruleCount) {
        this.ruleCount = ruleCount;
        return this;
    }

    public Integer getRuleCount() {
        return this.ruleCount;
    }

    public Array setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    public Array setMountCount(Integer mountCount) {
        this.mountCount = mountCount;
        return this;
    }

    public Integer getMountCount() {
        return this.mountCount;
    }

    public Array setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public Array setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getZoneName() {
        return this.zoneName;
    }

    public Array setAccessRuleId(Integer accessRuleId) {
        this.accessRuleId = accessRuleId;
        return this;
    }

    public Integer getAccessRuleId() {
        return this.accessRuleId;
    }

    public Array setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public String getIp() {
        return this.ip;
    }

    public Array setMask(Integer mask) {
        this.mask = mask;
        return this;
    }

    public Integer getMask() {
        return this.mask;
    }

    public Array setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    public Integer getPriority() {
        return this.priority;
    }

    public Array setWriteAccess(String writeAccess) {
        this.writeAccess = writeAccess;
        return this;
    }

    public String getWriteAccess() {
        return this.writeAccess;
    }

    public Array setUserAccess(String userAccess) {
        this.userAccess = userAccess;
        return this;
    }

    public String getUserAccess() {
        return this.userAccess;
    }

    public Array setMountTargetId(String mountTargetId) {
        this.mountTargetId = mountTargetId;
        return this;
    }

    public String getMountTargetId() {
        return this.mountTargetId;
    }

    public Array setMountTargetName(String mountTargetName) {
        this.mountTargetName = mountTargetName;
        return this;
    }

    public String getMountTargetName() {
        return this.mountTargetName;
    }

    public Array setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public Array setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    @Override
    public String toString() {
        return "Array{" + "accessGroupName=" + accessGroupName + "\n" + "description=" + description + "\n" + "ruleCount=" + ruleCount + "\n" + "instanceCount=" + instanceCount
                + "\n" + "mountCount=" + mountCount + "\n" + "createTime=" + createTime + "\n" + "zoneName=" + zoneName + "\n" + "accessRuleId=" + accessRuleId + "\n" + "ip=" + ip
                + "\n" + "mask=" + mask + "\n" + "priority=" + priority + "\n" + "writeAccess=" + writeAccess + "\n" + "userAccess=" + userAccess + "\n" + "mountTargetId="
                + mountTargetId + "\n" + "mountTargetName=" + mountTargetName + "\n" + "instanceId=" + instanceId + "\n" + "instanceName=" + instanceName + "\n" + "}";
    }

}