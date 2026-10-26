package com.baidubce.pfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccessRuleInfo {
    /**
     * 规则 ID
     */
    private Integer accessRuleId;

    /**
     * 客户端 IP
     */
    private String ip;

    /**
     * 掩码位数
     */
    private Integer mask;

    /**
     * 优先级
     */
    private Integer priority;

    /**
     * 读写权限，read_only（只读）/ read_write（读写）
     */
    private String writeAccess;

    /**
     * 用户权限，no_squash / root_squash / all_squash
     */
    private String userAccess;

    public AccessRuleInfo setAccessRuleId(Integer accessRuleId) {
        this.accessRuleId = accessRuleId;
        return this;
    }

    public Integer getAccessRuleId() {
        return this.accessRuleId;
    }

    public AccessRuleInfo setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public String getIp() {
        return this.ip;
    }

    public AccessRuleInfo setMask(Integer mask) {
        this.mask = mask;
        return this;
    }

    public Integer getMask() {
        return this.mask;
    }

    public AccessRuleInfo setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    public Integer getPriority() {
        return this.priority;
    }

    public AccessRuleInfo setWriteAccess(String writeAccess) {
        this.writeAccess = writeAccess;
        return this;
    }

    public String getWriteAccess() {
        return this.writeAccess;
    }

    public AccessRuleInfo setUserAccess(String userAccess) {
        this.userAccess = userAccess;
        return this;
    }

    public String getUserAccess() {
        return this.userAccess;
    }

    @Override
    public String toString() {
        return "AccessRuleInfo{" + "accessRuleId=" + accessRuleId + "\n" + "ip=" + ip + "\n" + "mask=" + mask + "\n" + "priority=" + priority + "\n" + "writeAccess="
                + writeAccess + "\n" + "userAccess=" + userAccess + "\n" + "}";
    }

}
