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
     * 创建时间。
     */
    private Long createTime;

    /**
     * 更新时间。
     */
    private Long updateTime;

    /**
     * 删除时间。
     */
    private Long deleteTime;

    /**
     * 绑定时间。
     */
    private String bindTime;

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

    public ResourceInfo setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    public Long getCreateTime() {
        return this.createTime;
    }

    public ResourceInfo setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public Long getUpdateTime() {
        return this.updateTime;
    }

    public ResourceInfo setDeleteTime(Long deleteTime) {
        this.deleteTime = deleteTime;
        return this;
    }

    public Long getDeleteTime() {
        return this.deleteTime;
    }

    public ResourceInfo setBindTime(String bindTime) {
        this.bindTime = bindTime;
        return this;
    }

    public String getBindTime() {
        return this.bindTime;
    }

    @Override
    public String toString() {
        return "ResourceInfo{" + "name=" + name + "\n" + "extra=" + extra + "\n" + "parentUuid=" + parentUuid + "\n" + "groupId=" + groupId + "\n" + "accountId=" + accountId
                + "\n" + "userId=" + userId + "\n" + "createTime=" + createTime + "\n" + "updateTime=" + updateTime + "\n" + "deleteTime=" + deleteTime + "\n" + "bindTime="
                + bindTime + "\n" + "}";
    }

}