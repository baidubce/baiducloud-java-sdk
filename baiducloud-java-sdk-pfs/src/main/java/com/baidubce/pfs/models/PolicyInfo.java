package com.baidubce.pfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PolicyInfo {
    /**
     * 规则ID
     */
    private String policyId;

    /**
     * 规则名字
     */
    private String policyName;

    /**
     * 规则所属实例ID
     */
    private String instanceId;

    /**
     * 规则生效路径
     */
    private String path;

    /**
     * 规则过期时间
     */
    private Integer expiredTime;

    /**
     * 规则创建时间
     */
    private String createTime;

    /**
     * 规则执行时间点
     */
    private Integer executeTime;

    /**
     * policy类型。ttl or export
     */
    private Integer type;

    /**
     * 如果是导出类型，返回导出的bos bucket路径
     */
    private String bosPath;

    /**
     * 规则当前状态：<br>• 0：生效中<br>• 1：运行中<br>• 2：删除中<br>• 3：失败
     */
    private Integer status;

    public PolicyInfo setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    public String getPolicyId() {
        return this.policyId;
    }

    public PolicyInfo setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    public String getPolicyName() {
        return this.policyName;
    }

    public PolicyInfo setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public PolicyInfo setPath(String path) {
        this.path = path;
        return this;
    }

    public String getPath() {
        return this.path;
    }

    public PolicyInfo setExpiredTime(Integer expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }

    public Integer getExpiredTime() {
        return this.expiredTime;
    }

    public PolicyInfo setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public PolicyInfo setExecuteTime(Integer executeTime) {
        this.executeTime = executeTime;
        return this;
    }

    public Integer getExecuteTime() {
        return this.executeTime;
    }

    public PolicyInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    public Integer getType() {
        return this.type;
    }

    public PolicyInfo setBosPath(String bosPath) {
        this.bosPath = bosPath;
        return this;
    }

    public String getBosPath() {
        return this.bosPath;
    }

    public PolicyInfo setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Integer getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        return "PolicyInfo{" + "policyId=" + policyId + "\n" + "policyName=" + policyName + "\n" + "instanceId=" + instanceId + "\n" + "path=" + path + "\n" + "expiredTime="
                + expiredTime + "\n" + "createTime=" + createTime + "\n" + "executeTime=" + executeTime + "\n" + "type=" + type + "\n" + "bosPath=" + bosPath + "\n" + "status="
                + status + "\n" + "}";
    }

}