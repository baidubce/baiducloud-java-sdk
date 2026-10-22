package com.baidubce.rds.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResourceGroup {
    /**
     * 分组名称
     */
    private String name;

    /**
     * 扩展信息
     */
    private String extra;

    /**
     * 父分组UUID
     */
    private String parentUuid;

    /**
     * 分组ID
     */
    private String groupId;

    /**
     * 账户ID
     */
    private String accountId;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 创建时间（毫秒时间戳）
     */
    private Integer createTime;

    /**
     * 更新时间（毫秒时间戳）
     */
    private Integer updateTime;

    /**
     * 删除时间（毫秒时间戳）
     */
    private Integer deleteTime;

    /**
     * 绑定时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'
     */
    private String bindTime;

    public ResourceGroup setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public ResourceGroup setExtra(String extra) {
        this.extra = extra;
        return this;
    }

    public String getExtra() {
        return this.extra;
    }

    public ResourceGroup setParentUuid(String parentUuid) {
        this.parentUuid = parentUuid;
        return this;
    }

    public String getParentUuid() {
        return this.parentUuid;
    }

    public ResourceGroup setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public ResourceGroup setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public ResourceGroup setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getUserId() {
        return this.userId;
    }

    public ResourceGroup setCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }

    public Integer getCreateTime() {
        return this.createTime;
    }

    public ResourceGroup setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public Integer getUpdateTime() {
        return this.updateTime;
    }

    public ResourceGroup setDeleteTime(Integer deleteTime) {
        this.deleteTime = deleteTime;
        return this;
    }

    public Integer getDeleteTime() {
        return this.deleteTime;
    }

    public ResourceGroup setBindTime(String bindTime) {
        this.bindTime = bindTime;
        return this;
    }

    public String getBindTime() {
        return this.bindTime;
    }

    @Override
    public String toString() {
        return "ResourceGroup{" + "name=" + name + "\n" + "extra=" + extra + "\n" + "parentUuid=" + parentUuid + "\n" + "groupId=" + groupId + "\n" + "accountId=" + accountId
                + "\n" + "userId=" + userId + "\n" + "createTime=" + createTime + "\n" + "updateTime=" + updateTime + "\n" + "deleteTime=" + deleteTime + "\n" + "bindTime="
                + bindTime + "\n" + "}";
    }

}