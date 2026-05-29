package com.baidubce.cfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccessRuleModel {
    /**
     * 权限规则标识符
     */
    private Integer accessRuleId;

    /**
     * IP地址
     */
    private String ip;

    /**
     * 子网掩码
     */
    private Integer mask;

    /**
     * 优先级
     */
    private Integer priority;

    /**
     * 用户访问权限
     */
    private String userAccess;

    /**
     * 读写权限
     */
    private String writeAccess;

    public AccessRuleModel setAccessRuleId(Integer accessRuleId) {
        this.accessRuleId = accessRuleId;
        return this;
    }

    public Integer getAccessRuleId() {
        return this.accessRuleId;
    }

    public AccessRuleModel setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public String getIp() {
        return this.ip;
    }

    public AccessRuleModel setMask(Integer mask) {
        this.mask = mask;
        return this;
    }

    public Integer getMask() {
        return this.mask;
    }

    public AccessRuleModel setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    public Integer getPriority() {
        return this.priority;
    }

    public AccessRuleModel setUserAccess(String userAccess) {
        this.userAccess = userAccess;
        return this;
    }

    public String getUserAccess() {
        return this.userAccess;
    }

    public AccessRuleModel setWriteAccess(String writeAccess) {
        this.writeAccess = writeAccess;
        return this;
    }

    public String getWriteAccess() {
        return this.writeAccess;
    }

    @Override
    public String toString() {
        return "AccessRuleModel{" + "accessRuleId=" + accessRuleId + "\n" + "ip=" + ip + "\n" + "mask=" + mask + "\n" + "priority=" + priority + "\n" + "userAccess=" + userAccess
                + "\n" + "writeAccess=" + writeAccess + "\n" + "}";
    }

}