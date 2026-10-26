package com.baidubce.pfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccessGroupInfo {
    /**
     * 权限组名称
     */
    private String accessGroupName;

    /**
     * 描述，未设置时该字段不返回
     */
    private String description;

    /**
     * 规则数量
     */
    private Integer ruleCount;

    /**
     * 关联实例数量
     */
    private Integer instanceCount;

    /**
     * 关联挂载点数量
     */
    private Integer mountCount;

    /**
     * 创建时间，ISO-8601 UTC 秒精度，如 2026-09-01T03:12:45Z
     */
    private String createTime;

    /**
     * 逻辑机房（可用区）
     */
    private String zoneName;

    public AccessGroupInfo setAccessGroupName(String accessGroupName) {
        this.accessGroupName = accessGroupName;
        return this;
    }

    public String getAccessGroupName() {
        return this.accessGroupName;
    }

    public AccessGroupInfo setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public AccessGroupInfo setRuleCount(Integer ruleCount) {
        this.ruleCount = ruleCount;
        return this;
    }

    public Integer getRuleCount() {
        return this.ruleCount;
    }

    public AccessGroupInfo setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    public AccessGroupInfo setMountCount(Integer mountCount) {
        this.mountCount = mountCount;
        return this;
    }

    public Integer getMountCount() {
        return this.mountCount;
    }

    public AccessGroupInfo setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public AccessGroupInfo setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getZoneName() {
        return this.zoneName;
    }

    @Override
    public String toString() {
        return "AccessGroupInfo{" + "accessGroupName=" + accessGroupName + "\n" + "description=" + description + "\n" + "ruleCount=" + ruleCount + "\n" + "instanceCount="
                + instanceCount + "\n" + "mountCount=" + mountCount + "\n" + "createTime=" + createTime + "\n" + "zoneName=" + zoneName + "\n" + "}";
    }

}
