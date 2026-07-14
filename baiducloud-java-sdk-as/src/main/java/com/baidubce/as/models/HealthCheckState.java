package com.baidubce.as.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HealthCheckState {
    /**
     * 检查id
     */
    private String checkId;

    /**
     * 伸缩组id
     */
    private String groupId;

    /**
     * 账号id
     */
    private String accountId;

    /**
     * 检查状态（CHECKING-正在检查、CHECK_SUCCESS-检查通过、CHECK_FAILED-检查失败）
     */
    private String state;

    /**
     * 检查项列表
     */
    private List<CheckEntity> checkEntities;

    /**
     * 创建时间
     */
    private String createTime;

    public HealthCheckState setCheckId(String checkId) {
        this.checkId = checkId;
        return this;
    }

    public String getCheckId() {
        return this.checkId;
    }

    public HealthCheckState setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public HealthCheckState setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public HealthCheckState setState(String state) {
        this.state = state;
        return this;
    }

    public String getState() {
        return this.state;
    }

    public HealthCheckState setCheckEntities(List<CheckEntity> checkEntities) {
        this.checkEntities = checkEntities;
        return this;
    }

    public List<CheckEntity> getCheckEntities() {
        return this.checkEntities;
    }

    public HealthCheckState setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    @Override
    public String toString() {
        return "HealthCheckState{" + "checkId=" + checkId + "\n" + "groupId=" + groupId + "\n" + "accountId=" + accountId + "\n" + "state=" + state + "\n" + "checkEntities="
                + checkEntities + "\n" + "createTime=" + createTime + "\n" + "}";
    }

}