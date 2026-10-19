package com.baidubce.rds.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResourceInfo {
    /**
     * 资源分组名称。
     */
    private String name;

    /**
     * 扩展信息。
     */
    private String extra;

    /**
     * 上级资源 ID。
     */
    private String parentUuid;

    /**
     * 分组 ID。
     */
    private String groupId;

    /**
     * 账户ID。
     */
    private String accountId;

    /**
     * 用户ID。
     */
    private String userId;

    /**
     * createTime
     */
    private Object createTime;

    /**
     * updateTime
     */
    private Object updateTime;

    /**
     * deleteTime
     */
    private Object deleteTime;

    /**
     * bindTime
     */
    private Object bindTime;

    public ResourceInfo setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public ResourceInfo setExtra(String extra) {
        this.extra = extra;
        return this;
    }

    public String getExtra() {
        return this.extra;
    }

    public ResourceInfo setParentUuid(String parentUuid) {
        this.parentUuid = parentUuid;
        return this;
    }

    public String getParentUuid() {
        return this.parentUuid;
    }

    public ResourceInfo setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public ResourceInfo setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public ResourceInfo setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getUserId() {
        return this.userId;
    }

    public ResourceInfo setCreateTime(Object createTime) {
        this.createTime = createTime;
        return this;
    }

    public Object getCreateTime() {
        return this.createTime;
    }

    public ResourceInfo setUpdateTime(Object updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public Object getUpdateTime() {
        return this.updateTime;
    }

    public ResourceInfo setDeleteTime(Object deleteTime) {
        this.deleteTime = deleteTime;
        return this;
    }

    public Object getDeleteTime() {
        return this.deleteTime;
    }

    public ResourceInfo setBindTime(Object bindTime) {
        this.bindTime = bindTime;
        return this;
    }

    public Object getBindTime() {
        return this.bindTime;
    }

    @Override
    public String toString() {
        return "ResourceInfo{" + "name=" + name + "\n" + "extra=" + extra + "\n" + "parentUuid=" + parentUuid + "\n" + "groupId=" + groupId + "\n" + "accountId=" + accountId
                + "\n" + "userId=" + userId + "\n" + "createTime=" + createTime + "\n" + "updateTime=" + updateTime + "\n" + "deleteTime=" + deleteTime + "\n" + "bindTime="
                + bindTime + "\n" + "}";
    }

}