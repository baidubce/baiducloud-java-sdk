package com.baidubce.cfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RuleInfo {
    /**
     * 授权ip地址，虚拟VPC IP，允许单IP或结合mask参数设置网段，支持IPV4和IPV6，如10.10.1.123或2001::/16
     */
    private String ip;

    /**
     * 结合ip参数实现指定网段，如果单IP则设置为32（IPV4）或128（IPV6）
     */
    private Integer mask;

    /**
     * 读写规则，支持"read_only"表示只读, "read_write"表示读写
     */
    private String writeAccess;

    /**
     * 用户权限规则，支持"no_squash"表示不限制root用户, "root_squash"表示限制root用户, "all_squash"表示限制所有用户
     */
    private String userAccess;

    /**
     * 规则优先级，优先级可选范围为1-100，1为最高优先级
     */
    private Integer priority;

    public RuleInfo setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public String getIp() {
        return this.ip;
    }

    public RuleInfo setMask(Integer mask) {
        this.mask = mask;
        return this;
    }

    public Integer getMask() {
        return this.mask;
    }

    public RuleInfo setWriteAccess(String writeAccess) {
        this.writeAccess = writeAccess;
        return this;
    }

    public String getWriteAccess() {
        return this.writeAccess;
    }

    public RuleInfo setUserAccess(String userAccess) {
        this.userAccess = userAccess;
        return this;
    }

    public String getUserAccess() {
        return this.userAccess;
    }

    public RuleInfo setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    public Integer getPriority() {
        return this.priority;
    }

    @Override
    public String toString() {
        return "RuleInfo{" + "ip=" + ip + "\n" + "mask=" + mask + "\n" + "writeAccess=" + writeAccess + "\n" + "userAccess=" + userAccess + "\n" + "priority=" + priority + "\n"
                + "}";
    }

}