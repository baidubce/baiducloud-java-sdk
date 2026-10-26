package com.baidubce.pfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccessRuleModel {
    /**
     * 客户端 IP
     */
    private String ip;

    /**
     * 掩码位数，IPv4 默认 32，IPv6 默认 128
     */
    private Integer mask;

    /**
     * 读写权限，read_only（只读）/ read_write（读写）
     */
    private String writeAccess;

    /**
     * 用户权限，no_squash（不限制 root 账户）/ root_squash（限制 root 账户）/ all_squash（限制所有用户）
     */
    private String userAccess;

    /**
     * 优先级
     */
    private Integer priority;

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

    public AccessRuleModel setWriteAccess(String writeAccess) {
        this.writeAccess = writeAccess;
        return this;
    }

    public String getWriteAccess() {
        return this.writeAccess;
    }

    public AccessRuleModel setUserAccess(String userAccess) {
        this.userAccess = userAccess;
        return this;
    }

    public String getUserAccess() {
        return this.userAccess;
    }

    public AccessRuleModel setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    public Integer getPriority() {
        return this.priority;
    }

    @Override
    public String toString() {
        return "AccessRuleModel{" + "ip=" + ip + "\n" + "mask=" + mask + "\n" + "writeAccess=" + writeAccess + "\n" + "userAccess=" + userAccess + "\n" + "priority=" + priority
                + "\n" + "}";
    }

}
